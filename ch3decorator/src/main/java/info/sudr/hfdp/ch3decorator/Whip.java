package info.sudr.hfdp.ch3decorator;

import java.math.BigDecimal;

public class Whip extends CondimentDecorator {

	public Whip(Beverage beverage) {
		super(beverage);
	}
	
	@Override
	public String getDescription() {
		return "Whip " + getBeverage().getDescription();
	}

	@Override
	public BigDecimal getCost(Size size) {
		switch (size) {
		case TALL:
			return BigDecimal.valueOf(0.5);
		case GRANDE:
			return BigDecimal.valueOf(0.10);
		case VENTI:
			return BigDecimal.valueOf(0.15);
		default:
			throw new RuntimeException("unrecognized size");
		}
	}

}
