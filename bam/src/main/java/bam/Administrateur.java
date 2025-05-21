package bam;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class Administrateur extends utilisateur{
	
public Administrateur (String Nom,String Prenom,String Email,String Mdp) {
	super(Nom,Prenom,Email,Mdp);
	
}


public void creercours(String Nom,String Type) {
	//verifie qu il ya pas un cours avec le meme nom avant de le creer 
	for(Cours c: main.EnsembleCours) {
		if(!c.Nom.equals(Nom)) {
			main.EnsembleCours.add(new Cours(Nom, Type));
		}
		else {
			System.out.println("change de nom de cours");
		}
	}
}

public void setcoursNom(Cours cours,String modif) {
	for(Cours c: main.EnsembleCours) {
		if(!c.Nom.equals(Nom)) {
			cours.Nom=modif;
		}
		else {
			System.out.println("change de nom de cours");
		}
	}
	
}

public void setcoursType(Cours cours,String modif) {
	cours.Type=modif;
}

public void setcourssdc(Cours cours,Salle modif) {
	if(cours.sdc.disp==true) {
		cours.sdc=modif;
		cours.sdc.disp=false;
	}
	
}
public void sethoraire(LocalDateTime modifdebut,LocalDateTime modiffin,Cours cours) {
			String mour=modifdebut.getDayOfWeek().toString();
			Horaire creerhoraire=new Horaire(mour,modifdebut,modiffin);
			if(VoirDispSalle(cours.sdc,creerhoraire)) {
				cours.h.Jour=modifdebut.getDayOfWeek().toString();
				cours.h.HeureDebut=modifdebut;
				cours.h.HeureFin=modiffin;
			}
			else {
				System.out.println("il y a deja un cours a cette heure");
			}
	

}

public void affectenseignant (Cours cours,Enseignant enseignant) {

	cours.enseignant=enseignant;
}

public void setEquipement (Salle salle,String equipement) {
	if(salle.Equipements.contains(equipement.toLowerCase())==false) {
		salle.Equipements.add(equipement);
	}
}

public void creerhoraire(String jour,LocalDateTime modifdebut,LocalDateTime modiffin) {
	Horaire creerhoraire=new Horaire(jour,modifdebut,modiffin);
}

public void creersalle(String Nom,int Capacité) {
	for(Salle s: main.EnsembleSalle) {
		if(!s.Nom.equals(Nom)) {
			Salle creersalle=new Salle(Nom,Capacité);
		}
		else {
			System.out.println("change de nom de salle");
		}
	}
	

}
public void setsalleNom(Salle salle,String modif) {
	for(Salle s: main.EnsembleSalle) {
		if(!s.Nom.equals(modif)) {
			salle.Nom=modif;
		}
		else {
			System.out.println("change de nom de salle");
		}
	}
	
}

public void setsalleCapacité(Salle salle,int modif) {
	salle.Capacité=modif;
}

public void addEdtCours(Edt edt,Cours cours,Salle salle,Horaire horaire){
	Set<Object> ensemble = new HashSet<>();
	if(cours!=null) {
		ensemble.add(cours);
	}
	if(salle!=null) {
		ensemble.add(salle);
	}
	if(horaire!=null) {
		ensemble.add(horaire);
	}
	
	edt.emploidutemps.add(ensemble);
	
}

public void addEtudiant_Cours(Cours cours,Etudiant etudiant){
			cours.LE.add(etudiant);
}

public void delEtudiant_Cours(Cours cours,Etudiant etudiant){
	cours.LE.remove(etudiant);
}

public void addGroupe_Cours(Cours cours,String groupe) {
	for(Etudiant e :main.AB) {
		if(e.Groupe==groupe) {
			cours.LE.add(e);
		}
	}
	
}

public void delGroupe_Cours(Cours cours,String groupe) {
	for(Etudiant e :main.AB) {
		if(e.Groupe==groupe) {
			cours.LE.remove(e);
		}
	}
	
}

public void delEdtCours(Edt edt, Cours cours) {
    for (Set<Object> s : edt.emploidutemps) {
        Iterator<Object> it = s.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            if (obj instanceof Cours) {
                Cours c = (Cours) obj;
                if (c.Id == cours.Id) {
                    it.remove(); // suppression sans crash
                }
            }
        }
    }
}
/*
public void delEdt() {
	
}
*/
	
public void voirequipement(Salle salle){
	for (String equipement :salle.Equipements){
		System.out.println(equipement);
	}
}

public boolean VoirDispSalle(Salle salle,Horaire horaire){
	boolean verif =true;
	for(Cours c : main.EnsembleCours){
			if((horaire.HeureDebut.isAfter(c.h.HeureDebut) || horaire.HeureFin.isAfter(c.h.HeureFin))&& c.sdc.Id==salle.Id ){
				verif=false;
				System.out.println("la salle n est pas disponible ");
				break;
			}
		
	}
	return verif;
}


}
