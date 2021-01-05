package algebra;
//we can use any number instead of 3
public class PowerOf3 {
	
	public static boolean powerOfThree(int n) {
		if(n<1)
			return false;
		int i=0;
		while(n%3==0) {
			n/=3;
		}
		
		return n==1;
	}
public static void main(String[] args) {
	System.out.println(powerOfThree(81*3));
}
}
