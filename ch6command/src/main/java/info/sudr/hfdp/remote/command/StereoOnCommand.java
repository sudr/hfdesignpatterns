package info.sudr.hfdp.remote.command;

import info.sudr.hfdp.remote.Command;
import info.sudr.hfdp.remote.device.Stereo;

/**
 * Encapsulates the request
 */
public class StereoOnCommand implements Command {

	private Stereo stereo;

	public StereoOnCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.on();
	}

	@Override
	public void undo() {
		stereo.off();
	}
}
