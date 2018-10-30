	package co.simlon.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList14 {

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
		
		System.out.println("Liste originale");
		System.out.println(list1);
		
		Collections.swap(list1, 2, 5);
		
		System.out.println("Liste après le swap.");
		System.out.println(list1);
	}

}
