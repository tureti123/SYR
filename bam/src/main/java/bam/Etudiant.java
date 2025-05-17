package bam;

public class Etudiant extends utilisateur{
	String Groupe;
	
public Etudiant (String Groupe,String Nom,String Prenom,String Email,String Mdp) {
	super(Nom,Prenom,Email,Mdp);
	this.Groupe=Groupe;
	
}
Edt EdtEtudiant=new Edt(this);
public void voirEdt() {
	System.out.println(EdtEtudiant.getCoursList().get(0).Nom);
}
}
