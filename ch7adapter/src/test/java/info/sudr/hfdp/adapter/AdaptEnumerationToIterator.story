package info.sudr.hfdp.adapter

scenario "adapt the enumeration interface to an iterator for use be Java 5 client", {
	given "a enumeration that is adapted to the iterator iterface", {
		items = new Vector()
		items.add('item1')
		items.add('item2')
		iterator = new EnumerationIterator(items.elements())
	}
	
	then 'we ask for hasNext we are told there is a next', {
		ensure(iterator.hasNext()) {
			isTrue
		}
	}
}

scenario "adapt the enumeration interface to an iterator for use be Java 5 client", {
	given "a enumeration that is adapted to the iterator iterface", {
		items = new Vector()
		items.add('item1')
		items.add('item2')
		iterator = new EnumerationIterator(items.elements())
	}
	
	when 'we ask for next', {
		item = iterator.next()
	}
	
	then 'we get the first item', {
		item.shouldBeEqualTo 'item1'
	}
}