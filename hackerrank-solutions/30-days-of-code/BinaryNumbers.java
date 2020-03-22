
import java.util.Scanner;

public class BinaryNumbers {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int seq = 0;
		String strBinary = Integer.toBinaryString(n);
		String[] parts = strBinary.split("0");
		for (int i = 0; i < parts.length; i++) {
			if (seq < parts[i].length()) {
				seq = parts[i].length();
			}
		}
		System.out.println(seq);

	}

}
