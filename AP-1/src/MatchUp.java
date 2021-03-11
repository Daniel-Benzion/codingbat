public class MatchUp {

	public int matchUp(String[] a, String[] b) {

		int total = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i].isEmpty() || b[i].isEmpty()) continue;

			if (a[i].charAt(0) == b[i].charAt(0)) total++;

		}
		return total;
	}
}
