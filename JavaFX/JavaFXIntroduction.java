import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class JavaFXIntroduction extends Application
{
	/* IBM Advanced Java Programming */
	/* JavaFX Version 16 - Referencing this class for older or younger versions may result in errors */
	/* JavaFXIntroduction.java */
	/* This is an introductory class that simply goes over setting up and launching a scene */
	/* James Maki */
	/* September 16 2021 */
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		/* Group is a class that is part of JavaFX. A Group contains the number of nodes. */
		/* A Group will take on the collective bounds of its children and is not directly resizable. */
		Group group = new Group(); //Root
		
		/* The JavaFX Scene class is the container for all content in a scene graph. The background of the scene is filled as specified by the fill property. */
		/* The application must specify the root Node for the scene graph by setting the root property. If a Group is used as the root, */
		/* the contents of the scene graph will be clipped by the scene's width and height and changes to the scene's size (if user resizes the stage) */
		/* will not alter the layout of the scene graph. If a resizable node (layout Region or Control is set as the root, then the root's size will track */
		/* the scene's size, causing the contents to be relayed out as necessary. The scene's size may be initialized by the application during construction. */
		/* If no size is specified, the scene will automatically compute its initial size based on the preferred size of its content. */
		/* If only one dimension is specified, the other dimension is computed using the specified dimension, respecting content bias of a root. */
		Scene scene = new Scene(group, 500, 300); /* Creates a new scene, including the root and specifies the dimensions of the application */
		scene.setFill(Color.ALICEBLUE); /* Sets the color of the scene from javafx.scene.paint.Color */
		
		/* Stage */
		primaryStage.setTitle("JavaFX Introduction Application"); /* Sets Stage Title */
		primaryStage.setScene(scene); /* Sets the Scene for the stage method */
		primaryStage.show(); /* Shows the scene */
	}

	public static void main(String[] args)
	{
		/* The launch method launches the application, typically from the main method() */
		/* Launch must not be called more than once or an exception will be called */
		/* Launch Format: */
		/* Application.launch([Class Name]); */
		launch(args);
	}

}