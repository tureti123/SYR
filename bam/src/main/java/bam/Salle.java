package bam;

import java.util.Random;

public class Salle {
	int Id;
	String Nom;
	int Capacité;
	public Salle(String Nom,int Capacité) {
		Random r = new Random();
		int x = r.nextInt(10000);
		this.Id=x;
		this.Nom=Nom;
		this.Capacité=Capacité;
		
	}
}
