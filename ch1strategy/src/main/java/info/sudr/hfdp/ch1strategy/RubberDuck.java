package info.sudr.hfdp.ch1strategy;

import info.sudr.hfdp.ch1strategy.fly.NoFly;
import info.sudr.hfdp.ch1strategy.quack.Squeak;

public class RubberDuck extends Duck {

	public RubberDuck(String name) {
		super(name, new Squeak(), new NoFly());
	}

	@Override
	public void display() {
		System.out.println("Mallard [" + name + "] display");
		setChanged();
		notifyObservers(Event.DISPLAY_RUBBER);
	}

}
