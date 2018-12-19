/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import model.Asset;
import model.CMDB;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author mythr
 */
public class JSONRead implements CMDBTools {
    public static HashMap<String, Asset> jRead = new HashMap<String, Asset>();
    
    @Override
    public void doAction(CMDB cmdb) {
        
        JSONParser parser = new JSONParser();
        
        try (FileReader reader = new FileReader("compiled.json")) {
            Object obj = parser.parse(reader);
            
            JSONArray assetList = (JSONArray) obj;
            
            assetList.forEach( asset -> parseAssetList((JSONObject) asset));
            } catch(FileNotFoundException e) {e.printStackTrace();}
              catch(IOException e) {e.printStackTrace();}
              catch(ParseException e) {e.printStackTrace();}
              catch(Exception e) {e.printStackTrace();}
        
        cmdb.setFromJSON(jRead);
        }

    private void parseAssetList(JSONObject asset) {
        JSONObject assetObj = (JSONObject) asset.get("asset");
        
        String ciName = (String) assetObj.get("ciName");       
        String serialNumber = (String) assetObj.get("serialNumber");  
        String macAddress = (String) assetObj.get("macAddress");
        String model = (String) assetObj.get("model");
        String ipAddress = (String) assetObj.get("ipAddress");
        Long l = (Long) assetObj.get("locationID");
        int locationId = l.intValue();
        Asset a = new Asset(ciName, serialNumber, macAddress, model, ipAddress, locationId);
        jRead.put(ciName, a);
    }

}
