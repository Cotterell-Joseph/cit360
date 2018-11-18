/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fluidconv2.view;

import java.util.Scanner;

/**
 *
 * @author mythr
 */
public class FromView {
    Scanner input = new Scanner(System.in);
    String command;
    String fromUnits;
    
    public void display() {
        command = null;
        fromUnits = null;
        boolean done = false;
        
        do {
            System.out.println("What would you like to convert from?\n"
                + "\tA - Ounces\n"
                + "\tB - Liters\n"
                + "\tC - Gallons\n"
                + "\tQ - Quit");
            String menu = input.nextLine();
            menu = menu.trim().toUpperCase();

            switch (menu) {
                case "A" :
                    command = "OzTo";
                    fromUnits = "ounces";
                    done = true;
                    break;
                case "B" :
                    command = "LitTo";
                    fromUnits = "liters";
                    done = true;
                    break;
                case "C" :
                    command = "GalTo";
                    fromUnits = "gallons";
                    done = true;
                    break;
                case "Q" :
                    System.exit(0);
                default :
                    System.out.println("Please enter a value from the list.\n");
            } 
            
        }while (!done);
        
        doAction(command);       
    }
    public void doAction(String command) {
        ToView toView = new ToView();
        toView.display(command, fromUnits);
    }
    
}
