package info.sudr.hfdp.menu;

import java.util.Iterator;

public class Waitress {

	private final MenuComponent menus;

	public Waitress(MenuComponent menus) {
		this.menus = menus;
	}

	public void printMenu() {
		menus.print();
	}
	
	public void printVegetarianMenu() {
		Iterator<MenuComponent> iterator = menus.createIterator();
		System.out.println("\nVEGETARIAN MENU\n-------------");
		while (iterator.hasNext()) {
			MenuComponent mc = iterator.next();
			try {
				if (mc.isVegetarian()) {
					mc.print();
				}
			} catch (UnsupportedOperationException e) {
			}
		}
	}

}
