package bam;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Administrateur extends utilisateur{
	
public Administrateur (String Nom,String Prenom,String Email,String Mdp) {
	super(Nom,Prenom,Email,Mdp);
	
}
public void creercours(String Nom,String Type) {
	Cours creercours=new Cours(Nom,Type);
}
public void setcoursNom(Cours cours,String modif) {
	cours.Nom=modif;
}
public void setcoursType(Cours cours,String modif) {
	cours.Type=modif;
}
public void setcourssdc(Cours cours,Salle modif) {
	if(cours.sdc.disp==true) {
		cours.sdc=modif;
	}
	
}
public void sethoraire(Horaire h,LocalDateTime modifdebut,LocalDateTime modiffin) {
			h.Jour=modifdebut.getDayOfWeek().toString();
			h.HeureDebut=modifdebut;
			h.HeureFin=modiffin;

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
	Salle creersalle=new Salle(Nom,Capacité);
}
public void setsalleNom(Salle salle,String modif) {
	salle.Nom=modif;
}
public void setsalleCapacité(Salle salle,int modif) {
	salle.Capacité=modif;
}
public void addEdtCours(Edt edt,Cours cours){
edt.Courslist.add(cours);
}
public void delEdtCours(Edt edt,Cours cours){
for(Cours c : edt.Courslist){
if(c.id==cours.id){
Courslist.remove(c);
}
}
}
public void voirequipement(Salle salle){
for (String equipement :salle.Equipemnts){
Systeme.out.println(equipemnt);
}
}

public void VoirDispSalle(Salle salle){
Systeme.out.println(salle.disp);
}

}
