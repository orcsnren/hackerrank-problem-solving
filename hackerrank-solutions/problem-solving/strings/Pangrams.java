package strings;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Pangrams {

	// Complete the pangrams function below.
	static String pangrams(String s) {
		boolean check = true;
		for (int i = 97; i < 123; i++) {
			check = check && (s.indexOf((char) i) >= 0 || s.indexOf((char) i - 32) >= 0 || s.indexOf((char) 40) >= 0);
		}
		return check ? "pangram" : "not pangram";
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = scanner.nextLine();

		String result = pangrams(s);

		bufferedWriter.write(result);
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
