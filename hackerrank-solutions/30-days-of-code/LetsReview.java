
import java.util.Scanner;

public class LetsReview {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		scan.nextLine();
		StringBuilder sp1 = new StringBuilder();
		StringBuilder sp2 = new StringBuilder();

		for (int j = 0; j < i; j++) {
			sp1.setLength(0);
			sp2.setLength(0);
			String current = scan.nextLine();
			for (int k = 0; k < current.length(); k++) {
				if (k % 2 == 0) {
					sp1.append(current.charAt(k));
				} else {
					sp2.append(current.charAt(k));
				}
			}
			System.out.println(sp1.toString() + " " + sp2.toString());
		}
		scan.close();

	}

}
