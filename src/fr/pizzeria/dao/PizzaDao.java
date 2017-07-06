package fr.pizzeria.dao;

import fr.pizzeria.model.Pizza;

public class PizzaDao {

	static private Pizza[] pizzas;
	
	/**
	 * Initialise les pizzas originelles
	 */
	static public void initPizzas(int nbPizzas) {
		
		pizzas = new Pizza[nbPizzas];
		
		pizzas[0] = new Pizza(0, "PEP", "Pépéroni", 12.50);
		pizzas[1] = new Pizza(1, "MAR", "Margherita", 14.00);
		pizzas[2] = new Pizza(2, "REI", "LA Reine", 11.50);
		pizzas[3] = new Pizza(3, "FRO", "La 4 fromages", 12.00);
		pizzas[4] = new Pizza(4, "CAN", "La cannibale", 12.50);
		pizzas[5] = new Pizza(5, "SAV", "La savoyarde", 13.00);
		pizzas[6] = new Pizza(6, "ORI", "L'orientale", 13.50);
		pizzas[7] = new Pizza(7, "IND", "L'indienne", 14.00);
	}
	
	/**
	 * @return the pizzas
	 */
	public static Pizza[] getPizzas() {
		return pizzas;
	}
}
