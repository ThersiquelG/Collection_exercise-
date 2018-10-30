package co.simlon.ArrayList;

import java.util.ArrayList;

public class ArrayListEx16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Rouge");
		list1.add("Noir");
		list1.add("Vert");
		
		System.out.println("Liste original.");
		System.out.println(list1);
		
		
		ArrayList<String> list2 = (ArrayList<String>)list1.clone();
		
		System.out.println("Copie de la première liste.");
		System.out.println(list2);
		
		list1.remove(1);
		
		System.out.println("Removal de l'index 1.");
		System.out.println(list2);
		System.out.println(list1);
	}

}
