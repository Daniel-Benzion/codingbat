import java.util.HashMap;
import java.util.Map;

public class Pairs {

	public Map<String, String> pairs(String[] strings) {
		Map<String, String> map = new HashMap<>();

		for (String str : strings) {
			String key = str.substring(0, 1);
			String value = str.substring(str.length() - 1);
			map.put(key, value);
		}
		return map;
	}
}
