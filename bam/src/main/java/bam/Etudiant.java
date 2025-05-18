package bam;

public class Etudiant extends utilisateur{
	String Groupe;
	
public Etudiant (String Groupe,String Nom,String Prenom,String Email,String Mdp) {
	super(Nom,Prenom,Email,Mdp);
	this.Groupe=Groupe;
	
}
Edt EdtEtudiant=new Edt(this);
public void voirEdt() {
for(Cours c : EdtEtudiant.Courslist){
	System.out.println(c.Nom);
	System.out.println(c.Matiere);
	System.out.println(c.Enseignant);
	System.out.println(c.h);
}

}
}
