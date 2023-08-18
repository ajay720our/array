package com.kn.array;

public class bubbleSort {

	public int[] bubble(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			boolean isSwapped = false;
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int swap = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = swap;
				}
				isSwapped = true;
			}
			if (isSwapped == false) {
				break;
			}
		}

		return arr;
		// TODO Auto-generated method stub

	}
}