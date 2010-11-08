package info.sudr.hfdp.remote.device;

public class Stereo {

	private int volume;
	private boolean on;

	public void on() {
		this.on = true;
	}

	public void off() {
		this.on = false;
	}

	public void setCD() {
	}
	
	public void setDVD() {
	}
	
	public void setRadio() {
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public boolean isOn() {
		return on;
	}
}
