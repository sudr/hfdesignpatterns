package info.sudr.hfdp.starbuzz;

import java.math.BigDecimal;

public abstract class CondimentDecorator extends Beverage {

	private Beverage beverage;

	public CondimentDecorator(Beverage beverage) {
		this.beverage = beverage;
	}

	public Beverage getBeverage() {
		return beverage;
	}
	
	@Override
	public BigDecimal getCost() {
		return getCost(getBeverage().getSize()).add(getBeverage().getCost());
	}
	
	@Override
	public Size getSize() {
		return getBeverage().getSize();
	}
	
	@Override
	public void setSize(Size size) {
		getBeverage().setSize(size);
	}
}
