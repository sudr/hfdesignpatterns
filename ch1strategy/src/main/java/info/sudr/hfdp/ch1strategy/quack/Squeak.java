package info.sudr.hfdp.ch1strategy.quack;

import info.sudr.hfdp.ch1strategy.Event;
import info.sudr.hfdp.ch1strategy.QuackBehavior;

public class Squeak implements QuackBehavior {

	@Override
	public Event quack() {
		System.out.println("squeak");
		return Event.SQUEAK;
	}

}
