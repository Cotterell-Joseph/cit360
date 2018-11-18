/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doingmorewithjava.example;

/**
 *
 * @author mythr
 */
public class ClothingCustomer extends Customer {
    double inseam;
    
    public ClothingCustomer(String aName, int anAge, double someYears, double inseam) {
        super(aName, anAge, someYears);
        this.inseam = inseam;
    }
}
