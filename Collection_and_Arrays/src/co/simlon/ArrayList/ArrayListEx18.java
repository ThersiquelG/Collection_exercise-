package co.simlon.ArrayList;

import java.util.ArrayList;

public class ArrayListEx18 {

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
		if(list1.isEmpty()) {
			System.out.println("La liste est vide.");
			
		} else {
			System.out.println("La liste contient des valeurs.");
		}
	}

}
