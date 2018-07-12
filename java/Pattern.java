package java_exOne;

import java.util.Scanner;

public class Pattern {
	public static void main(String args[]) {
		int num;
		System.out.println("Enter a number:");
		Scanner ip = new Scanner(System.in);
		num = ip.nextInt();
		for (int i = 0; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
		}
	}
}
