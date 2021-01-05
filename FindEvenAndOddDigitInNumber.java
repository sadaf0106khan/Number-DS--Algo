package numbers;

public class FindEvenAndOddDigitInNumber {
	public static void main(String[] args) {
		int n=123456;
		int temp=n;
		int even=0;
		int odd=0;
		while(temp!=0) {
			int rem=temp%10;
			if(rem%2==0) {
				even++;
				System.out.println(rem+" is even");
			}
			else {
				odd++;
				System.out.println(rem+" is odd");
			}
			temp/=10;
		}
		//System.out.println("no of even digit in given number is "+even+" and "+ "odd digit is "+odd);
		}
	
}
