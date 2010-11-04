package info.sudr.hfdp.ch1strategy;

import java.util.Observable;

public abstract class Duck extends Observable {

	protected final String name;

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
	
	public abstract void display();
}
