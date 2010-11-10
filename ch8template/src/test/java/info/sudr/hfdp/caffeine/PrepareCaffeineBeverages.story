package info.sudr.hfdp.caffeine

scenario "prepare coffee", {
	given "a coffee", {
		coffee = new Coffee()
	}
	
	when 'we ask it to  prepare itself', {
		coffee.prepare()
	}
	
	then 'the preparation steps are displayed', {
	}
}

scenario "prepare teaa", {
	given "a tea", {
		tea = new Tea()
	}
	
	when 'we ask it to  prepare itself', {
		tea.prepare()
	}
	
	then 'the preparation steps are displayed', {
	}
}