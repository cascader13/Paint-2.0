package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

import java.util.Objects;

public class Controller {

    @FXML
    Pane pane;


    public void onClickColor(ActionEvent a) {
        Button button = (Button) a.getSource();
        Main.color = Color.valueOf(button.getId());
    }

    public void onActionFrag(MouseEvent t) {
        if(t.getY() > 0){
            Circle circle = new Circle(15, Main.color);
            circle.relocate(t.getX(), t.getY());
            pane.getChildren().addAll(circle);
        }
    }
}
