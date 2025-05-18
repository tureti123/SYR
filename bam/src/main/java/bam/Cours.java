package bam;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class Cours {
int Id;
String Nom;
String Type;
Salle sdc;
Enseignant enseignant;
ArrayList<Horaire> LH;
HashMap<LocalDateTime,LocalDateTime> hor =new HashMap<>();
public Cours(String Nom,String Type) {
	Random r = new Random();
	int x = r.nextInt(10000);
	int l = r.nextInt(10);
	int c =r.nextInt(30);
	
	this.Id=x;
	this.Nom=Nom;
	this.Type=Type;
	
	Salle sdc=new Salle("S"+l,c);
	this.sdc=sdc;
	
}


}
