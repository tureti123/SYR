package bam;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;



public class Controller {


    // === Pour courses.fxml ===
    @FXML
    private TextField cd_name, cd_code,field_type;
    @FXML
    private ChoiceBox<String> credit, teachr, typee, semestr, prereq;

    
    @FXML private Spinner<Integer> heuredebut,heurefin,minutedebut,minutefin;
    @FXML
    private DatePicker date_debut,date_defin;

    // === Pour users.fxml ===
    @FXML
    private TextField fd_fname, fd_lname, fd_user;
    @FXML
    private PasswordField fd_pass;
    @FXML
    private DatePicker fd_date;
    @FXML
    private ChoiceBox<String> atype;

    // === Méthodes appelées depuis le FXML ===
    @FXML
    private void loadData() {
        System.out.println("Chargement des données du tableau...");
        // TODO: charger les cours depuis le modèle (ArrayList ou DB)
    }

    @FXML
    private void rmData() {
        System.out.println("Suppression du cours sélectionné...");
        // TODO: supprimer le cours sélectionné dans la TableView
    }
    @FXML
    private void dash() {
        System.out.println("Dashboard (gestioncours.fxml)");
    }


    @FXML
    private void cd_addcourse() {
        String name = cd_name.getText();
        String code = cd_code.getText();
        String credits = credit.getValue();
        String teacher = teachr.getValue();
        String type = field_type.getText();
        String semester = semestr.getValue();
        String prereqVal = prereq.getValue();

        System.out.println("Ajout cours: " + name + ", Code: " + code);
        // TODO: créer un nouvel objet Cours et l’ajouter à la liste
    }
    @FXML

    private void directCours(ActionEvent event) throws IOException {
    	
    	    Parent homePage = FXMLLoader.load(getClass().getResource("/fxml/gestioncours.fxml"));
    	    Scene homeScene = new Scene(homePage);

    	    // Obtenir la fenêtre (stage) à partir de l'événement
    	    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
    	    window.setScene(homeScene);
    	    window.show();
    	}
    @FXML
    private void directdisplayCours(ActionEvent event) throws IOException {
    	
    	    Parent homePage = FXMLLoader.load(getClass().getResource("/fxml/displaycourse.fxml"));
    	    Scene homeScene = new Scene(homePage);

    	    // Obtenir la fenêtre (stage) à partir de l'événement
    	    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
    	    window.setScene(homeScene);
    	    window.show();
    	}
    
    public void homei(javafx.scene.input.MouseEvent mouseEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/board.fxml"));
            Parent root = loader.load();

            Scene scene = ((Node) mouseEvent.getSource()).getScene();
            Stage stage = (Stage) scene.getWindow();

            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    public void duser(javafx.scene.input.MouseEvent mouseEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/displayuser.fxml"));
            Parent root = loader.load();

            Scene scene = ((Node) mouseEvent.getSource()).getScene();
            Stage stage = (Stage) scene.getWindow();

            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    public void dcourse(javafx.scene.input.MouseEvent mouseEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/displaycourse.fxml"));
            Parent root = loader.load();

            Scene scene = ((Node) mouseEvent.getSource()).getScene();
            Stage stage = (Stage) scene.getWindow();

            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    private void goToRegister(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/register.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    private void fd_register() {
        String fname = fd_fname.getText();
        String lname = fd_lname.getText();
        String username = fd_user.getText();
        String password = fd_pass.getText();
        String type = atype.getValue();

        System.out.println("Nouvel utilisateur: " + fname + " " + lname);
        // TODO: créer un nouvel utilisateur selon le type (étudiant, enseignant, admin)
    }

    @FXML
    private void logout() {
        System.out.println("Déconnexion...");
        // TODO: Retourner à l’écran de login
    }
    
    

    // === Navigation ===
 
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
