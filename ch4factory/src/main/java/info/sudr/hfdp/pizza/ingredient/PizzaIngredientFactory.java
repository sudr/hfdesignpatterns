package info.sudr.hfdp.pizza.ingredient;

public interface PizzaIngredientFactory {

	Dough createDough();
	Sauce createSauce();
	Cheese creteCheese();
	Veggies[] createVeggies();
	Pepperoni createPepperoni();
	Clams createClam();
}
