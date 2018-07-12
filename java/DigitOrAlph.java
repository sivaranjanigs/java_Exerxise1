package java_exOne;

import java.util.Scanner;

public class DigitOrAlph {
	public static void main(String args[]) {
char a;
System.out.println("Enter a character:");
		Scanner ip=new Scanner(System.in);
		a = ip.next().charAt(0);
		if(a>='a'&&a<='z') {
			System.out.println(a+" is a small letter");
		}
		else if(a>='A'&&a<='z') {
			System.out.println(a+" is a capital letter");

		}
		else if(Character.isDigit(a)) {
			System.out.println(a+" is a number");

		}
		else {
			System.out.println(a+" is a special symbol");

		}
			
		}

}
