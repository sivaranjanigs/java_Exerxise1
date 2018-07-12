package java_exOne;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Unspecified {
	public static void main(String args[]) {
		int n, sum = 0;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter limit");
		n = in.nextInt();
		System.out.println("Enter array elements:");
		int a[] = new int[n];
		try {
		for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
				sum = sum + a[i];
				Integer.parseInt(String.valueOf(a[i]));
				System.out.println("Valid");
		}
		System.out.println("sum of array elements:"+sum);
	
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid");
		}

	}
}
