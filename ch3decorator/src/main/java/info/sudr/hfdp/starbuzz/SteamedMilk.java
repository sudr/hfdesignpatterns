package info.sudr.hfdp.starbuzz;

import java.math.BigDecimal;

public class SteamedMilk extends CondimentDecorator {

	public SteamedMilk(Beverage beverage) {
		super(beverage);
	}
	
	@Override
	public String getDescription() {
		return "Steamed Milk " + getBeverage().getDescription();
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
