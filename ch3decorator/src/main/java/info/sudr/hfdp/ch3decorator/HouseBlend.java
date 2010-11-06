package info.sudr.hfdp.ch3decorator;

import java.math.BigDecimal;

public class HouseBlend extends Beverage {

	@Override
	public String getDescription() {
		return "House Blend";
	}

	@Override
	public BigDecimal getCost(Size size) {
		switch (size) {
		case TALL:
			return BigDecimal.valueOf(0.70);
		case GRANDE:
			return BigDecimal.valueOf(0.89);
		case VENTI:
			return BigDecimal.valueOf(0.99);
		default:
			throw new RuntimeException("unrecognized size");
		}
	}

}
