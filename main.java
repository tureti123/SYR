/*package bam;
import java.util.ArrayList;
import java.time.LocalDateTime;  // pour date + heure (ex : 2025-05-17T14:30)
public class main {
	 	public static ArrayList<Cours> EnsembleCours =new ArrayList();
		  public static ArrayList<Etudiant> AB=new ArrayList();
		  public static ArrayList<Enseignant> CE=new ArrayList();
		  public static ArrayList<Edt> Emploi_du_temps=new ArrayList();
		  public static ArrayList<Salle> EnsembleSalle=new ArrayList();
		  
	  public static void main(String[] args) {

		 
		  Etudiant christian=new Etudiant("AB","christian","daniel","atrace","123");
		  Edt Edt0=new Edt(christian);
		  Cours terrorisme=new Cours("terrorisme","trop cool");
		  LocalDateTime heuredebut = LocalDateTime.of(2024, 12, 25, 9, 30);
		  LocalDateTime heurefin = LocalDateTime.of(2024, 12, 25, 9, 30);
		  System.out.println(heuredebut);  // 2024-12-25T09:30
		  Horaire horaire=new Horaire("heuredebut.getDayOfWeek()",heuredebut,heurefin);
		  terrorisme.h=(horaire);
		  AB.add(christian);
		  Enseignant dicateur=new Enseignant("terrorisme","oussama","ben laden","2tours@gmail.com","911");
		  
		  christian.EdtEtudiant.voirEdtEtudiant();
		  
	  }
}
*/
package bam;

import java.time.LocalDateTime;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class main extends Application{
    public static ArrayList<Cours> EnsembleCours = new ArrayList<>();
    public static ArrayList<Etudiant> AB = new ArrayList<>();
    public static ArrayList<Enseignant> CE = new ArrayList<>();
    public static ArrayList<Edt> Emploi_du_temps = new ArrayList<>();
    public static ArrayList<Salle> EnsembleSalle = new ArrayList<>();
	public static Administrateur admin;

    public static void main(String[] args) {
        // Création administrateur


         admin = new Administrateur("Admin", "Super", "admin@mail.com", "admin123");

        // Création d'une salle
        Salle s1 = new Salle("Salle101", 30);
        EnsembleSalle.add(s1);

        // Création d'un cours
        admin.creercours("Maths", "Scientifique");
        Cours coursMaths = EnsembleCours.get(0); // premier cours créé

        // Création d’un enseignant
        Enseignant prof = new Enseignant("Maths", "Einstein", "Albert", "ae@gmail.com", "emc2");
        CE.add(prof);

        // Affecter une salle au cours
        admin.setcourssdc(coursMaths, s1);

        // Création horaire
        LocalDateTime debut = LocalDateTime.of(2025, 6, 1, 10, 0);
        LocalDateTime fin = LocalDateTime.of(2025, 6, 1, 12, 0);
        admin.sethoraire(debut, fin, coursMaths);

        // Affecter enseignant au cours
        admin.affectenseignant(coursMaths, prof);

        // Créer un étudiant
        Etudiant e1 = new Etudiant("G1", "Marie", "Curie", "mc@gmail.com", "radium");
        AB.add(e1);

        // Créer un emploi du temps
        Edt edtEtudiant = new Edt(e1);
        Emploi_du_temps.add(edtEtudiant);
        e1.EdtEtudiant = edtEtudiant;

        // Ajouter le cours dans l’emploi du temps
        admin.addEdtCours(edtEtudiant, coursMaths, s1, coursMaths.h);

        // Inscription de l'étudiant au cours
        admin.addEtudiant_Cours(coursMaths, e1);

        // Voir emploi du temps
        System.out.println("----- Emploi du temps Étudiant -----");
        e1.voirEdt();

        System.out.println("\n----- Emploi du temps Enseignant -----");
        prof.voirEdt();

        // Voir les notifications
        System.out.println("\n----- Notifications Étudiant -----");
        e1.voirNotif();

        // Vérifier si salle est dispo à un horaire qui chevauche
        Horaire testConflit = new Horaire("Lundi", debut.minusMinutes(30), fin.plusMinutes(30));
        System.out.println("\n----- Test de disponibilité de la salle -----");
        boolean dispo = admin.VoirDispSalle(s1, testConflit);
        System.out.println("Salle dispo ? " + dispo);


        launch(args);
        
	   
    }
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/board.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Exemple FXML");
        stage.show();
    }
    
}
