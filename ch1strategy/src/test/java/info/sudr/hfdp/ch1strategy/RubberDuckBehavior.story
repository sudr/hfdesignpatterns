package info.sudr.hfdp.ch1strategy

shared_behavior "shared behaviors", {
	given "a rubber duck and a duck observer", {
		duck = new RubberDuck("fred")
		duckObserver = new DuckObserver(duck)
	}
}

scenario "a rubber duck squeaks", {
	it_behaves_as "shared behaviors"
	
	when "the duck quacks", { duck.quack() }
	
	then "the duck observer hears the squeak", {
		duckObserver.awareOfEvent(duck, Event.SQUEAK).shouldBe true
	}
}

scenario "a rubber does not fly", {
	it_behaves_as "shared behaviors"
	
	when "the duck tries to fly", { duck.fly() }
	
	then "the duck observer sees the duck cannot fly", {
		duckObserver.awareOfEvent(duck, Event.NO_FLY).shouldBe true
	}
}