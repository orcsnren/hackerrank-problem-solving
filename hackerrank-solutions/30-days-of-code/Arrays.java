
import java.util.Scanner;

public class Arrays {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		StringBuilder sp = new StringBuilder();
		for (int i = arrItems.length - 1; i >= 0; i--) {
			sp.append(arrItems[i]).append(" ");
		}
		System.out.println(sp.toString());
		scanner.close();
	}

}
