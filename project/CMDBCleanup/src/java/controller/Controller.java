/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.HashMap;
import model.CMDB;
import model.CommandList;

/**
 *
 * @author mythr
 */
public class Controller {
    CommandList commandList = new CommandList();
    protected static HashMap<String, CMDBTools> c;
    
    public Controller() {
        this.c = commandList.getCommandList();
    }
    
    public static void handleData(String command, CMDB cmdb) {
        
        CMDBTools aHandler = c.get(command);
        aHandler.doAction(cmdb);
    }
}
