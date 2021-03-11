public class DividesSelf {

	public boolean dividesSelf(int n) {
		int nCheck = n;
		while (n > 0) {
			int currentDigit = n % 10;
			if (currentDigit == 0) {
				return false;
			}
			if (nCheck % currentDigit != 0) return false;
			n /= 10;
		}
		return true;
	}
}
