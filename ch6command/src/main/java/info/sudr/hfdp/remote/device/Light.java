package info.sudr.hfdp.remote.device;

public class Light {

	private boolean on;

	public void on() {
		on = true;
	}

	public void off() {
		on = false;
	}
	
	public boolean isOn() {
		return on;
	}

}
