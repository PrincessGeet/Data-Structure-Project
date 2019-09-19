/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

 
import java.io.InputStream;
 
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
 
public class ButtonEffectDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
 
        FlowPane root = new FlowPane();
        root.setPadding(new Insets(10));
        root.setHgap(10);
        root.setVgap(10);
 
    
 
        InputStream input = //
                getClass().getResourceAsStream("/org/o7planning/javafx/icon/java-32.png");
 
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);
 
        // Button 1
        Button button1 = new Button("JavaFX", imageView);
        
        // Set Style
        button1.setStyle("-fx-font: 22 arial; -fx-base: #b6e7c9;");
 
        root.getChildren().add (button1 );
 
        primaryStage.setTitle("Java Button (o7planning.org)");
 
        Scene scene = new Scene(root, 350, 150);
        primaryStage.setScene(scene);
        primaryStage.show();
 
    }
 
    public static void main(String[] args) {
        Application.launch(args);
    }
 
}