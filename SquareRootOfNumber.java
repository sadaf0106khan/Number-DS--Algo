package numbers;

public class SquareRootOfNumber {
	public static void main(String[] args) {
		System.out.print(squareRoot(2));
	}

	public static double squareRoot(double n) {
	double	square_root = n / 2;
		double temp;
		do {
			temp=square_root;
			square_root=(temp+(n/temp))/2;
		}while(temp-square_root!=0);
		
		
		return square_root;
	}
	
}
