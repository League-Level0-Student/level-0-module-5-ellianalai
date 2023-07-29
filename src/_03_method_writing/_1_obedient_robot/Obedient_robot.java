package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class Obedient_robot {

	public static void main(String[] args) {
		drawSquare();
		// TODO Auto-generated method stub

	}
	public static void drawSquare() {
		Robot r = new Robot();
		r.penDown();
		r.setSpeed(5);
		for(int i =0;i<4;i++) {
			r.move(90);
			r.turn(90);
		}
	}
}
