package info.sudr.hfdp.remote;

import info.sudr.hfdp.remote.command.NoCommand;

import java.util.Stack;

public class RemoteControl {

	private Command[] onCommands;
	private Command[] offCommands;
	
	private Stack<Command> commandStack;
	
	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		
		Command noCommand = new NoCommand();
		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		
		commandStack = new Stack<Command>();
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
		commandStack.push(onCommands[slot]);
	}
	
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
		commandStack.push(onCommands[slot]);
	}
	
	public void undo() {
		if (commandStack.isEmpty()) {
			return;
		}
		Command command = commandStack.pop();
		command.undo();
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\n--------Remote Control---------\n");
		for (int i = 0; i < onCommands.length; i++) {
			sb.append("[slot " + i + "] " +  onCommands[i].getClass().getName() + "    " + offCommands[i].getClass().getName() + "\n");
		}
		
		return sb.toString();
	}
}
