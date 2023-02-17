package personnages;

public class Chef extends Gaulois {
	
	
	private Village village;
	
	public Chef(String nom, int force, Village village) {
		super(nom, force);
		this.village = village;
		this.village.devientChef(this);
	}

	@Override
	public String prendreParole() {
		return "Le chef " + this.getNom() + " du village " + village.getNom() + " : ";
	}
	
	
	
}
