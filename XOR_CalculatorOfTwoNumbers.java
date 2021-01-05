package numbers;

import java.util.Scanner;

public class XOR_CalculatorOfTwoNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		System.out.println("xor of two numbers "+xor(a, b));
	}

	public static int xor(int a, int b) {
		int res = a ^ b;
		return res;
	}
}
