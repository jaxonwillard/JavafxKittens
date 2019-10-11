import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class inClassClown extends Application {
    public void start(Stage stage){
        Pane pane = new Pane();
        Scene scene = new Scene(pane);
        stage.setHeight(500);
        stage.setWidth(500);

        Arc mouth = new Arc(200, 350, 150, 90.0, 0, 180);
        mouth.setRotate(180);
        mouth.setFill(Color.RED);
        mouth.setStroke(Color.BLACK);
        Arc nose = new Arc(200, 200, 30, 45, 0, 180);
        nose.setFill(Color.BLUE);
        Arc leftEye = new Arc(100, 100, 30, 50, 0, 360);
        Arc rightEye = new Arc(300, 100, 30, 50, 0, 360);
        Arc rightEyeGlint = new Arc(300, 110, 10, 40, 0, 360);
        rightEyeGlint.setFill(Color.GREEN);
        Arc leftEyeGlint = new Arc(100, 110, 10, 40, 0, 360);
        leftEyeGlint.setFill(Color.GREEN);

        Arc head = new Arc(200, 250, 200, 115, 0, 360);
        head.setFill(Color.YELLOW);



        pane.getChildren().add(head);
        pane.getChildren().add(rightEye);
        pane.getChildren().add(mouth);
        pane.getChildren().add(nose);
        pane.getChildren().add(leftEye);
        pane.getChildren().add(rightEyeGlint);
        pane.getChildren().add(leftEyeGlint);

        stage.setScene(scene);
        stage.show();


    }
}
