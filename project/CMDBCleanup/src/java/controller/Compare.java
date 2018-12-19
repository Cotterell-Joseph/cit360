/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.HashMap;
import model.Asset;
import model.CMDB;

/**
 *
 * @author mythr
 */
public class Compare {

        public static void crunchTheData() {
        CMDB cmdb = new CMDB();
        HashMap<String, Asset> diff = new HashMap<String, Asset>();
        Controller aController = new Controller();
        aController.handleData("JSONIn", cmdb);
        aController.handleData("DBIn", cmdb);
        
        HashMap<String, Asset> fromJSON = cmdb.getFromJSON();
        HashMap<String, Asset> fromDB = cmdb.getFromDB();
        
        for (HashMap.Entry<String, Asset> entry : fromJSON.entrySet()) {
            String key = entry.getKey();
            if (fromJSON.get(key).equals(fromDB.get(key))) {
                continue;
            } else {
                diff.put(key, fromJSON.get(key));
            }
            
        }
        aController.handleData("DBOut", cmdb);
        aController.handleData("JSONOut", cmdb);
    }
}
