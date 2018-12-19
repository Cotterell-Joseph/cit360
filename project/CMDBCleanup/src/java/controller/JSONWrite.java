/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import model.Asset;
import model.CMDB;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author mythr
 */
public class JSONWrite implements CMDBTools {
    public static JSONArray jsa = new JSONArray();
    
    @Override
    public void doAction(CMDB cmdb) {
        HashMap<String, Asset> diff = cmdb.getDiff();
        
        for (HashMap.Entry<String, Asset> entry : diff.entrySet()) {
            Asset asset = entry.getValue();
            updateRecords(asset);
        }
        
        try (FileWriter file = new FileWriter("difference.json"))
        {
            file.write(jsa.toString());
            file.flush();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
    private void updateRecords(Asset asset) {
        String ciName = asset.getCiName();
        String serialNumber = asset.getSerialNumber();
        String macAddress = asset.getMacAddress();
        String model = asset.getModel();
        String ipAddress = asset.getIpAddress();
        Integer locationId = asset.getLocationID();
        
        JSONObject obj = new JSONObject();
        obj.put("ciName", ciName);
        obj.put("serialNumber", serialNumber);
        obj.put("macAddress", macAddress);
        obj.put("model", model);
        obj.put("ipAddress", ipAddress);
        obj.put("locationID", locationId);
        
        jsa.add(obj);
    }
}
