package info.sudr.hfdp.gumball.state;

import info.sudr.hfdp.gumball.GumballMachine;
import info.sudr.hfdp.gumball.State;

public class Sold extends State {

	@Override
	protected void dispense(GumballMachine machine) {
		machine.release();
		if (machine.count() > 0) {
			machine.setState(GumballMachine.NO_QUARTER);
		} else {
			System.out.println("info: we just popped the last gumball...need refill");
			machine.setState(GumballMachine.OUT);
		}
	}
}
