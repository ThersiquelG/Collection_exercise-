package co.simplon.hashSet;

import java.util.HashSet;

public class HashSetEx5 {
/*
 * Ecrire un programme Java pour tester un HashSet vide ou non.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> h = new HashSet<String>();
		 h.add("Pomme");
		 h.add("Pwar");
		 h.add("Chips");
		 h.add("Voiture");
		 h.add("Fraise");
		 System.out.println("Est ce que la liste est vide ? " + h.isEmpty());
	}

}
