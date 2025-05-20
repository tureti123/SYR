package bam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Edt {
	utilisateur Utilisateur;
	ArrayList<Set> emploidutemps=new ArrayList<>();
	 
public Edt (utilisateur utilisateur) {
	this.Utilisateur=utilisateur;
}
public ArrayList<Cours> getCoursList(){
	ArrayList<Cours> CoursList=new ArrayList<>();
	for (Set<Object> s:emploidutemps) {
		for(Object obj : s) {
			 if (obj instanceof Cours) {
				 Cours c=(Cours) obj;
				 CoursList.add(c);
				 System.out.println(c.Nom);
			 }
		}
	}
	return CoursList; 
}
}
