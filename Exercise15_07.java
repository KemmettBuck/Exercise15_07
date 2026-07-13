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
        circle.setStrokeWidth(3);

        // When mouse is pressed, turn circle black
        circle.setOnMousePressed(e -> {
            circle.setFill(Color.BLACK);
        });

        // When mouse is released, turn white
        circle.setOnMouseReleased(e -> {
            circle.setFill(Color.WHITE);
        });

        // Place circle in StackPane
        StackPane pane = new StackPane();
        pane.getChildren().add(circle);

        // Create scene and set on stage
        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setTitle("Exercise15_07");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
