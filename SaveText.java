/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
/**
 *
 * @author Student
 */
public class SaveText extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Data Structure");
        Group root = new Group();
        Button buttonSave = new Button("Save");
        
        
          TextArea textArea = new TextArea();        
        buttonSave.setOnAction((ActionEvent event) -> {
            FileChooser fileChooser = new FileChooser();
             
            //Set extension filter
            FileChooser.ExtensionFilter extFilter = 
                new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
            fileChooser.getExtensionFilters().add(extFilter);
             
            //Show save file dialog
            File file = fileChooser.showSaveDialog(primaryStage);
             
            if(file != null){
                SaveFile(textArea.getText(), file);
            }
        });
         
        VBox vBox = new VBox();
        vBox.getChildren().addAll( buttonSave , textArea);
         
        root.getChildren().add(vBox);
         
        primaryStage.setScene(new Scene(root, 500, 400));
        primaryStage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
 
    private void SaveFile(String content, File file){
        try {
            FileWriter fileWriter;
              
            fileWriter = new FileWriter(file);
            fileWriter.write(content);
            fileWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(SaveText.class
                .getName()).log(Level.SEVERE, null, ex);
        }
          
    }
     
}
