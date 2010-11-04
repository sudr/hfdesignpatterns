package info.sudr.hfdp.ch1strategy

shared_behavior "shared behaviors", {
	given "a duck and a duck observer", {
		duck = new Duck("fred")
		duckObserver = new DuckObserver()
		duck.addObserver(duckObserver)
	}
}

scenario "a duck quacks", {
	it_behaves_as "shared behaviors"
	
	when "the duck quacks", {
		duck.quack()
	}
	
	then "the duck observer hears the quack", {
		duckObserver.awareOfEvent(duck, Event.QUACK).shouldBe true
	}
}

scenario "a duck swims", {
	it_behaves_as "shared behaviors"
	
	when "the duck swims", {
		duck.swim()
	}
	
	then "the duck observer sees the duck swim", {
		duckObserver.awareOfEvent(duck, Event.SWIM).shouldBe true
	}
}