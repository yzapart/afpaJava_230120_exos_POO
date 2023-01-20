package afpaJava_230120_exos_POO;

import java.util.ArrayList;


public class TestBatiment {
	
	public static void main(String[] args) {
//		Immeuble i1 = new Immeuble("3 rue machin", 670, 5);
//		Maison m1   = new Maison("24 rue Pasteur", 55, 40, 4);
//		Batiment b1 = new Batiment("5 rue truc", 300);
//		
//		listeBatiments.add(i1);
//		listeBatiments.add(m1);

		genererPersonnes();
		afficherPersonnes();
		System.out.println("---");
		
		genererBatiments(20);
		afficherBatiments();
		System.out.println("---");
		
		System.out.println("Surface hab. totale : " + surfaceHabitableTotale(listeBatiments) + " m²");
		System.out.println("Surface jrd. totale : " + surfaceJardinTotale(listeBatiments) + " m²");
		System.out.println("---");
		
		
		
	}
	
	public static ArrayList<Batiment> listeBatiments = new ArrayList<>();
	public static void afficherBatiments() {
		for (Batiment b: listeBatiments) {
			System.out.println(b.toStr());
		}
	}
	
	public static ArrayList<Personne> listePersonnes = new ArrayList<>();
	public static void afficherPersonnes() {
		for (Personne p: listePersonnes) {
			System.out.println(p.toStr());
		}
	}
	

	public static void genererBatiments(int n) {
		String rues[] = {"Pasteur", "Truc", "Machin", "Chose", "Prevert", "Carnot", "de Dax", "Turing", "Allo", "Lune", "d'Isly", "Toto"};
		for (int i = 0; i<n; i++) {
			Personne proprietaire = listePersonnes.get(Utils.nAlea(0, listePersonnes.size()));
			listeBatiments.add(new Batiment(Utils.nAlea(1, 99) + " rue " + rues[Utils.nAlea(0, rues.length)], Utils.nAlea(40, 500), proprietaire));
		}
	}
	
	public static int surfaceHabitableTotale(ArrayList<Batiment> tabBat) {
		int sum = 0;
		for (Batiment batiment : tabBat) {
			sum += batiment == null ? 0 : batiment.getSurfaceHabitable();
		}
		return sum;
	}
	
	public static int surfaceJardinTotale(ArrayList<Batiment> tabBat) {
		int sum = 0;
		for (Batiment b : tabBat) {
			sum += b == null ? 0 : (b instanceof Maison) ? ((Maison) b).getSurfaceJardin() : 0;
		}
		return sum;
	}
	
	public static void genererPersonnes() {
		String[][] listeNoms = {
				{"Francis", "Cabrel"},
				{"JJ","Goldman"},
				{"Celine","Dion"},
				{"Francis","Lalanne"},
				{"France","Gall"},
				{"Aymeric","Lompret"},
				{"Daniel","Balavoine"},
				{"Michel","Berger"}
		};
		for (int i=0; i<listeNoms.length; i++) {
			listePersonnes.add(new Personne(listeNoms[i][0], listeNoms[i][1]));
		}
	}
	
	
	
}
