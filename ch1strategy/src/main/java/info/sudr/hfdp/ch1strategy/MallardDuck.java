package info.sudr.hfdp.ch1strategy;

public class MallardDuck extends Duck {

	public MallardDuck(String name) {
		super(name);
	}

	@Override
	public void display() {
		System.out.println("Mallard [" + name + "] display");
		setChanged();
		notifyObservers(Event.DISPLAY_MALLARD);
	}

}
