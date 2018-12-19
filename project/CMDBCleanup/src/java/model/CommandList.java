/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.CMDBTools;
import controller.DBRead;
import controller.DBWrite;
import controller.JSONRead;
import controller.JSONWrite;
import java.util.HashMap;

/**
 *
 * @author mythr
 */
public class CommandList {
    public static HashMap<String, CMDBTools> commandList = new HashMap<String, CMDBTools>();

    public static HashMap<String, CMDBTools> getCommandList() {
        return commandList;
    }

    public static void setCommandList(HashMap<String, CMDBTools> commandList) {
        CommandList.commandList = commandList;
    }
    
    public CommandList() {
        commandList.put("JSONIn", new JSONRead());
        commandList.put("JSONOut", new JSONWrite());
        commandList.put("DBIn", new DBRead());
        commandList.put("DBOut", new DBWrite());
    }
}
