package co.simlon.ArrayList;

import java.util.ArrayList;

public class ArrayListEx3 {
/*
 * Ecrire un programme Java pour insérer un élément dans l’ arraylist à la première position.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Rouge");
		al.add("Noir");
		al.add("Vert");
		al.add("Jaune");
		
		System.out.println("En première position la couleur est : " + al.get(0));
		for(String color : al) {
			System.out.println("La couleur " + color + " provient de l'ArrayList.");
			
		}
		al.add(0, "Bleu");
		
		System.out.println("En première positon la couleur est devenue ... : " + al.get(0));
	}

}
 