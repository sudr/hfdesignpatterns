package info.sudr.hfdp.ch1strategy;

public class RubberDuck extends Duck {

	public RubberDuck(String name) {
		super(name);
	}

	@Override
	public void quack() {
		System.out.println("[" + name + "] squeak");
		setChanged();
		notifyObservers(Event.SQUEAK);
	}

	@Override
	public void display() {
		System.out.println("Mallard [" + name + "] display");
		setChanged();
		notifyObservers(Event.DISPLAY_RUBBER);
	}

}
