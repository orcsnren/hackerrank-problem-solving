
import java.util.Scanner;

public class RunningTimeAndComplexity {
	public static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}
		if (n == 2) {
			return true;
		}
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
			String prime = isPrime(arr[i]) ? "Prime" : "Not prime";
			System.out.println(prime);
		}

	}
}
