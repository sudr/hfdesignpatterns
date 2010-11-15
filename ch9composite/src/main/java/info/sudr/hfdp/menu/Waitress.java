package info.sudr.hfdp.menu;

public class Waitress {

	private final MenuComponent menus;

	public Waitress(MenuComponent menus) {
		this.menus = menus;
	}

	public void printMenu() {
		menus.print();
	}

}
