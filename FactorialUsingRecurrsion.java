package numbers;

import java.util.Scanner;

public class FactorialUsingRecurrsion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		System.out.println(factorialRec(num));
	}
	
	public static long factorialRec(int n) {
		if(n==0||n==1) {
			return 1;
		}
		return n*factorialRec(n-1);
		
	}
}
