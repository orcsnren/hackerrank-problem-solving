package implementations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MinimumDistances {

	// Complete the minimumDistances function below.
	static int minimumDistances(Integer[] a) {
		Map<Integer, Integer> firstIndexes = new HashMap<Integer, Integer>();
		int min = Integer.MAX_VALUE;
		for (Integer i = 0; i < a.length; i++) {
			if (firstIndexes.get(a[i]) == null) {
				firstIndexes.put(a[i], i);
			} else {
				Integer dif = Math.abs(i - firstIndexes.get(a[i]));
				min = Math.min(min, dif);
			}
		}
		return min == Integer.MAX_VALUE ? -1 : min;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		Integer[] a = new Integer[n];

		String[] aItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {

			a[i] = new Integer(aItems[i]);
		}

		int result = minimumDistances(a);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
