package info.sudr.hfdp.remote.command;

import info.sudr.hfdp.remote.Command;

public class MacroCommand implements Command {

	private Command[] commands;

	public MacroCommand(Command[] commands) {
		this.commands = commands;
	}
	
	@Override
	public void execute() {
		for (Command c : commands) {
			c.execute();
		}
	}

	@Override
	public void undo() {
		for (int i = commands.length-1; i < 0; i++) {
			commands[i].undo();
		}
	}

}
