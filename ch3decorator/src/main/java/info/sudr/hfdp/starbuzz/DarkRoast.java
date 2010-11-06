package info.sudr.hfdp.starbuzz;

import java.math.BigDecimal;

public class DarkRoast extends Beverage {

	@Override
	public String getDescription() {
		return "Dark Roast";
	}

	@Override
	public BigDecimal getCost(Size size) {
		switch (size) {
		case TALL:
			return BigDecimal.valueOf(0.70);
		case GRANDE:
			return BigDecimal.valueOf(0.99);
		case VENTI:
			return BigDecimal.valueOf(1.10);
		default:
			throw new RuntimeException("unrecognized size");
		}
	}

}
