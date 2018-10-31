package co.simplon.hashSet;

import java.util.HashSet;

public class HashSetEx4 {
/*
 * Ecrire un programme Java pour vider un HashSet.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> h = new HashSet<String>();
		 h.add("Pomme");
		 h.add("Pwar");
		 h.add("Chips");
		 h.add("Voiture");
		 h.add("Fraise");
		 System.out.println("Liste avant de la vider " + h);
		 h.removeAll(h);
		 System.out.println("Liste après l'avoir vider " + h);
		 System.out.println("Nombre d'éléments dans la liste :" + h.size());
	}

}
