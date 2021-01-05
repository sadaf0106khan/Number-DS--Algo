package numbers;

import java.util.Scanner;

public class SumOfDigitsInGivenNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=sc.nextInt();
	System.out.println(sumOfDigit(num));
}
	
	public static int sumOfDigit(int num) {
		int temp=num;
		int sum=0;
		while(temp!=0) {
			int rem=temp%10;
			sum+=rem;
			temp/=10;
		}
		return sum;
	}
}
