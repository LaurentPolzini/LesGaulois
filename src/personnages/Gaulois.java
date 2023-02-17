package personnages;

public class Gaulois extends Personnage {


	public Gaulois(String nom, int force) {
		super(nom, force);
	}

	private int effetPotion = 1;
	

	public String prendreParole() {
		return "Le gaulois " + this.getNom() + " : ";
	}
	
	public void boirePotion(int forcePotion, Druide unDruide) {
		this.effetPotion = forcePotion;
		System.out.println("Merci " + unDruide.getNom() + ", je sens que ma force est " + this.effetPotion + " fois décuplée !");
	}
	
	public void frapper (Romain unRomain) {
		System.out.println(this.getNom() + " envoie un grand coup dans la mâchoire de " + unRomain.getNom());
		unRomain.recevoirCoup((this.getForce() / 3) * this.effetPotion);
	}
	
	public String toString() {
		return super.toString() + ": Gaulois [nom=" + this.getNom() + ", force=" + this.getForce()
				+ ", effetPotion=" + this.effetPotion + "]";
	}
	
	public static void main(String[] args) {
		Gaulois unGaulois = new Gaulois("Asterix", 12);
		// unGaulois.parler("Bonjour !");
		// System.out.println(unGaulois);
		Druide pano = new Druide("Panoramix", 5, 10);
		unGaulois.boirePotion(pano.preparerPotion(), pano);
	}
}
