public class MergeTwo {

	public String[] mergeTwo(String[] a, String[] b, int n) {
		String[] result = new String[n];
		int aIndex = 0;
		int bIndex = 0;

		for (int index = 0; index < n; index++) {
			if (a[aIndex].compareTo(b[bIndex]) < 0) {
				result[index] = a[aIndex];
				aIndex++;
			} else if (a[aIndex].compareTo(b[bIndex]) > 0) {
				result[index] = b[bIndex];
				bIndex++;
			} else {
				result[index] = a[aIndex];
				aIndex++;
				bIndex++;
			}
		}
		return result;
	}
}
