package implementations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CutTheSticks {

	// Complete the cutTheSticks function below.
	static Integer[] cutTheSticks(int[] arr) {
		ArrayList<Integer> al = new ArrayList<>();
		ArrayList<Integer> stickCuts = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			int a = arr[i];
			al.add(a);
		}
		Collections.sort(al);
		for (int i = 0; i < al.size(); i++) {
			if (al.get(0) == 0) {
				al.remove(0);
				i = -1;
				continue;
			}
			stickCuts.add(al.size());
			int min = al.get(0);
			for (int j = 0; j < al.size(); j++) {
				al.set(j, al.get(j) - min);
			}
		}
		return stickCuts.toArray(new Integer[stickCuts.size()]);
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

		Integer[] result = cutTheSticks(arr);

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
