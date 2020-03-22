
//Complete this code or write your own from scratch
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class DictionariesAndMaps {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			if (map.get(name) == null) {
				map.put(name, phone);
			}

		}
		while (in.hasNext()) {
			String s = in.next();
			System.out.println(map.get(s) == null ? "Not found" : s + "=" + map.get(s));
		}
		in.close();
	}
}
