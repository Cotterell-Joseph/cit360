/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcpatterndemo.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mythr
 */
public class StudentControllerTest {
    
    public StudentControllerTest() {
    }

    /**
     * Test of setStudentName method, of class StudentController.
     */
    @Test
    public void testSetStudentName() {
        System.out.println("setStudentName");
        String name = "";
        StudentController instance = null;
        instance.setStudentName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudentName method, of class StudentController.
     */
    @Test
    public void testGetStudentName() {
        System.out.println("getStudentName");
        StudentController instance = null;
        String expResult = "";
        String result = instance.getStudentName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStudentRollNo method, of class StudentController.
     */
    @Test
    public void testSetStudentRollNo() {
        System.out.println("setStudentRollNo");
        String rollNo = "";
        StudentController instance = null;
        instance.setStudentRollNo(rollNo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudentRollNo method, of class StudentController.
     */
    @Test
    public void testGetStudentRollNo() {
        System.out.println("getStudentRollNo");
        StudentController instance = null;
        String expResult = "";
        String result = instance.getStudentRollNo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateView method, of class StudentController.
     */
    @Test
    public void testUpdateView() {
        System.out.println("updateView");
        StudentController instance = null;
        instance.updateView();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
