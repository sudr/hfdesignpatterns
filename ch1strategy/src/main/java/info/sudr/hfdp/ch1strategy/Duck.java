package info.sudr.hfdp.ch1strategy;

import java.util.Observable;

public class Duck extends Observable {

	private final String name;

	public Duck(String name) {
		this.name = name;
	}
	
	public void quack() {
		System.out.println("[" + name + "] quack");
		setChanged();
		notifyObservers(Event.QUACK);
	}
	
	public void swim() {
		System.out.println("[" + name + "] swim");
		setChanged();
		notifyObservers(Event.SWIM);
	}
	
}
