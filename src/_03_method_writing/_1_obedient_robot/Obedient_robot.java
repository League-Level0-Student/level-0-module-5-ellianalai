package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Obedient_robot {

	public static void main(String[] args) {
		String q = JOptionPane.showInputDialog("Would you like to draw: a square, triangle, or circle?");
		if (q.equalsIgnoreCase("square")) {
			drawSquare();
		}
		else if (q.equalsIgnoreCase("triangle")) {
			drawTriangle();
		}
		else if (q.equalsIgnoreCase("circle")) {
			drawCircle();
		}
	}
	public static void drawSquare() {
		Robot r = new Robot("mini");
		r.penDown();
		r.setSpeed(10);
		for(int i =0;i<4;i++) {
			r.move(90);
			r.turn(90);
		}
		r.hide();
	}
	public static void drawTriangle() {
		Robot r = new Robot("mini");
		r.penDown();
		r.setSpeed(10);
		for(int i=0;i<3; i++) {
			r.move(90);
			r.turn(120);
		}
		
		r.hide();
	}
	public static void  drawCircle() {
		Robot r = new Robot ("mini");
		r.penDown();
		r.setSpeed(50);
		for(int i=0;i<=360/5;i++) {
			r.move(5);
			r.turn(5);
		}
		r.hide();
	}
}
