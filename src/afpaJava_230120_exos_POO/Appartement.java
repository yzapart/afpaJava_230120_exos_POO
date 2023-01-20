package afpaJava_230120_exos_POO;

public class Appartement extends Immeuble {
	private int num, nbPieces;
	private boolean location;
	private Personne locataire;

	public Appartement(int num, int nbPieces, boolean location, Personne proprietaire, Personne locataire) {
		super(proprietaire);
		this.num = num;
		this.nbPieces = nbPieces;
		this.location = location;
		this.locataire = locataire;
	}
}
