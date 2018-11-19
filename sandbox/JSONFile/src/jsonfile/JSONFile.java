/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonfile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author mythr
 */
public class JSONFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //create JSON Object to store the data we will write to our file.
        JSONObject obj = new JSONObject();
        
        //add attributes of a vehicle to that object
        obj.put("make", "Ford");
        obj.put("model", "Focus");
        obj.put("color", "gray");
        obj.put("year", 2008);
        obj.put("is leased", false);
        
        //create a JSON Array for grouped data
        JSONArray drivers = new JSONArray();
        
        //add a list of drives for the vehicle to the array
        drivers.add("Joe");
        drivers.add("Alicia");
        drivers.add("Ann");
        drivers.add("Deanna");
        
        //put the array into the JSON objecet
        obj.put("drivers", drivers);
        
        //create the object for writing out to myJSON.json in the local directory
        try (FileWriter file = new FileWriter("myJSON.json"))
        {
            //start buffered writing of object and 'flush' to immediately write it
            file.write(obj.toString());
            file.flush();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        
        //this is what we sent to the file
        System.out.println("Data sent out to JSON file");
        System.out.println(obj + "\n");
        
        //set up the parser to now read the file back
        JSONParser parser = new JSONParser();
        
        try
        {
            //retreive the data from the file and convert to JSON Object type
            Object objIn = parser.parse(new FileReader("myJSON.json"));
            JSONObject jsonObj = (JSONObject) objIn;
            
            //this is what we read from the file
            System.out.println("Data retreived from the JSON file");
            System.out.println(objIn + "\n");
            
            //retreive the vehicle information and display it
            String make = (String) jsonObj.get("make");
            System.out.println("Vehicle Make: " + make);
            
            String model = (String) jsonObj.get("model");
            System.out.println("Vehicle Model: " + model);
            
            String color = (String) jsonObj.get("color");
            System.out.println("Vehicle Color: " + color);
            
            Long year = (Long) jsonObj.get("year");
            System.out.println("Vehicle Year: " + year);
            
            boolean isLeased = (boolean) jsonObj.get("is leased");
            if (isLeased) {
                System.out.println("This vehicle is leased.");
            } else {
                System.out.println("This vehicle is owned.");
            }
            
            //retreive the list of drivers from the object as an array and create an iterator
            JSONArray driversArray = (JSONArray) jsonObj.get("drivers");
            Iterator<String> iterator = driversArray.iterator();
            
            //iterate through the list and display driver names
            while (iterator.hasNext()) {
                System.out.println("Driver: " + iterator.next());
            }
        }
        catch(FileNotFoundException e) {e.printStackTrace();}
        catch(IOException e) {e.printStackTrace();}
        catch(ParseException e) {e.printStackTrace();}
        catch(Exception e) {e.printStackTrace();}
    }
    
}
