package com.kn.array;

public class sumOfArrayElementsObject {
	public static int arrayAddition(int[] arr) {
		// traversing
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];

		}
		return sum;
	}
}
