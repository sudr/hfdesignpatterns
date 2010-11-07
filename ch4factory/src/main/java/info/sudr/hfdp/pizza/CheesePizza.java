package info.sudr.hfdp.pizza;

import info.sudr.hfdp.pizza.ingredient.PizzaIngredientFactory;

public class CheesePizza extends Pizza {

	private final PizzaIngredientFactory ingredientFactory;

	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.creteCheese();
	}
}
