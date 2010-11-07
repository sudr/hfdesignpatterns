package info.sudr.hfdp.pizza;

import info.sudr.hfdp.pizza.ingredient.Cheese;
import info.sudr.hfdp.pizza.ingredient.Clams;
import info.sudr.hfdp.pizza.ingredient.Dough;
import info.sudr.hfdp.pizza.ingredient.Pepperoni;
import info.sudr.hfdp.pizza.ingredient.Sauce;
import info.sudr.hfdp.pizza.ingredient.Veggies;

import org.apache.commons.lang.builder.ToStringBuilder;

public abstract class Pizza {

	public enum Type {
		CHEESE, CLAM, PEPPERONI, VEGGIE
	}

	protected String name;
	protected Dough dough;
	protected Sauce sauce;
	protected Veggies[] veggies;
	protected Cheese cheese;
	protected Pepperoni pepperoni;
	protected Clams clam;

	public abstract void prepare();

	public void bake() {
		System.out.println("bake for 25 minutes at 350");
	}

	public void cut() {
		System.out.println("cutting the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("place pizza in official PizzaStore box");
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
						.append("name", name)
						.append("dough", dough)
						.append("sauce", sauce)
						.toString();
	}
}