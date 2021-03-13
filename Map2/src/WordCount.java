import java.util.HashMap;
import java.util.Map;

public class WordCount {

	public Map<String, Integer> wordCount(String[] strings) {
		Map<String, Integer> map = new HashMap<>();

		if (strings.length == 0) return map;

		for (int i = 0; i < strings.length - 1; i++) {
			if (!map.containsKey(strings[i])) {
				int count = 1;
				for (int j = i + 1; j < strings.length; j++) {
					if (strings[j].equals(strings[i])) {
						count++;
					}
				}
				map.put(strings[i], count);
			}
		}
		if (!map.containsKey(strings[strings.length - 1])) {
			map.put(strings[strings.length - 1], 1);
		}
		return map;
	}
}
