package subrobot;
import lejos.robotics.subsumption.Behavior;
public class AvoidWallBehaviour extends SimpleRobot implements Behavior {

	@Override
	public boolean takeControl() {
		return this.noseBumped();
	}

	@Override
	public void action() {
		turnAround();
		walk();
	}

	@Override
	public void suppress() {
		// TODO Auto-generated method stub
		
	}

}

