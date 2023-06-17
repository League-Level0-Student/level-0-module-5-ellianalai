package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class prime {

	public static void main(String[] args) {
		String prime = JOptionPane.showInputDialog("Input a number");
		int primeAsInt = Integer.parseInt(prime);
//how to make it check if at one time it is not a prime number, then it is automatically non prime
		for (int i=2;i<primeAsInt; i++) {
			if (primeAsInt%i == 0 && primeAsInt!=2) {
				JOptionPane.showMessageDialog(null, "Your number is not a prime number");
				System.exit(0);
				
				}
			
		}
		JOptionPane.showMessageDialog(null, "Your number is a prime number");
		
		



	}

}
