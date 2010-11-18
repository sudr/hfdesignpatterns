package info.sudr.hfdp.gumball.state;

import info.sudr.hfdp.gumball.GumballMachine;
import info.sudr.hfdp.gumball.State;

public class NoQuarter extends State {

	@Override
	protected void insertQuarter(GumballMachine machine) {
		System.out.println("quarter is successfully inserted");
		machine.setState(GumballMachine.HAS_QUARTER);
	}

}
