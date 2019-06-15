package exercises;

import java.util.ArrayList;

public class Decorator {

	public static void main(String[] args) {
		ArrayList<Ornament> boxOfDecorations = new ArrayList<Ornament>();

		for (int i = 0; i < 20; i++) {
			boxOfDecorations.add(new Ornament());
			boxOfDecorations.get(i).hang();
		}
	}

}