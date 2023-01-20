package afpaJava_230120_exos_POO;

public class Batiment {

	private String adresse;
	private int surfaceHabitable;

	Batiment(String adresse, int surfaceHabitable) {
		this.adresse = adresse;
		this.surfaceHabitable = surfaceHabitable;
	}
	
	public String getAdresse() {
		return adresse;
	}
	
	public int getSurfaceHabitable() {
		return surfaceHabitable;
	}

	public String toStr() {
		return this.getClass().getName().substring(getClass().getName().indexOf(".")+1) + "\t" + adresse + "\t" + surfaceHabitable + "m² hab.\tImp.: " + impot(5.6, 1.2) + " €";
	}

	public double impot(double TauxA, double tauxB) {
	    double temp = (this instanceof Maison) ? ((Maison) this).getSurfaceJardin() : 0;
		return Utils.round2dec(TauxA*surfaceHabitable + tauxB*temp);
	}

}
