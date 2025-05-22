package bam;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

//L'objet emploi du temps possede un attribut emploidutemps ou c est une liste de triplé (Cours,Salle,horaire)
public class Edt {
	utilisateur Utilisateur;
	ArrayList<Set<Object>> emploidutemps=new ArrayList<>();
	 
public Edt (utilisateur utilisateur) {
	this.Utilisateur=utilisateur;
}
//affiche l ensemble des cours
public ArrayList<Cours> getCoursList(){
	ArrayList<Cours> CoursList=new ArrayList<>();
	for (Set<Object> s:emploidutemps) {
		for(Object obj : s) {
			 if (obj instanceof Cours) {
				 Cours c=(Cours) obj;
				 CoursList.add(c);
				 System.out.println(c.Nom);
			 }
		}
	}
	return CoursList; 
}

//affiche l ensemble des salles
public ArrayList<Salle> getsalleList(){
	ArrayList<Salle> SalleList=new ArrayList<>();
	for (Set<Object> s:emploidutemps) {
		for(Object obj : s) {
			 if (obj instanceof Salle) {
				 Salle sa=(Salle) obj;
				 SalleList.add(sa);
				 System.out.println(sa.Nom);
			 }
		}
	}
	return SalleList; 
}

//affiche l ensemble des horaires
public ArrayList<Horaire> gethoraireList(){
	ArrayList<Horaire> HoraireList=new ArrayList<>();
	for (Set<Object> s:emploidutemps) {
		for(Object obj : s) {
			 if (obj instanceof Horaire) {
				 Horaire h=(Horaire) obj;
				 HoraireList.add(h);
				 System.out.println(h.HeureDebut);
			 }
		}
	}
	return HoraireList; 
}


//affiche l ensemble des cours,des salles,horaires
public void voirEdtEtudiant() {
	for (Set<Object> s: emploidutemps) {
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


public void voirEdtEnseignant() {
	for (Set<Object> s: emploidutemps) {
		for(Object obj : s) {
			 if (obj instanceof Cours) {
				 Cours c=(Cours) obj;
				 System.out.println(c.Nom);
				 System.out.println(c.Type);
				 System.out.println(c.LE);
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
//trouver le cours et la salle correspondant a l heure
public Set<Object> search(LocalDateTime heure) {
		Set<Object> Setfind=new HashSet<>();
	for (Set<Object> s:emploidutemps) {
		for(Object obj : s) {
			 if (obj instanceof Horaire) {
				 Horaire h=(Horaire) obj;
				 if(h.HeureDebut==heure) {
					 Setfind.add(s);
					 System.out.println(h.HeureDebut);
				 }
				
			 }
		}
	}
	return Setfind;
}
}
