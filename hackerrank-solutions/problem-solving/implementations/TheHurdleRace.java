package implementations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TheHurdleRace {

	// Complete the hurdleRace function below.
	static int hurdleRace(int k, int[] height) {
		int h = 0;
		for (int i = 0; i < height.length; i++) {
			if (k < height[i]) {
				h += (height[i] - k);
				k = height[i];
			}
		}
		return h;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] nk = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nk[0]);

		int k = Integer.parseInt(nk[1]);

		int[] height = new int[n];

		String[] heightItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int heightItem = Integer.parseInt(heightItems[i]);
			height[i] = heightItem;
		}

		int result = hurdleRace(k, height);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
