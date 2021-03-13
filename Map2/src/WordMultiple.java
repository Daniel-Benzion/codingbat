import java.util.HashMap;
import java.util.Map;

public class WordMultiple {

	public Map<String, Boolean> wordMultiple(String[] strings) {
		Map<String, Boolean> map = new HashMap<>();

		for (String str : strings) {
			if (!map.containsKey(str)) {
				map.put(str, false);
			} else {
				map.put(str, true);
			}
		}
		return map;
	}
}
