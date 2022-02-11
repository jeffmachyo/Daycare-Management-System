/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package samplefx;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author jeff
 */
public class FileUtil {
    private String parentPasswords = "/home/jeff/Desktop/Daycare Data/ParentPasswords.csv" ;		
    private String childFirstNames = "/home/jeff/Desktop/Daycare Data/ChildFirstNames.csv" ;	
    private String childLastNames = "/home/jeff/Desktop/Daycare Data/ChildLastNames.csv" ;	
    private String childAges = "/home/jeff/Desktop/Daycare Data/childAges.csv" ;	
    private String parentFirstNames = "/home/jeff/Desktop/Daycare Data/ParentFirstNames.csv" ;	
    private String parentLastNames = "/home/jeff/Desktop/Daycare Data/ParentLastNames.csv" ;
    
    private String username,password,firstName=new Parent().getFirstName(),childFirstName;
    private int childAge;
    private Map<String, String> parentPasswordList = new HashMap<>();
    private Map<String, Integer> childAgeList = new HashMap<>();
    private List<String>vList = new ArrayList<>();
    private Map<String, Integer> vaccineList = new HashMap<>();
    private Map<Integer,String> vaccineList1 = new HashMap<>();
    //private static Map<String, Integer> vList = new HashMap<>();
    public Map<String, String> getParentPasswordList() {
        return parentPasswordList;
    }
    
    public void setParentPasswordList(Map<String, String> parentPasswordList) {
        this.parentPasswordList = parentPasswordList;
    }
    private static Map<Integer, String> TeacherUserList = new HashMap<>();
    private static Map<Integer, String> TeacherPasswordList = new HashMap<>();
    private static Map<String, String> parentFirstNameList = new HashMap<>();
    private static Map<String, String> childFirstNameList = new HashMap<>();
//    private static String parentPasswords = "/home/jeff/Desktop/Daycare Data/ParentPasswords.csv" ;
//    private static String parentFirstNames = "/home/jeff/Desktop/Daycare Data/ParentFirstNames.csv" ;
//    private static String childAges = "/home/jeff/Desktop/Daycare Data/childAges.csv" ;
//    private static String childFirstNames = "/home/jeff/Desktop/Daycare Data/ChildFirstNames.csv" ;
    
    public String getParentPasswords() {
        return parentPasswords;
    }
    public void setParentPasswords(String parentPasswords) {
        this.parentPasswords = parentPasswords;
    }

    public void readPasswordsFromCSV() {
        try {
            Scanner inLine = new Scanner(new BufferedReader(new FileReader(parentPasswords)));	
            while (inLine.hasNextLine()) {
                String inputLine = inLine.nextLine();
                Scanner in = new Scanner(inputLine);
                in.useDelimiter(",");
                username = in.next();
                password = in.next();
                parentPasswordList.put(username, password);
                in.close();
            }
	inLine.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
		 
    }
    public void readFirstNamesFromCSV() {
        try {
            Scanner inLine = new Scanner(new BufferedReader(new FileReader(parentFirstNames)));			
            while (inLine.hasNextLine()) {
                String inputLine = inLine.nextLine();
                Scanner in = new Scanner(inputLine);
                in.useDelimiter(",");
                username = in.next();
                firstName = in.next();
                parentFirstNameList.put(username, firstName);
                in.close();
            }
	inLine.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
		 
    }
    public void readChildFirstNamesFromCSV() {
        try {
            Scanner inLine = new Scanner(new BufferedReader(new FileReader(childFirstNames)));			
            while (inLine.hasNextLine()) {
                String inputLine = inLine.nextLine();
                Scanner in = new Scanner(inputLine);
                in.useDelimiter(",");
                username = in.next();
                childFirstName = in.next();
                childFirstNameList.put(username, childFirstName);
                in.close();
            }
	inLine.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
		 
    }
    
    public int readChildAgesFromCSV(String user) {
        this.username = user;
        try {
            Scanner inLine = new Scanner(new BufferedReader(new FileReader(childAges)));			
            while (inLine.hasNextLine()) {
                String inputLine = inLine.nextLine();
                Scanner in = new Scanner(inputLine);
                in.useDelimiter(",");
                username = in.next();
                childAge = in.nextInt();
                childAgeList.put(username, childAge);
                in.close();
            }
	inLine.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
	       loadVaxList(childAgeList.get(user));
               return vList.size();
    }
    public String loadFirstName(String userName){
        readFirstNamesFromCSV();
        return parentFirstNameList.get(userName);
    }
    public String loadChildFirstName(String userName){
        //readChildAgesFromCSV(userName);
        readChildFirstNamesFromCSV();
        return childFirstNameList.get(userName);
    }
    
    public String matchParentPassword(String username) {
        if (LoginCredentials.getParentPasswordList().containsKey(username)){
            return LoginCredentials.getParentPasswordList().get(username);
        }
        else {
            return "Error! This username does not exist";
        }
    }
    
    @Override
    public String toString() {
        return "LoginCredentials [username=" + username + ", password=" + password + "]";
    }
    public static Map<Integer, String> getTeacherUserList() {
        return TeacherUserList;
    }
    public static void setTeacherUserList(Map<Integer, String> teacherUserList) {
        TeacherUserList = teacherUserList;
    }
    public static Map<Integer, String> getTeacherPasswordList() {
        return TeacherPasswordList;
    }
    public static void setTeacherPasswordList(Map<Integer, String> teacherPasswordList) {
        TeacherPasswordList = teacherPasswordList;
    }
//    public String getEmailID() {
//	return emailID;
//    }
//    public void setEmailID(String emailID) {
//	this.emailID = emailID;
//    }
    public String getUsername() {
	return username;
    }
    public void setUsername(String username) {
	this.username = username;
    }
    public String getPassword() {
	return password;
    }
    public void setPassword(String password) {
	this.password = password;
    }
    
    public void loadVaxList(int childAge) {
        vaccineList.put("HepA Dose 1", 0);
        vaccineList.put("HepA Dose 2", 1);
        vaccineList.put("HepA Dose 3", 6);
        vaccineList.put("RV Dose 1", 2);
        vaccineList.put("RV Dose 2", 4);
        vaccineList.put("DTaP Dose 1", 2);
        vaccineList.put("DTaP Dose 2", 4);
        vaccineList.put("DTaP Dose 3", 6);
        vaccineList.put("DTaP Dose 4", 15);
        vaccineList.put("DTaP Dose 5", 48);
        vaccineList.put("HiB Dose 1", 2);
        vaccineList.put("HiB Dose 2", 4);
        vaccineList.put("HiB Dose 3", 6);
        vaccineList.put("HiB Dose 4", 12);
        vaccineList.put("PCV13 Dose 1", 2);
        vaccineList.put("PCV13 Dose 2", 4);
        vaccineList.put("PCV13 Dose 3", 6);
        vaccineList.put("PCV13 Dose 4", 12);
        vaccineList.put("IPV Dose 1", 2);
        vaccineList.put("IPV Dose 2", 4);
        vaccineList.put("IPV Dose 3", 6);
        vaccineList.put("IPV Dose 4", 48);
        vaccineList.put("IIV Dose 1", 12);
        vaccineList.put("IIV Dose 2", 24);
        vaccineList.put("IIV Dose 3", 36);
        vaccineList.put("IIV Dose 4", 48);
        vaccineList.put("IIV Dose 5", 60);
        vaccineList.put("IIV Dose 6", 72);
        vaccineList.put("MMR Dose 1", 12);
        vaccineList.put("MMR Dose 2", 48);
        vaccineList.put("VAR Dose 1", 12);
        vaccineList.put("VAR Dose 2", 48);
        vaccineList.put("HepA Dose 1", 12);
        vaccineList.put("HepA Dose 2", 18);
        vaccineList.put("Meningococcal Dose 1", 132);
        vaccineList.put("Meningococcal Dose 2", 192);
        
       // List<Integer>vList = new ArrayList<>();
        //vaccineList.entrySet().stream().filter((e)->e.getValue()>30).map(Map.Entry::getKey).forEach(e->System.out.println(e));
        vList=vaccineList.entrySet().stream().filter((e)->e.getValue()>childAge).map(Map.Entry::getKey).collect(Collectors.toList());
        //return vList.size();
        
    }
   
    
    
}
