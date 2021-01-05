package numbers;

public class MagicNumber {
public static void main(String[] args) {
	System.out.println(magicNumber(1));
}
	
	
	public static boolean magicNumber(int n) {
		int sum=n;
		while(sum>9) {
			int temp=sum;
			sum=0;
			while(temp!=0) {
				int rem=temp%10;
				sum+=rem;
				temp/=10;
			}
			
		}
		if(sum==1)
			
		return true;
		
		return false;
	}
}
