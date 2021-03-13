import java.util.Map;
import java.util.HashMap;

public class Word0 {

	public Map<String, Integer> word0(String[] strings) {
		Map<String, Integer> map = new HashMap<>();
		for (String key : strings) {
			map.put(key, 0);
		}
		return map;
	}
}
