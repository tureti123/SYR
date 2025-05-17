package bam;
import java.util.ArrayList;


public class Edt {
	utilisateur Utilisateur;
	ArrayList<Cours> CoursList = new ArrayList<>();
public Edt (utilisateur utilisateur) {
	this.Utilisateur=utilisateur;
}
public ArrayList<Cours> getCoursList(){
	return CoursList;
}
}
