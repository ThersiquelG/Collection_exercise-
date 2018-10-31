package co.simplon.LinkedList;

import java.util.LinkedList;
/*
 * Ecrire un programme Java pour insérer l&#39;élément spécifié au début d&#39;une LinkedList.
 * Ecrire un programme Java pour insérer l&#39;élément spécifié à la fin d&#39;une LinkedList.
 */
public class LinkedListEx7 {

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
		
		list.add(0, "Pomme");
		System.out.println(list);
		
	}

}
