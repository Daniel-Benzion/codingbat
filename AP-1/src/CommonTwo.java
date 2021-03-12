import java.util.ArrayList;

public class CommonTwo {

	public int commonTwo(String[] a, String[] b) {
		int sum = 0;
		ArrayList<String> checker = new ArrayList<>();
		for (String s : b) {
			for (String value : a) {
				if (value.equals(s) && !checker.contains(value)) {
					checker.add(value);
					sum++;
				}
			}
		}
		return sum;
	}
}
