package afpaJava_230120_exos_POO;

import java.util.ArrayList;

public class TestBatiment {
	
	public static void main(String[] args) {
		Immeuble i1 = new Immeuble("3 rue machin", 670, 5);
		Maison m1   = new Maison("24 rue Pasteur", 55, 40, 4);
		Batiment b1 = new Batiment("5 rue truc", 300);
		
		listeBatiments.add(i1);
		listeBatiments.add(m1);
		
				
		genererBatiments(20);
		afficher(listeBatiments);
		System.out.println("---");
		
		System.out.println("Surface hab. totale : " + surfaceHabitableTotale(listeBatiments) + " m²");
		System.out.println("Surface jrd. totale : " + surfaceJardinTotale(listeBatiments) + " m²");
		
		
	}
	
	public static ArrayList<Batiment> listeBatiments = new ArrayList<>();
	public static void afficher(ArrayList<Batiment> arrayList) {
		for (Batiment b: arrayList) {
			System.out.println(b.toStr() + "\t" + (b instanceof Maison));
		}
	}
	

	public static void genererBatiments(int n) {
		String rues[] = {"Pasteur", "Truc", "Machin", "Chose", "Prevert", "Carnot", "de Dax", "Turing", "Allo", "Lune", "d'Isly", "Toto"};
		for (int i = 0; i<n; i++) {
			listeBatiments.add(new Batiment(Utils.nAlea(1, 99) + " rue " + rues[Utils.nAlea(0, rues.length)], Utils.nAlea(40, 500)));
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
	
	
	
}
