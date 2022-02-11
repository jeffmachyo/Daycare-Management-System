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
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javafx.collections.ObservableList;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableView;
import vaccines.DTaP;
import vaccines.Vaccine;

/**
 *
 * @author jeff
 */
public class LoginCredentials {
    private static String path = ClassLoader.getSystemResource("samplefx/Databases/ChildFirstNames.csv").getPath();
    /**
    * For testing login credential retrieval and validation
    */
    private String username,password,firstName=new Parent().getFirstName(),childFirstName;
    private CheckBox teacherCheck;
    private int childAge;
    private static Map<String, String> parentPasswordList = new HashMap<>();
    private static Map<String, String> teacherPasswordList = new HashMap<>();
    private static Map<String, Integer> childAgeList = new HashMap<>();
    private static List<String>vList = new ArrayList<>();
    private static List<Teacher>teacherList = new ArrayList<>();
    private static Map<String, Integer> vaccineList = new HashMap<>();
    private static Map<Integer,String> vaccineList1 = new HashMap<>();
    //private static Map<String, Integer> vList = new HashMap<>();
    public static Map<String, String> getParentPasswordList() {
        return parentPasswordList;
    }
    
    public static void setParentPasswordList(Map<String, String> parentPasswordList) {
        LoginCredentials.parentPasswordList = parentPasswordList;
    }
    //private static Map<Integer, String> TeacherUserList = new HashMap<>();
    //private static Map<Integer, String> TeacherPasswordList = new HashMap<>();
    private static Map<String, String> parentFirstNameList = new HashMap<>();
    private static Map<String, String> childFirstNameList = new HashMap<>();
    private static String parentPasswords = "/home/jeff/Desktop/Daycare Data/ParentPasswords.csv" ;
    private static String parentFirstNames = "/home/jeff/Desktop/Daycare Data/ParentFirstNames.csv" ;
    private static String childAges = "/home/jeff/Desktop/Daycare Data/childAges.csv" ;
    private static String childFirstNames = "/home/jeff/Desktop/Daycare Data/ChildFirstNames.csv" ;
    
    private String teacherPasswords = "/home/jeff/Desktop/Daycare Data/TeacherPasswords.csv" ;		

    public String getTeacherPasswords() {
        return teacherPasswords;
    }
    private String teacherFirstNames = "/home/jeff/Desktop/Daycare Data/TeacherFirstNames.csv" ;	
    private String teacherLastNames = "/home/jeff/Desktop/Daycare Data/TeacherLastNames.csv" ;	
    private String teacherBiograhpies = "/home/jeff/Desktop/Daycare Data/TeacherBio.csv" ;	
    private String hourlyRate = "/home/jeff/Desktop/Daycare Data/HourlyRate.csv" ;
    
    private String teacherMaster = "/home/jeff/Desktop/Daycare Data/MasterTeacherCSV.csv" ;
    private String trialCSV = "/home/jeff/Desktop/Daycare Data/TrialCSV.csv" ;
    private String trialPassword = "/home/jeff/Desktop/Daycare Data/TrialPassword.csv" ;

    public String getTrialCSV() {
        return trialCSV;
    }
    
    public static String getParentPasswords() {
        return parentPasswords;
    }
    public static void setParentPasswords(String parentPasswords) {
        LoginCredentials.parentPasswords = parentPasswords;
    }
    public static Map<String, String> getTeacherPasswordList() {
        return teacherPasswordList;
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
    public String matchTeacherPassword(String username) {
        if (LoginCredentials.getTeacherPasswordList().containsKey(username)){
            return LoginCredentials.getTeacherPasswordList().get(username);
        }
        else {
            return "Error! This username does not exist";
        }
    }
    public void readTeacherPasswordsFromCSV() {
        try {
            Scanner inLine = new Scanner(new BufferedReader(new FileReader(teacherPasswords)));	
            while (inLine.hasNextLine()) {
                String inputLine = inLine.nextLine();
                Scanner in = new Scanner(inputLine);
                in.useDelimiter(",");
                username = in.next();
                password = in.next();
                teacherPasswordList.put(username, password);
                in.close();
            }
	inLine.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
		 
    }
    public void readTeacherPasswordsFromMasterCSV() {
        String teacherFirstName,teacherLastName,teacherEmail,bio;
        double teacherHourlyRate;
        try {
            Scanner inLine = new Scanner(new BufferedReader(new FileReader(teacherMaster)));	
            while (inLine.hasNextLine()) {
                String inputLine = inLine.nextLine();
                Scanner in = new Scanner(inputLine);
                in.useDelimiter(",");
                teacherFirstName = in.next();
                teacherLastName = in.next();
                username = in.next();
                teacherHourlyRate = in.nextDouble();
                bio = in.next();
                password = in.next();
                teacherPasswordList.put(username, password);
                in.close();
            }
	inLine.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
		 
    }
    public void readTeacherMasterFromCSV(TableView table) {
        DayCareFXMLController dx = new DayCareFXMLController();
        //CheckBox cb = new CheckBox();
        String teacherFirstName,teacherLastName,teacherEmail,bio,password;
        double teacherHourlyRate;
        try {
            Scanner inLine = new Scanner(new BufferedReader(new FileReader(teacherMaster)));	
            while (inLine.hasNextLine()) {
                String inputLine = inLine.nextLine();
                Scanner in = new Scanner(inputLine);
                in.useDelimiter(",");
                teacherFirstName = in.next();
                teacherLastName = in.next();
                teacherEmail = in.next();
                teacherHourlyRate = in.nextDouble();
                bio = in.next();
                password = in.next();
                //teacherCheck = new CheckBox();
                teacherList.add(new Teacher(teacherFirstName, teacherLastName,teacherEmail,teacherHourlyRate, bio));
                dx.getObl().add(new Teacher(teacherFirstName, teacherLastName,teacherEmail,teacherHourlyRate, bio));
                //dx.getObl().add(new Teacher(cb, teacherFirstName, teacherLastName, teacherEmail , teacherHourlyRate,bio));
                //dx.getObl().add(new Teacher(teacherFirstName, teacherLastName,teacherEmail,teacherHourlyRate, bio));
                table.setItems(dx.getObl());
               // teacherPasswordList.put(username, password);
                in.close();
            }
	inLine.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
		 
    }
    public void removeTeacherObject(int row) {
        List<String>str = new ArrayList<>();
        DayCareFXMLController dx = new DayCareFXMLController();
        String teacherFirstName,teacherLastName,teacherEmail,bio,password;
        double teacherHourlyRate;
        try {
            Scanner inLine = new Scanner(new BufferedReader(new FileReader(teacherMaster)));	
            while (inLine.hasNextLine()) {
                String inputLine = inLine.nextLine();
                Scanner in = new Scanner(inputLine);
                in.useDelimiter(",");
                teacherFirstName = in.next();
                teacherLastName = in.next();
                teacherEmail = in.next();
                teacherHourlyRate = in.nextDouble();
                bio = in.next();
                password = in.next();
                //teacherList.add(new Teacher(teacherFirstName, teacherLastName,teacherEmail,teacherHourlyRate,bio,password));
                str.add(new Teacher(teacherFirstName, teacherLastName,teacherEmail,teacherHourlyRate,bio,password).toString());
                in.close();
            }
            inLine.close();
            //System.out.println(str);
            if (row>=0 && row<str.size()){
                str.remove(row);
                //System.out.println(str);
                overWriteCSV(str, teacherMaster);   
            }
            
           //anotherCSVtrial(str);
//            for (String s:str){
//               overWriteCSV(s,trialCSV );
//                //System.out.println(s);
//            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
		 
    
    }
    public void loadTrialCSV() {
        List<String>str1 = new Vector<>();
        List<String>str = new ArrayList<>();
        List<Teacher>tlist = new ArrayList<>();
        DayCareFXMLController dx = new DayCareFXMLController();
        String teacherFirstName,teacherLastName,teacherEmail,bio,password;
        double teacherHourlyRate;
        try {
            Scanner inLine = new Scanner(new BufferedReader(new FileReader(teacherMaster)));	
            while (inLine.hasNextLine()) {
                String inputLine = inLine.nextLine();
                Scanner in = new Scanner(inputLine);
                in.useDelimiter(",");
                teacherFirstName = in.next();
                teacherLastName = in.next();
                teacherEmail = in.next();
                teacherHourlyRate = in.nextDouble();
                bio = in.next();
                password = in.next();
                teacherList.add(new Teacher(teacherFirstName, teacherLastName,teacherEmail,teacherHourlyRate,bio,password));
                str1.add(new Teacher(teacherFirstName, teacherLastName,teacherEmail,teacherHourlyRate,bio,password).toString());
                in.close();
            }
            inLine.close();
            System.out.println(teacherList.toString());
            
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
    }
    public void removePassword(int row, String fileName) {
        List<String>str = new ArrayList<>();
        DayCareFXMLController dx = new DayCareFXMLController();
        String teacherFirstName,teacherLastName,teacherEmail,bio;
        double teacherHourlyRate;
        try {
            Scanner inLine = new Scanner(new BufferedReader(new FileReader(fileName)));	
            while (inLine.hasNextLine()) {
                String inputLine = inLine.nextLine();
                Scanner in = new Scanner(inputLine);
                in.useDelimiter(",");
                teacherFirstName = in.next();
                teacherLastName = in.next();
//                teacherEmail = in.next();
//                teacherHourlyRate = in.nextDouble();
//                bio = in.next();
                //teacherList.add(new Teacher(teacherFirstName, teacherLastName));
                str.add(new Teacher(teacherFirstName, teacherLastName).toString());
                //str = String.valueOf(teacherList);
                in.close();
            }
            inLine.close();
            System.out.println(str);
            if (row>=0 && row<str.size()){
                str.remove(row);
                System.out.println(str);
                overWriteCSV(str, fileName);   
            }
            
           //anotherCSVtrial(str);
//            for (String s:str){
//               overWriteCSV(s,trialCSV );
//                //System.out.println(s);
//            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
		 
    
    }
//    public void removePassword(int row,String fileName){
//        List<String>str = new ArrayList<>();
//        DayCareFXMLController dx = new DayCareFXMLController();
//        String teacherFirstName,teacherPassword;
//        
//        try {
//            Scanner inLine = new Scanner(new BufferedReader(new FileReader(fileName)));	
//            while (inLine.hasNextLine()) {
//                String inputLine = inLine.nextLine();
//                Scanner in = new Scanner(inputLine);
//                in.useDelimiter(",");
//                teacherFirstName = in.next();
//                teacherPassword = in.next();
//                teacherEmail = in.next();
//                teacherHourlyRate = in.nextDouble();
//                bio = in.next();
//                teacherList.add(new Teacher(teacherFirstName, teacherLastName,teacherEmail,teacherHourlyRate,bio));
//                str.add(new Teacher(teacherFirstName, teacherLastName,teacherEmail,teacherHourlyRate,bio).toString());
//                in.close();
//            }
//            inLine.close();
//            System.out.println(str);
//            if (row>=0 && row<str.size()){
//                str.remove(row);
//                System.out.println(str);
//                overWriteCSV(str, fileName);   
//            }
//            
//           //anotherCSVtrial(str);
////            for (String s:str){
////               overWriteCSV(s,trialCSV );
////                //System.out.println(s);
////            }
//        }
//        catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
    //}
    public void TrialCSVReader(Teacher item) {
        List<String>str = new ArrayList<>();
       // item = new Teacher(Monisha, Kaltenborn, m.kaltenborn@school.edu, 35.15);
         DayCareFXMLController dx = new DayCareFXMLController();
        //CheckBox cb = new CheckBox();
        String teacherFirstName,teacherLastName,teacherEmail,bio;
        double teacherHourlyRate;
        try {
            Scanner inLine = new Scanner(new BufferedReader(new FileReader(trialCSV)));	
            while (inLine.hasNextLine()) {
                String inputLine = inLine.nextLine();
                Scanner in = new Scanner(inputLine);
                in.useDelimiter(",");
                teacherFirstName = in.next();
                teacherLastName = in.next();
                teacherEmail = in.next();
                teacherHourlyRate = in.nextDouble();
                bio = in.next();
                //teacherCheck = new CheckBox();
                //teacherList.add(new Teacher(teacherFirstName, teacherLastName));
                //str.add(new Teacher(teacherFirstName, teacherLastName).toString());
                teacherList.add(new Teacher(teacherFirstName, teacherLastName,teacherEmail,teacherHourlyRate));
                str.add(new Teacher(teacherFirstName, teacherLastName,teacherEmail,teacherHourlyRate).toString());
                //dx.getObl().add(new Teacher(teacherFirstName, teacherLastName,teacherEmail,teacherHourlyRate, bio));
                //System.out.println(teacherList.indexOf(item));
                System.out.println(str.contains(item.toString()));
                //System.out.println(str.indexOf(item.toString()));
                //dx.getObl().add(new Teacher(cb, teacherFirstName, teacherLastName, teacherEmail , teacherHourlyRate,bio));
                //dx.getObl().add(new Teacher(teacherFirstName, teacherLastName,teacherEmail,teacherHourlyRate, bio));
                //table.setItems(dx.getObl());
               // teacherPasswordList.put(username, password);
               /**
                * Teacher{emailID=m.kaltenborn@school.edu, hourlyRate=35.15, teacherBio=Monisha is a dedicated daycare professional with over 20 years experience in daycare services. Prior to joining NU Daycare, teacherListCheckBox=null}

                */
                in.close();
            }
            inLine.close();
            System.out.println(str);
            str.remove(2);
            System.out.println(str);
            overWriteCSV(str, trialCSV);
           //anotherCSVtrial(str);
//            for (String s:str){
//               overWriteCSV(s,trialCSV );
//                //System.out.println(s);
//            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
		 
    }
    private void overWriteCSV(List <String> teacherObj,String fileName) {
        try {			
            FileWriter fw = new FileWriter(fileName,false);
            BufferedWriter out= new BufferedWriter(fw);
            for (String s:teacherObj){
                out.append(s);
            
                out.newLine();
                out.flush();
            }
            out.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
	}
		
    }
    
//    @Override
//    public String toString() {
//        return "LoginCredentials [username=" + username + ", password=" + password + "]";
//    }
    
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
    public void anotherCSVtrial(List<String> fixedLines){
        List<String> inputLines = new ArrayList<>();
        try {
           inputLines = Files.readAllLines(Paths.get(trialCSV), StandardCharsets.UTF_8);
        } catch (IOException ex) {
            Logger.getLogger(LoginCredentials.class.getName()).log(Level.SEVERE, null, ex);
        }

        // = new ArrayList<>(inputLines.size());

//        for(String line: inputLines){
//        fixedLines.add(line.replace("NaN", "2.5"));
//        }

        try {
            Files.write(
                    Paths.get(trialCSV),
                    fixedLines,
                    StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE
            );
        } catch (IOException ex) {
            Logger.getLogger(LoginCredentials.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    
	/**
	 * Testing purposes only
	 * @param args
	 */
    
    public boolean vaccineCheck(int vaccineDose) {
        //vaccine.vaccineRules();
        return (5>vaccineDose);
    }
    
    public static void main(String args[]) {
        //Teacher tc = new Teacher(childFirstNames, path, path, 0);
        Teacher item = new Teacher("Monisha", "Kaltenborn","m.kaltenborn@school.edu",35.15);
        //Monisha,Kaltenborn,m.kaltenborn@school.edu,35.15,null
        //System.out.println(item.toString());
        LoginCredentials cr = new LoginCredentials();
        //cr.loadTrialCSV();
        //cr.removeTeacherObject(2);
        //cr.TrialCSVReader(item);
        //cr.removeObject(4,cr.getTeacherPasswords());
        //cr.removePassword(4, cr.getTeacherPasswords());
//        List
//        System.out.println("samplefx.LoginCredentials.main()");
        }

    
    
}
