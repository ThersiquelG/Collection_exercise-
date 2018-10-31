package co.simlon.ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListEx19 {
/*
 * Ecrire un programme Java pour imprimer tous les éléments d’une ArrayList en utilisant la
position des éléments.
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
		ListIterator<String> it = list1.listIterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
			
	}

}
