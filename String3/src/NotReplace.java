public class NotReplace {

	public String notReplace(String str) {
		StringBuilder result = new StringBuilder();
		str = " " + str + "  ";
		for (int i = 0; i <= str.length() - 2; i++) {
			if (str.substring(i, i + 2).equals("is") && !(Character.isLetter(str.charAt(i - 1)))
					&& (!Character.isLetter(str.charAt(i + 2)))) {
				result.append("is not");
				i = i + 1;
			} else {
				result.append(str.charAt(i));
			}
		}
		return result.substring(1, result.length() - 1);
	}

}
