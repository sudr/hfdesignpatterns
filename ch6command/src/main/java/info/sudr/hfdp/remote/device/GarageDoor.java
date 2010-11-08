package info.sudr.hfdp.remote.device;

public class GarageDoor {

	private boolean open;

	public void up() {
		open = true;
	}

	public void down() {
	}

	public void stop() {
	}

	public void lightOn() {
	}

	public void lightOff() {
	}
	
	public boolean isOpen() {
		return open;
	}
}
