import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class JavaFXHBox extends Application
{
	/* IBM Advanced Java Programming */
	/* JavaFX Version 16 - Referencing this class for older or younger versions may result in errors */
	/* JavaFXHBox.java */
	/* This is a class that simply goes over changing the layout behind the scene from Group to HBox in JavaFX */
	/* James Maki */
	/* September 17 2021 */
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		/* Variable Declaration - Same as JavaFXButton.java */
		String exitButtonCSS = "-fx-background-color: #ababad;" +
							   "-fx-border-color: rgb(0, 20, 255);" +
							   "-fx-text-fill: white;" +
							   "-fx-font-size: 18pt;" +
							   "-fx-font-family: 'Courier New';" +
							   "-fx-border-radius: 10;"; /* Smooths the corners */
		
		/* Button - Same as JavaFXButton.java */
		Button exitButton = new Button("Exit");
		Tooltip exitButtonTip = new Tooltip("Exit Button"); /* Creates a new Tooltip that shows text when the mouse hovers over the button */
		Tooltip.install(exitButton, exitButtonTip); /* Installs the Tooltip to the Exit Button */
		exitButton.setStyle(exitButtonCSS); /* Sets the background color of the button */
		
		/* HBox & Scene */
		/* Group group = new Group(exitButton); - Commented out so you can see the difference */
		HBox root = new HBox();
		root.getChildren().add(exitButton);
		Scene scene = new Scene(root, 500, 300);
		
		/* Stage - Same as JavaFXButton.java */
		primaryStage.setTitle("JavaFX HBox Application");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args)
	{
		launch(args);
	}

}