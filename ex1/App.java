package ex1;

import java.util.ArrayList;
import java.util.HashSet;

public class App {

	public static void main(String[] args) {

		HashSet<Restaurant> miHashSet = new HashSet<Restaurant>();

		Restaurant miRestaurant111 = new Restaurant("Restaurant111", 10);
		Restaurant miRestaurant222 = new Restaurant("Restaurant222", 20);
		Restaurant miRestaurant333 = new Restaurant("Restaurant333", 30);

		miHashSet.add(miRestaurant111);
		miHashSet.add(miRestaurant222);
		miHashSet.add(miRestaurant333);

//Restaurants duplicats	(no s'imprimeixen ja que tenen mateix nom i puntuació)
		miHashSet.add(miRestaurant222);
		miHashSet.add(miRestaurant333);

		Restaurant miRestaurant444 = new Restaurant("Restaurant222", 400);
		Restaurant miRestaurant555 = new Restaurant("Restaurant333", 600);

//Restaurants amb mateix nom pero diferent puntuació		
		miHashSet.add(miRestaurant444);
		miHashSet.add(miRestaurant555);

// Convertim HashSet a ArrayList per poder imprimir
		ArrayList<Restaurant> list = new ArrayList<Restaurant>(miHashSet);

		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i).getNom());
		}
	}
}
