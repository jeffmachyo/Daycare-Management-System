/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package samplefx;

/**
 *
 * @author jeff
 */
public class Parent extends Person {
    private String emailID,parentPassword;
    private boolean subscription;
    //private String emailID,teacherBio,teacherPassword;
    public Parent() {
        super();
    }

    public Parent(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Parent(String emailID, String firstName, String lastName) {
        super(firstName, lastName);
        this.emailID = emailID;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getParentPassword() {
        return parentPassword;
    }

    public boolean isSubscription() {
        return subscription;
    }


    
    
}
