/**
 * 
 */
package personnages;

/**
 * @author laurentpolzin
 *
 */
public class Romain extends Personnage {

	public Romain(String nom, int force) {
		super(nom, force);
	}
	
	public void recevoirCoup(int forceCoup) {
		this.setForce(this.getForce() - forceCoup);
		if (this.getForce() > 0) {
			parler("Aie");
		} else {
			parler("J'abandonne");

		}
	}
	
	public String prendreParole() {
		return "Le romain " + this.getNom() + " : ";
	}
	
	public static void main(String[] args) {
		Romain unRomain = new Romain("Arthurus", 7);
		unRomain.parler("Ave Caeser !");
		Gaulois unGaulois = new Gaulois("Asterix", 12);
		unGaulois.parler("Bonjour !");
		unGaulois.frapper(unRomain);
		unGaulois.frapper(unRomain);
		Village unVillage = new Village("Archingeay");
		Chef unChef = new Chef("Abraracourcix", 15, unVillage);
		unChef.parler("Je suis le chef !");
	}
}
