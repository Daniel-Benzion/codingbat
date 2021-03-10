public class ScoresClump {

	public boolean scoresClump(int[] scores) {
		if (scores.length < 3) return false;

		int i = 0;
		for (int j = i + 2; j < scores.length; j++) {
			if (scores[j] - scores[i] < 3) return true;
			i++;
		}
		return false;
	}
}
