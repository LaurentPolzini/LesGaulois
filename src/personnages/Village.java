package personnages;

import java.util.ArrayList;

public class Village {

	private String nom = null;
	private ArrayList<Personnage> habitant = new ArrayList<Personnage>();
	private Chef leChef = null;
	
	public Village(String nom) {
		this.nom = nom;
	}
	
	
	
	public String getNom() {
		return this.nom;
	}
	
	public void devientChef(Chef unChef) {
		this.leChef = unChef;
		if (!this.estHabitant(unChef)) {
			this.habitant.add(unChef);
		}
	}


	public void ajouterHabitant(Personnage unHabitant) {
		this.habitant.add(unHabitant);
	}
	
	public void enleveHabitant(Personnage unHabitant) {
		this.habitant.remove(unHabitant);
	}
	
	public boolean estHabitant(Personnage Quelquun) {
		return this.habitant.contains(Quelquun);
	}
	
	public int nbHabitant() {
		return this.habitant.size();
	}
	
	public String nomVillage(String name) {
		return this.nom;
	}
	

}
