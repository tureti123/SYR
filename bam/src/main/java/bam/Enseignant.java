package bam;

public class Enseignant extends utilisateur{
	String Matière;
public Enseignant (String Matière,String Nom,String Prenom,String Email,String Mdp) {
	super(Nom,Prenom,Email,Mdp);
	this.Matière=Matière;
}
Edt EdtEnseignant=new Edt(this);
public void voirEdt(){
	EdtEnseignant.voirEdtEnseignant();
}

}
