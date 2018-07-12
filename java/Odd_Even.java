package java_exOne;

import java.util.Scanner;

public class Odd_Even {
	public static void main(String args[]) {
		int num;
		System.out.println("Enter a number:");
		Scanner ip = new Scanner(System.in);
		num = ip.nextInt();
		if ((num % 2) == 0) {
			if ((num >= 20) && (num <= 30)) {
				System.out.println("Jerry");
			}
		} else if ((num % 2) != 0) {
			if ((num > 20) && (num < 30)) {
				System.out.println("Tom");
			}
		}
	}
}
