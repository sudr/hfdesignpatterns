package info.sudr.hfdp.ch1strategy.fly;

import info.sudr.hfdp.ch1strategy.Event;
import info.sudr.hfdp.ch1strategy.FlyBehavior;

public class Fly implements FlyBehavior {

	@Override
	public Event fly() {
		System.out.println("fly");
		return Event.FLY;
	}

}
