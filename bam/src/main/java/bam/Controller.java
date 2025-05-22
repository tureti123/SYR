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
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;



public class Controller {

    // === Pour displayCourses.fxml ===
    @FXML
    private TableView<?> tableView;
    @FXML
    private TableColumn<?, ?> idColumn;
    @FXML
    private TableColumn<?, ?> CNameColumn;
    @FXML
    private TableColumn<?, ?> CCodeColumn;
    @FXML
    private TableColumn<?, ?> CHrsColumn;
    @FXML
    private TableColumn<?, ?> TAssignedColumn;
    @FXML
    private TableColumn<?, ?> PreReqColumn;
    @FXML
    private TableColumn<?, ?> TypeColumn;
    @FXML
    private TableColumn<?, ?> SemesterColumn;

    // === Pour courses.fxml ===
    @FXML
    private TextField cd_name, cd_code,field_type;
    @FXML
    private ChoiceBox<String> credit, teachr, typee, semestr, prereq;
    
    @FXML private Spinner<Integer> heuredebut,heurefin,minutedebut,minutefin;

    @FXML
    private void initialize() {
        System.out.println("heuredebut == null ? " + (heuredebut == null));
        System.out.println("heurefin == null ? " + (heurefin == null));

        if (heuredebut != null) {
            SpinnerValueFactory<Integer> valueFactory =
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 23, 8);
            heuredebut.setValueFactory(valueFactory);
        } 
        if (minutedebut != null) {
            SpinnerValueFactory<Integer> valueFactory =
                    new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 59, 1);
                minutedebut.setValueFactory(valueFactory);
            }


        if (heurefin != null) {
            SpinnerValueFactory<Integer> endFactory =
                new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 59, 1);
            heurefin.setValueFactory(endFactory);
        }
        if (minutefin != null) {
            SpinnerValueFactory<Integer> valueFactory =
                    new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 23, 8);
                minutefin.setValueFactory(valueFactory);
            }
    }

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
