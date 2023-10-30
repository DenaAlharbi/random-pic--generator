package com.example.mylab15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new Pane();
        int n = (int) (Math.random() * 3);
        ArrayList<Image> myImages = new ArrayList<>();
        Image img1 = new Image("C:\\\\Users\\\\denaa\\\\OneDrive\\\\Desktop\\\\javaprojects\\\\pics\\\\download.jpg");
        Image img2 = new Image("C:\\\\Users\\\\denaa\\\\OneDrive\\\\Desktop\\\\javaprojects\\\\pics\\\\download (1).jpg");
        Image img3 = new Image("C:\\\\Users\\\\denaa\\\\OneDrive\\\\Desktop\\\\javaprojects\\\\pics\\\\d.jpg");

        myImages.add(img1);
        myImages.add(img2);
        myImages.add(img3);

        ImageView theSelectedImage = new ImageView(myImages.get(n));
        pane.getChildren().add(theSelectedImage);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

