package info.sudr.hfdp.menu.app;

import info.sudr.hfdp.menu.MenuItem;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {

	private int index;
	private final MenuItem[] menuItems;

	public DinerMenuIterator(MenuItem[] menuItems) {
		this.menuItems = menuItems;
	}

	@Override
	public boolean hasNext() {
		return index < menuItems.length && menuItems[index] != null;
	}

	@Override
	public MenuItem next() {
		MenuItem item = menuItems[index];
		index++;
		return item;
	}

	@Override
	public void remove() {
		if (index < 1) {
			throw new IllegalStateException("Cannot remove before having called next() at least once");
		}
		if (menuItems[index - 1] != null) {
			for (int i = index - 1; i < menuItems.length - 1; i++) {
				menuItems[i] = menuItems[i + 1];
			}
			menuItems[menuItems.length - 1] = null;
		}

	}

}
