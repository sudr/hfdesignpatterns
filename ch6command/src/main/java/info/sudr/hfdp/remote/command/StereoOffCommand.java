package info.sudr.hfdp.remote.command;

import info.sudr.hfdp.remote.Command;
import info.sudr.hfdp.remote.device.Stereo;

/**
 * Encapsulates the request
 */
public class StereoOffCommand implements Command {

	private Stereo stereo;

	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.off();
	}

	@Override
	public void undo() {
		stereo.on();
	}
}
