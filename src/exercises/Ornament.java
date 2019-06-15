package exercises;

import java.util.Random;

/* 
 * Create a class called Decorator that contains an ArrayList called boxOfDecorations.
 *   1. In the Decorator class, hang all the ornaments in the box.
 *   2. Add a color to the Ornament class so that your program prints Hanging a red ornament, etc.
 */

public class Ornament {
	String color;

	public Ornament() {
		Random r = new Random();
		String[] colors = { "black", "white", "red", "blue", "green", "yellow", "pink", "grey", "purple", "brown" };
		this.color = colors[r.nextInt(colors.length)];
	}

	public void hang() {
		System.out.println("Hanging a " + this.color + " ornament");

	}

}

