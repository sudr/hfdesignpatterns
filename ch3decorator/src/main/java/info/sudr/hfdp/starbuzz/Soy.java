package info.sudr.hfdp.starbuzz;

import java.math.BigDecimal;

public class Soy extends CondimentDecorator {

	public Soy(Beverage beverage) {
		super(beverage);
	}
	
	@Override
	public String getDescription() {
		return "Soy " + getBeverage().getDescription();
	}
	
	@Override
	public BigDecimal getCost(Size size) {
		switch (size) {
		case TALL:
			return BigDecimal.valueOf(0.10);
		case GRANDE:
			return BigDecimal.valueOf(0.15);
		case VENTI:
			return BigDecimal.valueOf(0.20);
		default:
			throw new RuntimeException("unrecognized size");
		}
	}

}
