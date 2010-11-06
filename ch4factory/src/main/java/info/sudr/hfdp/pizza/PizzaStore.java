package info.sudr.hfdp.pizza;

import info.sudr.hfdp.pizza.Pizza.Type;

public class PizzaStore {

	public Pizza orderPizza(Type type) {
		System.out.println("ordering " + type + " pizza");
		Pizza pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}

	private Pizza createPizza(Type type) {
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
