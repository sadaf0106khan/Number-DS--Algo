package numbers;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		System.out.println(factorial(num));
	}

	public static long factorial(int n) {
		long fact = 1;
		while (n != 0) {
			fact = fact * n;
			n--;
		}
		return fact;
	}
}
