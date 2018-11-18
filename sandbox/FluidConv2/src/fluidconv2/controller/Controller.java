/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fluidconv2.controller;

import fluidconv2.model.ConvTable;
import java.util.HashMap;

/**
 *
 * @author mythr
 */
public class Controller {
    ConvTable convTable = new ConvTable();
    protected static HashMap<String, Convert> c;
    
    public static void chooseConversion(String command, String fromUnits,
            String toUnits, int amount) {
        
        Convert aHandler = c.get(command);
        aHandler.doAction(fromUnits, toUnits, amount);
    }

    public Controller() {
        this.c = convTable.getConvTable();
    }
}
