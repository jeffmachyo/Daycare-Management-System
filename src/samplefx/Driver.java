/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package samplefx;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author jeff
 */
public class Driver extends Application {
    
  
    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(Driver.class.getResource("DayCareFXML.fxml"));
        Scene scene = new Scene(root);
        
        primaryStage.initStyle(StageStyle.UNDECORATED);
     
        primaryStage.setTitle("Daycare Management System");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        launch(args);
        
    }
    
}
