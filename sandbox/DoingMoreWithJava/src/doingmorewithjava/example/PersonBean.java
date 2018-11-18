/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doingmorewithjava.example;

import java.io.Serializable;

/**
 *
 * @author mythr
 */
public class PersonBean implements Serializable {
    private String firstName;
    private String lastName;
    private int age;
    
    public PersonBean() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        
        PersonBean that = (PersonBean) o;
        
        if (this.age != that.age) return false;
        if (!this.firstName.equals(that.firstName)) return false;
        return this.lastName.equals(that.lastName);
    }
    @Override
    public int hashCode() {
        int result = this.firstName.hashCode();
        result = 31 * result + this.lastName.hashCode();
        result = 31 * result + this.age;
        return result;
    }
    //this bean has an OPTIONAL constructor that sets all the values
    public PersonBean(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
