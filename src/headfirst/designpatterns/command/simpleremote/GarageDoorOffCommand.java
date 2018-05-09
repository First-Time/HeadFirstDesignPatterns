package headfirst.designpatterns.command.simpleremote;

public class GarageDoorOffCommand implements Command {

	GarageDoor garageDoor;

	public GarageDoorOffCommand(GarageDoor garageDoor) {
		super();
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		garageDoor.down();
	}

}
