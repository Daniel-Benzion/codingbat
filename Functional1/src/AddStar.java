import java.util.List;

public class AddStar {

	public List<String> addStar(List<String> strings) {
		strings.replaceAll(s -> s + "*");
		return strings;
	}
}
