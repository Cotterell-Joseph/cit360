/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;

/**
 *
 * @author mythr
 */
public class CMDB {
    private HashMap<String, Asset> fromJSON;
    private HashMap<String, Asset> fromDB;
    private HashMap<String, Asset> diff;

    public HashMap<String, Asset> getDiff() {
        return diff;
    }

    public void setDiff(HashMap<String, Asset> diff) {
        this.diff = diff;
    }

    public HashMap<String, Asset> getFromJSON() {
        return fromJSON;
    }

    public void setFromJSON(HashMap<String, Asset> fromJSON) {
        this.fromJSON = fromJSON;
    }

    public HashMap<String, Asset> getFromDB() {
        return fromDB;
    }

    public void setFromDB(HashMap<String, Asset> fromDB) {
        this.fromDB = fromDB;
    }
    
}
