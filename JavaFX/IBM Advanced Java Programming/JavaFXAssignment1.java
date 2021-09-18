import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavaFXAssignment1 extends Application
{
	/* IBM Advanced Java Programming */
	/* JavaFX Version 16 - Referencing this class for older or younger versions may result in errors */
	/* JavaFXAssignment1.java */
	/* This is a class that simply goes over creating a student course registration form UI in JavaFX */
	/* James Maki */
	/* September 17 2021 */
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		/* registrationText Text Object */
		Text registrationText = new Text("Course Registration");
		registrationText.setFill(Color.DARKRED);
		registrationText.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 18));
		
		/* courseRegistration Text Object */
		Text courseRegistration = new Text("Please Fill Out");
		courseRegistration.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 15));
		
		/* Submit Button */
		Button submitButton = new Button("Submit");
		Tooltip submitButtonTT = new Tooltip("Submit Button");
		Tooltip.install(submitButton, submitButtonTT);
		
		/* Reset Button */
		Button resetButton = new Button("Reset");
		Tooltip resetButtonTT = new Tooltip("Reset Button");
		Tooltip.install(resetButton, resetButtonTT);
		
		/* Course ChoiceBox */
		ChoiceBox courseBox =  new ChoiceBox(FXCollections.observableArrayList("ACC 1015", "BIO 2613", "CSC 4211", "CHM 8754", "CRJ 1101", "JPN 5101", "MTH 4123", "REL 7717"));
		Tooltip courseBoxTT = new Tooltip("Please Select a Course");
		Tooltip.install(courseBox, courseBoxTT);
		
		/* Radio Buttons */
		RadioButton studentRadio = new RadioButton("Racine");
		RadioButton facultyRadio = new RadioButton("Kenosha");
		RadioButton staffRadio = new RadioButton("Staff");
		RadioButton otherRadio = new RadioButton("Other");
		
		/* Toggle Group */
		ToggleGroup radioGroup = new ToggleGroup();
		studentRadio.setToggleGroup(radioGroup);
		facultyRadio.setToggleGroup(radioGroup);
		staffRadio.setToggleGroup(radioGroup);
		otherRadio.setToggleGroup(radioGroup);
		
		/* GridPane */
		GridPane pane = new GridPane();
		pane.setHgap(6);
		pane.setVgap(6);
		pane.setAlignment(Pos.CENTER);
		
		/* GridPane - Registration Text */
		pane.add(registrationText, 0, 0);
		GridPane.setHalignment(registrationText, HPos.LEFT);
		pane.add(courseRegistration, 0, 1);
		
		/* GridPane - First Name Label & TextField */
		pane.add(new Label("First Name"), 0, 2);
		pane.add(new TextField(), 1, 2);
		
		/* GridPane - Last Name Label & TextField */
		pane.add(new Label("Last Name"), 0, 3);
		pane.add(new TextField(), 1, 3);
		
		/* GridPane - Email Address Label & TextField */
		pane.add(new Label("Email Address"), 0, 4);
		pane.add(new TextField(), 1, 4);
		
		/* GridPane - Phone Number Label & TextField */
		pane.add(new Label("Phone Number"), 0, 5);
		pane.add(new TextField(), 1, 5);
		
		/* GridPane - Course ChoiceBox */
		pane.add(new Label("Program"), 0, 6);
		pane.add(courseBox, 1, 6);
		
		/* GridPane - Radio Buttons */
		pane.add(new Label("Please select a user type"), 0, 7);
		pane.add(studentRadio, 0, 8);
		pane.add(facultyRadio, 0, 9);
		pane.add(staffRadio, 0, 10);
		pane.add(otherRadio, 0, 11);
		
		/* GridPane - Submit & Reset Button */
		pane.add(submitButton, 0, 12);
		GridPane.setHalignment(submitButton, HPos.RIGHT);
		pane.add(resetButton, 1, 12);
		
		/* Scene */
		Scene scene = new Scene(pane, 400, 400);
		
		/* Stage */
		primaryStage.setTitle("JavaFX Assignment 1 Application");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args)
	{
		launch(args);
	}

}