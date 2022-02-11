/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package samplefx;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author jeff
 */
public class DayCareFXMLController implements Initializable {

    /**
     * @return the obl
     */
    public ObservableList<Teacher> getObl() {
        return obl;
    }

    /**
     * @param obl the obl to set
     */
    public void setObl(ObservableList<Teacher> obl) {
        this.obl = obl;
    }

    @FXML
    private Button adminLoginBtn;
    @FXML
    private Pane adminLoginOptions;
    @FXML
    private Pane dummyPane;
    @FXML
    private Pane adminLoginPane;
    @FXML
    private TextField txtAdminUsername;
    @FXML
    private PasswordField pwdAdminPassword;
    @FXML
    private Pane adminHomePage;
    @FXML
    private Pane addTeacherPanel;
    @FXML
    private TextField txtTeacherFirstName;
    @FXML
    private TextArea txtTeacherBio;
    @FXML
    private TextField txtTeacherLastName;
    @FXML
    private Button teacherSignUpButton;
    @FXML
    private TextField txtTeacherEmail;
    @FXML
    private PasswordField pwdTeacherPass;
    @FXML
    private TextField txtConfirmTeacherEmail;
    @FXML
    private PasswordField pwdTeacherConfirmPass;
    @FXML
    private TextField txtHourlyRate;
    @FXML
    private Pane manageTeachersDisplay;
    @FXML
    private TableView<Teacher> teacherTable;
    @FXML
    private TableColumn<Teacher, CheckBox> teacherSelector;
    @FXML
    private TableColumn<Teacher, String> teacherTableFirstName;
    @FXML
    private TableColumn<Teacher, String> teacherTableLastName;
    @FXML
    private TableColumn<Teacher, String> teacherTableEmail;
    @FXML
    private TableColumn<Teacher, Double> teacherTableHourlyRate;
    @FXML
    private TableColumn<Teacher, String> teacherTableBio;

    /**
     * @return the mainHomePane
     */
//    public TableView getTeacherTable() {
//        return teacherTable;
//    }
    
    public Pane getMainHomePane() {
        return mainHomePane;
    }

    @FXML
    private BorderPane mainPane;
    @FXML
    private StackPane optionsArea;
    @FXML
    private StackPane mainArea;
    private Pane pane1;
    @FXML
    private Pane loginHomePane;
    @FXML
    private Pane loginOptionsPane;
    @FXML
    private Button parentLoginBtn;
    @FXML
    private Button teacherLoginBtn;
    @FXML
    private Pane mainHomePane;
    @FXML
    private Pane parentLoginPane;
    @FXML
    private Pane teacherLoginPane;
    @FXML
    private Pane parentLoginOptions;
    @FXML
    private Pane teacherLoginOptions;
    @FXML
    private Pane parentHomePage;
    @FXML
    private Pane teacherHomePage;
    @FXML
    private Pane signUpPanel;
   
    private String parentPasswords = "/home/jeff/Desktop/Daycare Data/ParentPasswords.csv" ;		
    private String childFirstNames = "/home/jeff/Desktop/Daycare Data/ChildFirstNames.csv" ;	
    private String childLastNames = "/home/jeff/Desktop/Daycare Data/ChildLastNames.csv" ;	
    private String childAges = "/home/jeff/Desktop/Daycare Data/childAges.csv" ;	
    private String parentFirstNames = "/home/jeff/Desktop/Daycare Data/ParentFirstNames.csv" ;	
    private String parentLastNames = "/home/jeff/Desktop/Daycare Data/ParentLastNames.csv" ;
    
    private String teacherPasswords = "/home/jeff/Desktop/Daycare Data/TeacherPasswords.csv" ;		
    private String teacherFirstNames = "/home/jeff/Desktop/Daycare Data/TeacherFirstNames.csv" ;	
    private String teacherLastNames = "/home/jeff/Desktop/Daycare Data/TeacherLastNames.csv" ;	
    //private String teacherAges = "/home/jeff/Desktop/Daycare Data/TeacherAges.csv" ;	
    private String teacherBiograhpies = "/home/jeff/Desktop/Daycare Data/TeacherBio.csv" ;	
    private String hourlyRate = "/home/jeff/Desktop/Daycare Data/HourlyRate.csv" ;
    
    private String masterTeacherCSV = "/home/jeff/Desktop/Daycare Data/MasterTeacherCSV.csv" ;
    private LoginCredentials cred = new LoginCredentials();
    private FileUtil fut = new FileUtil();
    private String currentUser = "Parent";
   
    @FXML
    private PasswordField pwdParentPassword;
    @FXML
    private TextField txtParentUsername_1;
    @FXML
    private TextField txtTeacherUsername;
    @FXML
    private PasswordField pwdTeacherpassword_1;
    @FXML
    private Button signUpButton;
    @FXML
    private TextField txtEmailId;
    @FXML
    private TextField txtConfirmemailid;
    @FXML
    private PasswordField pwdPasswordnew;
    @FXML
    private PasswordField pwdPassnew;
    @FXML
    private TextField txtChildName;
    @FXML
    private TextField txtParentFirstName;
    @FXML
    private TextField txtChildAge;
    @FXML
    private TextField txtChildLastName;
    @FXML
    private TextField txtParentLastName;
    @FXML
    private Label userLabel;
    @FXML
    private Label identifierLbl;
    @FXML
    private Pane vaxInfoPane;
    @FXML
    private ImageView vaxRulesImage;
    @FXML
    private Pane mainLoginPane;
    @FXML
    private Label childVaxStatus;
    
    private ObservableList<Teacher> obl = FXCollections.observableArrayList();
    
      /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        getOptionsArea().getChildren().removeAll();
        getOptionsArea().getChildren().setAll(loginHomePane); 
        getMainArea().getChildren().removeAll();
        getMainArea().getChildren().setAll(getMainHomePane());
        identifierLbl.setText("Home");
        
    }    
    public void loginOptionsActivation(javafx.event.ActionEvent actionEvent)throws IOException {
        getOptionsArea().getChildren().removeAll();
        getOptionsArea().getChildren().setAll(loginOptionsPane);
        getMainArea().getChildren().removeAll();
        getMainArea().getChildren().setAll(mainLoginPane);
            
    }
    public void parentLoginActivation(javafx.event.ActionEvent actionEvent)throws IOException {
        getOptionsArea().getChildren().removeAll();
        getOptionsArea().getChildren().setAll(loginOptionsPane);
          
        getMainArea().getChildren().removeAll();
        getMainArea().getChildren().setAll(parentLoginPane);
    }
    public void loginHomeActivation(javafx.event.ActionEvent actionEvent)throws IOException {
        getOptionsArea().getChildren().removeAll();
        getOptionsArea().getChildren().setAll(loginHomePane);
    }
    public void mainHomeActivation(javafx.event.ActionEvent actionEvent)throws IOException {
        getMainArea().getChildren().removeAll();
        getMainArea().getChildren().setAll(mainHomePane);
        identifierLbl.setText("Home");
    }
    public void teacherLoginActivation(javafx.event.ActionEvent actionEvent)throws IOException {
        getOptionsArea().getChildren().removeAll();
        getOptionsArea().getChildren().setAll(loginOptionsPane);
          
        getMainArea().getChildren().removeAll();
        getMainArea().getChildren().setAll(teacherLoginPane);
    }
    public void adminLoginActivation(javafx.event.ActionEvent actionEvent)throws IOException {
        getOptionsArea().getChildren().removeAll();
        getOptionsArea().getChildren().setAll(loginOptionsPane);
          
        getMainArea().getChildren().removeAll();
        getMainArea().getChildren().setAll(adminLoginPane);
    }
    public void teacherHomePageActivation(javafx.event.ActionEvent actionEvent)throws IOException {
        getOptionsArea().getChildren().removeAll();
        getOptionsArea().getChildren().setAll(teacherLoginOptions);
          
        getMainArea().getChildren().removeAll();
        getMainArea().getChildren().setAll(teacherHomePage);
    }
    public void adminHomePageActivation(javafx.event.ActionEvent actionEvent)throws IOException {
        getOptionsArea().getChildren().removeAll();
        getOptionsArea().getChildren().setAll(adminLoginOptions);
          
        getMainArea().getChildren().removeAll();
        getMainArea().getChildren().setAll(adminHomePage);
    }
    public void parentHomePageActivation(javafx.event.ActionEvent actionEvent)throws IOException {
        getOptionsArea().getChildren().removeAll();
        getOptionsArea().getChildren().setAll(parentLoginOptions);
          
        getMainArea().getChildren().removeAll();
        getMainArea().getChildren().setAll(parentHomePage);
    }
    public void signUpPageActivation(javafx.event.ActionEvent actionEvent) throws IOException {
        getOptionsArea().getChildren().removeAll();
        getOptionsArea().getChildren().setAll(loginHomePane);
          
        getMainArea().getChildren().removeAll();
        getMainArea().getChildren().setAll(signUpPanel);
    }
    public void vaccineInfoPageActivation(javafx.event.ActionEvent actionEvent)throws IOException {
        getOptionsArea().getChildren().removeAll();
        getOptionsArea().getChildren().setAll(loginHomePane); 
        getMainArea().getChildren().removeAll();
        getMainArea().getChildren().setAll(vaxInfoPane);
    }
    private void writeToCSV(String userEmail, String parameter, String fileName) {
        try {			
            FileWriter fw = new FileWriter(fileName,true);
            BufferedWriter out= new BufferedWriter(fw);
			
            out.append(userEmail);
            out.append(",");
            out.append(parameter);
			
            out.newLine();
			
            out.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
	}
		
    }
    
    private void writeToMainCSV(String firstName, String lastName, String email, String hourlyRate,String bio, String password, String fileName) {
        try {			
            FileWriter fw = new FileWriter(fileName,true);
            BufferedWriter out= new BufferedWriter(fw);
			
            out.append(firstName);
            out.append(",");
            out.append(lastName);
            out.append(",");
            out.append(email);
            out.append(",");
            out.append(hourlyRate);
            out.append(",");
            out.append(bio);
            out.append(",");
            out.append(password);
            out.newLine();
			
            out.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
	}
		
    }
    
    @FXML
    private void loadHomePanel(ActionEvent event) {
        try {
            loginHomeActivation(event);
            mainHomeActivation(event);
            identifierLbl.setText("Home");
        }
        catch(IOException e) {
            e.printStackTrace();
           
        }
    }

    @FXML
    private void loadLoginPanel(ActionEvent event) {
        
        try {
            cred.readPasswordsFromCSV();
            cred.readTeacherPasswordsFromMasterCSV();
            
	} 
        catch (Exception e) {
            e.printStackTrace();
	}
        try {
            loginOptionsActivation(event);
            identifierLbl.setText("Login");
             
        }
        catch(IOException e) {
            e.printStackTrace();
           
       }
    }

    @FXML
    private void loadSignUpPanel(ActionEvent event) {
        try {
            signUpPageActivation(event);
            identifierLbl.setText("Sign Up");
             
        }
        catch (IOException e) {
            e.printStackTrace();
           
       }
    }

    @FXML
    private void loadVaccineInfo(ActionEvent event) {
        try {
            vaccineInfoPageActivation(event);
            identifierLbl.setText("Vaccine Info");
             
        }
        catch (IOException e) {
            e.printStackTrace();
           
       }
     
    }

    @FXML
    private void exitProgram(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ConfirmExitFXML.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root1));
            stage.show();
                
        }
        catch(Exception e){
            e.printStackTrace();
        }
        //System.exit(0);
    }

    /**
     * @return the mainPane
     */
    public BorderPane getMainPane() {
        return mainPane;
    }

    /**
     * @param mainPane the mainPane to set
     */
    public void setMainPane(BorderPane mainPane) {
        this.mainPane = mainPane;
    }

    /**
     * @return the optionsArea
     */
    public StackPane getOptionsArea() {
        return optionsArea;
    }

    /**
     * @param optionsArea the optionsArea to set
     */
    public void setOptionsArea(StackPane optionsArea) {
        this.optionsArea = optionsArea;
    }

    /**
     * @return the mainArea
     */
    public StackPane getMainArea() {
        return mainArea;
    }

    /**
     * @param mainArea the mainArea to set
     */
    public void setMainArea(StackPane mainArea) {
        this.mainArea = mainArea;
    }

    @FXML
    @SuppressWarnings("CallToPrintStackTrace")
    private void parentLogin(ActionEvent event) {
        
        try {
            parentLoginActivation(event);
            identifierLbl.setText("Parent Login");
        }
        catch(IOException e) {
            e.printStackTrace();
           
        }
    }

    @FXML
    @SuppressWarnings("CallToPrintStackTrace")
    private void teacherLogin(ActionEvent event) {
        try {
            teacherLoginActivation(event);
            identifierLbl.setText("Teacher Login");
        }
        catch(IOException e) {
            e.printStackTrace();
           
        }
    }

    @FXML
    private void parentLoginConfirmed(ActionEvent event) {
        //LoginCredentials cr = new LoginCredentials();
	String userName = txtParentUsername_1.getText();
	@SuppressWarnings("deprecation")
	String password = pwdParentPassword.getText();
				
	if (cred.matchParentPassword(userName).equals(password)) {
            
            userLabel.setText("Welcome "+cred.loadFirstName(userName));
            identifierLbl.setText(cred.loadFirstName(userName)+"'s Dashboard");
            childVaxStatus.setText(cred.loadChildFirstName(userName)+" has "+String.valueOf(cred.readChildAgesFromCSV(userName))+" vaccines remaining");
				
            txtParentUsername_1.setText(null);
            pwdParentPassword.setText(null);
            try {
                parentHomePageActivation(event);
            }
            catch(IOException e) {
                e.printStackTrace();
            }
  		
        }
	else {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ErrorFXML.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.initStyle(StageStyle.UNDECORATED);
                stage.setScene(new Scene(root1));
                stage.show();
                txtParentUsername_1.setText(null);
                pwdParentPassword.setText(null);
            }
            catch(Exception e){
                 e.printStackTrace();
            }
				
	}
    }
       
    @FXML
    private void teacherLoginConfirmed(ActionEvent event) {
        String userName = txtTeacherUsername.getText();
	@SuppressWarnings("deprecation")
	String password = pwdTeacherpassword_1.getText();
        
        if (cred.matchTeacherPassword(userName).equals(password)) {				
            txtTeacherUsername.setText(null);
            pwdTeacherpassword_1.setText(null);
                
            try {
                teacherHomePageActivation(event);
            }
            catch(IOException e) {
                e.printStackTrace();
            }
				
        }
        else {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ErrorFXML.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.initStyle(StageStyle.UNDECORATED);
                stage.setScene(new Scene(root1));
                stage.show();
                txtTeacherUsername.setText(null);
                pwdTeacherpassword_1.setText(null);
            }
            catch(Exception e) {
                e.printStackTrace();        
            }
        }
    }

    @FXML
    private void confirmSignUp(ActionEvent event) {
        String emailId = txtEmailId.getText();
	String userName1 = txtConfirmemailid.getText();
	@SuppressWarnings("deprecation")
	String password1 = pwdPasswordnew.getText();
	@SuppressWarnings("deprecation")
	String password = pwdPassnew.getText();
				
	/**
	 * Verifying the login details
	*/
	if (LoginCredentials.getParentPasswordList().containsKey(userName1)) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("UserExistsErrorFXML.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.initStyle(StageStyle.UNDECORATED);
                stage.setScene(new Scene(root1));
                stage.show();
                //txtParentUsername_1.setText(null);
                //pwdParentPassword.setText(null);
            }
            catch(Exception e) {
                 e.printStackTrace();
            }
	}
	else {
            if (emailId.equals(userName1)&& (password.equals(password1))) {
		String childFirstName = txtChildName.getText();
		String childLastName = txtChildLastName.getText();
		String childAge = txtChildAge.getText();
		String parentFirstName = txtParentFirstName.getText();
		String parentLastName = txtParentLastName.getText();
	
					
                if (childAge.trim().isEmpty() || emailId.trim().isEmpty() || userName1.trim().isEmpty() || password1.trim().isEmpty() || password.trim().isEmpty() || childFirstName.trim().isEmpty() || childLastName.trim().isEmpty() || parentFirstName.trim().isEmpty() || parentLastName.trim().isEmpty()) {
                    try {
                        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MissingFieldErrorFXML.fxml"));
                        Parent root1 = (Parent) fxmlLoader.load();
                        Stage stage = new Stage();
                        stage.initStyle(StageStyle.UNDECORATED);
                        stage.setScene(new Scene(root1));
                        stage.show();
                    }
                    catch(Exception e){
                        e.printStackTrace();        
                    }
                }
                else {
                    writeToCSV(userName1, password1,parentPasswords);
                    writeToCSV(userName1, childFirstName,childFirstNames);
                    writeToCSV(userName1, childLastName,childLastNames);
                    writeToCSV(userName1, childAge,childAges);
                    writeToCSV(userName1, parentFirstName,parentFirstNames);
                    writeToCSV(userName1, parentLastName,parentLastNames);
					
                    try {
                        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SignUpSuccessFXML.fxml"));
                        Parent root1 = (Parent) fxmlLoader.load();
                        Stage stage = new Stage();
                        stage.initStyle(StageStyle.UNDECORATED);
                        stage.setScene(new Scene(root1));
                        stage.show();
                    }
                    catch(Exception e) {
                        e.printStackTrace();        
                    }                               
                    txtEmailId.setText(null);
                    txtConfirmemailid.setText(null);
                    pwdPasswordnew.setText(null);
                    pwdPassnew.setText(null);
                    txtChildName.setText(null);
                    txtChildLastName.setText(null);
                    txtChildAge.setText(null);
                    txtParentFirstName.setText(null);
                    txtParentLastName.setText(null);
                    }
					
            }		
            else {
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ErrorFXML.fxml"));
                    Parent root1 = (Parent) fxmlLoader.load();
                    Stage stage = new Stage();
                    stage.initStyle(StageStyle.UNDECORATED);
                    stage.setScene(new Scene(root1));
                    stage.show();
                }
                catch(Exception e) {
                    e.printStackTrace();        
                }     
            }
        }
    }

    @FXML
    private void adminLogin(ActionEvent event) {
        try {
            adminLoginActivation(event);
            identifierLbl.setText("Admin Login");
        }
        catch(IOException e) {
            e.printStackTrace();
           
        }
        
    }

    @FXML
    private void adminLoginConfirmed(ActionEvent event) {
        String userName = txtAdminUsername.getText();
	@SuppressWarnings("deprecation")
	String password = pwdAdminPassword.getText();
        
        if (password.equals("admin")&& userName.equals("admin")) {				
            txtAdminUsername.setText(null);
            pwdAdminPassword.setText(null);
                
            try {
                adminHomePageActivation(event);
            }
            catch(IOException e) {
                e.printStackTrace();
            }
				
        }
        else {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ErrorFXML.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.initStyle(StageStyle.UNDECORATED);
                stage.setScene(new Scene(root1));
                stage.show();
                txtAdminUsername.setText(null);
                pwdAdminPassword.setText(null);
            }
            catch(Exception e) {
                e.printStackTrace();        
            }
        }
    }

    @FXML
    private void fromSignUpToHome(ActionEvent event) {
        
        try {
            mainHomeActivation(event);
            
            txtEmailId.setText(null);
            txtConfirmemailid.setText(null);
            pwdPasswordnew.setText(null);
            pwdPassnew.setText(null);
            txtChildName.setText(null);
            txtChildLastName.setText(null);
            txtChildAge.setText(null);
            txtParentFirstName.setText(null);
            txtParentLastName.setText(null);
        
        }
        catch(IOException e) {
            e.printStackTrace();
           
        }
        
        
    }

    private void fromAddTeacherToAdminHome(ActionEvent event) {
        
        getMainArea().getChildren().removeAll();
        getMainArea().getChildren().setAll(adminHomePage);
        
    }

    @FXML
    private void confirmTeacherSignUp(ActionEvent event) {
        String emailId = txtTeacherEmail.getText();
	String userName1 = txtConfirmTeacherEmail.getText();
	@SuppressWarnings("deprecation")
	String password1 = pwdTeacherPass.getText();
	@SuppressWarnings("deprecation")
	String password = pwdTeacherConfirmPass.getText();
				
	/**
	 * Verifying the login details
	*/
	if (LoginCredentials.getParentPasswordList().containsKey(userName1)) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("UserExistsErrorFXML.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.initStyle(StageStyle.UNDECORATED);
                stage.setScene(new Scene(root1));
                stage.show();
                //txtParentUsername_1.setText(null);
                //pwdParentPassword.setText(null);
            }
            catch(Exception e) {
                 e.printStackTrace();
            }
	}
	else {
            if (emailId.equals(userName1)&& (password.equals(password1))) {
		String teacherFirstName = txtTeacherFirstName.getText();
		String teacherLastName = txtTeacherLastName.getText();
		String teacherHourlyRate = txtHourlyRate.getText();
		String teacherBio = txtTeacherBio.getText();
		//String parentLastName = txtParentLastName.getText();
	
					
                if (teacherFirstName.trim().isEmpty() || emailId.trim().isEmpty() || userName1.trim().isEmpty() || password1.trim().isEmpty() || password.trim().isEmpty() || teacherLastName.trim().isEmpty() || teacherHourlyRate.trim().isEmpty() || teacherBio.trim().isEmpty()) {
                    try {
                        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MissingFieldErrorFXML.fxml"));
                        Parent root1 = (Parent) fxmlLoader.load();
                        Stage stage = new Stage();
                        stage.initStyle(StageStyle.UNDECORATED);
                        stage.setScene(new Scene(root1));
                        stage.show();
                    }
                    catch(Exception e){
                        e.printStackTrace();        
                    }
                }
                else {

                    writeToMainCSV(teacherFirstName, teacherLastName, userName1, teacherHourlyRate, teacherBio,password1, masterTeacherCSV);
                   
                    try {
                        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SignUpSuccessFXML.fxml"));
                        Parent root1 = (Parent) fxmlLoader.load();
                        Stage stage = new Stage();
                        stage.initStyle(StageStyle.UNDECORATED);
                        stage.setScene(new Scene(root1));
                        stage.show();
                    }
                    catch(Exception e) {
                        e.printStackTrace();        
                    }                               
                    txtTeacherEmail.setText(null);
                    txtConfirmTeacherEmail.setText(null);
                    pwdTeacherPass.setText(null);
                    pwdTeacherConfirmPass.setText(null);
                    txtTeacherFirstName.setText(null);
                    txtTeacherLastName.setText(null);
                    txtHourlyRate.setText(null);
                    txtTeacherBio.setText(null);
                    //txtParentLastName.setText(null);
                    }
					
            }		
            else {
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ErrorFXML.fxml"));
                    Parent root1 = (Parent) fxmlLoader.load();
                    Stage stage = new Stage();
                    stage.initStyle(StageStyle.UNDECORATED);
                    stage.setScene(new Scene(root1));
                    stage.show();
                }
                catch(Exception e) {
                    e.printStackTrace();        
                }     
            }
        }
    }

    @FXML
    private void loadAdminDashboard(ActionEvent event) {
        //getMainArea().getChildren().removeAll();
        //getMainArea().getChildren().setAll(addTeacherPanel);
    }

    @FXML
    private void activateManageTeachers(ActionEvent event) {
        loadTeacherTable();
        getMainArea().getChildren().removeAll();
        getMainArea().getChildren().setAll(manageTeachersDisplay);
    }

    @FXML
    private void addTeacherAction(ActionEvent event) {
        getMainArea().getChildren().removeAll();
        getMainArea().getChildren().setAll(addTeacherPanel);
    }

    @FXML
    private void backToAddTeacher(ActionEvent event) {
        loadTeacherTable();
        getMainArea().getChildren().removeAll();
        getMainArea().getChildren().setAll(manageTeachersDisplay);
    }
    public void loadTeacherTable() {
        //teacherSelector.setCellValueFactory(new PropertyValueFactory<>("teacherListCheckBox"));
        teacherTableFirstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        teacherTableLastName.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        teacherTableEmail.setCellValueFactory(new PropertyValueFactory<>("emailID"));
        teacherTableHourlyRate.setCellValueFactory(new PropertyValueFactory<>("hourlyRate"));
        teacherTableBio.setCellValueFactory(new PropertyValueFactory<>("teacherBio"));
        
        cred.readTeacherMasterFromCSV(teacherTable);
    }

    @FXML
    private void removeTeacherAction(ActionEvent event) {

        removeTeacher();
        
    }
    public void removeTeacher() {
        ObservableList<Teacher> allItems, oneItem;
        allItems = teacherTable.getItems();
        oneItem = teacherTable.getSelectionModel().getSelectedItems();
        TablePosition pos = teacherTable.getSelectionModel().getSelectedCells().get(0);
        int row = pos.getRow();
        cred.removeTeacherObject(row);
        
       oneItem.forEach(allItems::remove);
    }

    public TableView<Teacher> getTeacherTable() {
        return teacherTable;
    }
    
    
}
