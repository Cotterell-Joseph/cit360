/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fluidconv;

import java.util.Scanner;

/**
 *
 * @author mythr
 */
public class FluidConv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Controller convert = new Controller();
            String command;
            String units;
            Integer amount;
            
            System.out.println("What would you like to do?\n"
                    + "\tA - Convert Ounces to Liters\n"
                    + "\tB - Convert Ounces to Gallons\n"
                    + "\tC - Convert Liters to Ounces\n"
                    + "\tD - Convert Liters to Gallons\n"
                    + "\tE - Convert Gallons to Ounces\n"
                    + "\tF - Convert Gallons to Liters\n"
                    + "\tQ - Quit");
            String menu = input.nextLine();
            menu = menu.trim().toUpperCase();
                        
            System.out.println("Enter an amount to convert.");
            amount = Integer.parseInt(input.nextLine());
            
            switch (menu) {
                case "A" :
                    command = "OzToLit";
                    units = "ounces";
                    convert.chooseConversion(command, units, amount);
                    break;
                case "B" :
                    command = "OzToGal";
                    units = "ounces";
                    convert.chooseConversion(command, units, amount);
                    break;
                case "C" :
                    command = "LitToOz";
                    units = "liters";
                    convert.chooseConversion(command, units, amount);
                    break;
                case "D" :
                    command = "LitToGal";
                    units = "liters";
                    convert.chooseConversion(command, units, amount);
                    break;
                case "E" :
                    command = "GalToOz";
                    units = "gallons";
                    convert.chooseConversion(command, units, amount);
                    break;
                case "F" :
                    command = "GalToLit";
                    units = "gallons";
                    convert.chooseConversion(command, units, amount);
                    break;
                case "Q" :
                    System.exit(0);
                    
            }
            
    }
    
}
