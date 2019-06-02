package implementations;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class Result {

	public static int pickingNumbers(List<Integer> a) {
		List<Integer> list = new ArrayList<Integer>();
		Collections.sort(a);
		int max = 1;
		list.add(a.get(0));
		for (int i = 1; i < a.size(); i++) {
			int num = a.get(i);
			int dif = num - list.get(0);
			System.out.println(num + " " + dif);
			if (dif < 2) {
				list.add(num);
				if (max < list.size()) {
					max = list.size();
				}
			} else {
				list.clear();
				list.add(num);
			}
		}
		return max;
	}

}

public class PickingNumbers {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList());

		int result = Result.pickingNumbers(a);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
