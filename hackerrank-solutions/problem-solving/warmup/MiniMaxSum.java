package warmup;

import java.util.Scanner;

public class MiniMaxSum {

	// Complete the miniMaxSum function below.
	static void miniMaxSum(int[] arr) {
		long min = Long.MAX_VALUE;
		long max = 0;
		for (int y = 0; y < arr.length; y++) {
			long temp = 0;
			for (int i = 0; i < arr.length; i++) {
				if (y != i) {
					temp += arr[i];
				}
			}
			if (temp > max) {
				max = temp;
			}
			if (temp < min) {
				min = temp;
			}
		}
		System.out.println(min + " " + max);
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = new int[5];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < 5; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}
		miniMaxSum(arr);
		scanner.close();
	}
}
