package bam;
import java.time.LocalDate;      // pour les dates (ex : 2025-05-17)
import java.time.LocalTime;      // pour les heures (ex : 14:30)
import java.time.LocalDateTime;  // pour date + heure (ex : 2025-05-17T14:30)

public class Horraire {

String Jour;
LocalDateTime HeureDebut;
LocalDateTime HeureFin;

public Horraire(String Jour,LocalDateTime HeureDebut,LocalDateTime HeureFin) {
	this.HeureDebut=HeureDebut;
	this.HeureFin=HeureFin;
};
}
