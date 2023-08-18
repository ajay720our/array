package com.kn.array;

import java.util.Scanner;

public class evenOddCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println(" enter the length of array");
		// creation and declaration
		int[] arr = new int[scan.nextInt()];
		
		//initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the "+(i+1)+" element = ");
			arr[i]= scan.nextInt();
			}
		// object creation and declaration
		countEvenOrOddElement count = new countEvenOrOddElement();
		count.countEvenOrOddElementInArray(arr);
		
		//scan close
		scan.close();
	}

}
