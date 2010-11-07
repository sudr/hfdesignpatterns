package info.sudr.hfdp.pizza.store;

import info.sudr.hfdp.pizza.CheesePizza;
import info.sudr.hfdp.pizza.ClamPizza;
import info.sudr.hfdp.pizza.PepperoniPizza;
import info.sudr.hfdp.pizza.Pizza;
import info.sudr.hfdp.pizza.Pizza.Type;
import info.sudr.hfdp.pizza.VeggiePizza;
import info.sudr.hfdp.pizza.ingredient.ChicagoPizzaIngredientFactory;
import info.sudr.hfdp.pizza.ingredient.PizzaIngredientFactory;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(Type type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

		switch (type) {
		case CHEESE:
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Cheese Pizza");
			break;
		case CLAM:
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Chicago Style Clam Pizza");
			break;
		case PEPPERONI:
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("Chicago Style Pepperoni Pizza");
			break;
		case VEGGIE:
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("Chicago Style Veggie Pizza");
			break;
		default:
			throw new RuntimeException("we do not have " + type + " pizzas");
		}

		return pizza;
	}

}
