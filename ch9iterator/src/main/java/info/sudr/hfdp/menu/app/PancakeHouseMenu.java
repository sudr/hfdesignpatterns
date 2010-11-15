package info.sudr.hfdp.menu.app;

import info.sudr.hfdp.menu.Menu;
import info.sudr.hfdp.menu.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {

	ArrayList<MenuItem> menuItems;
	
	public PancakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();
		
		addItem("K&B's Pancake Breakfast",
				"Pankcakes with scrambled eggs, and toast",
				true,
				2.99);
		
		addItem("Regular Pancake Breakfast",
				"Pankcakes with fried eggs, and sausage",
				false,
				2.99);
		
		addItem("Bleuberry Pancakes",
				"Pankcakes made with fresh blueberries",
				true,
				3.49);
		
		addItem("Waffles",
				"Waffles, with your choice of blueberries strawberries",
				true,
				3.59);
	}

	private void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}

	public Iterator<MenuItem> createIterator() {
		return new PancakeHouseMenuIterator(menuItems);
	}

}
