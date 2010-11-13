package info.sudr.hfdp.menu

scenario "lookup menu for PancakeHouse", {
	given "a Pancake House menu", {
		pancakeHouseMenu = new PancakeHouseMenu()
	}
	
	when 'we ask for the menu', {
		menuItems = pancakeHouseMenu.getMenuItems()
	}
	
	then 'we receive the menu', {
		menuItems.size().shouldBeEqualTo 4
	}
}

scenario "lookup menu for Diner", {
	given "a Pancake House menu", {
		dinerMenu = new DinerMenu()
	}
	
	when 'we ask for the menu', {
		menuItems = dinerMenu.getMenuItems()
	}
	
	then 'we receive the menu', {
		menuItems.shouldNotEqual null
	}
}