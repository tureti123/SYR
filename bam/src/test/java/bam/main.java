package bam;
import java.util.ArrayList;
public class main {
	  public static void main(String[] args) {
		  ArrayList<Etudiant> AB=new ArrayList();
		  ArrayList<Enseignant> CE=new ArrayList();
		  ArrayList<Edt> Emploi_du_temps=new ArrayList();
		  Etudiant christian=new Etudiant("AB","christian","daniel","atrace","123");
		  Edt Edt0=new Edt(christian);
		  Cours terrorisme=new Cours(911,"terrorisme","trop cool");
		  AB.add(christian);
		  Enseignant dicateur=new Enseignant("terrorisme","oussama","ben laden","2tours@gmail.com","911");
		  dicateur.addCours(christian,terrorisme);
		  christian.voirEdt();
		  
	  }
}
