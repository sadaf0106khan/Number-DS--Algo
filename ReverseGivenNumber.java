package numbers;

public class ReverseGivenNumber {
	
	public static void main(String[] args) {
		System.out.println(reverseNumber(123));
	}
	
	public static int reverseNumber(int num) {
		int rev=0;
		 int temp=num;
		 while(temp!=0) {
			 int rem=temp%10;
			 rev=rev*10+rem;
			 temp/=10;
		 }
		return rev;
	}

}
