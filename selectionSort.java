package com.kn.array;

public class selectionSort {

	public int[] selection(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int min = arr[i];
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < min) {
					min = arr[j];
					index = j;

				}
				int swap = arr[i];
				arr[i] = min;
				arr[index] = swap;

			}

		}
		return arr;

	}
}
