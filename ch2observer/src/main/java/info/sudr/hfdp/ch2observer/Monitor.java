package info.sudr.hfdp.ch2observer;

public interface Monitor {

	void registerObserver(Observer observer);
	void removeObserver(Observer observer);
	void notifyObservers();
}
