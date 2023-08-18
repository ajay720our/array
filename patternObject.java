package com.kn.array;

public class patternObject {
	public void pattern(String[] arr) {
		System.out.println("*");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("*");
			for (int j = 0; j <= i; j++) {
				System.out.print(" " + arr[i]);
			}
			System.out.println(" * ");

		}
	}
}
