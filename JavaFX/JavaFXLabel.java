import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class JavaFXLabel extends Application
{
	/* IBM Advanced Java Programming */
	/* JavaFX Version 16 - Referencing this class for older or younger versions may result in errors */
	/* JavaFXLabel.java */
	/* This is an introductory class that simply goes over creating a label in JavaFX */
	/* James Maki */
	/* September 16 2021 */
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		/* Label is a non-editable text control. */
		Label label = new Label("This is how you do a JavaFX Label.");
		
		/* Group & Scene */
		Group group = new Group(label);
		Scene scene = new Scene(group, 600, 300);
		
		/* Stage */
		primaryStage.setTitle("JavaFX Label Application");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args)
	{
		launch(args);
	}

}