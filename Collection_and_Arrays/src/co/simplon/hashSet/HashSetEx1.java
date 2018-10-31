package co.simplon.hashSet;

import java.util.HashSet;

public class HashSetEx1 {
	/*
	 * Ecrire un programme Java pour ajouter l&#39;élément spécifié à la fin d&#39;un HashSet.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashSet<String> h = new HashSet<String>();
		 h.add("Pomme");
		 h.add("Pwar");
		 h.add("Chips");
		 h.add("Voiture");
		 h.add("Fraise");
		 System.out.println(h);
		 System.out.println("La liste contient-elle le mot Fraise ? :" + 
                 h.contains("Fraise")); 
		 System.out.println("La liste contient-elle le mot Banane ? :" + 
                 h.contains("Banane")); 
	}

}
