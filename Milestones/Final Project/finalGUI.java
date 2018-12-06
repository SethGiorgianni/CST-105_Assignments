//Seth Giorgianni This Work is my own.
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.FileInputStream;
import java.util.ArrayList;

import javafx.scene.control.cell.PropertyValueFactory;



public class finalGUI extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception{
		
		//Creates Outline for GUI
		HBox hbox = new HBox(30);
		VBox vbox = new VBox(10);
		VBox vbox2 = new VBox(10);
		HBox hbox2 = new HBox(10);
		StackPane stackpane = new StackPane();
		//**************Creates Roster Selection**********************
		ListView<String> listView = new ListView<String>();
		listView.getItems().add("All Players");
		listView.getItems().add("My Roster");
		listView.getItems().add("Last Search");
		listView.setPrefWidth(100);
		listView.setPrefHeight(75);
		//****************Creates Search Choice Box********************
		ChoiceBox<String> choiceBox = new ChoiceBox<String>();
		choiceBox.getItems().add("Search By Name");
		choiceBox.getItems().add("Search By Postion");
		choiceBox.getItems().add("Search By College");
		//***************Creates Search Text Field*********************
		Label label = new Label("Enter Search Value");
		TextField textField = new TextField();
		//*************Inserts Logo***********************
		FileInputStream input = new FileInputStream("F:\\Programs\\EclipseWorkplace\\CST-105NFLDraft\\src\\logo.png");
		Image image = new Image(input);
		ImageView imageView = new ImageView(image);
		//****************Creates Table Columns********************
		TableView <NFLPlayer>tblAllPlayer = new TableView<>();
		tblAllPlayer.setMinSize(1000, 400);
		TableColumn colName = new TableColumn("Name");
		TableColumn colCollege = new TableColumn("College");
		TableColumn colPostion = new TableColumn("Position");
		TableColumn colAge = new TableColumn("Age");
		TableColumn colGamesPlayed = new TableColumn("Games Played");
		TableColumn colGamesWon = new TableColumn("Games Won");
		TableColumn colGamesStarted = new TableColumn("Games Started");
		TableColumn colGameStartAverage = new TableColumn("Game Start Average");
		TableColumn colGameWinAverage = new TableColumn("Game Win Average");
		TableColumn colSalary = new TableColumn("Salary");
		//*******************Creates Table Columns*******************
		TableView <NFLPlayer>tblMyRoster = new TableView<>();
		tblMyRoster.setMinSize(1000, 400);
		TableColumn colMyRostName = new TableColumn("Name");
		TableColumn colMyRostCollege = new TableColumn("College");
		TableColumn colMyRostPostion = new TableColumn("Position");
		TableColumn colMyRostAge = new TableColumn("Age");
		TableColumn colMyRostGamesPlayed = new TableColumn("Games Played");
		TableColumn colMyRostGamesWon = new TableColumn("Games Won");
		TableColumn colMyRostGamesStarted = new TableColumn("Games Started");
		TableColumn colMyRostGameStartAverage = new TableColumn("Game Start Average");
		TableColumn colMyRostGameWinAverage = new TableColumn("Game Win Average");
		TableColumn colMyRostSalary = new TableColumn("Salary");
		//*******************Creates Table Columns*******************
		TableView <NFLPlayer>tblSearch = new TableView<>();
		tblSearch.setMinSize(1000, 400);
		TableColumn colSearchName = new TableColumn("Name");
		TableColumn colSearchCollege = new TableColumn("College");
		TableColumn colSearchPostion = new TableColumn("Position");
		TableColumn colSearchAge = new TableColumn("Age");
		TableColumn colSearchGamesPlayed = new TableColumn("Games Played");
		TableColumn colSearchGamesWon = new TableColumn("Games Won");
		TableColumn colSearchGamesStarted = new TableColumn("Games Started");
		TableColumn colSearchGameStartAverage = new TableColumn("Game Start Average");
		TableColumn colSearchGameWinAverage = new TableColumn("Game Win Average");
		TableColumn colSearchSalary = new TableColumn("Salary");
		//***************************************
		tblAllPlayer.getColumns().addAll(colName, colCollege,	colPostion, colAge, colGamesPlayed, colGamesWon, colGamesStarted, colGameStartAverage, colGameWinAverage, colSalary); 
		//***************************************
		tblMyRoster.getColumns().addAll(colMyRostName, colMyRostCollege,colMyRostPostion, colMyRostAge, colMyRostGamesPlayed, colMyRostGamesWon, colMyRostGamesStarted, colMyRostGameStartAverage, colMyRostGameWinAverage, colMyRostSalary);
		//***************************************
		tblSearch.getColumns().addAll(colSearchName, colSearchCollege,colSearchPostion, colSearchAge, colSearchGamesPlayed, colSearchGamesWon, colSearchGamesStarted, colSearchGameStartAverage, colSearchGameWinAverage, colSearchSalary); 
		//**************Fills the Table with information*************************
		NFLPlayerManager managePlayerObject = new NFLPlayerManager();
		managePlayerObject.createPlayers();
		
		ObservableList<NFLPlayer> playerObj = 
				FXCollections.observableArrayList(managePlayerObject.NFLPlayerArray);
		
		tblAllPlayer.setItems(playerObj);
		//***************************************
		colName.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("name"));
		colCollege.setCellValueFactory(
				new PropertyValueFactory<NFLPlayer, String>("college"));
		colPostion.setCellValueFactory(
				new PropertyValueFactory<NFLPlayer, String>("position"));
		colAge.setCellValueFactory(
				new PropertyValueFactory<NFLPlayer, String>("age"));
		colGamesPlayed.setCellValueFactory(
				new PropertyValueFactory<NFLPlayer, String>("gamesPlayed"));
		colGamesWon.setCellValueFactory(
				new PropertyValueFactory<NFLPlayer, String>("gamesWon"));
		colGamesStarted.setCellValueFactory(
				new PropertyValueFactory<NFLPlayer, String>("gamesStarted"));
		colGameStartAverage.setCellValueFactory(
				new PropertyValueFactory<NFLPlayer, String>("gameStartAverage"));
		colGameWinAverage.setCellValueFactory(
				new PropertyValueFactory<NFLPlayer, String>("gameWinAverage"));
		colSalary.setCellValueFactory(
				new PropertyValueFactory<NFLPlayer, String>("salary"));
		
		//******************************************
		colMyRostName.setCellValueFactory(
				new PropertyValueFactory<NFLPlayer, String>("name"));
		colMyRostCollege.setCellValueFactory(
				new PropertyValueFactory<NFLPlayer, String>("college"));
		colMyRostPostion.setCellValueFactory(
				new PropertyValueFactory<NFLPlayer, String>("position"));
		colMyRostAge.setCellValueFactory(
				new PropertyValueFactory<NFLPlayer, String>("age"));
		colMyRostGamesPlayed.setCellValueFactory(
				new PropertyValueFactory<NFLPlayer, String>("gamesPlayed"));
		colMyRostGamesWon.setCellValueFactory(
				new PropertyValueFactory<NFLPlayer, String>("gamesWon"));
		colMyRostGamesStarted.setCellValueFactory(
				new PropertyValueFactory<NFLPlayer, String>("gamesStarted"));
		colMyRostGameStartAverage.setCellValueFactory(
				new PropertyValueFactory<NFLPlayer, String>("gameStartAverage"));
		colMyRostGameWinAverage.setCellValueFactory(
				new PropertyValueFactory<NFLPlayer, String>("gameWinAverage"));
		colMyRostSalary.setCellValueFactory(
				new PropertyValueFactory<NFLPlayer, String>("salary"));
		//********************************************
		colSearchName.setCellValueFactory(new PropertyValueFactory<NFLPlayer, String>("name"));
		colSearchCollege.setCellValueFactory(
				new PropertyValueFactory<NFLPlayer, String>("college"));
		colSearchPostion.setCellValueFactory(
				new PropertyValueFactory<NFLPlayer, String>("position"));
		colSearchAge.setCellValueFactory(
				new PropertyValueFactory<NFLPlayer, String>("age"));
		colSearchGamesPlayed.setCellValueFactory(
				new PropertyValueFactory<NFLPlayer, String>("gamesPlayed"));
		colSearchGamesWon.setCellValueFactory(
				new PropertyValueFactory<NFLPlayer, String>("gamesWon"));
		colSearchGamesStarted.setCellValueFactory(
				new PropertyValueFactory<NFLPlayer, String>("gamesStarted"));
		colSearchGameStartAverage.setCellValueFactory(
				new PropertyValueFactory<NFLPlayer, String>("gameStartAverage"));
		colSearchGameWinAverage.setCellValueFactory(
				new PropertyValueFactory<NFLPlayer, String>("gameWinAverage"));
		colSearchSalary.setCellValueFactory(
				new PropertyValueFactory<NFLPlayer, String>("salary"));
		
		//******************************************
		//********************Creates Buttons****************************
		Button btnSearch = new Button("Search");
		Button btnDraft = new Button("Draft To Team");
		Button btnRemove = new Button("Remove From Team");
		//***************Fills in GUI with elements*********************************
		//TODO Add imageView
		vbox.getChildren().addAll(listView, choiceBox, label, textField, btnSearch,imageView);
		hbox2.getChildren().addAll(btnDraft, btnRemove);
		vbox2.getChildren().addAll(stackpane, hbox2);
		stackpane.getChildren().addAll(tblAllPlayer,tblMyRoster,tblSearch);
		hbox.getChildren().addAll(vbox,vbox2);
		
		Scene scene = new Scene(hbox);
		
		//***************Creates Scene*****************************s
		primaryStage.setTitle("NFL Draft Application");
		primaryStage.setScene(scene);
		primaryStage.show();
	
		//*****************Remove Button Functionality***************************
		btnRemove.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				int index = listView.getSelectionModel().getSelectedIndex();
				if (index == 1) {
					NFLPlayer player = tblMyRoster.getSelectionModel().getSelectedItem();
					tblMyRoster.getItems().remove(player);
				}

			}
		}
		);
		//********************Draft Button Functionality************************
		btnDraft.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				if(tblAllPlayer.isVisible() == true) {
					NFLPlayer player = tblAllPlayer.getSelectionModel().getSelectedItem();
					tblMyRoster.getItems().add(player);
					tblAllPlayer.getSelectionModel().clearSelection();
				}
				else if(tblSearch.isVisible() == true) {
					NFLPlayer player = tblSearch.getSelectionModel().getSelectedItem();
					tblMyRoster.getItems().add(player);
					tblSearch.getSelectionModel().clearSelection();
				}
			}
		}
		);
		//**********************Change Between Rosters**********************
		listView.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent e) {
				int index = listView.getSelectionModel().getSelectedIndex();
				if (index ==0) {
					tblAllPlayer.setVisible(true);
					tblMyRoster.setVisible(false);
					tblSearch.setVisible(false);
				}
				
				else if (index == 1) {
					tblAllPlayer.setVisible(false);
					tblMyRoster.setVisible(true);
					tblSearch.setVisible(false);
				}
				else if (index == 2) {
					tblAllPlayer.setVisible(false);
					tblMyRoster.setVisible(false);
					tblSearch.setVisible(true);
				}
			}
		}
		);
		//*********************Search Button*******************************************
		btnSearch.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				ObservableList<NFLPlayer> playerObj = tblAllPlayer.getItems();
				for (int x=0; x<playerObj.size(); x++) {
					NFLPlayer player = playerObj.get(x);
					tblSearch.getItems().remove(player);
					}
				int index = choiceBox.getSelectionModel().getSelectedIndex();
				if (index == 0) {
					for (int x=0; x<playerObj.size(); x++) {
						if (playerObj.get(x).getName().equals(textField.getText())) {
							NFLPlayer player = playerObj.get(x);
							tblSearch.getItems().add(player);
						}
					}
				}
				else if (index == 1) {
					for (int x=0; x<playerObj.size(); x++) {
						if (playerObj.get(x).getPosition().equals(textField.getText())) {
							NFLPlayer player = playerObj.get(x);
							tblSearch.getItems().add(player);
						}
					}
				}
				else if (index == 2) {
					for (int x=0; x<playerObj.size(); x++) {
						if (playerObj.get(x).getCollege().equals(textField.getText())) {
							NFLPlayer player = playerObj.get(x);
							tblSearch.getItems().add(player);
						}
					}
				}
				tblAllPlayer.setVisible(false);
				tblMyRoster.setVisible(false);
				tblSearch.setVisible(true);
			}
		}
		);
	}
					
		
	
	
	
	
	
	
	public static void main(String[] args) {
		Application.launch(args);

	}

}
