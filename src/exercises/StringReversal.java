package exercises;

import junit.framework.TestCase;

public class StringReversal extends TestCase {
	
	/*
	 * Without using the reverse() method in StringBuffer or StringBuilder, write a
	 * string reverser that will make this unit test pass.
	 * 
	 * Then use it to decode this message: 
	 *       QcXgW9w4wQd=v?hctaw/moc.ebutuoy
	 */

	public void test() {
		assertEquals("cellardoor", reverseMe("roodrallec"));
		System.out.println(reverseMe("QcXgW9w4wQd=v?hctaw/moc.ebutuoy"));
	}
	private String reverseMe(String string) {
		String reversedString = "";
		char[] stringToChar = string.toCharArray();
		for (int i = stringToChar.length-1; i >= 0; i--) {
			reversedString += stringToChar[i];
		}
		return reversedString;
	}
	
	

}


