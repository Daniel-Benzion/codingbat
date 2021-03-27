public class LinearIn {

	public boolean linearIn(int[] outer, int[] inner) {
		int i = 0;
		int j = 0;

		while (i < inner.length && j < outer.length) {
			if (inner[i] > outer[j]) {
				j++;
			} else if (inner[i] < outer[j]) {
				return false;
			} else {
				i++;
			}
		}

		return i == inner.length;
	}

}
