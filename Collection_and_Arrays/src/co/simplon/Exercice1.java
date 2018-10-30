package co.simplon;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		Scanner sc = new Scanner(System.in);
		
		int  nbInput= 0;
		int total =  0 ;
		while(nbInput<3) {
			System.out.println("Veuillez taper un nombre qui sera ajouté dans le tableau.");
			int valueUser = sc.nextInt();
			nbInput++;
			al.add(valueUser);
			 total += valueUser ;
			
		}
		System.out.println("Next step.");
		
		for(int i = 0; i<al.size();i++) {
			System.out.println("entrée à l'indice : " + i + " correspond à  "  + al.get(i));
			
		}
		
		System.out.println("Calcule de la moyenne des valeurs contenues dans votre tableau ...");
		
		
		int moyenne = total / nbInput ;
		//int moyenne = ((int) al.get(0) + (int) al.get(1) +  (int) al.get(2) + (int) al.get(3) +(int) al.get(4) + (int) al.get(5) + (int) al.get(6) +(int) al.get(7) + (int) al.get(8) + (int) al.get(9)) / 10;
		System.out.println("La moyenne des valeurs contenues dans le tableau est de .." + moyenne);
		
		
        System.out.println(al.isEmpty());		
        System.out.println(al.contains(23));
		
		
		
		
		
		
	}

}
