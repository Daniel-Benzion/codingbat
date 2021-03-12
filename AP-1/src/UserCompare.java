public class UserCompare {

	public int userCompare(String aName, int aId, String bName, int bId) {
		if (aName.compareTo(bName) == 0) {
			return Integer.compare(aId, bId);
		}
		return Integer.compare(aName.compareTo(bName), 0);
	}
}
