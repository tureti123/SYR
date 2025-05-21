package bam;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.Random;

public class Notification {
int id;
String message;
LocalDateTime date;
public Notification(String message,LocalDateTime date) {
	Random r = new Random();
	int x =r.nextInt(10000);
	this.id=x;
	this.message=message;
	this.date=date;
	
}

}
