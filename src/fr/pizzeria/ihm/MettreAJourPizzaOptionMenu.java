package fr.pizzeria.ihm;

import fr.pizzeria.console.PizzeriaAdmin;
import fr.pizzeria.dao.PizzaDao;

public class MettreAJourPizzaOptionMenu extends OptionMenu {

	public MettreAJourPizzaOptionMenu(String libelle) {
		super(libelle);
	}

	@Override
	public boolean execute() {
		
		System.out.println("Veuillez choisir le code de la pizza à modifier.");
		System.out.println("(99 pour abandonner)");
		
		String codeChosen = PizzeriaAdmin.getInput().next();
		
		if(!codeChosen.equals("99")) {
		
			String codeString;
			String nomString;
			String prixString;
			
			System.out.println("Veuillez saisir le code");
			codeString = PizzeriaAdmin.getInput().next();
			System.out.println("Veuillez saisir le nom (sans espace)");
			nomString = PizzeriaAdmin.getInput().next();
			System.out.println("Veuillez saisir le prix");
			prixString = PizzeriaAdmin.getInput().next();
			
			for(int i=0 ; i<PizzaDao.getPizzas().length ; i++) {
				if(PizzaDao.getPizzas()[i] != null && PizzaDao.getPizzas()[i].getCode().equals(codeChosen)) {
					PizzaDao.getPizzas()[i].setCode(codeString);
					PizzaDao.getPizzas()[i].setNom(nomString);
					PizzaDao.getPizzas()[i].setPrix(Double.parseDouble(prixString));
				}
			}
		}
		
		return true;
	}

}
