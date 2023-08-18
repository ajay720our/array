package com.kn.array;

import java.util.Scanner;

public class addArrayElementsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length of array = ");
		// array creation and declaration
		int[] arr = new int[scan.nextInt()];
		for (int i = 0; i < arr.length; i++) {

			System.out.println("Enter the element " + (i + 1) + " = ");
			arr[i] = scan.nextInt();
		}
		// traversing
		sumOfArrayElementsObject.arrayAddition(arr);
		System.out.println("sum of elements = "+sumOfArrayElementsObject.arrayAddition(arr));

		scan.close();

	}

}
// countevenoroddelement
// inarray

