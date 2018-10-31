package co.simplon.LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListEx5 {
/*
 * Ecrire un programme Java pour insérer l&#39;élément spécifié à la position spécifiée dans la
LinkedList.
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
		System.out.println(list);
		
		list.add(5, "Banane");
		System.out.println("Ajout d'un élément à l'index [5]");
		System.out.println(list);
		
		
		
	
		
		
		
	}

}
