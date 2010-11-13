package info.sudr.hfdp.menu;

import java.util.ArrayList;

public class Waitress {

	public void printMenu() {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		ArrayList<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();
		for (MenuItem item : breakfastItems) {
			System.out.print(item.getName() + " ");
			System.out.println(item.getPrice() + " ");
			System.out.println(item.getDescription());
		}
		
		DinerMenu dinerMenu = new DinerMenu();
		MenuItem[] lunchItems = dinerMenu.getMenuItems();
		for (MenuItem item : lunchItems) {
			System.out.print(item.getName() + " ");
			System.out.println(item.getPrice() + " ");
			System.out.println(item.getDescription());
		}
	}
}
