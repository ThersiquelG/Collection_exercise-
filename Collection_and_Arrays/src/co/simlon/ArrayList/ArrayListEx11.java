package co.simlon.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx11 {
/*
 * Ecrire un programme Java pour inverser des éléments dans une arraylist.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Rouge");
		list1.add("Noir");
		list1.add("Vert");
		list1.add("Jaune");
		list1.add("Marron");
		list1.add("Mauve");
		list1.add("Turquoise");
		
		System.out.println("Liste avant l'inversement.");
		System.out.println(list1);
		
		System.out.println("Liste après l'inversement.");
		Collections.reverse(list1);
		System.out.println(list1);
	}

}
