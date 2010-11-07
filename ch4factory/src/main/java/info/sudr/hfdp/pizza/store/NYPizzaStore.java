package info.sudr.hfdp.pizza.store;

import info.sudr.hfdp.pizza.CheesePizza;
import info.sudr.hfdp.pizza.ClamPizza;
import info.sudr.hfdp.pizza.PepperoniPizza;
import info.sudr.hfdp.pizza.Pizza;
import info.sudr.hfdp.pizza.Pizza.Type;
import info.sudr.hfdp.pizza.VeggiePizza;
import info.sudr.hfdp.pizza.ingredient.NYPizzaIngredientFactory;
import info.sudr.hfdp.pizza.ingredient.PizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(Type type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

		switch (type) {
		case CHEESE:
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
			break;
		case CLAM:
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
			break;
		case PEPPERONI:
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("New York Style Pepperoni Pizza");
			break;
		case VEGGIE:
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("New York Style Veggie Pizza");
			break;
		default:
			throw new RuntimeException("we do not have " + type + " pizzas");
		}

		return pizza;
	}
}
