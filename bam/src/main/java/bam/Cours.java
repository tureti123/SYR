package bam;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;


public class Cours {
int Id;
String Nom;
String Type;
Salle sdc;
Enseignant enseignant;
Horaire h;
ArrayList<Etudiant> LE;
HashMap<Horaire,Salle> hs = new HashMap<>();

public Cours(String Nom,String Type) {
	Random r = new Random();
	int x = r.nextInt(10000);
	int l = r.nextInt(10);
	int c =r.nextInt(30);
	
	this.Id=x;
	this.Nom=Nom;
	this.Type=Type;
	this.enseignant=null;
	Salle sdc=new Salle("S"+l,c);
	this.sdc=sdc;
	
}



}
