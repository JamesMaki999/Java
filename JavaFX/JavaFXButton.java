import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.stage.Stage;

public class JavaFXButton extends Application
{
	/* IBM Advanced Java Programming */
	/* JavaFX Version 16 - Referencing this class for older or younger versions may result in errors */
	/* JavaFXButton.java */
	/* This is a class that simply goes over creating a Button Object in JavaFX */
	/* This class also includes a basic example of hard-coding CSS properties in JavaFX */
	/* James Maki */
	/* September 17 2021 */
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		/* Variable Declaration */
		String exitButtonCSS = "-fx-background-color: #ababad;" +
							   "-fx-border-color: rgb(0, 20, 255);" +
							   "-fx-text-fill: white;" +
							   "-fx-font-size: 18pt;" +
							   "-fx-font-family: 'Courier New';" +
							   "-fx-border-radius: 10;"; /* Smooths the corners */
		
		/* Button */
		Button exitButton = new Button("Exit");
		Tooltip exitButtonTip = new Tooltip("Exit Button"); /* Creates a new Tooltip that shows text when the mouse hovers over the button */
		Tooltip.install(exitButton, exitButtonTip); /* Installs the Tooltip to the Exit Button */
		exitButton.setStyle(exitButtonCSS); /* Sets the background color of the button */
		
		/* Group & Scene */
		Group group = new Group(exitButton);
		Scene scene = new Scene(group, 500, 300);
		
		/* Stage */
		primaryStage.setTitle("JavaFX Button Application");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args)
	{
		launch(args);
	}

}