package info.sudr.hfdp.caffeine;

public abstract class CaffeineBeverage {

	public CaffeineBeverage() {
		super();
	}

	public void prepare() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
		onComplete();
	}

	protected abstract void brew();

	protected void boilWater() {
		System.out.println("Boiling water");
	}

	protected void pourInCup() {
		System.out.println("Pouring into cup");
	}

	protected boolean customerWantsCondiments() {
		return true;
	}
	
	protected abstract void addCondiments();
	
	protected void onComplete() { //hook method
	}

}