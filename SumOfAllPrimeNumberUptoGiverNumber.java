package numbers;

import java.util.Scanner;

public class SumOfAllPrimeNumberUptoGiverNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no ");
		int n = sc.nextInt();
		System.out.println(sumPrime(n));
	}

	public static int sumPrime(int n) {
		int sum = 0;
		for (int i = 2; i <= n; i++) {
			if (prime(i)) {
				sum += i;
			}
		}
		return sum;
	}

	public static boolean prime(int n) {
		if (n == 1 || n == 0)
			return false;
	
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0)
					return false;
			}
		

		return true;
	}
}
