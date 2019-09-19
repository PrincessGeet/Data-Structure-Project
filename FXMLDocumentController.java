/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javax.swing.JFileChooser;

/**
 *
 * @author Student
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
//        JFileChooser chooser = new JFileChooser();
//        chooser.showOpenDialog(null);
//        File f=chooser.getSelectedFile();
//        String filename= f.getAbsolutePath();
//        try{
//            FileReader reader= new FileReader(filename);
//            BufferedReader br=new BufferedReader(reader);
//            jTextArea.read(br, null);
//            br.close();
//            jTextArea.requestFocus();
//            
//        }
//        catch(Exception e){
//            jOptionPane.showMessageDialog(null, e);
//        }
//        System.out.println("You clicked me!");
//        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
