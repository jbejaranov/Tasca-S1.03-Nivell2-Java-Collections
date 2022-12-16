package ex1;

import java.util.ArrayList;
import java.util.HashSet;

public class App {

	public static void main(String[] args) {

		HashSet<Restaurant> miHashSet = new HashSet<Restaurant>();
		String nom;
		int puntuacio;

		Restaurant miRestaurant111 = new Restaurant("Restaurant111", 10);
		Restaurant miRestaurant222 = new Restaurant("Restaurant222", 20);
		Restaurant miRestaurant333 = new Restaurant("Restaurant333", 30);

		// Afegim 3 restaurants diferents
		miHashSet.add(miRestaurant111);
		miHashSet.add(miRestaurant222);
		miHashSet.add(miRestaurant333);

//Restaurants duplicats	(no s'imprimeixen ja que tenen mateix nom i puntuació)

		miHashSet.add(miRestaurant222);
		miHashSet.add(miRestaurant333);

//Restaurants amb mateix nom pero diferent puntuació (Al tenir diferent puntuació, sí s'afegirà a la llista)

		Restaurant miRestaurant444 = new Restaurant("Restaurant222", 200);
		Restaurant miRestaurant555 = new Restaurant("Restaurant333", 300);

		miHashSet.add(miRestaurant444);
		miHashSet.add(miRestaurant555);
		miHashSet.add(miRestaurant555);

// Convertim HashSet a ArrayList per poder imprimir
		ArrayList<Restaurant> list = new ArrayList<Restaurant>(miHashSet);

		for (int i = 0; i < list.size(); i++) {

			nom = list.get(i).getNom();
			puntuacio = list.get(i).getPuntuacio();

			System.out.println(nom + " " + puntuacio);

		}

	}

}
