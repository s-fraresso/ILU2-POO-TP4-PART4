package scenarioTest;

import personnages.Gaulois;
import produit.Poisson;
import produit.Sanglier;
import villagegaulois.Etal;
import villagegaulois.IEtal;

public class Scenario {

	public static void main(String[] args) {

		// TODO Partie 4 : creer de la classe anonyme Village

		// fin

		Gaulois ordralfabetix = new Gaulois("Ordralfabétix", 9);
		Gaulois obelix = new Gaulois("Obélix", 20);
		Gaulois asterix = new Gaulois("Astérix", 6);

		Etal<Sanglier> etalSanglierObelix = new Etal<>();
		Etal<Sanglier> etalSanglierAsterix = new Etal<>();
		Etal<Poisson> etalPoisson = new Etal<>();

		Sanglier sanglier1 = new Sanglier(2000, obelix);
		Sanglier sanglier2 = new Sanglier(1500, obelix);
		Sanglier sanglier3 = new Sanglier(1000, asterix);
		Sanglier sanglier4 = new Sanglier(500, asterix);

		Sanglier[] sangliersObelix = { sanglier1, sanglier2 };
		Sanglier[] sangliersAsterix = { sanglier3, sanglier4 };

		Poisson poisson1 = new Poisson("lundi");
		Poisson[] poissons = { poisson1 };
		
		IEtal[] marche = new IEtal[] {etalSanglierAsterix, etalSanglierObelix, etalPoisson};

		etalSanglierObelix.installerVendeur(obelix, sangliersObelix, 8);
		etalSanglierAsterix.installerVendeur(asterix, sangliersAsterix, 10);
		etalPoisson.installerVendeur(ordralfabetix, poissons, 7);
		
		for (int i = 0; i < marche.length; i++) {
			System.out.println(marche[i].etatEtal());
		}
		
		System.out.println("a l etal n 1, j achete 2 sangliers et je paye " + marche[0].acheterProduit(2) + " sous.");
		System.out.println("a l etal n 2, j achete 2 sangliers et je paye " + marche[1].acheterProduit(1) + " sous.");
		System.out.println("Je voulais acheter 3 sangliers, j'en ai achete 3.\n");
		
		for (int i = 0; i < marche.length; i++) {
			System.out.println(marche[i].etatEtal());
		}
	}

}
