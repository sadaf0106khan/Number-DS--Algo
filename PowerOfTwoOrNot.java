package numbers;

import java.util.Scanner;

public class PowerOfTwoOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=sc.nextInt();
		System.out.println(powerOfTwo(n));
	}

	public static boolean powerOfTwo(int n) {
		if(n==0)
		return false;
		while(n!=1) {
			if(n%2!=0)
				return false;
		n=n/2;
		}
		return true;
	}
}
