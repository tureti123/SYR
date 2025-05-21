package bam;

import java.util.Random;
import java.util.ArrayList;

public class Salle {
	int Id;
	String Nom;
	int Capacité;
	String localistaion;
	boolean disp=true;
	ArrayList<String> Equipements = new ArrayList<>();
	public Salle(String Nom,int Capacité) {
		Random r = new Random();
		int x = r.nextInt(10000);
		this.Id=x;
		this.Nom=Nom;
		this.Capacité=Capacité;
		
	}
}
