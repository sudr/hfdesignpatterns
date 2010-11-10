package info.sudr.hfdp.caffeine;

public abstract class CaffeineBeverage {

	public CaffeineBeverage() {
		super();
	}

	public void prepare() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
		onComplete();
	}

	protected abstract void brew();

	protected void boilWater() {
		System.out.println("Boiling water");
	}

	protected void pourInCup() {
		System.out.println("Pouring into cup");
	}

	protected abstract void addCondiments();
	
	public void onComplete() { //hook method
	}

}