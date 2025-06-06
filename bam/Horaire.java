package bam;
import java.time.LocalDate;      // pour les dates (ex : 2025-05-17)
import java.time.LocalTime;      // pour les heures (ex : 14:30)
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.time.LocalDateTime;  // pour date + heure (ex : 2025-05-17T14:30)
import java.util.Objects;

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
	this.Jour=Jour;
	
};
@Override
public boolean equals(Object o) {
	//compare les references memoires
    if (this == o) return true;
    //compare si c est une instance de horaire
    if (!(o instanceof Horaire)) return false;
    //compare le contenu des objets
    Horaire h = (Horaire) o;
    return Objects.equals(Jour, h.Jour) &&
           Objects.equals(HeureDebut, h.HeureDebut) &&
           Objects.equals(HeureFin, h.HeureFin);
}

@Override
public int hashCode() {
    return Objects.hash(Jour, HeureDebut, HeureFin);
}
}
