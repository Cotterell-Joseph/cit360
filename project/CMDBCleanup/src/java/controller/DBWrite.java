/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.HashMap;
import model.Asset;
import model.CMDB;
import model.Current;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author mythr
 */
public class DBWrite implements CMDBTools {
    
    @Override
    public void doAction(CMDB cmdb) {
        HashMap<String, Asset> diff = cmdb.getDiff();
        
        for (HashMap.Entry<String, Asset> entry : diff.entrySet()) {
            Asset asset = entry.getValue();
            updateRecords(asset);
        }
    }
    
    private void updateRecords(Asset asset) {
        String ciName = asset.getCiName();
        String serialNumber = asset.getSerialNumber();
        String macAddress = asset.getMacAddress();
        String model = asset.getModel();
        String ipAddress = asset.getIpAddress();
        Integer locationId = asset.getLocationID();
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        
        try {
            tx = session.beginTransaction();
                      
            Current assetDB = (Current)session.get(Current.class, ciName);
            assetDB.setCiName(ciName);
            assetDB.setSerialNumber(serialNumber);
            assetDB.setMacAddress(macAddress);
            assetDB.setModel(model);
            assetDB.setIpAddress(ipAddress);
            assetDB.setLocationId(locationId);
            session.update(assetDB);

            tx.commit();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
    }
}