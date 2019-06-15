package optional;

import java.util.ArrayList;

public class PeaceOnEarth {
	public static void main(String[] args) {
		ArrayList<Character> truth = new ArrayList<Character>();
		truth.add('#');
		truth.add('g');
		truth.add('u');
		truth.add('#');
		truth.add('n');
		truth.add('s');
		truth.add(' ');
		truth.add('s');
		truth.add('#');
		truth.add('u');
		truth.add('#');
		truth.add('#');
		truth.add('c');
		truth.add('k');

		/* TODO: Remove the hash symbols and print out the truth. */
		for (int i = 0; i < truth.size(); i++) {
			if (truth.get(i).equals('#')) {
				truth.remove(i);
				i--;
			}
		}

		// 2 ways to print chars as string

		StringBuilder sb = new StringBuilder();
		for (Character ch : truth) {
			sb.append(ch);
		}
		String string = sb.toString();
		System.out.println(string);

		for (int i = 0; i < truth.size(); i++) {
			System.out.print(truth.get(i).toString());
		}
	}
}