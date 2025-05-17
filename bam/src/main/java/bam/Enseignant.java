package bam;

public class Enseignant extends utilisateur{
	String Matière;
public Enseignant (String Matière,String Nom,String Prenom,String Email,String Mdp) {
	super(Nom,Prenom,Email,Mdp);
	this.Matière=Matière;
}
public void addCours(Etudiant Etudiant,Cours Cours) {
	Etudiant.EdtEtudiant.CoursList.add(Cours);
}
}
