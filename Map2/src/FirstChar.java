import java.util.HashMap;
import java.util.Map;

public class FirstChar {

	public Map<String, String> firstChar(String[] strings) {
		Map<String, String> map = new HashMap<>();

		if (strings.length == 0) return map;

		for (int i = 0; i < strings.length - 1; i++) {
			if (!map.containsKey(strings[i].substring(0, 1))) {
				StringBuilder sb = new StringBuilder();
				sb.append(strings[i]);
				for (int j = i + 1; j < strings.length; j++) {
					if (strings[j].substring(0, 1).equals(strings[i].substring(0, 1))) {
						sb.append(strings[j]);
					}
				}
				String result = sb.toString();
				map.put(strings[i].substring(0, 1), result);
			}
		}
		if (!map.containsKey(strings[strings.length - 1].substring(0, 1))) {
			map.put(strings[strings.length - 1].substring(0, 1), strings[strings.length - 1]);
		}
		return map;
	}
}
