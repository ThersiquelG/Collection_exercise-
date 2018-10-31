package co.simplon.LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
/*
 * Ecrire un programme Java pour itérer une LinkedList dans l&#39;ordre inverse.
 */
public class LinkedListEx4 {

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
		
		// use ListIterator to iterate List in reverse order
		ListIterator<String> it = list.listIterator(list.size());
		
		// hasPrevious() returns true if the list has previous element
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
		
	}

}
