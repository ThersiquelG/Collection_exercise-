package co.simlon.ArrayList;

import java.util.ArrayList;

public class ArrayListEx15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Rouge");
		list1.add("Noir");
		list1.add("Vert");
		
		System.out.println(list1);
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Jaune");
		list2.add("Marron");
		list2.add("Mauve");
		System.out.println(list2);
		
		
		System.out.println("Deuxième liste après jointure");
		list2.addAll(list1);
		System.out.println(list2);
		
	}

}
