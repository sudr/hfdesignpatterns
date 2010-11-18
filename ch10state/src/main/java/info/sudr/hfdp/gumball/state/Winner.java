package info.sudr.hfdp.gumball.state;

import info.sudr.hfdp.gumball.GumballMachine;
import info.sudr.hfdp.gumball.State;

public class Winner extends State {

	@Override
	protected void dispense(GumballMachine machine) {
		System.out.println("You are a winner!");
		machine.release();
		if (machine.count() < 1) {
			machine.setState(GumballMachine.SOLD);
		} else {
			machine.release();
			if (machine.count() < 1) {
				System.out.println("info: we just popped the last gumball...need refill");
				machine.setState(GumballMachine.SOLD);
			} else {
				machine.setState(GumballMachine.NO_QUARTER);
			}
		}
	}
}
