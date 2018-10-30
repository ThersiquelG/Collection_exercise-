package co.simlon.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Rouge");
		list1.add("Noir");
		list1.add("Vert");
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Rouge");
		list2.add("Bleu");
		list2.add("Vert");
		
		
		boolean result = Arrays.equals(list1.toArray(),list2.toArray());
		
		if(result == true ) {
			System.out.println("Les listes sont identiques.");
		} else {
			System.out.println("Les listes sont différentes.");
		}
	}

}
