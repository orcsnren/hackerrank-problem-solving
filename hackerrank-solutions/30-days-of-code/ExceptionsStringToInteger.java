
import java.util.Scanner;

public class ExceptionsStringToInteger {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		try {
			Integer num = Integer.parseInt(S);
			System.out.println(num);
		} catch (Exception e) {
			System.out.println("Bad String");
		}
	}
}
