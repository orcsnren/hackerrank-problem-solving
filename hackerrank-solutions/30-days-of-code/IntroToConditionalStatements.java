import java.util.Scanner;

public class IntroToConditionalStatements {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		scanner.close();

		if (N % 2 != 0) {
			System.out.println("Weird");
		} else if ((N >= 2 && N <= 5) || N > 20) {
			System.out.println("Not Weird");
		} else {
			System.out.println("Weird");
		}
	}
}
