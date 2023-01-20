package afpaJava_230120_exos_POO;

public class Immeuble extends Batiment {
	
	private int nbAppart;
	
	public Immeuble(String adresse, int surfaceHabitable, Personne proprietaire, int nbAppart) {
		super(adresse, surfaceHabitable, proprietaire);
		this.nbAppart = nbAppart;
	}
	
	public int getNbAppart() {
		return nbAppart;
	}
	
	public String toStr() {
		return this.getClass().getName().substring(getClass().getName().indexOf(".")+1) + "\t" + this.getAdresse() + "\t" + this.getSurfaceHabitable() + " m² hab." + "\t" + nbAppart + " apts.";
		
	}
	
	
}
