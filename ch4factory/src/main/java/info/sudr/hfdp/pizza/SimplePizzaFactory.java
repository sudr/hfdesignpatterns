package info.sudr.hfdp.pizza;

import info.sudr.hfdp.pizza.Pizza.Type;

public class SimplePizzaFactory {

	public Pizza createPizza(Type type) {
		switch (type) {
		case CHEESE:
			return new CheesePizza();
		case GREEK:
			return new GreekPizza();
		case PEPPERONI:
			return new PepperoniPizza();
		default:
			throw new RuntimeException("we do not have " + type + " pizzas");
		}
	}

}
