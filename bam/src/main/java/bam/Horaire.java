package bam;
import java.time.LocalDate;      // pour les dates (ex : 2025-05-17)
import java.time.LocalTime;      // pour les heures (ex : 14:30)
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.time.LocalDateTime;  // pour date + heure (ex : 2025-05-17T14:30)

public class Horaire {
int id;
String Jour;
LocalDateTime HeureDebut;
LocalDateTime HeureFin;

public Horaire(String Jour,LocalDateTime HeureDebut,LocalDateTime HeureFin) {
	Random r = new Random();
	int x =r.nextInt(10000);
	this.id=x;
	this.HeureDebut=HeureDebut;
	this.HeureFin=HeureFin;
	int j =r.nextInt(7);
	String[] semane = {"Lundi", "Mardi", "Mercredi","Jeudi","Vendredi","Samedi","Dimanche"};
	this.Jour=semane[j];
	
};
}
