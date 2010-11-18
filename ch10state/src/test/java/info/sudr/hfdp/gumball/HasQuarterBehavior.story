package info.sudr.hfdp.gumball

shared_behavior "shared behaviors", {
	given "a gumball machine in HAS_QUARTER state", {
		machine = new GumballMachine(5)
		machine.setState(machine.HAS_QUARTER)
	}
}

scenario "quarter is ejected", {
	it_behaves_as "shared behaviors"
	
	when "the quarter is ejected", {
		machine.ejectQuarter()
	}
	
	then "the machine is set to state NoQuarter", {
		machine.state().shouldBeEqualTo machine.NO_QUARTER
	}
}

scenario "crank is turned", {
	it_behaves_as "shared behaviors"
	
	when "the crank is turned", {
		machine.turnCrank()
	}
	
	then "the machine is set to state NoQuarter", {
		machine.state().shouldBeEqualTo machine.NO_QUARTER
	}
	and
	then "the # of gumballs left is 4", {
		machine.count.shouldEqual 4
	}
}

scenario "crank is turned 5 times", {
	it_behaves_as "shared behaviors"
	
	when "the crank is turned 5 times", {
		machine.turnCrank()
		machine.insertQuarter()
		machine.turnCrank()
		machine.insertQuarter()
		machine.turnCrank()
		machine.insertQuarter()
		machine.turnCrank()
		machine.insertQuarter()
		machine.turnCrank()
	}
	and
	when "the crank is turned the 6th time", {
		machine.insertQuarter()
		machine.turnCrank()
	}
	then "the machine is set to state Out", {
		machine.state().shouldBeEqualTo machine.OUT
	}
	and
	then "the # of gumballs left is 0", {
		machine.count.shouldEqual 0
	}
}