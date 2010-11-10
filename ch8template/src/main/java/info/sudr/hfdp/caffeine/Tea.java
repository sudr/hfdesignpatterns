package info.sudr.hfdp.caffeine;

public class Tea extends CaffeineBeverage {

	public void prepare() {
		boilWater();
		steepTeaBag();
		pourInCup();
		addLemon();
	}

	private void steepTeaBag() {
		System.out.println("Steeping the tea");
	}

	private void addLemon() {
		System.out.println("Adding lemon");
	}
}
