package fr.pizzeria.ihm;

import fr.pizzeria.console.PizzeriaAdmin;
import fr.pizzeria.dao.PizzaDao;
import fr.pizzeria.model.Pizza;

public class NouvellePizzaOptionMenu extends OptionMenu {

	public NouvellePizzaOptionMenu(String libelle) {
		super(libelle);
	}

	@Override
	public boolean execute() {
		String codeString;
		String nomString;
		String prixString;
		
		System.out.println("Veuillez saisir le code");
		codeString = PizzeriaAdmin.getInput().next();
		System.out.println("Veuillez saisir le nom (sans espace)");
		nomString = PizzeriaAdmin.getInput().next();
		System.out.println("Veuillez saisir le prix");
		prixString = PizzeriaAdmin.getInput().next();
		
		int nbPizzas = 0;
		for(int i=0 ; i<PizzaDao.getPizzas().length ; i++) {
			if(PizzaDao.getPizzas()[i] != null) {
				nbPizzas++;
			}
		}
		
		PizzaDao.getPizzas()[nbPizzas] = new Pizza(nbPizzas, codeString, nomString, Double.parseDouble(prixString));
		return true;
	}

}
