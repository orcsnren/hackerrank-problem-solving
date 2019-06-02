package implementations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BeatifulDaysAtMovies {
	// Complete the beautifulDays function below.
	static int beautifulDays(int i, int j, int k) {
		int count = 0;
		for (int z = i; z <= j; z++) {
			if (Math.abs(z - reversDigits(z)) % k == 0) {
				count++;
			}
		}
		return count;
	}

	static int reversDigits(int num) {
		int reversed = 0;
		while (num > 0) {
			reversed = reversed * 10 + num % 10;
			num = num / 10;
		}
		return reversed;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] ijk = scanner.nextLine().split(" ");

		int i = Integer.parseInt(ijk[0]);

		int j = Integer.parseInt(ijk[1]);

		int k = Integer.parseInt(ijk[2]);

		int result = beautifulDays(i, j, k);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
