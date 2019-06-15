package exercises;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Algorithms {

	static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			String egg = eggs.get(i);
			if (egg.contains("crack")) {
				return i;
			}
		}
		return -1;
	}

	public static Object countPearls(List<Boolean> oysters) {
		int counter = 0;
		for (int i = 0; i < oysters.size(); i++) {
			Boolean oyster = oysters.get(i);
			if (oyster) {
				counter++;
			}
		}
		return counter;
	}

	public static double findTallest(List<Double> peeps) {
		Double max = peeps.get(0);
		for (int i = 0; i < peeps.size(); i++) {
			if (max < peeps.get(i)) {
				max = peeps.get(i);
			}
		}
		return max;
	}

	public static String findLongestWord(List<String> words) {
		String longestWord = words.get(0);
		for (int i = 0; i < words.size(); i++) {
			if (longestWord.length() < words.get(i).length()) {
				longestWord = words.get(i);
			}
		}
		return longestWord;
	}

	public static Object containsSOS(List<String> message) {
		Boolean b = false;
		for (int i = 0; i < message.size(); i++) {
			if (message.get(i).contains("... --- ...")) {
				b = true;
			}

		}
		return b;
	}

	public static List<Double> sortScores(List<Double> results) {
		Collections.sort(results);
		return results;
	}

	public static Object sortDNA(List<String> unsortedSequences) {
		Collections.sort(unsortedSequences, Comparator.comparing(String::length));
		return unsortedSequences;
	}

	public static List<String> sortWords(List<String> words) {
		Collections.sort(words);
		return words;
	}

}