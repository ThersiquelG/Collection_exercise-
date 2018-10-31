package co.simplon.hashSet;

import java.util.HashSet;

public class HashSetEx9 {
	/*
	 * Ecrire un programme Java pour comparer deux HashSets.
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

		HashSet<String> h2 = new HashSet<String>();
		h2.add("Jambon");
		h2.add("Pwar");
		h2.add("Jesus");
		h2.add("Voiture");
		h2.add("Oui");
		System.out.println("Contenu deuxième HashSet :" + h2);

		// for each String premier hSET
		for (String element : h) {

			// if deuxième hset contiens les strings
			if (h2.contains(element)) {
				System.out.println("They have " + element + " in common.");
			}
		}

	}
}
