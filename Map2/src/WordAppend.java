import java.util.HashMap;
import java.util.Map;

public class WordAppend {

	public String wordAppend(String[] strings) {
		Map<String, Integer> map = new HashMap<>();
		StringBuilder sb = new StringBuilder();

		for (String str : strings) {
			if (!map.containsKey(str)) {
				map.put(str, 1);
			} else {
				sb.append(str);
				map.remove(str);
			}
		}
		return sb.toString();
	}
}
