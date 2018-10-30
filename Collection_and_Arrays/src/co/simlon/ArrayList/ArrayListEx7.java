package co.simlon.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx7 {
/*
 * Ecrire un programme Java pour rechercher un élément dans une arraylist.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		al.add("Rouge");
		al.add("Noir");
		al.add("Vert");
		al.add("Jaune");
		al.add("Marron");
		al.add("Mauve");
		al.add("Turquoise");
		System.out.println("Tapez la couleur que vous voulez rechercher.");
		String myColor = sc.next();
		
		System.out.println("Nous recherchons la couleur : " + myColor);
		boolean colorWanted = true;
		while(colorWanted) {
			for(String color : al) {
				if(color.equals(myColor)) {
					System.out.println("Nous avons trouvé la couleur demandée : " + color);
					System.out.println("Merci d'avoir utilisé cette application.*********************");
					colorWanted = false;
					
				} else {
					System.out.println("Parcours de l'ArrayList ...");
				}
			}
		}
	}

}
