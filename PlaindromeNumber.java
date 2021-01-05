package numbers;

import java.util.Scanner;

public class PlaindromeNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a no ");
	int n=sc.nextInt();
	int m=isPlaindrome(n);
	if(n==m)
	System.out.println("yes");
	else
		System.out.println("no");
}
	public static int isPlaindrome(int n) {
		int temp=n;
		int rev=0;
		while(temp!=0) {
			int rem=temp%10;
			rev=rev*10+rem;
			temp/=10;
		}
		return rev;
	}
}
