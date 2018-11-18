/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junittest;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author mythr
 */
public class JunitTestTest {
    JunitTest testJunit;
    String adultName1, adultName2, youthName;
    int adultAge1, adultAge2, youthAge;
    
    @Before
    public void setUp() throws Exception {
        testJunit = new JunitTest();
        adultName1 = "Mark";
        adultName2 = "Nancy";
        youthName = "Jean";
        adultAge1 = 34;
        adultAge2 = 18;
        youthAge = 17;
    }
        
    @Test
    public void testSetAdults() {
        testJunit.setAdults(adultName1, adultAge1);
        int numAdults = testJunit.adults.size();
        assertEquals(1, numAdults);
        
        testJunit.setAdults(youthName, youthAge);
        numAdults = testJunit.adults.size();
        assertEquals(1, numAdults);
        
        testJunit.setAdults(adultName2, adultAge2);
        numAdults = testJunit.adults.size();
        assertEquals(2, numAdults);
    }

    @Test
    public void testGetAdultAge() {
        Integer age = testJunit.getAdultAge(youthName);
        assertNull(age);
    }

    @Test
    public void testCheckIfAdult() {
        boolean test = testJunit.checkIfAdult(adultAge1);
        assertTrue(test);
        
        test = testJunit.checkIfAdult(adultAge2);
        assertTrue(test);
        
        test = testJunit.checkIfAdult(youthAge);
        assertFalse(test);
    }
    
}
