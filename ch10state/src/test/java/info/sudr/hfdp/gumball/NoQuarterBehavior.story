package info.sudr.hfdp.gumball

shared_behavior "shared behaviors", {
	given "a gumball machine", {
		machine = new GumballMachine(5)
	}
}

scenario "initial state of gumball machine is NoQuarter", {
	it_behaves_as "shared behaviors"
		
	then "the machine is initially set to state NoQuarter", {
		machine.state().shouldBeEqualTo machine.NO_QUARTER
	}
}

scenario "state transitions from NoQuarter", {
	it_behaves_as "shared behaviors"
	
	when "a quarter is inserted", {
		machine.insertQuarter()
	}
	
	then "the machine is set to state HasQuarter", {
		machine.state().shouldBeEqualTo machine.HAS_QUARTER
	}
}