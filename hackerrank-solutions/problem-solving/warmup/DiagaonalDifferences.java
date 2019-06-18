package warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DiagaonalDifferences {

	// Complete the diagonalDifference function below.
	static int diagonalDifference(int[][] arr) {
		int diagonal1 = 0;
		int diagonal2 = 0;
		for (int i = 0; i < arr[0].length; i++) {
			System.out.println(arr[i].length);
			diagonal1 += arr[i][i];
			diagonal2 += arr[i][arr[i].length - i - 1];
		}
		return Math.abs(diagonal1 - diagonal2);

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < n; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
			}
		}

		int result = diagonalDifference(arr);
		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();
		bufferedWriter.close();
		scanner.close();
	}
}
