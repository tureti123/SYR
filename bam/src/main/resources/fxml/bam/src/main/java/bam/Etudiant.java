package bam;

import java.util.Set;

public class Etudiant extends utilisateur{
	String Groupe;
	
	
public Etudiant (String Groupe,String Nom,String Prenom,String Email,String Mdp) {
	super(Nom,Prenom,Email,Mdp);
	this.Groupe=Groupe;
	
}
Edt EdtEtudiant=new Edt(this);
public void voirEdt(){
	EdtEtudiant.voirEdtEtudiant();
}

public void voirNotif() {
	for(Notification noti:LN) {
		System.out.println(noti.message);
	}
	
}

}
