import java.util.HashMap;
import java.util.Map;

public class FirstSwap {

	public String[] firstSwap(String[] strings) {
		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i < strings.length - 1; i++) {
			if (!map.containsKey(strings[i].substring(0, 1))) {
				map.put(strings[i].substring(0, 1), 1);
				for (int j = i + 1; j < strings.length; j++) {
					if (strings[i].substring(0, 1).equals(strings[j].substring(0, 1))) {
						String temp = strings[i];
						strings[i] = strings[j];
						strings[j] =  temp;
						break;
					}
				}
			}
		}
		return strings;
	}
}
