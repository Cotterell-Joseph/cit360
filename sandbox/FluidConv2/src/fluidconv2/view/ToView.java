/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fluidconv2.view;

import fluidconv2.controller.Controller;
import java.util.Scanner;

/**
 *
 * @author mythr
 */
public class ToView {
    Scanner input = new Scanner(System.in);
    String toUnits;
    int amount;
    
    
    public void display(String command, String fromUnits) {
        String lookup = null;
        toUnits = null;
        boolean done = false;
        
        do {
            System.out.println("What would you like to convert to?\n"
                + "\tA - Ounces\n"
                + "\tB - Liters\n"
                + "\tC - Gallons\n"
                + "\tQ - Quit");
            String menu = input.nextLine();
            menu = menu.trim().toUpperCase();

            switch (menu) {
                case "A" :
                    lookup = "Oz";
                    toUnits = "ounces";
                    done = true;
                    break;
                case "B" :
                    lookup = "Lit";
                    toUnits = "liters";
                    done = true;
                    break;
                case "C" :
                    lookup = "Gal";
                    toUnits = "gallons";
                    done = true;
                    break;
                case "Q" :
                    System.exit(0);
                default :
                    System.out.println("Please enter a value from the list.\n");
            }
            try {
                if (toUnits.equals(fromUnits)) {
                    System.out.println("You must specify a different unit to convert to:\n"
                            + "\tConvert From: " + fromUnits);
                    done = false;
                }
            } catch(NullPointerException e) {
                System.out.println();
            }
        } while (!done);
            
        command += lookup;
        done = false;
        
        do {
            System.out.println("How many " + fromUnits + " would you like to"
                    + " convert to " + toUnits + "?");
            
            try {
                amount = Integer.parseInt(input.nextLine());
            } catch(NumberFormatException e) {
                System.out.println("Please enter a valid whole number.\n");
                continue;
            }
                    
            if (amount < 1) {
                System.out.println("Enter a value greater than zero.\n");
            } else { done = true; }
            
        } while (!done);
            
        doAction(command, fromUnits, toUnits, amount);
    }
    
    public void doAction(String command, String fromUnits, 
            String toUnits, int amount ) {
        Controller aController = new Controller();
        aController.chooseConversion(command, fromUnits, toUnits, amount);
    }
}
