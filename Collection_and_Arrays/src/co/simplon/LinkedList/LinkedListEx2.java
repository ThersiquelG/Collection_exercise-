package co.simplon.LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListEx2 {
/*
 * Ecrire un programme Java pour parcourir tous les éléments d&#39;une LinkedList.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new LinkedList();
		list.add("Rouge");
		list.add("Noir");
		list.add("Vert");
		list.add("Jaune");
		list.add("Marron");
		list.add("Mauve");
		list.add("Turquoise");
		ListIterator<String> it = list.listIterator();
		System.out.println(list);
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
