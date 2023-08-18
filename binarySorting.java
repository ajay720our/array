package com.kn.array;

import java.util.Scanner;

public class binarySorting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// declaration and creation
		System.out.println("enter the lenght of array = ");
		int[] arr = new int[scan.nextInt()];
		

		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter the element " + (i + 1) + " = ");
			arr[i] = scan.nextInt();
		}
		System.out.println("enter the element for search = ");
		int element = scan.nextInt();
		
				binary binarySe = new binary();
		binarySe.binarySearch(arr, element);
		scan.close();
	}

}
