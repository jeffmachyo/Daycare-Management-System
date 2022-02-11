/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package samplefx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TablePosition;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author jeff
 */
public class ConfirmRemoveTeacherFXMLController implements Initializable {
    
    @FXML
    private Button closebuttonNo;
    @FXML
    private Button closeButtonYes;

    /**
     * Initializes the controller class.
     */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void refuseCloseAction(ActionEvent event) {
        Stage stage = (Stage) closebuttonNo.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void confirmClose(ActionEvent event) {
        DayCareFXMLController d = new DayCareFXMLController();
        d.removeTeacher();
        Stage stage = (Stage) closeButtonYes.getScene().getWindow();
        stage.close();
    }
    
}

//    /**
//     * Initializes the controller class.
//     */
//    @Override
//    public void initialize(URL url, ResourceBundle rb) {
//        // TODO
//    }    
//
//    @FXML
//    private void refuseCloseAction(ActionEvent event) {
//        Stage stage = (Stage) closebuttonNo.getScene().getWindow();
//        stage.close();
//        
//    }
//
//    @FXML
//    private void confirmClose(ActionEvent event) {
//        System.exit(0);
//    }
    