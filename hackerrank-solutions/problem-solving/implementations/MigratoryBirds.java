package implementations;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class MigratoryBirds {
	public static int minType = 6;

	// Complete the migratoryBirds function below.
	static int migratoryBirds(List<Integer> arr) {
		Map<Integer, Integer> typeMap = new HashMap<Integer, Integer>();
		int maxCount = 1;
		for (Integer type : arr) {
			if (typeMap.get(type) == null) {
				typeMap.put(type, 1);
			} else {
				int count = typeMap.get(type) + 1;
				typeMap.put(type, count);
				if (count > maxCount) {
					maxCount = count;
				}
			}
		}
		for (Integer type : arr) {
			if (typeMap.get(type) != null && typeMap.get(type) == maxCount && type < minType) {
				minType = type;
			}
		}
		return minType;

	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		int result = migratoryBirds(arr);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
