package info.sudr.hfdp.menu

import info.sudr.hfdp.menu.app.*;

scenario "ask waitress to print menus", {
	given "a Waitress with menus", {
		menus = new ArrayList<Menu>()
		menus.add(new PancakeHouseMenu())
		menus.add(new DinerMenu())
		menus.add(new CafeMenu())
		waitress = new Waitress(menus)
	}
	
	when 'we ask to print the menus', { waitress.printMenu(); }
	
	then 'we receive the menu', {
	}
}