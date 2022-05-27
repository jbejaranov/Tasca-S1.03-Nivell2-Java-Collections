package ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class App {

	public static void main(String[] args) {

		HashSet<Restaurant> miHashSet = new HashSet<Restaurant>();

		Restaurant miRestaurant111 = new Restaurant("Restaurant_A", 10);
		Restaurant miRestaurant222 = new Restaurant("Restaurant_B", 20);
		Restaurant miRestaurant333 = new Restaurant("Restaurant_C", 30);

		miHashSet.add(miRestaurant111);
		miHashSet.add(miRestaurant222);
		miHashSet.add(miRestaurant333);

//Restaurants duplicats	(no s'imprimeixen ja que tenen mateix nom i puntuació)
		miHashSet.add(miRestaurant222);
		miHashSet.add(miRestaurant333);

		Restaurant miRestaurant444 = new Restaurant("Restaurant_B", 400);
		Restaurant miRestaurant555 = new Restaurant("Restaurant_C", 600);

//Restaurants amb mateix nom pero diferent puntuació		
		miHashSet.add(miRestaurant444);
		miHashSet.add(miRestaurant555);

// Convertim HashSet a ArrayList per poder imprimir
		List list = new ArrayList<Restaurant>(miHashSet);

		System.out.println("Llista desordenada: ");
		System.out.println(list);
		
//Ordenem llista
		Collections.sort(list);
		System.out.println("\nLlista ordenada: ");
		System.out.println(list);
	}
}
