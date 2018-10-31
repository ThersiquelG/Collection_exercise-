package co.simplon.hashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetEx7 {
/*
 * Ecrire un programme Java pour convertir un HashSet en un tableau.
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
		 h.add("Jambon");
		 h.add("Pwar");
		 h.add("Jesus");
		 h.add("Voiture");
		 h.add("Oui");
		 String[] array = new String[h2.size()];
		 h2.toArray(array);
		
		 System.out.println("************************************");
		 // Create a HashSet
	     HashSet<String> hset = new HashSet<String>();
	 
	     //add elements to HashSet
	     hset.add("Element1");
	     hset.add("Element2");
	     hset.add("Element3");
	     hset.add("Element4");
	 
	     // Displaying HashSet elements
	     System.out.println("HashSet contains: "+ hset);
	 
	     // Creating an Array
	     String[] array1 = new String[hset.size()];
	     hset.toArray(array1);
	 
	     // Displaying Array elements
	     System.out.println("Array elements: ");
	     for(String temp : array1){
	        System.out.println(temp);
	     }
	}

}
