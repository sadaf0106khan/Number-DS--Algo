package numbers;

import java.util.Scanner;

public class AdamNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		System.out.println(adamNumber(n));
	}

	public static int reverseNumber(int n) {
		int reverse = 0;
		int temp = n;
		while (temp != 0) {
			int rem = temp % 10;
			reverse = reverse * 10 + rem;
			temp /= 10;
		}
		return reverse;
	}

	public static boolean adamNumber(int n) {
		int square_number = n * n;
		int reverse_number = reverseNumber(n);
		int reverse_square = reverse_number * reverse_number;
		int reverse_squared_number = reverseNumber(reverse_square);
		if (square_number != reverse_squared_number)
			return false;
		return true;
	}

}
