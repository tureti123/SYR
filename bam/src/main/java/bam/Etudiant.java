package bam;

public class Etudiant extends utilisateur{
	String Groupe;
public Etudiant (String Groupe,int id,String Nom,String Prenom,String Email,String Mdp) {
	super(id,Nom,Prenom,Email,Mdp);
	this.Groupe=Groupe;
}
}
