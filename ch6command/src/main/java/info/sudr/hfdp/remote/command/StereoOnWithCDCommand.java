package info.sudr.hfdp.remote.command;

import info.sudr.hfdp.remote.Command;
import info.sudr.hfdp.remote.device.Stereo;

/**
 * Encapsulates the request
 */
public class StereoOnWithCDCommand implements Command {

	private Stereo stereo;

	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(11);
	}

	@Override
	public void undo() {
		stereo.off();
	}
}
