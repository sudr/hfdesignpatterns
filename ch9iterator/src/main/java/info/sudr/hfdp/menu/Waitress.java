package info.sudr.hfdp.menu;

import java.util.Iterator;
import java.util.List;

public class Waitress {

	private final List<Menu> menus;

	public Waitress(List<Menu> menus) {
		this.menus = menus;
	}
	
	public void printMenu() {
		for (Menu m : menus) {
			printMenu(m.createIterator());
		}
	}

	private void printMenu(Iterator<MenuItem> menuIterator) {
		while (menuIterator.hasNext()) {
			MenuItem item = menuIterator.next();
			System.out.print(item.getName() + " ");
			System.out.println(item.getPrice() + " ");
			System.out.println(item.getDescription());
		}
	}
}
