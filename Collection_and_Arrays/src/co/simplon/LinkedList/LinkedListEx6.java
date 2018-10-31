package co.simplon.LinkedList;

import java.util.LinkedList;

public class LinkedListEx6 {
/*
 * Ecrire un programme Java pour insérer des éléments dans la LinkedList en première et
   dernière position.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		list.add("Rouge");
		list.add("Noir");
		list.add("Vert");
		list.add("Jaune");
		list.add("Marron");
		list.add("Mauve");
		list.add("Turquoise");
		System.out.println("LinkedList before modification.");
		System.out.println(list);
		
		list.addFirst("Pomme");
		
		list.addLast("Pwar");
		
		System.out.println("LinkedList after modification.");
		System.out.println(list);
	}

}
