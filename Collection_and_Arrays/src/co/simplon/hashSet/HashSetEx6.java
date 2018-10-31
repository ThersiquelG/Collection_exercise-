package co.simplon.hashSet;

import java.util.HashSet;

public class HashSetEx6 {
/*
 * Ecrire un programme Java pour cloner un HashSet en un autre.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> h = new HashSet<String>();
		 h.add("Pomme");
		 h.add("Pwar");
		 h.add("Chips");
		 h.add("Voiture");
		 h.add("Fraise");
		 System.out.println("Contenue du premier HashSet : " + h);
		 
		 HashSet<String> h2 = (HashSet<String>) h.clone();
		 System.out.println("Contenu du deuxième HashSet : " + h2);
	}

}
