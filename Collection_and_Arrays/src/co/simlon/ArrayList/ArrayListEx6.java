package co.simlon.ArrayList;

import java.util.ArrayList;

public class ArrayListEx6 {
	/*
	 * Ecrire un programme Java pour supprimer le troisième élément d&#39;une arraylist.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Rouge");
		al.add("Noir");
		al.add("Vert");
		al.add("Jaune");
		
		System.out.println("ArrayList Avant le delete.");
		for(String color : al) {
			System.out.println(color);
		}
		System.out.println("********************************");
	
		
		al.remove(2);
		System.out.println("ArrayList Après le delete.");
		for(String color : al) {
			System.out.println(color);
		}
	}

}
