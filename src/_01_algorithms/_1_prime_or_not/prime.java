package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class prime {

	public static void main(String[] args) {
		String prime = JOptionPane.showInputDialog("Input a number");
		int primeAsInt = Integer.parseInt(prime);
//easier way??
		if (primeAsInt%2 ==0 && primeAsInt !=2){
			JOptionPane.showMessageDialog(null, "Your number is not a prime number");
		}
		else if (primeAsInt%3 ==0 && primeAsInt != 3){
			JOptionPane.showMessageDialog(null, "Your number is not a prime number");
		}
		else if (primeAsInt%5 ==0 && primeAsInt !=5){
			JOptionPane.showMessageDialog(null, "Your number is not a prime number");
		}
		else if (primeAsInt%7 ==0){
			JOptionPane.showMessageDialog(null, "Your number is not a prime number");
		}
		else if (primeAsInt%11 ==0){
			JOptionPane.showMessageDialog(null, "Your number is not a prime number");
		}
		else if (primeAsInt%13 ==0){
			JOptionPane.showMessageDialog(null, "Your number is not a prime number");
		}
		else if (primeAsInt%17 ==0){
			JOptionPane.showMessageDialog(null, "Your number is not a prime number");
		}
		else if (primeAsInt%19 ==0){
			JOptionPane.showMessageDialog(null, "Your number is not a prime number");
		}
		else if (primeAsInt%23 ==0){
			JOptionPane.showMessageDialog(null, "Your number is not a prime number");
		}
		else if (primeAsInt%29 ==0){
			JOptionPane.showMessageDialog(null, "Your number is not a prime number");
		}
		else if (primeAsInt%31 ==0){
			JOptionPane.showMessageDialog(null, "Your number is not a prime number");
		}
		else if (primeAsInt%37 ==0){
			JOptionPane.showMessageDialog(null, "Your number is not a prime number");
		}
		else if (primeAsInt%41 ==0){
			JOptionPane.showMessageDialog(null, "Your number is not a prime number");
		}
		else if (primeAsInt%43 ==0){
			JOptionPane.showMessageDialog(null, "Your number is not a prime number");
		}
		else if (primeAsInt%47 ==0){
			JOptionPane.showMessageDialog(null, "Your number is not a prime number");

		}
		else {
			JOptionPane.showMessageDialog(null, "Your number is a prime number!");
		}



	}

}
