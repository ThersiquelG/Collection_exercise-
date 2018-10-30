package co.simlon.ArrayList;

import java.util.ArrayList;

public class ArrayListEx2 {
/*
 * Ecrire un programme Java pour parcourir tous les éléments d'une arraylist.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Rouge");
		al.add("Noir");
		al.add("Vert");
		al.add("Jaune");
		
		for (int i = 0; i<al.size();i++) {
			System.out.println("En train de parcourir l'ArrayList ... : " + al.get(i));
		}
	}

}
