package implementations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Encryption {
	// Complete the encryption function below.
	static String encryption(String s) {
		int offset = (int) Math.ceil(Math.sqrt(s.length()));
		StringBuilder sp = new StringBuilder();
		StringBuilder encrypted = new StringBuilder();
		for (int i = 0; i < offset; i++) {
			sp.setLength(0);
			for (int y = 0; y < offset; y++) {
				if (i + offset * y < s.length()) {
					sp.append(s.charAt(i + offset * y));
				}
			}
			encrypted.append(sp.toString()).append(" ");
		}
		encrypted.setLength(encrypted.length() - 1);
		return encrypted.toString();
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = scanner.nextLine();

		String result = encryption(s);

		bufferedWriter.write(result);
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
