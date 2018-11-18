/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junittest;

import java.util.HashMap;

/**
 *
 * @author mythr
 */
public class JunitTest {
    HashMap<String, Integer> adults = new HashMap();
    
    public void setAdults(String name, int age) {
        if (age > 17) {
            adults.put(name, age);
        }
    }
    
    public Integer getAdultAge(String name) {
        return adults.get(name);
    }
    
    public boolean checkIfAdult(int age) {
        boolean check = (age > 17);
        return check;
    }
    
}
