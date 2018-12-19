/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.HashMap;
import java.util.List;
import model.Asset;
import model.CMDB;
import model.Current;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author mythr
 */
public class DBRead implements CMDBTools {
    
    @Override
    public void doAction(CMDB cmdb) {
        HashMap<String, Asset> fromDB = new HashMap<String, Asset>();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query query = session.createQuery("from Current");
            List l = query.list();
            for (int i = 0; i < l.size(); i++) {
                Current current = (Current) l.get(i);
                String ciName = current.getCiName();
                String serialNumber = current.getSerialNumber();
                String macAddress = current.getMacAddress();
                String model = current.getModel();
                String ipAddress = current.getIpAddress();
                Integer locationId = current.getLocationId();
                
                Asset asset = new Asset(ciName, serialNumber, macAddress, model, ipAddress, locationId);
                fromDB.put(ciName, asset);
            }
            cmdb.setFromDB(fromDB);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            if(tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
        
    }
}