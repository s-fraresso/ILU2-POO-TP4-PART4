package produit;

import personnages.Gaulois;

public class Sanglier extends Produit {
	
	private int poids;
	private Gaulois chasseur;
	
	public Sanglier(int poids, Gaulois chasseur) {
		super("sanglier", Unite.KILOGRAMME);
		this.poids = poids;
		this.chasseur = chasseur;
	}

	@Override
	public String decrireProduit() {
		return "sanglier de " + poids + " kg chasse par " + chasseur.getNom() + ".";
	}
	
	@Override
	public int calculerPrix(int prix) {
		return prix * poids / 1000; // prix pour la tonne
	}

}
