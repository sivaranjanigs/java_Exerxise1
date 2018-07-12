package java_exOne;

import java.util.Scanner;

public class Palindrome {
	public static void main(String args[]) {
		int num, temp, revNum = 0, r, sum = 0;
		System.out.println("Enter a number:");
		Scanner ip = new Scanner(System.in);
		num = ip.nextInt();
		temp = num;
		while (num != 0) {
			r = num % 10;
			revNum = revNum * 10 + r;
			num /= 10;
		}
		if (temp == revNum) {
			while (temp != 0) {
				r = temp % 10;
				if ((r % 2) == 0) {
					sum += r;
				}
				temp /= 10;
			}
			System.out.println(revNum + " is palindrome and sum of even digits is " + sum);

		} else {
			System.out.println(temp + " is not palindrome");

		}
	}
}
