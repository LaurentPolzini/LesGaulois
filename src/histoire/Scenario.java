/**
 * 
 */
package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

/**
 * @author laurentpolzin
 *
 */
public class Scenario {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix", 5, 10);
		panoramix.parler("Je vais aller préparer une petite potion...");
		panoramix.preparerPotion();
		Gaulois obelix = new Gaulois("Obelix", 0);
		panoramix.booster(obelix);
		obelix.parler("Par Bélénos, ce n'est pas juste !");
		Gaulois asterix = new Gaulois("Asterix", 8);
		panoramix.booster(asterix);
		asterix.parler("Bonjour !");
		Romain minus = new Romain("Minus", 6);
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		obelix.frapper(minus);
	}

}
