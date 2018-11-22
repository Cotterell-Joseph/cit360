/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonexample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import org.quickconnectfamily.json.*;
/**
 *
 * @author mythr
 */
public class JSONExample {
    
    class placeholderObject implements Serializable {
        public String make, model, color;
        public int modelYear;
        public boolean isLeased;
        
        public placeholderObject(String make, String model, String color, int modelYear, boolean isLeased) {
            this.make = make;
            this.model = model;
            this.color = color;
            this.modelYear = modelYear;
            this.isLeased = isLeased;
        }
        
        public placeholderObject(HashMap aMap) {
            this.make = (String) aMap.get("make");
            this.model = (String) aMap.get("model");
            this.color = (String) aMap.get("color");
            this.modelYear = (Integer) aMap.get("modelYear");
            if((Boolean) aMap.get("isLeased")) {
                this.isLeased = true;
            } else {
                this.isLeased = false;
            }
        }
        
        public void toSomeString() {
            System.out.print(modelYear + " " + color + " " + make + " "
                    + model + " lease status is: ");
            if (!isLeased) {
                System.out.println(" Leased.");
            } else {
                System.out.println(" Owned.");
            }
        }
    }
    
    public void qcJSONExample(String filename) throws Exception {
        FileOutputStream fOut = new FileOutputStream(filename);
        FileInputStream fIn = new FileInputStream(filename);
        
        JSONOutputStream jsonOut = new JSONOutputStream(fOut);
        JSONInputStream jsonIn = new JSONInputStream(fIn);
        
        placeHolderObject writeIt = new placeHolderObject("Ford", "Focus", "Gray", 2008, false);
        writeIt.toSomeString();
        
        try {
            jsonOut.writeObject(writeIt);
            System.out.println("JSON file created successfully.");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        
        try {
            System.out.println("Reading file contents.");
            
            HashMap stringFromFile = (HashMap) jsonIn.readObject();
            placeHolderObject readObject = new placeHolderObject(stringFromFile);
            readObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        String dir = "C:\\Users\\mythr\\OneDrive\\Documents\\BYUI\\CIT360\\cit360\\sandbox\\IO Files";
        String filename = dir + "\\testFile.txt";
        
        JSONExample obj = new JSONExample();
        
        try {
            obj.qcJSONExample(filename);
        } catch (IOException e) {
            System.out.println("The file: " + filename + " does not exist.");
            e.printStackTrace();
        }
    }
    
}
