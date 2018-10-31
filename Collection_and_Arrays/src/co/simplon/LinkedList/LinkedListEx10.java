package co.simplon.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

/*
 * Ecrire un programme Java pour obtenir la première et la dernière occurrence des
   éléments spécifiés dans une LinkedList.
 */
public class LinkedListEx10 {

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
		ListIterator<String> it = list.listIterator();
		System.out.println(list.indexOf("Marron"));
		System.out.println(list.lastIndexOf("Mauve"));
		
	}

}
