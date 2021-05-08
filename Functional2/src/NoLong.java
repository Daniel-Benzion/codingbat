import java.util.List;

public class NoLong {

	public List<String> noLong(List<String> strs) {
		strs.removeIf(x -> x.length() >= 4);
		return strs;
	}
}
