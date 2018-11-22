/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fluidconv2.model;

import fluidconv2.controller.Convert;
import fluidconv2.controller.GalToLit;
import fluidconv2.controller.GalToOz;
import fluidconv2.controller.LitToGal;
import fluidconv2.controller.LitToOz;
import fluidconv2.controller.OzToGal;
import fluidconv2.controller.OzToLit;
import java.util.HashMap;

/**
 *
 * @author mythr
 */
public class ConvTable {
    public static HashMap<String, Convert> convTable = new HashMap<String, Convert>();

    public ConvTable() {
        convTable.put("OzToLit", new OzToLit());
        convTable.put("OzToGal", new OzToGal());
        convTable.put("LitToOz", new LitToOz());
        convTable.put("LitToGal", new LitToGal());
        convTable.put("GalToOz", new GalToOz());
        convTable.put("GalToLit", new GalToLit());
    }

    public static HashMap<String, Convert> getConvTable() {
        return convTable;
    }

    public static void setConvTable(HashMap<String, Convert> c) {
        ConvTable.convTable = convTable;
    }
}
