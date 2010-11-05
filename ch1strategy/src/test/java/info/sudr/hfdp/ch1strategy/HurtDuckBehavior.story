package info.sudr.hfdp.ch1strategy

shared_behavior "shared behaviors", {
	given "a mallard duck and a duck observer", {
		duck = new MallardDuck("fred")
		duckObserver = new DuckObserver(duck)
	}
}

scenario "a hurt duck does not fly", {
	it_behaves_as "shared behaviors"
	
	when "the duck is hurt", { duck.injure() }
	and
	when "and the duck tries to fly", { duck.fly() }
	
	then "the duck observer sees the duck cannot fly", {
		duckObserver.awareOfEvent(duck, Event.NO_FLY).shouldBe true
	}
}