package bam;

public class Enseignant extends utilisateur{
	String Matière;
public Enseignant (String Matière,int id,String Nom,String Prenom,String Email,String Mdp) {
	super(id,Nom,Prenom,Email,Mdp);
	this.Matière=Matière;
}

}
