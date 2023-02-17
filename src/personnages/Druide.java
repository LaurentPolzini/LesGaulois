/**
 * 
 */
package personnages;

import java.util.Random;

/**
 * @author laurentpolzin
 *
 */
public class Druide extends Personnage{

	private int effetPotionMin = 1;
	private int effetPotionMax = 1;
	private int puissancePotion = 1;
	
	/**
	 * 
	 */
	public Druide (String nom, int effetPotionMin, int effetPotionMax) {
		super(nom, 0);
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		this.parler("Bonjour, je suis le druide " + this.getNom() + " et ma potion peut aller d'une force " + this.effetPotionMin + " à " + this.effetPotionMax + ".");
	}

	@Override
	public String prendreParole() {
		return "Le druide " + this.getNom() + " : ";
	}

	public int preparerPotion() {
		Random puissance = new Random();
		this.puissancePotion = puissance.nextInt(this.effetPotionMax - this.effetPotionMin + 1) + this.effetPotionMin;
		if (this.puissancePotion > 7) {
			this.parler("J'ai préparé une super potion de force, sa force est de: " + this.puissancePotion);
		} else {
			this.parler("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de: " + this.puissancePotion);
		}
		return this.puissancePotion;
	}
	
	public void booster(Gaulois unGaulio) {
		if (unGaulio.getNom().equals("Obelix")) {
			System.out.println("Non Obélix !... Tu n’auras pas de potion magique !");
		} else {
			unGaulio.boirePotion(this.puissancePotion, this);
		}
		
		
	}
	
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix", 5, 10);
		panoramix.preparerPotion();
	}
	
}
