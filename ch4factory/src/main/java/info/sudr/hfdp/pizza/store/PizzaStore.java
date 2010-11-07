package info.sudr.hfdp.pizza.store;

import info.sudr.hfdp.pizza.Pizza;
import info.sudr.hfdp.pizza.Pizza.Type;

public abstract class PizzaStore {

	public Pizza orderPizza(Type type) {
		System.out.println("ordering " + type + " pizza");
		Pizza pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	protected abstract Pizza createPizza(Type type);
	
}
