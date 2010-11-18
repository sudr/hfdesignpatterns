package info.sudr.hfdp.gumball.state;

import info.sudr.hfdp.gumball.GumballMachine;
import info.sudr.hfdp.gumball.State;

import java.util.Random;

public class HasQuarter extends State {

	private Random randomWinner = new Random(System.currentTimeMillis());

	@Override
	public void ejectQuarter(GumballMachine machine) {
		System.out.println("quarter is successfully ejected");
		machine.setState(GumballMachine.NO_QUARTER);
	}

	@Override
	public void turnCrank(GumballMachine machine) {
		System.out.println("crank was turned");
		int winner = randomWinner.nextInt(10);
		if (winner == 0 && machine.count() > 1) {
			machine.setState(GumballMachine.WINNER);
		} else {
			machine.setState(GumballMachine.SOLD);
		}
	}

}
