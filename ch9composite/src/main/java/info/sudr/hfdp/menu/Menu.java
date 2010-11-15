package info.sudr.hfdp.menu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent {

	Iterator<MenuComponent> iterator = null;
	List<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	private String name;
	private String description;
	
	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	@Override
	public void add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}
	
	@Override
	public void remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
	}
	
	@Override
	public MenuComponent getChild(int i) {
		return menuComponents.get(i);
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public String getDescription() {
		return description;
	}
	
	@Override
	public void print() {
		System.out.println("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("----------------------");
		
		for (MenuComponent mc : menuComponents) {
			mc.print();
		}
	}

	@Override
	public Iterator<MenuComponent> createIterator() {
		if (iterator == null) {
			iterator = new CompositeIterator(menuComponents.iterator());
		}
		return iterator;
	}
}