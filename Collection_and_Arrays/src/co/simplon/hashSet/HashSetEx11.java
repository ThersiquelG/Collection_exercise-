package co.simplon.hashSet;

import java.util.HashSet;

public class HashSetEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> h = new HashSet<String>();
		h.add("Pomme");
		h.add("Pwar");
		h.add("Chips");
		h.add("Voiture");
		h.add("Fraise");
		System.out.println("Contenue du premier HashSet : " + h);
		h.clear();
		System.out.println("Nombre d'éléments dans le HashSet :" + h.size());
	}

}
