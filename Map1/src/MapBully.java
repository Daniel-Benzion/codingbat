import java.util.Map;

public class MapBully {

	public Map<String, String> mapBully(Map<String, String> map) {
		if (map.containsKey("a") && !map.get("a").equals("")) {
			map.put("b", map.get("a"));
			map.put("a", "");
		}
		return map;
	}
}
