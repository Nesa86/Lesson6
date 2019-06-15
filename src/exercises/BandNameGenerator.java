package exercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Random;

/* 
 * Make 2 ArrayLists; 
 *      1 full of adjectives (e.g. slimy, blind)
 *      1 full of plural nouns (e.g. pants, bones)
 *      
 * When the program is run, one word is randomly selected from each list to generate a band name.
*/
public class BandNameGenerator {
	public static ArrayList<String> listFromFile(String path) {
		int lines;
		ArrayList<String> words = new ArrayList<>();
		try {
			LineNumberReader lnr = new LineNumberReader(new FileReader(new File(path)));
			lnr.skip(Long.MAX_VALUE);
			lines = lnr.getLineNumber();
			lnr.close();
			BufferedReader br = new BufferedReader(new FileReader(new File(path)));
			for (int i = 0; i < lines; i++) {
				words.add(br.readLine());
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return words;
	}

	public static void main(String[] args) {
		Random random = new Random();
		ArrayList<String> adjectives = listFromFile("src/exercises/adjectives.txt");
		ArrayList<String> nouns = listFromFile("src/exercises/nouns.txt");
		System.out.println(adjectives.get(random.nextInt(adjectives.size() - 1)) + " "
				+ nouns.get(random.nextInt(nouns.size() - 1)));
	}

}