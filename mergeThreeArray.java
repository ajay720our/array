package com.kn.array;

import java.util.Scanner;

public class mergeThreeArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// array creation and declaration
		System.out.println("enter the length of array 1 = ");
		int[] arr = new int[scan.nextInt()];
		System.out.println("enter the length of array 2 = ");
		int[] brr = new int[scan.nextInt()];
		System.out.println("enter the lenght of array 3 = ");
		int[] crr = new int[scan.nextInt()];

		// initialization for arr
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter the 1st array element" + (i + 1) + " = ");
			arr[i] = scan.nextInt();
		}
		// initialization for brr
		for (int i = 0; i < brr.length; i++) {
			System.out.println("enter the 2nd array element" + (i + 1) + " = ");
			brr[i] = scan.nextInt();
		}
		// initialization for crr
		for (int i = 0; i < crr.length; i++) {
			System.out.println("enter the 3rd array element" + (i + 1) + " = ");
			crr[i] = scan.nextInt();
		}
		// method creation

		int[] drr = merge(arr, brr, crr);

		// traversing
		for (int i = 0; i < drr.length; i++) {
			System.out.println(drr[i]);
		}
		scan.close();
	}

	public static int[] merge(int[] arr, int[] brr, int[] crr) {
		int[] drr = new int[arr.length + brr.length + crr.length];

		for (int i = 0; i < arr.length; i++) {
			drr[i] = arr[i];
		}
		
		for (int i = 0; i < brr.length; i++) {
				drr[arr.length+i] = brr[i];
			

		}
		for (int i = 0; i < crr.length; i++) {
			
				drr[arr.length+brr.length+i] = crr[i];
			
		}

		return drr;
	}

}
