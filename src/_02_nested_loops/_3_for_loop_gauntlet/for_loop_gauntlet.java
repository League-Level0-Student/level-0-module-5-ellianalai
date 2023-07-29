package _02_nested_loops._3_for_loop_gauntlet;

import javax.swing.JOptionPane;

public class for_loop_gauntlet {

	public static void main(String[] args) {
		/*		 first for loop (1-100)
		 for(int i =0;i<101;i++) {
			System.out.println(i);
		}

		second for loop(100-0)
		for(int i = 100; i>-1;i--) {
			System.out.println(i);
		}

		third for loop (even numbers)
		for(int i = 2; i<101;i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}

		fourth for loop(odd numbers)
		for(int i = 0; i<100;i++) {
			if (i%2==1) {
				System.out.println(i);
			}
		}

		fifth for loop (distinguish if number is even or odd)
		for(int i = 1; i<501;i++) {
			if (i%2==0) {
				System.out.println(i + " is even");
			}
			else {
				System.out.println(i + " is odd");
			}
		}

		sixth for loop (print multiples of 7)
		for (int i = 1; i<112; i++) {
			System.out.println(i*7);
		}

		seventh for loop (defining age in what year)
		int years = 2009;
		System.out.println("In 2009, I was just born");
		for (int i = 1; i<14;i++) {
			years+=1;
			System.out.println("In " + years + ", I was " + i + " years old");
		}
		System.out.println("In 2023, I am 14 years old");

		eighth for loop (nested loop)
		for (int i =0; i<3; i++) {

			for (int c = 0; c<3; c++) {

				System.out.println(i + " " + c);
			}
		}

		ninth for loop (3x3 grid)
		int counter = 0;

		for (int i =0; i<3; i++) {

			for (int j=1; j<4; j++) {
				counter++;
				System.out.print(counter + " ");

			}
			System.out.println();

		}
		
		tenth for loop (10x10 grid)
		int counter = 0;

		for (int i =0; i<10; i++) {

			for (int j=0; j<10; j++) {
				counter++;
				if (counter<=10) {
					System.out.print(counter + "  ");
				}
				else if (counter>=11) {
					System.out.print(counter + " ");
				}
				
			}
			System.out.println();

		}
		twelfth for loop (count down from 100-0)
		int number = 101;
		for(int i =0; i<100; i++) {
			number--;
			System.out.println(number);
		}
*/
		for (int i =0; i<6; i++) {
			
			for (int k=0; k<6;k++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		
	}

}
