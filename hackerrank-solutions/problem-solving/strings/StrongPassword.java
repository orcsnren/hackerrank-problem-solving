package strings;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StrongPassword {

	// Complete the minimumNumber function below.
	static int minimumNumber(int n, String password) {
		int count = 0;
		String numbers = "0123456789";
		String lower_case = "abcdefghijklmnopqrstuvwxyz";
		String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String special_characters = "!@#$%^&*()-+";
		boolean[] controls = new boolean[4];
		for (Character c : password.toCharArray()) {
			if (numbers.indexOf(c) != -1) {
				controls[0] = true;
			}
			if (lower_case.indexOf(c) != -1) {
				controls[1] = true;
			}
			if (upper_case.indexOf(c) != -1) {
				controls[2] = true;
			}
			if (special_characters.indexOf(c) != -1) {
				controls[3] = true;
			}

		}
		for (int i = 0; i < controls.length; i++) {
			if (controls[i] == false) {
				count++;
			}
		}
		return Math.max(6 - n, count);

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String password = scanner.nextLine();

		int answer = minimumNumber(n, password);

		bufferedWriter.write(String.valueOf(answer));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
