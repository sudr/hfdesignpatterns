package info.sudr.hfdp.remote.command;

import info.sudr.hfdp.remote.Command;
import info.sudr.hfdp.remote.device.GarageDoor;

/**
 * Encapsulates the request
 */
public class GarageDoorOpenCommand implements Command {

	private GarageDoor garageDoor;

	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.up();
	}
}
