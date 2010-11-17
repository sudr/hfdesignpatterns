package info.sudr.hfdp.gumball.state;

import info.sudr.hfdp.gumball.GumballMachine;
import info.sudr.hfdp.gumball.State;

public class Sold extends State {

	@Override
	protected void dispense(GumballMachine machine) {
		machine.release();
	}
}
