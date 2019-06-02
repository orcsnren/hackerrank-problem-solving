package implementations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ChocolateFeast {

	// Complete the chocolateFeast function below.
	static int chocolateFeast(int n, int c, int m) {
		int initialChocolates = n / c;
		int exchangedChocolates = initialChocolates / m;
		int totalChocolates = initialChocolates + exchangedChocolates;
		int remainWrappers = initialChocolates % m;
		while (exchangedChocolates != 0) {
			int totalWrap = (exchangedChocolates + remainWrappers);
			exchangedChocolates = totalWrap / m;
			totalChocolates += exchangedChocolates;
			remainWrappers = totalWrap % m;
		}
		return totalChocolates;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		for (int tItr = 0; tItr < t; tItr++) {
			String[] ncm = scanner.nextLine().split(" ");

			int n = Integer.parseInt(ncm[0]);

			int c = Integer.parseInt(ncm[1]);

			int m = Integer.parseInt(ncm[2]);

			int result = chocolateFeast(n, c, m);

			bufferedWriter.write(String.valueOf(result));
			bufferedWriter.newLine();
		}
		bufferedWriter.close();
		scanner.close();
	}
}
