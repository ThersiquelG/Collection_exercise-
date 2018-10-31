package co.simplon.hashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;


public class HashSetEx2 {
/*
 * Ecrire un programme Java pour parcourir tous les éléments d&#39;un HashSet.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> h = new HashSet<String>();
		 h.add("Pomme");
		 h.add("Pwar");
		 h.add("Chips");
		 h.add("Voiture");
		 h.add("Fraise");
		 Iterator<String> it = h.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
	}

}
