package com.kn.array;

import java.util.Scanner;

public class BubbleDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// array declaration and creation
		System.out.println("enter the lenght of array = ");
		int[] arr = new int[scan.nextInt()];

		// initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter the element " + (i + 1) + " = ");
			arr[i] = scan.nextInt();
		}
		//traversing before sorting 
		System.out.println("Before sorting ");
		for (int i : arr) {
			System.out.print(" "+arr[i]);
			
		}
		// object creation and declaration
		bubbleSort bubble = new bubbleSort();
		bubble.bubble(arr);

		// traversing after sorting
		System.out.println("\nAfter sorting");
		for (int i : arr) {
			System.out.print(" " + arr[i]);
		}
		scan.close();
	}

}
