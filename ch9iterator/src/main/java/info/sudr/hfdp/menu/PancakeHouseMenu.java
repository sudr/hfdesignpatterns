package info.sudr.hfdp.menu;

import java.util.ArrayList;

public class PancakeHouseMenu {

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
	
	public ArrayList<MenuItem> getMenuItems() {
		return menuItems;
	}
}
