package info.sudr.hfdp.gumball;

import info.sudr.hfdp.gumball.state.HasQuarter;
import info.sudr.hfdp.gumball.state.NoQuarter;
import info.sudr.hfdp.gumball.state.Out;
import info.sudr.hfdp.gumball.state.Sold;

public class GumballMachine {

	public static final State NO_QUARTER = new NoQuarter();
	public static final State HAS_QUARTER = new HasQuarter();
	public static final State SOLD = new Sold();
	public static final State OUT = new Out();

	private State currentState;
	private int count;

	public GumballMachine(int count) {
		this.count = count;
		if (count > 0) {
			currentState = NO_QUARTER;
		}
	}

	public void insertQuarter() {
		currentState.insertQuarter(this);
	}

	public void ejectQuarter() {
		currentState.ejectQuarter(this);
	}

	public void turnCrank() {
		currentState.turnCrank(this);
		currentState.dispense(this);
	}

	public State state() {
		return currentState;
	}

	public void setState(State state) {
		currentState = state;
	}

	public void release() {
		if (count > 0) {
			count--;
			System.out.println("released a gumball");
			setState(NO_QUARTER);
		} else {
			System.out.println("error: no gumballs");
			setState(OUT);
		}
	}
}
