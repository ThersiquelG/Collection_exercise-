package co.simplon.hashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetEx8 {
/*
 * Ecrire un programme Java pour convertir un HashSet défini en ArrayList.
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
		 
		 ArrayList<String> arrayHset = new ArrayList<String>(h);
		 System.out.println(arrayHset);
	}

}
