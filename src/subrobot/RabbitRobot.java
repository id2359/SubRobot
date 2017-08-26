package subrobot;
import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.NXTRegulatedMotor;

public class RabbitRobot {
	NXTRegulatedMotor leftLeg;
	NXTRegulatedMotor rightLeg;
	Button nose;
	
	RabbitRobot() {
		leftLeg = Motor.A;
		rightLeg = Motor.C;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	protected boolean noseBumped() {
		// TODO Auto-generated method stub
		return false;
	}

}
