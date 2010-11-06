package info.sudr.hfdp.ch3decorator;

import java.math.BigDecimal;

public class Espresso extends Beverage {

	@Override
	public String getDescription() {
		return "Espresso";
	}

	@Override
	public BigDecimal getCost(Size size) {
		switch (size) {
		case TALL:
			return BigDecimal.valueOf(1.70);
		case GRANDE:
			return BigDecimal.valueOf(1.99);
		case VENTI:
			return BigDecimal.valueOf(2.10);
		default:
			throw new RuntimeException("unrecognized size");
		}
	}

}
