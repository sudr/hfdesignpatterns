package info.sudr.hfdp.remote.command;

import info.sudr.hfdp.remote.Command;
import info.sudr.hfdp.remote.device.CeilingFan;

/**
 * Encapsulates the request
 */
public class CelingFanHighCommand implements Command {

	private CeilingFan ceilingFan;
	private CeilingFan.Speed prevSpeed;

	public CelingFanHighCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.high();
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
