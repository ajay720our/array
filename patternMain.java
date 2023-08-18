package com.kn.array;

import java.util.Scanner;

public class patternMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length = ");
		String[] arr = new String[scan.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter row" + (i + 1) + " = ");
			arr[i] = scan.next();
		}
		patternObject obj = new patternObject();
		obj.pattern(arr);
		scan.close();
	}

}
