package info.sudr.hfdp.ch2observer;

public class WeatherData {

	private final float temperature;
	private final float humidity;
	private final float pressure;

	public WeatherData(float temperature, float  humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
	}
	
	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
}
