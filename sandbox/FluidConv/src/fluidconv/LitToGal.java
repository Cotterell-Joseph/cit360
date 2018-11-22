/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fluidconv;

/**
 *
 * @author mythr
 */
public class LitToGal implements Convert {
    @Override
    public void doAction(String units, Integer amount) {
        double galAmount = (double) Math.round(amount * 0.26417205 * 100) / 100;
        System.out.println(amount + " " + units + " is equivalent to "
                + galAmount + " gallons");
    }
}
