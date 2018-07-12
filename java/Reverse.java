package java_exOne;

import java.util.Scanner;

public class Reverse {
	public static void main(String args[]) {
		String str;
		System.out.println("Enter a string:");
		Scanner ip = new Scanner(System.in);
		str = ip.next();
		for (int i = (str.length() - 1); i >= 0; i--) 
		{
			System.out.print(str.charAt(i));
		}
	}
}
