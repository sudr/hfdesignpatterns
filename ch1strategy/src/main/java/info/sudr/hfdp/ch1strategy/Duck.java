package info.sudr.hfdp.ch1strategy;

import info.sudr.hfdp.ch1strategy.fly.NoFly;

import java.util.Observable;

public abstract class Duck extends Observable {

	protected final String name;
	
	private QuackBehavior quackBehavior;
	private FlyBehavior flyBehavior;

	public Duck(String name, QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
		this.name = name;
		this.quackBehavior = quackBehavior;
		this.flyBehavior = flyBehavior;
	}
	
	public void quack() {
		Event event = quackBehavior.quack();
		setChanged();
		notifyObservers(event);
	}
	
	public void fly() {
		Event event = flyBehavior.fly();
		setChanged();
		notifyObservers(event);
	}
	
	public void swim() {
		System.out.println("[" + name + "] swim");
		setChanged();
		notifyObservers(Event.SWIM);
	}
	
	public void injure() {
		System.out.println("[" + name + "] injured");
		flyBehavior = new NoFly();
	}
	
	public abstract void display();
}
