package numbers;

import java.util.Scanner;

//armstrong nmber is also known as narcissistic number
public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no ");
		int n=sc.nextInt();
		int m=isArmstrong(n);
		if(n==m) {
			System.out.println("armstrong");
			
		}else
			System.out.println("Entered number is not armstrong");
	}
	public static int isArmstrong(int n) {
		int temp=n;
		int len=0;
		while(temp!=0) {
			temp/=10;
			len++;
		}
		int arm=0;
		int temp2=n;
		while(temp2!=0) {
			int mul=1;
			
			int rev=temp2%10;
			for(int i=0;i<len;i++) {
				mul*=rev;
			}
			arm+=mul;
			temp2/=10;
			
		}
		return arm;
	}
}
