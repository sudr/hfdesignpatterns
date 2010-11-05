package info.sudr.hfdp.ch1strategy;

import info.sudr.hfdp.ch1strategy.fly.Fly;
import info.sudr.hfdp.ch1strategy.quack.Quack;

public class MallardDuck extends Duck {

	public MallardDuck(String name) {
		super(name, new Quack(), new Fly());
	}

	@Override
	public void display() {
		System.out.println("Mallard [" + name + "] display");
		setChanged();
		notifyObservers(Event.DISPLAY_MALLARD);
	}

}
