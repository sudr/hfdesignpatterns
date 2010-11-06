package info.sudr.hfdp.pizza;

import org.apache.commons.lang.builder.ToStringBuilder;

public abstract class Pizza {

	public enum Type {
		CHEESE, GREEK, PEPPERONI
	}

	protected Type type;
	protected String name;
	protected String dough;
	protected String sauce;
	
	public Pizza() {
	}
	
	public Pizza(Type type, String name, String dough, String sauce) {
		this.type = type;
		this.name = name;
		this.dough = dough;
		this.sauce = sauce;
	}
	
	public Type getType() {
		return type;
	}
	
	public void prepare() {
		System.out.println("preparing...");
	}

	public void bake() {
		System.out.println("baking...");
	}

	public void cut() {
		System.out.println("cutting...");		
	}

	public void box() {
		System.out.println("boxing...");		
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
						.append("type", type)
						.append("name", name)
						.append("dough", dough)
						.append("sauce", sauce)
						.toString();
	}
}