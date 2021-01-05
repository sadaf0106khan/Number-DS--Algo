
package numbers;

public class UglyNumber {
public static void main(String[] args) {
	System.out.println(isUglyNumber(14));
}
	
	public static boolean isUglyNumber(int n) {
		if(n==1)return true;
		if(n==0)return false;
		if(n%2==0) {
			n/=2;
			return isUglyNumber(n);
		}
		if(n%3==0) {
			n/=3;
			return isUglyNumber(n);
		}
		if(n%5==0) {
			n/=5;
			return isUglyNumber(n);
		}
		return false;
	}
}
