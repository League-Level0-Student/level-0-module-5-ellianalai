package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class Skill {

	public static void main(String[] args) {
		/*		String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
		int cents = Integer.parseInt(dimes);
		JOptionPane.showMessageDialog(null, "You have " + cents*10 + "¢");


		String height = JOptionPane.showInputDialog("How tall are you? (in inches)");
		int inches = Integer.parseInt(height);
		if (inches<36) {
			JOptionPane.showMessageDialog(null, "You should eat your Wheaties");
		}
		else {
			JOptionPane.showMessageDialog(null, "Good job for eating your Wheaties");
		}
		 
		for (int i =0; i<=30;i+=3) {
			System.out.println(i);
		}
		
		Random ran = new Random();
		int number = ran.nextInt(20) + 0;
		System.out.println(number);
		int n = ran.nextInt(10) + 0;
		System.out.println(n);
		String result = Integer.toString(number-n);
		JOptionPane.showMessageDialog(null, "The difference between the two random numbers is " + result);
		
		String city = JOptionPane.showInputDialog("Which city do you live in?");
		if (city.equalsIgnoreCase("San Diego")) {
			JOptionPane.showMessageDialog(null, "You live in America's finest city!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Move to San Diego");
		}
		
		String cars = JOptionPane.showInputDialog("How many cars does your family have?");
		int c = Integer.parseInt(cars);
		if (c == 0) {
			JOptionPane.showMessageDialog(null, "I bet you use public transportation");
		}
		if (c == 1) {
			String model = JOptionPane.showInputDialog("What is the model of your car?");
			JOptionPane.showMessageDialog(null, "The " + model +   " model is very cool");
		}
		if (c> 1) {
			JOptionPane.showMessageDialog(null, "Your total collection of cars equate to having " + 4*c + " wheels");
		}
		*/
		String school = JOptionPane.showInputDialog("What is the name of your school?");
		JOptionPane.showMessageDialog(null, school + " is a fantastic school");
	}

}
