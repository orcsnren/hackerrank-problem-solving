package implementations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SequenceEquation {
	// Complete the permutationEquation function below.
	static int[] permutationEquation(int[] p) {
		int[] array = new int[p.length];
		for (int i = 0; i < array.length; i++) {
			array[p[i] - 1] = findIndex(p, i + 1);
		}
		return array;
	}

	static int findIndex(int[] ar, int num) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == num) {
				return i + 1;
			}
		}
		return 0;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] p = new int[n];

		String[] pItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int pItem = Integer.parseInt(pItems[i]);
			p[i] = pItem;
		}

		int[] result = permutationEquation(p);

		for (int i = 0; i < result.length; i++) {
			bufferedWriter.write(String.valueOf(result[i]));

			if (i != result.length - 1) {
				bufferedWriter.write("\n");
			}
		}

		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
