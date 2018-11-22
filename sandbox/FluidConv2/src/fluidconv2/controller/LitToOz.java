/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fluidconv2.controller;

/**
 *
 * @author mythr
 */
public class LitToOz implements Convert {
    @Override
    public void doAction(String fromUnits, String toUnits, int amount) {
        double ozAmount = (double) Math.round(amount * 33.8140227 * 100) / 100;
        System.out.println(amount + " " + fromUnits + " is equivalent to "
                + ozAmount + " " + toUnits);
    }
}
