import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class JavaFXExternalCSS extends Application
{
	/* IBM Advanced Java Programming */
	/* JavaFX Version 16 - Referencing this class for older or younger versions may result in errors */
	/* JavaFXExternalCSS.java */
	/* This is a class that simply goes over using an external .css file for styling in JavaFX */
	/* James Maki */
	/* September 17 2021 */
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		
		
		/* Button - Same as JavaFXButton.java */
		Button exitButton = new Button("Exit");
		Tooltip exitButtonTip = new Tooltip("Exit Button"); /* Creates a new Tooltip that shows text when the mouse hovers over the button */
		Tooltip.install(exitButton, exitButtonTip); /* Installs the Tooltip to the Exit Button */
		exitButton.setId("javaFXExternalCSS"); /* Sets the ID of where in the .css file that we will be grabbing the values from  */
		
		/* HBox & Scene */
		HBox root = new HBox();
		root.getChildren().add(exitButton);
		Scene scene = new Scene(root, 500, 300);
		scene.getStylesheets().add("JavaFXCSS.css"); /* Links the Styles Sheet to the Scene */
		
		/* Stage - Same as JavaFXButton.java */
		primaryStage.setTitle("JavaFX Button Application");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args)
	{
		launch(args);
	}

}