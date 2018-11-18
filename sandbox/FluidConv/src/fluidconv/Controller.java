/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fluidconv;

import java.util.HashMap;

/**
 *
 * @author mythr
 */
public class Controller {
    public static HashMap<String, Convert> c = new HashMap<String, Convert>();
    
    public void Controller() {
        
    }
    
    public static void chooseConversion(String command, String units, Integer amount) {
        c.put("OzToLit", new OzToLit());
        c.put("OzToGal", new OzToGal());
        c.put("LitToOz", new LitToOz());
        c.put("LitToGal", new LitToGal());
        c.put("GalToOz", new GalToOz());
        c.put("GalToLit", new GalToLit());
        
        Convert aHandler = c.get(command);
        aHandler.doAction(units, amount);
    }
}
