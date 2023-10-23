package personnages;

public class Humain {

	private String nom;
	private String boissonFav;
	private int argent;

	
	public Humain(String nom, String boissonFav,int argent) {
		this.nom = nom;
		this.boissonFav = boissonFav;
		this.argent=argent;
	}
				
	public String getNom() {
		return nom;
	}

	public int getAgent() {
		return argent;

	}

	public void parler(String texte) {
		System.out.println(texte);
	}

	public void direBonjour() {
		parler("Bonjour! Je m'appelle " + nom + " et j'aime boire du " + boissonFav);
	}

	public void boire() {
		parler("Mmmm,un bon verre de" + boissonFav + "! GLOUPS!");
	}

	public void acheter(int prix, String bien) {
		int poche = argent;
		if (poche >= prix) {
			parler("j'ai " + poche + " sous en poche.Je vais pouvoir m'offrir un " + bien + " à " + prix + " sous");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + poche + " sous en poche.Je ne peux meme pas m'offrir un " + bien + " à " + prix
					+ "sous");
		}
	}

	
	public void gagnerArgent(int gain) {
		this.argent+=gain;
		}
	public void perdreArgent(int perte) {
		this.argent-=perte;
	}
}
