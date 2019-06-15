package optional;

import java.util.ArrayList;

public class LearningArrayLists {

	public static Object createArrayList() {
		return new ArrayList();
	}

	public static void addToArrayList(ArrayList testList, String string) {
		testList.add(string);

	}

	public static Object getNumberOfItems(ArrayList testList) {
		return testList.size();
	}

	public static Object getItem(ArrayList testList, int i) {
		return testList.get(i);
	}

	public static String iterateOver(ArrayList testList) {
		String iteration = "";
		for (int i = 0; i < testList.size(); i++) {
			iteration += testList.get(i);
		}
		return iteration;
	}

	public static Object findItemOnList(ArrayList testList, String string) {
		return testList.indexOf(string);
	}

	public static void replaceItem(ArrayList testList, int i, String string) {
		testList.remove(i);
		testList.add(i, string);
	}

	public static void insertItem(ArrayList testList, int i, String string) {
		testList.add(i, string);
	}

	public static ArrayList<Integer> createTypedArrayList() {
		ArrayList<Integer> testList = new ArrayList<Integer>();
		return testList;
	}

	public static Object addAllInteger(ArrayList<Integer> testList) {
		int sum = testList.get(0);
		for (int i = 1; i < testList.size(); i++) {
			sum += testList.get(i);
		}
		return sum;

	}

	public static ArrayList<String> createStringTypedArrayList() {
		ArrayList<String> testList = new ArrayList<String>();
		return testList;
	}

	public static String addAllString(ArrayList<String> testList) {
		String all = testList.get(0);
		for (int i = 1; i < testList.size(); i++) {
			all += testList.get(i);
		}
		return all;
	}
}