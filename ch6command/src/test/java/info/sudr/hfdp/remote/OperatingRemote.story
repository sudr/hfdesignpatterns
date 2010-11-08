package info.sudr.hfdp.remote

import info.sudr.hfdp.remote.device.*;
import info.sudr.hfdp.remote.command.*;

scenario "turn on a light", {
	given "a remote with a light on command", {
		remote = new RemoteControl()
		light = new Light()
		remote.setCommand(0, new LightOnCommand(light), new LightOffCommand(light))
	}
	
	when "we press the on button", { remote.onButtonWasPushed(0) }
	
	then "the light is turned on", {
		light.isOn().shouldBe true
	}
}

scenario "turn off a light when we first turn it on and then undo it", {
	given "a remote with a light on command and we turn on the light", {
		remote = new RemoteControl()
		light = new Light()
		remote.setCommand(0, new LightOnCommand(light), new LightOffCommand(light))
		remote.onButtonWasPushed(0)
		assert light.isOn()
	}
	
	when "we press the undo button", { remote.undo() }
	
	then "the light is turned on", {
		light.isOn().shouldBe false
	}
}

scenario "undo the last speed setting on a ceiling fan", {
	given "a remote and a ceiling fan", {
		remote = new RemoteControl()
		ceilingFan = new CeilingFan('Living Room')
		remote.setCommand(0, new CelingFanLowCommand(ceilingFan), new CelingFanOffCommand(ceilingFan))
		remote.setCommand(1, new CelingFanHighCommand(ceilingFan), new CelingFanOffCommand(ceilingFan))
	}
	and
	given "the remote is used to first set the ceiling fan to low", {
		remote.onButtonWasPushed(0)
		assert ceilingFan.speed == CeilingFan.Speed.LOW
	}
	and
	given "the remote is used to then set the ceiling fan to high", {
		remote.onButtonWasPushed(1)
		assert ceilingFan.speed == CeilingFan.Speed.HIGH
	}
	
	when "we press the undo button", { remote.undo() }
	
	then "the ceiling fan is set back to low", {
		ceilingFan.speed.shouldBeEqualTo CeilingFan.Speed.LOW
	}
}

scenario "remote with party mode", {
	given "a remote and party devices", {
		remote = new RemoteControl()
		light = new Light()
		lightOn = new LightOnCommand(light)
		lightOff = new LightOffCommand(light)
		stereo = new Stereo()
		stereoOn = new StereoOnCommand(stereo)
		stereoOff = new StereoOffCommand(stereo)
		
		Command[] partyOn = [ lightOn, stereoOn ]
		Command[] partyOff = [ lightOff, stereoOff ]
		partyOnCommand = new MacroCommand(partyOn)
		partyOffCommand = new MacroCommand(partyOff)
		
		remote.setCommand(0, partyOnCommand, partyOffCommand)
	}
	
	when "we press the party button on", { remote.onButtonWasPushed(0) }
	
	then "the light is turned on", {
		light.isOn().shouldBeEqualTo true
	}
	and
	then "the stereo is turned on", {
		stereo.isOn().shouldBeEqualTo true
	}
}