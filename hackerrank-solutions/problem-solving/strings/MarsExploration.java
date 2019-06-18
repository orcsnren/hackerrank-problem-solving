package strings;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MarsExploration {

	// Complete the marsExploration function below.
	public static int marsExploration(String message) {
		String sos = "SOS";
		int count = 0;
		for (int i = 0; i < message.length(); i++) {
			if (message.charAt(i) != sos.charAt(i % 3)) {
				count++;
			}
		}
		return count;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = scanner.nextLine();

		int result = marsExploration(s);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
