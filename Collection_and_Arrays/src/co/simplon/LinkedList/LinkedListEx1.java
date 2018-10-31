package co.simplon.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
/*
 * Ecrire un programme Java pour ajouter l&#39;élément spécifié à la fin d&#39;une LinkedList.
 */
public class LinkedListEx1 {

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
