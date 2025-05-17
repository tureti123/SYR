package bam;
import java.util.Random;




public class utilisateur {
	int id;
	String Nom;
	String Prenom;
	String Mdp;
	String Email;

public utilisateur(String Nom,String Prenom,String Email,String Mdp) {
	Random r = new Random();
	int x = r.nextInt(10000);
	this.id=x;
	this.Nom=Nom;
	this.Prenom=Prenom;
	this.Email=Email;
	this.Mdp=Mdp;
}
}
