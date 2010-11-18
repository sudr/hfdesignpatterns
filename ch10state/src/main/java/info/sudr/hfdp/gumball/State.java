package info.sudr.hfdp.gumball;

public abstract class State {

	protected void insertQuarter(GumballMachine machine) {
		System.out.println("error: cannot insert quarter [state:" + machine.state() +"]");
	}
	
	protected void ejectQuarter(GumballMachine machine) {
		System.out.println("error: cannot eject quarter [state:" + machine.state() +"]");
	}
	
	protected void turnCrank(GumballMachine machine) {
		System.out.println("error: failed crank turn [state:" + machine.state() +"]");
	}

	protected void dispense(GumballMachine machine) {
		System.out.println("error: failed to dispense [state:" + machine.state() +"]");;
	}

}
