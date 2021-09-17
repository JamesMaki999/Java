import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class JavaFXLineObject extends Application
{
	/* IBM Advanced Java Programming */
	/* JavaFX Version 16 - Referencing this class for older or younger versions may result in errors */
	/* JavaFXLineObject.java */
	/* This is an introductory class that simply goes over creating a Line Object in JavaFX */
	/* James Maki */
	/* September 17 2021 */
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		/* Horizontal Line */
		Line horizontalLine = new Line();
		/* Horizontal Line Start Points */
		horizontalLine.setStartX(50);
		horizontalLine.setStartY(150);
		/* Horizontal Line End Points */
		horizontalLine.setEndX(450);
		horizontalLine.setEndY(150);
		
		/* Vertical Line */
		Line verticalLine = new Line();
		/* Horizontal Line Start Points */
		verticalLine.setStartX(250);
		verticalLine.setStartY(50);
		/* Horizontal Line End Points */
		verticalLine.setEndX(250);
		verticalLine.setEndY(250);
		
		/* Group & Scene */
		Group group = new Group(horizontalLine, verticalLine);
		Scene scene = new Scene(group, 500, 300);
		
		/* Stage */
		primaryStage.setTitle("JavaFX Line Object Application");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args)
	{
		launch(args);
	}

}