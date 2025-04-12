package produit;

public interface IProduit {

	String getNom();

	String decrireProduit();

	default int calculerPrix(int prix) {
		return prix;
	}

}