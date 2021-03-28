import java.util.List;
import java.util.stream.Collectors;

public class NoX {

	public List<String> noX(List<String> strings) {
		strings = strings.stream()
				.map(n -> n.replace("x", ""))
				.collect(Collectors.toList());
		return strings;
	}
}
