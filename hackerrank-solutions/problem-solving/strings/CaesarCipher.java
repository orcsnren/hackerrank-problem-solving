package strings;

import java.io.IOException;
import java.util.Scanner;

public class CaesarCipher {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		int k = sc.nextInt() % 26;
		int lowerInitial = 97;
		int upperInitial = 65;
		int upperLast = 90;
		int lowerLast = 122;
		StringBuilder sp = new StringBuilder();
		for (char c : str.toCharArray()) {
			int num = (int) c;
			if (c >= upperInitial && c <= upperLast) {
				num = (num + k) > upperLast ? (upperInitial + (num + k) % (upperLast + 1)) : (num + k);
			} else if (c >= lowerInitial && c <= lowerLast) {
				num = (num + k) > lowerLast ? (lowerInitial + (num + k) % (lowerLast + 1)) : (num + k);
			}
			sp.append((char) num);
		}
		System.out.println(sp.toString());
	}
}
