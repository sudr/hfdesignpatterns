package info.sudr.hfdp.starbuzz;

import java.math.BigDecimal;

public abstract class Beverage {

	private Size size;

	public enum Size {
		TALL, GRANDE, VENTI
	}
	
	public abstract String getDescription();
	protected abstract BigDecimal getCost(Size size);
	
	public void setSize(Size size) {
		this.size = size;
	}

	public Size getSize() {
		return size;
	}
	
	public BigDecimal getCost() {
		return getCost(size);
	}
	
}
