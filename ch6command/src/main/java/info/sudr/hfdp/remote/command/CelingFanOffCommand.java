package info.sudr.hfdp.remote.command;

import info.sudr.hfdp.remote.Command;
import info.sudr.hfdp.remote.device.CeilingFan;

/**
 * Encapsulates the request
 */
public class CelingFanOffCommand implements Command {

	private CeilingFan ceilingFan;
	private CeilingFan.Speed prevSpeed;

	public CelingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.off();
	}

	@Override
	public void undo() {
		switch (prevSpeed) {
		case LOW:
			ceilingFan.low();
			break;
		case MEDIUM:
			ceilingFan.medium();
			break;
		case HIGH:
			ceilingFan.high();
			break;
		case OFF:
			ceilingFan.off();
			break;
		default:
			break;
		}
	}
}
