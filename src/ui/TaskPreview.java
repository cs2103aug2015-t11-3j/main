package ui;

import java.awt.ScrollPane;

import org.joda.time.DateTime;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class TaskPreview extends StackPane{

	Label header;
	Label titleLabel;
	Label startLabel;
	Label endLabel;	
	Label recurringLabel;
	
	Label tempTitle;
	Label tempStartTime;
	Label tempEndTime;
	Label tempRecurring;
	
	public TaskPreview(String title, DateTime startTime, DateTime endTime) {
		
		header = new Label("Add new task");
		header.setTextFill(Color.LIGHTGREEN);
		header.setPrefHeight(30);
		titleLabel = new Label("Title:");
		titleLabel.setId("taskPreviewLabel");
		startLabel = new Label("Start:");
		startLabel.setId("taskPreviewLabel");
		endLabel = new Label("End:");	
		endLabel.setId("taskPreviewLabel");
		recurringLabel = new Label("Repeat:");
		recurringLabel.setId("taskPreviewLabel");
		
		tempTitle  = new Label();
		tempTitle.setId("taskPreviewDetails");
		tempStartTime = new Label();
		tempStartTime.setId("taskPreviewDetails");
		tempEndTime = new Label();
		tempEndTime.setId("taskPreviewDetails");
		tempRecurring = new Label();
		
		header.setText("Add new task");
		header.setFont(Font.font("SansSerif", FontWeight.BOLD, 16));
		
		GridPane taskPreviewLayout = new GridPane();
		GridPane.setConstraints(header, 0, 0, 2, 1);
		GridPane.setConstraints(titleLabel, 0, 1);
		GridPane.setConstraints(startLabel, 0, 2);
		GridPane.setConstraints(endLabel, 0, 3);
		GridPane.setConstraints(recurringLabel, 0, 4);
		GridPane.setConstraints(tempTitle, 1, 1);
		GridPane.setConstraints(tempStartTime, 1, 2);
		GridPane.setConstraints(tempEndTime, 1, 3);
		GridPane.setConstraints(tempRecurring, 1, 4);
		//GridPane.setConstraints();		
		
		
		taskPreviewLayout.setPrefSize(700, 50);
		taskPreviewLayout.setPadding(new Insets(20,20,20,20));
		taskPreviewLayout.setStyle("-fx-background-color: rgba(0,0,0,0.3); -fx-background-radius:20");
		taskPreviewLayout.getChildren().addAll(header, titleLabel, startLabel, endLabel, recurringLabel, tempTitle, tempStartTime, tempEndTime, tempRecurring);
		
		this.getChildren().addAll(taskPreviewLayout);
		this.setPrefSize(700, 50);
		this.setStyle("-fx-background-color: rgba(255,255,255,0.3)");
		this.setPadding(new Insets(200,50,100,50));
	}

}
