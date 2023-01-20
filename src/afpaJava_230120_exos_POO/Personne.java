package afpaJava_230120_exos_POO;


public class Personne {
	private String nom, prenom;
	
	public Personne(String prenom, String nom) {
		this.nom = nom;
		this.prenom = prenom;
		
		
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public String toStr() {
		return prenom + " " + nom;
	}
	
	
	
}
