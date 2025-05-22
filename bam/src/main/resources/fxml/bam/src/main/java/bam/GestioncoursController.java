package bam;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.SpinnerValueFactory;
import javafx.stage.Stage;

import java.util.ArrayList;
import javafx.scene.control.DatePicker;
import java.time.LocalDateTime;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.time.LocalTime;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GestioncoursController {

    @FXML private TextField cd_name, cd_code, field_type;
    @FXML private ChoiceBox<String> credit, teachr, semestr, prereq,salle;
    @FXML private Spinner<Integer> heuredebut, heurefin, minutedebut, minutefin;
    @FXML private DatePicker date_debut,date_fin;

    @FXML
    private void initialize() {
        if (heuredebut != null) {
            heuredebut.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 23, 8));
        }
        if (minutedebut != null) {
            minutedebut.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 59, 0));
        }
        if (heurefin != null) {
            heurefin.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 23, 10));
        }
        if (minutefin != null) {
            minutefin.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 59, 0));
        }

        ArrayList<String> CE = new ArrayList<>();
        if (main.CE != null && !main.CE.isEmpty()) {
            for (Enseignant e : main.CE) {
                CE.add(e.Nom);
            }
            ObservableList<String> enseignants = FXCollections.observableArrayList(CE);
            teachr.setItems(enseignants);
            teachr.setValue(enseignants.get(0));
        }
        ArrayList<String> EnsembleSalle = new ArrayList<>();
        if (main.EnsembleSalle != null && !main.EnsembleSalle.isEmpty()) {
            for (Salle s : main.EnsembleSalle) {
            	EnsembleSalle.add(s.Nom);
            }
            ObservableList<String> Salles = FXCollections.observableArrayList(EnsembleSalle);
            salle.setItems(Salles);
            salle.setValue(Salles.get(0));
        }

    }

    @FXML
    
    	private void cd_addcourse(ActionEvent event) throws IOException {
        String name = cd_name.getText();
        String room = salle.getValue();
        String type = field_type.getText();
        String enseignant = teachr.getValue();
        Integer hdebut=heuredebut.getValue();
        Integer hfin=heurefin.getValue();
        Integer mdebut=minutedebut.getValue();
        Integer mfin=minutefin.getValue();
        LocalDate dated = date_debut.getValue();
        LocalDate datef = date_fin.getValue();
        Cours c=null;

        if (type == null || type.trim().isEmpty()) {
          	
          	System.out.println("Veuillez remplir la case type");
          }
          else {
        	  c=main.admin.creercours(name,type);
          }
        if(c!=null) {
        	 
              if (dated != null && datef != null) {
                  LocalDateTime dateTimeDebut = LocalDateTime.of(dated, LocalTime.of(hdebut, mdebut));
                  LocalDateTime dateTimeFin = LocalDateTime.of(datef, LocalTime.of(hfin, mfin));
                  System.out.println("Début : " + dateTimeDebut);
                  System.out.println("Fin   : " + dateTimeFin);
                 
                  Horaire horaireducours=main.admin.creerhoraire(dateTimeDebut.getDayOfWeek().toString(),dateTimeDebut,dateTimeFin);
                  c.h=horaireducours;
              } else {
                  System.out.println("Veuillez remplir les deux dates (début et fin)");
              }
              
              if(room!=null) {
           	   for (Salle s : main.EnsembleSalle) {
                  		if(s.Nom==room) {
                  			main.admin.setcourssdc(c,s);
                  		}
                  }
             }
              else {
              	System.out.println("Vous n avez pas remplie la salle");
              }
              
              if(enseignant!=null) {
              	 for (Enseignant e : main.CE) {
               		if(e.Nom==enseignant) {
               			main.admin.affectenseignant(c,e);
               		}
               }
              }
              else {
              	System.out.println("Vous n avez pas remplie la case enseignant");
              }
            
        }
        for (Cours cou : main.EnsembleCours) {
            System.out.println("Cours : " + cou.Nom);
            System.out.println("Enseignant : " + (cou.enseignant != null ? cou.enseignant.Nom : "Aucun"));
        }
       
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/board.fxml"));
            Stage stage = (Stage) cd_name.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
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
