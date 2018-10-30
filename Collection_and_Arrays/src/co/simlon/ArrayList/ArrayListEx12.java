package co.simlon.ArrayList;

import java.util.ArrayList;

public class ArrayListEx12 {

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
		
		System.out.println("Contenu de la liste original");
		System.out.println(list1);
		
		ArrayList<String> list1p2 = new ArrayList<String>(list1.subList(2, 5));
		
		System.out.println("Contenu extracted.");
		System.out.println(list1p2);
	}

}
