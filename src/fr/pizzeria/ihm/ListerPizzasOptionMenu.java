package fr.pizzeria.ihm;

import fr.pizzeria.dao.PizzaDao;
import fr.pizzeria.model.Pizza;

public class ListerPizzasOptionMenu extends OptionMenu {

	public ListerPizzasOptionMenu(String libelle) {
		super(libelle);
	}

	@Override
	public boolean execute() {
		for(Pizza p : PizzaDao.getPizzas()) {
			if(p != null) {
				System.out.println(p.getCode() + " -> " 
								 + p.getNom() + " (" 
								 + p.getPrix() + " €)");
			}
		}
		return true;
	}
	

}
