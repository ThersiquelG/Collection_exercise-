package co.simlon.ArrayList;

import java.util.ArrayList;

public class ArrayListEx17 {

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
		
		System.out.println("Liste avant le removeAll.");
		System.out.println(list1);
		
		System.out.println("********");
		
		list1.removeAll(list1);
		System.out.println("Liste après le removeAll.");
		System.out.println(list1);
	}

}
