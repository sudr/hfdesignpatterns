package info.sudr.hfdp.caffeine;

public abstract class CaffeineBeverage {

	public CaffeineBeverage() {
		super();
	}

	public abstract void prepare();

	protected void boilWater() {
		System.out.println("Boiling water");
	}

	protected void pourInCup() {
		System.out.println("Pouring into cup");
	}

}