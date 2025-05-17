package bam;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class Cours {
int Id;
String Nom;
String Type;
Salle sdc;
ArrayList<Horaire> LH;
public Cours(int Id,String Nom,String Type) {
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
