package info.sudr.hfdp.menu.app;

import info.sudr.hfdp.menu.MenuItem;

import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenuIterator implements Iterator<MenuItem> {

	private Iterator<MenuItem> itemsIterator;

	public PancakeHouseMenuIterator(List<MenuItem> menuItems) {
		itemsIterator = menuItems.iterator();
	}

	@Override
	public boolean hasNext() {
		return itemsIterator.hasNext();
	}

	@Override
	public MenuItem next() {
		return itemsIterator.next();
	}

	@Override
	public void remove() {
		itemsIterator.remove();
	}

}
