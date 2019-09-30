package basics;

import java.util.SortedSet;
import java.util.TreeSet;

public class LargestNumbersInGivenArray {

	public static void main(String[] args) {
		SecondLargestNumber();
		largestNUmber();
	}

	public static void SecondLargestNumber() {
		int[] randomIntegers = { 1, 5, 4, 2, 8, 1, 8, 9, 9 };
		SortedSet<Integer> set = new TreeSet<Integer>();
		for (int i : randomIntegers) {
			set.add(i);
		}
		// Remove the maximum value; print the largest remaining item
		set.remove(set.last());
		System.out.println(set.last());
	}

	public static void largestNUmber() {
		int[] randomIntegers = { 1, 5, 4, 2, 8, 1, 8, 9, 9 };
		SortedSet<Integer> set = new TreeSet<Integer>();
		for (int i : randomIntegers) {
			set.add(i);
		}

		System.out.println(set.last());
	}

}
