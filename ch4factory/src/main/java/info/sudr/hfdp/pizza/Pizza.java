package info.sudr.hfdp.pizza;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.commons.lang.builder.ToStringBuilder;

public abstract class Pizza {

	public enum Type {
		CHEESE, CLAM, PEPPERONI, VEGGIE
	}

	protected String name;
	protected String dough;
	protected String sauce;
	protected Collection<String> toppings = new ArrayList<String>();

	public Pizza() {
	}

	public Pizza(String name, String dough, String sauce) {
		this.name = name;
		this.dough = dough;
		this.sauce = sauce;
	}

	public void prepare() {
		System.out.println("preparing " + name);
		System.out.println("tossing dough...");
		System.out.println("adding sauce...");
		System.out.println("adding toppings: ");
		for (String topping : toppings) {
			System.out.println("    " + topping);
		}
	}

	public void bake() {
		System.out.println("bake for 25 minutes at 350");
	}

	public void cut() {
		System.out.println("cutting the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("place pizza in official PizzaStore box");
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