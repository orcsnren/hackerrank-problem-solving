
import java.util.Scanner;

public class BitwiseAnd {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		for (int tItr = 0; tItr < t; tItr++) {
			String[] nk = scanner.nextLine().split(" ");
			int n = Integer.parseInt(nk[0]);
			int k = Integer.parseInt(nk[1]);
			int max = 0;
			for (int i = 1; i <= n; i++) {
				for (int y = i + 1; y <= n; y++) {
					int res = i & y;
					if (res < k && res > max)
						max = res;
				}
			}
			System.out.println(max);
		}

		scanner.close();
	}
}
