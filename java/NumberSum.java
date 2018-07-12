package java_exOne;

import java.util.Scanner;

public class NumberSum {
	public static void main(String args[]) {
		int num, i = 0, t, sum = 0;
		System.out.println("Enter a number:");
		Scanner ip = new Scanner(System.in);
		num = ip.nextInt();
		int length = String.valueOf(num).length();
		int arr[] = new int[length];
		int temp = num;
		do {
			arr[i] = temp % 10;
			temp /= 10;
			i = i + 1;
		} while (temp != 0);
		for (int x = 0; x < length; x++) {
			for (int y = x + 1; y < length; y++) {
				if (arr[x] < arr[y]) {
					t = arr[x];
					arr[x] = arr[y];
					arr[y] = t;
				}
			}
		}
		for (int x = 0; x < length; x++) {
			if (arr[x] % 2 == 0) {
				sum += arr[x];
			}
		}
		System.out.print("Sorted number in non-increasing order : ");
		for (int x = 0; x < length; x++) {
			System.out.print(arr[x]);
		}
		System.out.println("\nSum of even numbers: " + sum);
		if (sum > 15) {
			System.out.println("True");
		} else {
			System.out.println("False");

		}

	}
}
