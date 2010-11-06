package info.sudr.hfdp.pizza.factory;

import info.sudr.hfdp.pizza.Pizza;
import info.sudr.hfdp.pizza.Pizza.Type;

public interface SimplePizzaFactory {

	Pizza createPizza(Type type);

}
