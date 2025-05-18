package bam;
import java.util.ArrayList;
import java.time.LocalDateTime;  // pour date + heure (ex : 2025-05-17T14:30)
public class main {
	  public static void main(String[] args) {
		  ArrayList<Etudiant> AB=new ArrayList();
		  ArrayList<Enseignant> CE=new ArrayList();
		  ArrayList<Edt> Emploi_du_temps=new ArrayList();
    ArrayList<Salle> EnsembleSalle=new ArrayList();
ArrayList<Cours> EnsembleCours =new ArrayList();
		  Etudiant christian=new Etudiant("AB","christian","daniel","atrace","123");
		  Edt Edt0=new Edt(christian);
		  Cours terrorisme=new Cours("terrorisme","trop cool");
		  LocalDateTime heuredebut = LocalDateTime.of(2024, 12, 25, 9, 30);
		  LocalDateTime heurefin = LocalDateTime.of(2024, 12, 25, 9, 30);
		  System.out.println(heuredebut);  // 2024-12-25T09:30
		  Horaire h=new Horaire("heuredebut.getDayOfWeek()",heuredebut,heurefin);
		  terrorisme.LH.add(h);
		  
		  AB.add(christian);
		  Enseignant dicateur=new Enseignant("terrorisme","oussama","ben laden","2tours@gmail.com","911");
		  
		  christian.voirEdt();
		  
	  }
}
