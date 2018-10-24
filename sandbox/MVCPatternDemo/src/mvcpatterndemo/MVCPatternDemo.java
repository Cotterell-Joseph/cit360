/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcpatterndemo;

import mvcpatterndemo.control.StudentController;
import mvcpatterndemo.model.Student;
import mvcpatterndemo.view.StudentView;

/**
 *
 * @author mythr
 */
public class MVCPatternDemo {
    public static void main(String[] args) {
        
        //fetch student record based on his roll no from the database
        Student model = retreiveStudentFromDatabase();
        
        //create a view : to write student details on console
        StudentView view = new StudentView();
        
        StudentController controller = new StudentController(model, view);
        
        controller.updateView();
        
        //update model data
        controller.setStudentName("John");
        
        controller.updateView();
    }
    
    private static Student retreiveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
    
}
