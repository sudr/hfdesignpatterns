package info.sudr.hfdp.pizza.factory;

import info.sudr.hfdp.pizza.Pizza;
import info.sudr.hfdp.pizza.Pizza.Type;
import info.sudr.hfdp.pizza.ny.chicago.ChicagoStyleCheesePizza;
import info.sudr.hfdp.pizza.ny.chicago.ChicagoStyleClamPizza;
import info.sudr.hfdp.pizza.ny.chicago.ChicagoStylePepperoniPizza;
import info.sudr.hfdp.pizza.ny.chicago.ChicagoStyleVeggiePizza;

public class ChicagoPizzaFactory implements SimplePizzaFactory {

	public Pizza createPizza(Type type) {
		switch (type) {
		case CHEESE:
			return new ChicagoStyleCheesePizza();
		case CLAM:
			return new ChicagoStyleClamPizza();
		case PEPPERONI:
			return new ChicagoStylePepperoniPizza();
		case VEGGIE:
			return new ChicagoStyleVeggiePizza();
		default:
			throw new RuntimeException("we do not have " + type + " pizzas");
		}
	}

}
