/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package samplefx;

import javafx.scene.control.CheckBox;

/**
 *
 * @author jeff
 */
public abstract class Person {
    protected String firstName, lastName;
    protected int age;
    

    public int getAge() {
        return age;
    }
    public Person(int age) {
        this.age = age;
    }
    
    
    
    public void setAge(int age) {
        this.age = age;
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public Person() {
        super();
       
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(firstName).append(",").append(lastName);
        return sb.toString();
        //return "Person{" + "firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + '}';
    } 
}
