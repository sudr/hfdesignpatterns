package info.sudr.hfdp.menu

import info.sudr.hfdp.menu.app.*;

scenario "ask waitress to print menus", {
	given "a Waitress with menus", {
		pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast")
		pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast",
			"Pankcakes with scrambled eggs, and toast",
			true,
			2.99));
	
		pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast",
			"Pankcakes with fried eggs, and sausage",
			false,
			2.99));
	
		pancakeHouseMenu.add(new MenuItem("Bleuberry Pancakes",
			"Pankcakes made with fresh blueberries",
			true,
			3.49));
	
		pancakeHouseMenu.add(new MenuItem("Waffles",
			"Waffles, with your choice of blueberries strawberries",
			true,
			3.59));
		
		dinerMenu = new Menu("DINER MENU", "Lunch")
		dinerMenu.add(new MenuItem("Vegeterian BLT",
			"(Fakin') Bacon with lettuce & tomato on whole wheat",
			true,
			2.99));
	
		dinerMenu.add(new MenuItem("BLT",
			"Bacon with lettuce & tomato on whole wheat",
			false,
			2.99));
	
		dinerMenu.add(new MenuItem("Soup of the day",
			"Soup of the day, with a side of potato salad",
			false,
			3.29));
	
		dinerMenu.add(new MenuItem("Hotdog",
			"A hot dog, with saurkaut, relish, onions, topped with cheese",
			false,
			3.05));
		
		dessertMenu = new Menu("DESSERT MENU", "Dessert of course!")
		dessertMenu.add(new MenuItem("Apple Pie",
			"Apple pie with a flaky crust, topped with vanilla icecream",
			false,
			1.59));
		dinerMenu.add(dessertMenu)
		
		cafeMenu = new Menu("CAFE MENU", "Dinner")
		cafeMenu.add(new MenuItem("Vegie Burger and Air Fries",
			"Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
			true, 3.99));

		cafeMenu.add(new MenuItem("Soup of the day",
			"A cup of the soup of the day, with a side salad",
			false, 3.69));

		cafeMenu.add(new MenuItem("Burrito",
			"A large burrito, with whole pinto beans, salsa, guacamole",
			true, 4.29));
		
		menus = new Menu("All Menus", "All menus combined")
		menus.add(pancakeHouseMenu)
		menus.add(dinerMenu)
		menus.add(cafeMenu)
		waitress = new Waitress(menus)
	}
	
	when 'we ask to print the menus', { waitress.printMenu(); }
	
	then 'we receive the menu', {
	}
}