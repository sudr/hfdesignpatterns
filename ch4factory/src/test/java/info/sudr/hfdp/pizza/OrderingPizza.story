package info.sudr.hfdp.pizza

import info.sudr.hfdp.pizza.factory.*;
import info.sudr.hfdp.pizza.store.NYPizzaStore;
import info.sudr.hfdp.pizza.store.ChicagoPizzaStore;

scenario "order a NY style cheese pizza", {
	given "a NY pizza store", {
		store = new NYPizzaStore()
	}
	
	when "we order a cheese pizza", {
		pizza = store.orderPizza(Pizza.Type.CHEESE)
	}
	
	then "we receive a NY style cheese pizza", {
		pizza.name.shouldBeEqualTo "NY Style Sauce and Cheeze Pizza"
	}
}

scenario "order a Chicago style cheese pizza", {
	given "a Chicago pizza store", {
		store = new ChicagoPizzaStore()
	}
	
	when "we order a cheese pizza", {
		pizza = store.orderPizza(Pizza.Type.CHEESE)
	}
	
	then "we receive a Chicago style cheese pizza", {
		pizza.name.shouldBeEqualTo "Chicago Style Deep Dish Cheeze Pizza"
	}
}