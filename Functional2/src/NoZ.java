import java.util.List;

public class NoZ {

	public List<String> noZ(List<String> strs) {
		strs.removeIf(x -> x.contains("z"));
		return strs;
	}

}
