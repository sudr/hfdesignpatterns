package info.sudr.hfdp.ch1strategy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

public class DuckObserver implements Observer {

	private Map<Observable, Collection<Event>> duckEvents = new HashMap<Observable, Collection<Event>>();
	
	public DuckObserver(Observable obsevrable) {
		obsevrable.addObserver(this);
	}

	public boolean awareOfEvent(Duck duck, Event event) {
		Collection<Event> awareEvents = duckEvents.get(duck);
		return awareEvents.contains(event);
	}

	@Override
	public void update(Observable duck, Object event) {
		if (duckEvents.get(duck) == null ) {
			duckEvents.put(duck, new ArrayList<Event>());
		}
		duckEvents.get(duck).add((Event) event);
	}
	
}
