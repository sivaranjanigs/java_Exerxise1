package java_exOne;

import java.util.Scanner;

public class Guess {
	public static void main(String args[]) {
		int num, target;
		System.out.println("Enter a target number:");

		Scanner ip = new Scanner(System.in);
		target = ip.nextInt();
		do {
			System.out.println("Enter a number(between 1 and 50):");
			Scanner inp = new Scanner(System.in);
			num = ip.nextInt();
			if (num >= 1 && num <= 50) {
				if (num > target) {
					System.out.println("your number is greater than target");
				} else if (num < target) {
					System.out.println("your number is less than target");

				} else {
					System.out.println("Your number is matched with target");

				}
			} else {
				System.out.println("Please enter number between 1 and 50");

			}
		} while (num != target);
	}
}
