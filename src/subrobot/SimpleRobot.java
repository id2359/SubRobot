package subrobot;
import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.NXTRegulatedMotor;

public class SimpleRobot implements IRobot {
	NXTRegulatedMotor leftMotor;
	NXTRegulatedMotor rightMotor;
	Button nose;
	
	SimpleRobot() {
		leftMotor = Motor.A;
		rightMotor = Motor.C;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	protected boolean noseBumped() {
		// TODO Auto-generated method stub
		return nose.isDown();
	}
	
	public void run() {
		leftMotor.setSpeed(720);
		rightMotor.setSpeed(720);
		leftMotor.forward();
		rightMotor.forward();
	}

	@Override
	public void turnAround() {
		// TODO Auto-generated method stub
		
	}
	
	protexc

}
