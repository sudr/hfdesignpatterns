package info.sudr.hfdp.ch1strategy.quack;

import info.sudr.hfdp.ch1strategy.Event;
import info.sudr.hfdp.ch1strategy.QuackBehavior;

public class Mute implements QuackBehavior {

	@Override
	public Event quack() {
		System.out.println("mute");
		return Event.MUTE;
	}

}
