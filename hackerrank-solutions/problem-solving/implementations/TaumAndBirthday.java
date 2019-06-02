package implementations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TaumAndBirthday {
	// Complete the taumBday function below.
	static long taumBday(long b, long w, long bc, long wc, long z) {
		long costB = bc;
		long costW = wc;
		if (bc > wc + z)
			costB = wc + z;
		else if (wc > bc + z) {
			costW = bc + z;
			System.out.println(bc + " " + wc);
		} else {
			costB = bc;
			costW = wc;
		}

		return b * costB + w * costW;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			String[] bw = scanner.nextLine().split(" ");

			int b = Integer.parseInt(bw[0]);

			int w = Integer.parseInt(bw[1]);

			String[] bcWcz = scanner.nextLine().split(" ");

			int bc = Integer.parseInt(bcWcz[0]);

			int wc = Integer.parseInt(bcWcz[1]);

			int z = Integer.parseInt(bcWcz[2]);

			long result = taumBday(b, w, bc, wc, z);

			bufferedWriter.write(String.valueOf(result));
			bufferedWriter.newLine();
		}

		bufferedWriter.close();

		scanner.close();
	}
}
