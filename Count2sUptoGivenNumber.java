package numbers;

import java.util.Scanner;

public class Count2sUptoGivenNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a numbmer ");
		int n=sc.nextInt();
		System.out.println(countTwos(25));
	}

	public static int countTwos(int n) {
		int count = 0;
		for (int i = 2; i <= n; i++) {
			int temp = i;
			while (temp != 0) {
				int rem = temp % 10;
				if (rem == 2) {
					count++;
				}
				temp /= 10;
			}
		}
		return count;
	}
}
