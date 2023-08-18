package com.kn.array;

import java.util.Scanner;

public class mergeArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// creation and declaration
		System.out.println("enter the length of 1st array = ");
		int[] arr = new int[scan.nextInt()];
		System.out.println("enter the length of 2nd array = ");
		int[] brr = new int[scan.nextInt()];

		// inputs for 1st array
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter the 1st array element " + (i + 1) + " = ");
			arr[i] = scan.nextInt();
		}
		for (int i = 0; i < brr.length; i++) {
			System.out.println("enter the 2nd array element " + (i + 1) + " = ");
			brr[i]= scan.nextInt();
		}
		
		mergeArrayObject merge = new mergeArrayObject();
		merge.arrayMerge(arr,brr);
		scan.close();
	}

}
