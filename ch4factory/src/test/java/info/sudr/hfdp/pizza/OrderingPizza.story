package info.sudr.hfdp.pizza

shared_behavior "pizza store", {
	given "a pizza store", {
		store = new PizzaStore(new SimplePizzaFactory())
	}
}

scenario "order a cheese pizza", {
	it_behaves_as "pizza store"
	
	when "we order a cheese pizza", {
		pizza = store.orderPizza(Pizza.Type.CHEESE)
	}
	
	then "we receive a cheese pizza", {
		pizza.type.shouldBeEqualTo Pizza.Type.CHEESE
	}
}

scenario "order a clam pizza", {
	it_behaves_as "pizza store"
	
	when "we order a clam pizza", {
		pizza = store.orderPizza(Pizza.Type.CLAM)
	}
	
	then "we receive a clam pizza", {
		pizza.type.shouldBeEqualTo Pizza.Type.CLAM
	}
}

scenario "order a pepperoni pizza", {
	it_behaves_as "pizza store"
	
	when "we order a pepperoni pizza", {
		pizza = store.orderPizza(Pizza.Type.PEPPERONI)
	}
	
	then "we receive a pepperoni pizza", {
		pizza.type.shouldBeEqualTo Pizza.Type.PEPPERONI
	}
}

scenario "order a pepperoni pizza", {
	it_behaves_as "pizza store"
	
	when "we order a pepperoni pizza", {
		pizza = store.orderPizza(Pizza.Type.PEPPERONI)
	}
	
	then "we receive a pepperoni pizza", {
		pizza.type.shouldBeEqualTo Pizza.Type.PEPPERONI
	}
}

scenario "order a veggie pizza", {
	it_behaves_as "pizza store"
	
	when "we order a veggie pizza", {
		pizza = store.orderPizza(Pizza.Type.VEGGIE)
	}
	
	then "we receive a veggie pizza", {
		pizza.type.shouldBeEqualTo Pizza.Type.VEGGIE
	}
}