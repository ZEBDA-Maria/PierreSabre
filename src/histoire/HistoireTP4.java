package histoire;
import personnages.Humain;
public class HistoireTP4 {


public static void main(String[] args) {
	Humain Prof=new Humain("Prof","kombucha",54);
	Prof.direBonjour();
	Prof.acheter( 12,"boisson");
	Prof.boire();
	Prof.acheter( 2,"jeu");
	Prof.acheter(50, "kimono");
}}