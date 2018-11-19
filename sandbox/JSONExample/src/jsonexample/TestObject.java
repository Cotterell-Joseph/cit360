/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonexample;

import java.io.Serializable;

/**
 *
 * @author mythr
 */
public class TestObject implements Serializable {
    public String make, model, color;
    public int modelYear;
    public boolean isLeased;

    public TestObject(String make, String model, String color, int modelYear, boolean isLeased) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.modelYear = modelYear;
        this.isLeased = isLeased;
    }
    
}
