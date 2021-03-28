import java.util.List;

public class Doubling {

	public List<Integer> doubling(List<Integer> nums) {
		nums.replaceAll(num -> num * 2);
		return nums;
	}
}
