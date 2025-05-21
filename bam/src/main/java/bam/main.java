package bam;
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
