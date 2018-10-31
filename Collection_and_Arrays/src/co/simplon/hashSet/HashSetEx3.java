package co.simplon.hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx3 {
/*
 * Ecrire un programme Java pour obtenir le nombre d&#39;éléments d&#39;un HashSet.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> h = new HashSet<String>();
		 h.add("Pomme");
		 h.add("Pwar");
		 h.add("Chips");
		 h.add("Voiture");
		 h.add("Fraise");
		 System.out.println("La liste contient : " + h.size() + " éléments.");
	}

}
