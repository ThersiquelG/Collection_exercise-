package co.simlon.ArrayList;

import java.util.ArrayList;

public class ArrayListEx5 {
/*
 * Ecrire un programme Java pour mettre à jour un élément spécifique par élément donné.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Rouge");
		al.add("Noir");
		al.add("Vert");
		al.add("Jaune");
		System.out.println("Valeur de l'index [2] : " + al.get(2));
		al.set(2, "Marron");
		System.out.println("Valeur de l'index [2] après màj : " + al.get(2));
	}

}
