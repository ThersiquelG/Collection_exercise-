package co.simlon.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx8 {
/*
 * Ecrire un programme Java pour trier une arraylist donnée.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("E");
		al.add("D");
		al.add("A");
		al.add("B");
		al.add("O");
		al.add("S");
		al.add("H");
		
		
		for(String letter : al) {
			
			System.out.println("The lettre : " + letter);
		}
		System.out.println();
		Collections.sort(al);
		for(String letter : al ) {
			System.out.println("The lettre : " + letter);
		}
		
	}

}
