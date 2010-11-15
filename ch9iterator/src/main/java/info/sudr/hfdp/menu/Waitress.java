package info.sudr.hfdp.menu;

import info.sudr.hfdp.menu.app.DinerMenu;
import info.sudr.hfdp.menu.app.PancakeHouseMenu;

import java.util.Iterator;

public class Waitress {

	public void printMenu() {
		Iterator<MenuItem> pancakeHouseMenuIterator = new PancakeHouseMenu().createIterator();
		Iterator<MenuItem> dinerMenuIterator = new DinerMenu().createIterator();
		System.out.println("MENU\n-----\nBREAKFAST");
		printMenu(pancakeHouseMenuIterator);
		System.out.println("\nLUNCH");
		printMenu(dinerMenuIterator);
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
