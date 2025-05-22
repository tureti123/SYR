package bam;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.SpinnerValueFactory;
import java.util.ArrayList;
import javafx.scene.control.DatePicker;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javafx.beans.property.SimpleStringProperty;

public class DisplayCoursController {
		@FXML private TableView<Cours> tableView;
		@FXML private TableColumn<Cours, String> idColumn;
		@FXML private TableColumn<Cours, String> CNameColumn;
		@FXML private TableColumn<Cours, String> Enseignant;
		@FXML private TableColumn<Cours, String> Heuredebut;
		@FXML private TableColumn<Cours, String> Heurefin;
		@FXML private TableColumn<Cours, String> Salle;
		@FXML private TableColumn<Cours, String> TypeColumn;
		@FXML
		private void initialize() {
		    loadData();
		}


		 private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

		    @FXML
		    private void loadData() {
		    	System.out.println("tableView est null ? " + (tableView == null));

		    	  for (Cours cou : main.EnsembleCours) {
		              System.out.println("Cours : " + cou.Nom);
		              System.out.println("Enseignant : " + (cou.enseignant != null ? cou.enseignant.Nom : "Aucun"));
		          }
		         
		        ObservableList<Cours> data = FXCollections.observableArrayList(main.EnsembleCours);

		        idColumn.setCellValueFactory(cellData -> 
		            new SimpleStringProperty(String.valueOf(cellData.getValue().Id)));

		        CNameColumn.setCellValueFactory(cellData -> 
		            new SimpleStringProperty(cellData.getValue().Nom));

		        Enseignant.setCellValueFactory(cellData -> 
		            new SimpleStringProperty(
		                cellData.getValue().enseignant != null ? cellData.getValue().enseignant.Nom : "Aucun"));

		        Heuredebut.setCellValueFactory(cellData -> 
		            new SimpleStringProperty(
		                (cellData.getValue().h != null && cellData.getValue().h.HeureDebut != null)
		                    ? cellData.getValue().h.HeureDebut.format(formatter)
		                    : "—"));

		        Heurefin.setCellValueFactory(cellData -> 
		            new SimpleStringProperty(
		                (cellData.getValue().h != null && cellData.getValue().h.HeureFin != null)
		                    ? cellData.getValue().h.HeureFin.format(formatter)
		                    : "—"));

		        Salle.setCellValueFactory(cellData -> 
		            new SimpleStringProperty(
		                cellData.getValue().sdc != null ? cellData.getValue().sdc.Nom : "Non attribuée"));

		        TypeColumn.setCellValueFactory(cellData -> 
		            new SimpleStringProperty(cellData.getValue().Type));

		       
		        tableView.setItems(data);
		    }
		    @FXML
		    private void rmData() {
		        Cours selected = tableView.getSelectionModel().getSelectedItem();
		        if (selected != null) {
		            main.EnsembleCours.remove(selected);
		            tableView.getItems().remove(selected);
		            System.out.println("Cours supprimé : " + selected.Nom);
		        } else {
		            System.out.println("Aucun cours sélectionné.");
		        }
		    }

		    @FXML
		    private void logout() {
		        System.out.println("Déconnexion...");
		        // TODO: Retourner à l’écran de login
		    }
		    
		    @FXML
		    private void dash() { System.out.println("Dashboard"); }
		    @FXML
		    private void homei() { System.out.println("Home"); }
		    @FXML
		    private void users() { System.out.println("Users"); }
		    @FXML
		    private void Courses() { System.out.println("Courses"); }
		    @FXML
		    private void dcourse() { System.out.println("Delete Course"); }
		    @FXML
		    private void duser() { System.out.println("Delete User"); }
		    @FXML
		    private void setting() { System.out.println("Settings"); }    
}