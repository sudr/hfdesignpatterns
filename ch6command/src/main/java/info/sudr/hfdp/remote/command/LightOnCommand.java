package info.sudr.hfdp.remote.command;

import info.sudr.hfdp.remote.Command;
import info.sudr.hfdp.remote.device.Light;

/**
 * Encapsulates the request
 */
public class LightOnCommand implements Command {

	private Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}

	@Override
	public void undo() {
		light.off();
	}
}
