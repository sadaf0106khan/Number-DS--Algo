package algebra;
import java.math.*;
import java.util.Scanner;
public class BigFactorial {
	
	public static void bigfactorial(int n) {
		BigInteger fact=BigInteger.ONE;
		
		for(int i=n;i>=2;i--) {
			fact=fact.multiply(BigInteger.valueOf(i));
		}
		System.out.println(fact);
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	bigfactorial(n);
}
}
