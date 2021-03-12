public class MergeTwo {

	public String[] mergeTwo(String[] a, String[] b, int n) {
		String[] result = new String[n];
		int aIndex = 0;
		int bIndex = 0;

		for (int i = 0; i < n; i++) {
			if (a[aIndex].compareTo(b[bIndex]) < 0) {
				result[i] = a[aIndex];
				aIndex++;
			} else if (a[aIndex].compareTo(b[bIndex]) > 0) {
				result[i] = b[bIndex];
				bIndex++;
			} else {
				result[i] = a[aIndex];
				aIndex++;
				bIndex++;
			}
		}
		return result;
	}
}
