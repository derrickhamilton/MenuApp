/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author csc190
 */
public class MenuApp extends Application implements API {
    protected Label descLabel = new Label();
    protected Label priceLabel = new Label();
    protected ImageView iv = new ImageView();
    
    @Override
    public void start(Stage primaryStage) {
        NavController nav = new NavController(new Config(), this);
        nav.displayDish();
        Button btn1 = new Button();
        btn1.setText("Prev");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                nav.movePrev();
            }
        });
        
        Button btn2 = new Button();
        btn2.setText("Next");
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                nav.moveNext();
            }
        });
        
        GridPane gp = new GridPane();
        gp.add(iv, 0, 0, 2, 2);
        gp.add(descLabel, 0, 2, 1, 1);
        gp.add(priceLabel, 1, 2, 1, 1);
        gp.add(btn1, 0, 3, 1, 1);
        gp.add(btn2, 1, 3, 1, 1);
        
        Scene scene = new Scene(gp, 250, 275);
        
        primaryStage.setTitle("SmartRestaurant");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void displayPic(String picPath) {
        try {
            FileInputStream fis = new FileInputStream(new File(picPath));
            Image pic = new Image(fis);
            iv.setImage(pic);
        } catch (FileNotFoundException ex) {
            System.out.println("file not found");
        }
    }

    @Override
    public void displayDesc(String desc) {
        descLabel.setText(desc);
    }

    @Override
    public void displayPrice(double price) {
        priceLabel.setText(String.valueOf(price));
    }
    
}
