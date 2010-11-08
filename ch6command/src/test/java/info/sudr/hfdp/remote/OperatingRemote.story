package info.sudr.hfdp.remote

import info.sudr.hfdp.remote.device.*;
import info.sudr.hfdp.remote.command.*;

scenario "turn on a light", {
	given "a remote with a light on command", {
		remote = new SimpleRemoteControl()
		light = new Light()
		remote.setCommand(new LightOnCommand(light))
	}
	
	when "we press the button", { remote.buttonWasPressed() }
	
	then "the light is turned on", {
		light.isOn().shouldBe true
	}
}

scenario "open a garage door", {
	given "a remote with a open garage door command", {
		remote = new SimpleRemoteControl()
		garageDoor = new GarageDoor()
		remote.setCommand(new GarageDoorOpenCommand(garageDoor))
	}
	
	when "we press the button", { remote.buttonWasPressed() }
	
	then "the light is turned on", {
		garageDoor.isOpen().shouldBe true
	}
}