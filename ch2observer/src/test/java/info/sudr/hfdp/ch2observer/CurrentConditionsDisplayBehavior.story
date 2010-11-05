package info.sudr.hfdp.ch2observer

shared_behavior "shared behaviors", {
	given "a current conditions display", {
		monitor = new WeatherMonitor()
		weatherDisplay = new CurrentConditionsDisplay(monitor)
	}
}

scenario "the current conditions display reports the latest weather data", {
	it_behaves_as "shared behaviors"
	
	when "the weather monitor reports new data", {
		monitor.setMeasurements(80f, 66f, 90f);
	}
	
	then "the current weather conditions are displayed", {
		expected = 'Current conditions: 80.0F degrees 66.0% humidity'
		weatherDisplay.displayData.shouldBeEqualTo expected
	}
}