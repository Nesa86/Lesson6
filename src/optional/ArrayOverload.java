package optional;

import java.util.ArrayList;
import java.util.Random;

/* Burst an ArrayList by putting so many things into it that you cause an OutOfMemory error. */

public class ArrayOverload {
	public static void main(String[] args) {

		Random r = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (true) {
			list.add(r.nextInt());
		}

	}
}