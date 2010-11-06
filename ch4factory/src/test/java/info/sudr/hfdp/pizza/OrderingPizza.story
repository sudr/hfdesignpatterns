package info.sudr.hfdp.pizza

scenario "order a cheese pizza", {
	given "a pizza store", {
		store = new PizzaStore()
	}
	
	when "we order a cheese pizza", {
		pizza = store.orderPizza(Pizza.Type.CHEESE)
	}
	
	then "we receive a cheese pizza", {
		pizza.type.shouldBeEqualTo Pizza.Type.CHEESE
	}
}

scenario "order a greek pizza", {
	given "a pizza store", {
		store = new PizzaStore()
	}
	
	when "we order a greek pizza", {
		pizza = store.orderPizza(Pizza.Type.GREEK)
	}
	
	then "we receive a greek pizza", {
		pizza.type.shouldBeEqualTo Pizza.Type.GREEK
	}
}

scenario "order a pepperoni pizza", {
	given "a pizza store", {
		store = new PizzaStore()
	}
	
	when "we order a pepperoni pizza", {
		pizza = store.orderPizza(Pizza.Type.PEPPERONI)
	}
	
	then "we receive a pepperoni pizza", {
		pizza.type.shouldBeEqualTo Pizza.Type.PEPPERONI
	}
}