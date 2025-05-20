package bam;

import java.util.Set;

public class Etudiant extends utilisateur{
	String Groupe;
	
public Etudiant (String Groupe,String Nom,String Prenom,String Email,String Mdp) {
	super(Nom,Prenom,Email,Mdp);
	this.Groupe=Groupe;
	
}
Edt EdtEtudiant=new Edt(this);
public void voirEdt() {
	for (Set<Object> s:EdtEtudiant.emploidutemps) {
		for(Object obj : s) {
			 if (obj instanceof Cours) {
				 Cours c=(Cours) obj;
				 System.out.println(c.Nom);
				 System.out.println(c.Type);
				 if(c.enseignant!=null) {
						System.out.println(c.enseignant);
					}
			 }
			 else if (obj instanceof Horaire){
				 Horaire h=(Horaire) obj;
				 System.out.println(h.HeureDebut);
				 System.out.println(h.HeureFin);
				 System.out.println(h.Jour);
			 }
			 else {
				 Salle sa=(Salle) obj;
				 System.out.println(sa.Nom);
				 System.out.println(sa.Capacité);
				 
			 }
		}
	}


	




}
}
