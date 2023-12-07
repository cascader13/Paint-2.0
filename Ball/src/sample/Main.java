package sample;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.awt.*;
import java.util.Collection;
import java.util.Objects;


public class Main extends Application {

    public static Color color = Color.DARKVIOLET;
    public static boolean state = false;

    @Override
    public void start(Stage stage) throws Exception {
        Parent loader = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("sample.fxml")));
        Pane pane = new Pane(loader);
        Scene scene = new Scene(pane, 600.0, 388.0);
        stage.setTitle("Paint 2.0");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}