package co.simlon.ArrayList;

import java.util.ArrayList;

public class ArrayListEx4 {
/*
 * Ecrire un programme Java pour extraire un élément (à un index spécifié) d'une arraylist
donnée.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Rouge");
		al.add("Noir");
		al.add("Vert");
		al.add("Jaune");
		
		System.out.println("Vous avez selectionner l'index 2 : "  + al.get(1));
	}

}
