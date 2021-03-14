import java.util.HashMap;
import java.util.Map;

public class AllSwap {

	public String[] allSwap(String[] strings) {
		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i < strings.length - 1; i++) {
			if (!map.containsKey(strings[i]) || !(map.get(strings[i]) == i)) {
				for (int j = i + 1; j < strings.length; j++) {
					if (!map.containsKey(strings[j]) || !(map.get(strings[j]) == j)) {
						if (strings[i].charAt(0) == strings[j].charAt(0)) {
							map.put(strings[i], j);
							map.put(strings[j], i);
							String temp = strings[i];
							strings[i] = strings[j];
							strings[j] = temp;
							break;
						}
					}
				}
			}
		}
		return strings;
	}
}
