/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package httpurlconnect;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author mythr
 */
public class HTTPURLConnect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        BufferedReader reader = null;
        StringBuilder builder = null;
        
        //Lots of exceptions can be thrown, so the generic Exception class is used
        try {
            //Set the URL we are going to read from, this can throw MalformedURLException
            //this can be combatted with URLEncoder.encode(URL, "UTF-8"); method
            URL url = new URL("http://www.byui.edu");
            
            //Create the connection object. No connection yet. Throws IOException
            HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
            
            //Set some parms for the connection. GET is the default, but included
            //to show the syntax for other http request types.
            httpCon.setRequestMethod("GET");
            //Timeout delay is 15 seconds. SocketTimeoutException will occur if reached
            httpCon.setReadTimeout(15000);
            
            //Read the output from the server, and print in the console. getInputStream
            //can throw IOException, SocketTimoutException, and UnknownServiceException
            reader = new BufferedReader(new InputStreamReader(httpCon.getInputStream()));
            builder = new StringBuilder();
            String line = null;
            //Parse through the lines in the BufferedReader object and append to the 
            //StringBuilder object.
            while ((line = reader.readLine()) != null) {
                builder.append(line + "\n");
            }
            builder.toString();
            System.out.println(builder);
            
            //Close the reader. This can throw IOException.
            if (reader != null)
                reader.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
