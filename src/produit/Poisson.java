package produit;

public class Poisson extends Produit {
	
	private String datePeche;
	
	public Poisson(String datePeche) {
		super("poisson", Unite.PIECE);
		this.datePeche = datePeche;
	}

	@Override
	public String decrireProduit() {
		return "poisson peche " + datePeche + ".";
	}

}
