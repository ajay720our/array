package com.kn.array;

import java.util.Scanner;

public class mainReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the lenght of array");
		// array creation and declaration
		int[] arr= new int[scan.nextInt()];
		for (int i = 0;i<arr.length;i++) {
			System.out.println("enter the element "+(i+1)+" = ");
			arr[i]= scan.nextInt();
			}
		// array traversing
		arrarReverseTriversing arrayTriversing = new arrarReverseTriversing();
		arrayTriversing.reverse(arr);
		
		// close scan 
		scan.close();

	}

}
