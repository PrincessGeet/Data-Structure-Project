/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javax.swing.JFileChooser;
  
public class MainClass extends Application {  
public static void main(String[] args) {  
launch(args);  

    }

    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("Data Structure");
        stage.setWidth(900);
        stage.setHeight(990);

        VBox vbox = new VBox();
        vbox.setLayoutX(10);
        vbox.setLayoutY(15);

        Button button1 = new Button("Open");
        button1.setStyle("-fx-font: 22 arial; -fx-base: #b6e7c9;");
        button1.setOnAction(new EventHandler<ActionEvent>() {
           
            @Override public void handle(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String filename= f.getAbsolutePath();
         TextArea textArea = new TextArea();
        System.out.println(textArea.getText());

            textArea.setText("Clicked!");
            
//                try {
//                    FileReader reader reader = new FileReader(filename);
//                    BufferedReader br=new BufferedReader(reader);
//            textArea.read(br, null);
//           // br.close();
//            TextArea.requestFocus();
//                } catch (FileNotFoundException ex) {
//                    Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
//                }
            
  
            }
        });
        VBox vbox1 = new VBox();
        vbox1.setLayoutX(100);
        vbox1.setLayoutY(15);
Button button2 = new Button("Save");
button2.setStyle("-fx-font: 22 arial; -fx-base: #b6e7c9;");
vbox1.getChildren().add(button2);
        vbox1.setSpacing(20);
        ((Group)scene.getRoot()).getChildren().add(vbox1);

        vbox.getChildren().add(button1);
        vbox.setSpacing(10);
        ((Group)scene.getRoot()).getChildren().add(vbox);

        
        
        
        
        
        stage.setScene(scene);
        stage.show();
    }
}


