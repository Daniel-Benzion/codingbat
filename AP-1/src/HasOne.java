public class HasOne {

	public boolean hasOne(int n) {

		int currentDigit = 0;

		while (n > 0) {
			currentDigit = n % 10;
			if (currentDigit == 1) return true;
			n /= 10;
		}
		return false;
	}
}
