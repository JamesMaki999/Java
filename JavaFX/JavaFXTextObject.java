import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavaFXTextObject extends Application
{
	/* IBM Advanced Java Programming */
	/* JavaFX Version 16 - Referencing this class for older or younger versions may result in errors */
	/* JavaFXTextObject.java */
	/* This is an introductory class that simply goes over creating a Text Object in JavaFX */
	/* James Maki */
	/* September 17 2021 */
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		/* Text Object */
		Text textObject = new Text();
		textObject.setFont(new Font(20)); /* Unit of measurement used for font size is point */
		textObject.setX(50);
		textObject.setY(150);
		textObject.setText("This is how you make a JavaFX Text Object");
		
		/* Group & Scene */
		Group group = new Group(textObject);
		Scene scene = new Scene(group, 500, 300);
		
		/* Stage */
		primaryStage.setTitle("JavaFX Text Object Application");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args)
	{
		launch(args);

	}

}