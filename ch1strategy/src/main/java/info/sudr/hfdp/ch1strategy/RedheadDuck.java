package info.sudr.hfdp.ch1strategy;

public class RedheadDuck extends Duck {

	public RedheadDuck(String name) {
		super(name);
	}

	@Override
	public void display() {
		System.out.println("Redhead [" + name + "] display");
		setChanged();
		notifyObservers(Event.DISPLAY_REDHEAD);
	}

}
