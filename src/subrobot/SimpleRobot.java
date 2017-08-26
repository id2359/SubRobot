package subrobot;
import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.NXTRegulatedMotor;

public class SimpleRobot {
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
	
	protected void run() {
		leftMotor.setSpeed(720);
		rightMotor.setSpeed(720);
		leftMotor.forward();
		rightMotor.forward();
	}

}