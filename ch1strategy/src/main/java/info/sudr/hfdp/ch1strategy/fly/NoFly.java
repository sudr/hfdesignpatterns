package info.sudr.hfdp.ch1strategy.fly;

import info.sudr.hfdp.ch1strategy.Event;
import info.sudr.hfdp.ch1strategy.FlyBehavior;

public class NoFly implements FlyBehavior {

	@Override
	public Event fly() {
		System.out.println("no fly");
		return Event.NO_FLY;
	}

}
