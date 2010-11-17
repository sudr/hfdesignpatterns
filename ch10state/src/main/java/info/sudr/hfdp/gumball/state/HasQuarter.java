package info.sudr.hfdp.gumball.state;

import info.sudr.hfdp.gumball.GumballMachine;
import info.sudr.hfdp.gumball.State;

public class HasQuarter extends State {

	@Override
	public void ejectQuarter(GumballMachine machine) {
		System.out.println("quarter is successfully ejected");
		machine.setState(GumballMachine.NO_QUARTER);
	}

	@Override
	public void turnCrank(GumballMachine machine) {
		System.out.println("crank was turned");
		machine.setState(GumballMachine.SOLD);
	}
	

}
