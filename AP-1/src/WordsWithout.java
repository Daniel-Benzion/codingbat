public class WordsWithout {

	public String[] wordsWithout(String[] words, String target) {

		int len = 0;

		for (String word : words) {
			if (!word.equals(target)) {
				len++;
			}
		}

		String[] result = new String[len];
		int index = 0;

		for (int i = 0; i < words.length; i++) {
			if (!words[i].equals(target)) {
				result[index] = words[i];
				index++;
			}
		}
		return result;
	}
}
