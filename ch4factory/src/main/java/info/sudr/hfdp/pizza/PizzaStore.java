package info.sudr.hfdp.pizza;

import info.sudr.hfdp.pizza.Pizza.Type;

public class PizzaStore {

	private SimplePizzaFactory factory;
	
	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}
	
	public Pizza orderPizza(Type type) {
		System.out.println("ordering " + type + " pizza");
		Pizza pizza = factory.createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
}
