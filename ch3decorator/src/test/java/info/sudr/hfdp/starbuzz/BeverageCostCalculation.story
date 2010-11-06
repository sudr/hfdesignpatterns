package info.sudr.hfdp.starbuzz

scenario "a double mocha dark roast coffee with whip", {
	given "a dark roast grande beverage", {
		darkRoast = new DarkRoast()
		darkRoast.setSize(Beverage.Size.GRANDE)
	}
	
	when "we add a shot of mocha", {
		darkRoastMocha = new Mocha(darkRoast)
	}
	and 
	when "we a second shot of mocha", {
		darkRoastDoubleMocha = new Mocha(darkRoastMocha)
	}
	and
	when "we add whip", {
		darkRoastDoubleMochaWhip = new Whip(darkRoastDoubleMocha)
	}
	
	then "the cost of the beverage is 1.49 bucks", {
		darkRoastDoubleMochaWhip.getCost().shouldBeEqualTo BigDecimal.valueOf(1.49)
		println darkRoastDoubleMochaWhip.getDescription()
	}
}

scenario "a house blend soy mocha coffee with whip", {
	given "a house blend grande beverage", {
		houseBlend = new HouseBlend()
		houseBlend.setSize(Beverage.Size.GRANDE)
	}
	
	when "we add a shot of mocha", {
		houseBlendMocha = new Mocha(houseBlend)
	}
	and
	when "we add soy milk", {
		houseBlendSoyMocha = new Soy(houseBlendMocha)
	}
	and
	when "we add whip", {
		houseBlendSoyMochaWhip = new Whip(houseBlendSoyMocha)
	}
	
	then "the cost of the beverage is 1.34 bucks", {
		houseBlendSoyMochaWhip.getCost().shouldBeEqualTo BigDecimal.valueOf(1.34)
		println houseBlendSoyMochaWhip.getDescription()
	}
}