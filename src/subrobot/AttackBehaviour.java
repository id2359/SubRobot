package subrobot;

import lejos.robotics.subsumption.Behavior;

public class AttackBehaviour extends SimpleRobot implements Behavior {

	@Override
	public boolean takeControl() {
		// TODO Auto-generated method stub
		return isThreatened();
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
