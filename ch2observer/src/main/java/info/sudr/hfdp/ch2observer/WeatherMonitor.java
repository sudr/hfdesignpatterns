package info.sudr.hfdp.ch2observer;

import java.util.ArrayList;
import java.util.Collection;

public class WeatherMonitor implements Monitor {

	private Collection<Observer> observers;
	private WeatherData currentWeatherData;

	@Override
	public void registerObserver(Observer observer) {
		if (observers == null) {
			observers = new ArrayList<Observer>();
		}
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		if (observers != null) {
			observers.remove(observer);
		}
	}

	@Override
	public void notifyObservers() {
		for (Observer o : observers) {
			o.update(this, currentWeatherData);
		}
	}
	
	private void measurementsChanged() {
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.currentWeatherData = new WeatherData(temperature, humidity, pressure);
		measurementsChanged();
	}
	
}