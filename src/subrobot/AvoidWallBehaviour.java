package subrobot;
import lejos.robotics.subsumption.Behavior;
public class AvoidWallBehaviour extends SimpleRobot implements Behavior {

	@Override
	public boolean takeControl() {
		// TODO Auto-generated method stub
		return this.noseBumped();
	}


	@Override
	public void action() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void suppress() {
		// TODO Auto-generated method stub
		
	}

}

