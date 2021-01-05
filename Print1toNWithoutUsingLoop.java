package numbers;

public class Print1toNWithoutUsingLoop {

	public static void main(String[] args) {
		print(5);
	}
	public static void print(int n) {
		if(n<1)
		  System.out.println("");
		else {
		System.out.println(n);
		print(n-1);
		}
		
	}
}
