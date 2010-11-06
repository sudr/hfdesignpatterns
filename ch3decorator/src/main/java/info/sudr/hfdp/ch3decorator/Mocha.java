package info.sudr.hfdp.ch3decorator;

import java.math.BigDecimal;

public class Mocha extends CondimentDecorator {

	public Mocha(Beverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return "Mocha " + getBeverage().getDescription();
	}

	@Override
	public BigDecimal getCost(Size size) {
		switch (size) {
		case TALL:
			return BigDecimal.valueOf(0.15);
		case GRANDE:
			return BigDecimal.valueOf(0.20);
		case VENTI:
			return BigDecimal.valueOf(0.25);
		default:
			throw new RuntimeException("unrecognized size");
		}
	}

}
