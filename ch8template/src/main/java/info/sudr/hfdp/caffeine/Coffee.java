package info.sudr.hfdp.caffeine;

public class Coffee extends CaffeineBeverage {

	@Override
	public void prepare() {
		boilWater();
		brewCoffeeGrinds();
		pourInCup();
		addSugarAndMilk();
	}

	private void brewCoffeeGrinds() {
		System.out.println("Dripping coffee through filter");
	}

	private void addSugarAndMilk() {
		System.out.println("Adding sugar and milk");

	}

}
