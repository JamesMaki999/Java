import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class JavaFXStackedPane extends Application
{
	/* IBM Advanced Java Programming */
	/* JavaFX Version 16 - Referencing this class for older or younger versions may result in errors */
	/* JavaFXExternalCSS.java */
	/* This is a class that simply goes over using a Stacked Pane in JavaFX */
	/* James Maki */
	/* September 17 2021 */
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		/* Circle */
		Circle circle = new Circle();
		circle.setRadius(145);
		circle.setFill(new Color(0.5, 0.5, 0.5, 0.1));
		circle.setStroke(Color.BLACK); /* Sets a border around the circle */
		circle.setStrokeWidth(5); /* Sets the border width around the circle */
		
		/* Label */
		Label label = new Label("IBM Advanced Java Programming");
		label.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 18));
		
		/* Stacked Pane */
		Pane pane = new StackPane();
		pane.getChildren().add(circle);
		pane.getChildren().add(label);
		/* Can also do pane.getChildren.addAll(circle, label); to add all nodes in a single line of code */
		
		Scene scene = new Scene(pane, 500, 300);
		scene.getStylesheets().add("JavaFXCSS.css"); /* Links the Styles Sheet to the Scene */
		
		/* Stage - Same as JavaFXButton.java */
		primaryStage.setTitle("JavaFX Stacked Pane Application");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args)
	{
		launch(args);
	}

}