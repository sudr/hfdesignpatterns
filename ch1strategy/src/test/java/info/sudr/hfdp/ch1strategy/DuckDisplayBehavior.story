package info.sudr.hfdp.ch1strategy

shared_behavior "shared behaviors", {
	given "a mallard duck and a duck observer", {
		mallardDuck = new MallardDuck("fred")
		duckObserver = new DuckObserver()
		mallardDuck.addObserver(duckObserver)
	}
	
	and
	
	given "a redhead duck and the same duck observer", {
		redheadDuck = new RedheadDuck("john")
		redheadDuck.addObserver(duckObserver)
	}
}

scenario "a mallard duck displays itself", {
	it_behaves_as "shared behaviors"
	
	when "the mallard duck displays itself", {
		mallardDuck.display()
	}
	
	then "the duck observer sees the mallard duck", {
		duckObserver.awareOfEvent(mallardDuck, Event.DISPLAY_MALLARD).shouldBe true
	}
}

scenario "a redhead duck displays itself", {
	it_behaves_as "shared behaviors"
	
	when "the redhead duck displays itself", {
		redheadDuck.display()
	}
	
	then "the duck observer sees the redhead duck", {
		duckObserver.awareOfEvent(redheadDuck, Event.DISPLAY_REDHEAD).shouldBe true
	}
}