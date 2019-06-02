package implementations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EqualizeTheArray {
	// Complete the equalizeArray function below.
	static int equalizeArray(int[] arr) {
		Integer min = Integer.MAX_VALUE;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (Integer num : arr) {
			if (map.get(num) == null) {
				map.put(num, 1);
			} else {
				int count = map.get(num) + 1;
				map.put(num, count);
			}
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			min = (arr.length - entry.getValue()) < min ? arr.length - entry.getValue() : min;
		}
		return min;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		int result = equalizeArray(arr);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
