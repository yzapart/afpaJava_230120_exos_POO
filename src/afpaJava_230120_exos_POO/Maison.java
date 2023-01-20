package afpaJava_230120_exos_POO;

public class Maison extends Batiment {

	private int nbPieces, surfaceJardin;
	
	public Maison(String adresse, int surfaceHabitable, int surfaceJ, int nbPieces) {
		super(adresse, surfaceHabitable);
		this.surfaceJardin = surfaceJ;
		this.nbPieces = nbPieces;
	}
	
	public int getSurfaceJardin() {
		return surfaceJardin;
	}
	
	public int getNbPieces() {
		return nbPieces;
	}
	
	public String toStr() {
		return this.getClass().getName().substring(getClass().getName().indexOf(".")+1) + "\t\t" + this.getAdresse() + "\t" + this.getSurfaceHabitable() + " m² hab." + "\t" + nbPieces + " pcs\tJardin " + surfaceJardin + " m²";
	}

	
}
