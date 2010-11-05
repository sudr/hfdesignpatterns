package info.sudr.hfdp.ch2observer;


public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private final Monitor monitor; // so we can deregister if need be
	private StringBuffer displayData;
	private WeatherData currentWeatherData;

	public CurrentConditionsDisplay(Monitor monitor) {
		this.monitor = monitor;
		this.displayData = new StringBuffer();
		monitor.registerObserver(this);
	}
	
	@Override
	public void update(Monitor monitor, WeatherData currentWeatherData) {
		this.currentWeatherData = currentWeatherData;
		display();
	}

	@Override
	public void display() {
		displayData = new StringBuffer();
		displayData.append("Current conditions: ");
		displayData.append(currentWeatherData.getTemperature() + "F degrees");
		displayData.append(" " + currentWeatherData.getHumidity() + "% humidity");
	}
	
	@Override
	public String getDisplayData() {
		return displayData.toString();
	}
}
