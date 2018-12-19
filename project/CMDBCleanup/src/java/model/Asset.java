/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author mythr
 */
public class Asset {
    
    private String ciName;
    private String serialNumber;
    private String macAddress;
    private String model;
    private String ipAddress;
    private int locationID;
    
    public Asset(String ciName, String serialNumber, String macAddress, String model, String ipAddress, Integer locationID) {
       this.ciName = ciName;
       this.serialNumber = serialNumber;
       this.macAddress = macAddress;
       this.model = model;
       this.ipAddress = ipAddress;
       this.locationID = locationID;
    }

    public String getCiName() {
        return ciName;
    }

    public void setCiName(String ciName) {
        this.ciName = ciName;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public int getLocationID() {
        return locationID;
    }

    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }
}
