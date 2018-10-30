package co.simlon.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx9 {
/*
 * Ecrire un programme Java pour copier une arraylist dans une autre.
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
		System.out.println("Contenu de la première liste.");
		for(String color1 : list1) {
			System.out.println(color1);
		}
		
		System.out.println("************************************");
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Voiture");
		list2.add("Camion");
		list2.add("Banane");
		list2.add("Pwar");
		list2.add("oWo");
		list2.add("UmU");
		list2.add("uWu");
		System.out.println("Contenu de la deuxième liste.");
		for(String color2: list2) {
			System.out.println(color2);
		}
		
		System.out.println("*********************************");
		list2.addAll(list1);
		
		System.out.println("Contenue de la première liste copié dans la deuxième liste.");
		for(String value : list2) {
			System.out.println(value);
		}
	}

}
