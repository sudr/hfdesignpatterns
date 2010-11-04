package info.sudr.hfdp.ch1strategy

shared_behavior "shared behaviors", {
	given "", {
	}
}

scenario "a scenario", {
	it_behaves_as "shared behaviors"
	
	when "", {
	}
	
	then "", {
		ensure(true){
			isTrue
		}
	}
}