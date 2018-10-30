package co.simlon.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx10 {
/*
 * Ecrire un programme Java pour mélanger les éléments dans une arraylist.
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
		System.out.println("Contenu de la première liste avant le shuffle");
		for(String color1 : list1) {
			System.out.println(color1);
		}
		
		System.out.println("***********");
		System.out.println("Application du shuffle.");
		Collections.shuffle(list1);
		System.out.println("***********");
		System.out.println("Contenu de la première liste après le shuffle.");
		for(String color : list1) {
			System.out.println(color);
		}
	}

}
