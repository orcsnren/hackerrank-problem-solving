package warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TimeConversion {

	/*
	 * Complete the timeConversion function below.
	 */
	static String timeConversion(String s) {
		String[] timeAreas = s.split(":");
		StringBuilder builder = new StringBuilder();
		int newHour = Integer.parseInt(timeAreas[0]);
		if (newHour == 12) {
			newHour = 0;
		}
		if ("PM".equals(timeAreas[2].substring(timeAreas[2].length() - 2))) {
			newHour = newHour + 12;
		}
		if (newHour < 10) {
			builder.append("0");
		}
		return builder.append(Integer.toString(newHour)).append(":").append(timeAreas[1]).append(":").append(timeAreas[2].substring(0, 2)).toString();

	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		String s = scan.nextLine();
		String result = timeConversion(s);
		bw.write(result);
		bw.newLine();
		bw.close();
	}
}
