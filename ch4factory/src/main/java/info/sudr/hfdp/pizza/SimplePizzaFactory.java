package info.sudr.hfdp.pizza;

import info.sudr.hfdp.pizza.Pizza.Type;

public class SimplePizzaFactory {

	public Pizza createPizza(Type type) {
		switch (type) {
		case CHEESE:
			return new CheesePizza();
		case CLAM:
			return new ClamPizza();
		case PEPPERONI:
			return new PepperoniPizza();
		case VEGGIE:
			return new VeggiePizza();
		default:
			throw new RuntimeException("we do not have " + type + " pizzas");
		}
	}

}
