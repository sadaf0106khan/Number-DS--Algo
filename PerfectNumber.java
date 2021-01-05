package numbers;

public class PerfectNumber {

	public static void main(String[] args) {
		System.out.println(isPerfect(496));
	}

	public static boolean isPerfect(int n) {
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		if (sum == n)
			return true;
		else
			return false;
	}

}
