package com.kn.array;

public class binary {

	public void binarySearch(int[] arr, int element) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("element at position " + (i + 1) + " is = " + arr[i]);
		}

		int mid = 0;
		int l = 0, h = arr.length;
		int a = 0;
		while (l <= h) {
			mid = (l + h) / 2;
			if (element == arr[mid]) {
				a = 1;
				break;
			} else if (element >= arr[mid]) {
				l = mid + 1;

			} else {
				h = mid - 1;
			}

		}
		if (a == 1) {
			System.out.println("element found is = " + element + " at position = " + (mid + 1));
		} else {
			System.out.println("element not found");
		}

	}

}
