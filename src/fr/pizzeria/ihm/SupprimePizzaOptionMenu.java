package fr.pizzeria.ihm;

import fr.pizzeria.console.PizzeriaAdmin;
import fr.pizzeria.dao.PizzaDao;

public class SupprimePizzaOptionMenu extends OptionMenu {

	public SupprimePizzaOptionMenu(String libelle) {
		super(libelle);
	}

	@Override
	public boolean execute() {
		
		System.out.println("Veuillez choisir le code de la pizza à supprimer.");
		System.out.println("(99 pour abandonner)");
		
		String codeChosen = PizzeriaAdmin.getInput().next();
		
		if(!codeChosen.equals("99")) {
			
			int indexPizzaDelete = -1;
			
			// Récupère l'indice de la pizza supprimée
			for(int i=0 ; i<PizzaDao.getPizzas().length ; i++) {
				if(PizzaDao.getPizzas()[i] != null && PizzaDao.getPizzas()[i].getCode().equals(codeChosen)) {
					indexPizzaDelete = i;
				}
			}
			
			// Permet de "tasser" le tableau après la suppression
			for(int i=indexPizzaDelete ; i<PizzaDao.getPizzas().length ; i++) {
				if(PizzaDao.getPizzas()[i] != null) {
					PizzaDao.getPizzas()[i] = PizzaDao.getPizzas()[i+1];
				}
			}
		}
		
		return true;
	}

}
