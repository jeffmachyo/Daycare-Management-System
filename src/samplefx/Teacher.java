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
public class Teacher extends Person {
    private String emailID,teacherBio,teacherPassword;
    private double hourlyRate;
    
    
    private CheckBox teacherListCheckBox;

    public Teacher() {
        super();
    }

    public Teacher(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Teacher(String firstName,String lastName, String emailID, double hourlyRate, String teacherBio) {
        super(firstName, lastName);
        this.emailID = emailID;
        this.hourlyRate = hourlyRate;
        this.teacherBio = teacherBio;
        
    }
    public Teacher(CheckBox teacherBox,String firstName,String lastName, String emailID, double hourlyRate, String teacherBio) {
        super(firstName, lastName);
        this.emailID = emailID;
        this.hourlyRate = hourlyRate;
        this.teacherBio = teacherBio;
        teacherBox = new CheckBox();
    }
    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public String getTeacherBio() {
        return teacherBio;
    }

    public void setTeacherBio(String teacherBio) {
        this.teacherBio = teacherBio;
    }


    public String getTeacherPassword() {
        return teacherPassword;
    }

    public void setTeacherPassword(String teacherPassword) {
        this.teacherPassword = teacherPassword;
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
    public Teacher(String firstName, String lastName, String emailID, double hourlyRate, String teacherBio, String teacherPassword) {
        super(firstName, lastName);
        this.emailID = emailID;
        this.teacherBio = teacherBio;
        this.teacherPassword = teacherPassword;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String toString() {
       
        StringBuilder sb1 = new StringBuilder();
        sb1.append(firstName).append(",").append(lastName).append(",").append(emailID).append(",").append(hourlyRate).append(",").append(teacherBio).append(",").append(teacherPassword);
        
        return sb1.toString();
        //return "Teacher{" + "emailID=" + emailID + ", hourlyRate=" + hourlyRate + ", teacherBio=" + teacherBio + ", teacherListCheckBox=" + teacherListCheckBox + '}';
    }

    public Teacher(String firstName, String lastName, String emailID, double hourlyRate) {
        super(firstName, lastName);
        this.emailID = emailID;
        this.hourlyRate = hourlyRate;
    }
    
    
}
