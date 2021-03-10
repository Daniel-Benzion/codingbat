public class WordsCount {

	public int wordsCount(String[] words, int len) {
		int total = 0;

		for (String word : words) {
			if (word.length() == len) total++;
		}


		return total;
	}
}
