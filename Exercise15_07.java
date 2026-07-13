/**
 * Exercise15_07
 * Display circle that turns black when mouse is pressed
 * and white when mouse is released
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Exercise15_07 extends Application {
    @Override
    public void start(Stage primaryStage) {

        // Create circle with radius 100, default color white
        Circle circle = new Circle(100);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(2);
    }
}
