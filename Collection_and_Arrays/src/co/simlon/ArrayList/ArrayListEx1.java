package co.simlon.ArrayList;

import java.util.ArrayList;

public class ArrayListEx1 {
/*
 * Ecrire un programme Java pour créer une nouvelle arraylist, ajoutez des couleurs (String)
et imprimer la collection.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Rouge");
		al.add("Noir");
		al.add("Vert");
		al.add("Jaune");
		for(String color : al) {
			System.out.println("La couleur " + color + " provient de l'ArrayList.");

		}

	}
}

