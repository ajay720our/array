package com.kn.array;

public class countEvenOrOddElement {
	public void countEvenOrOddElementInArray(int [] arr) {
		// traversing
		int e = 0;
		int o = 0;
		for(int i = 0;i<arr.length;i++) {
			if (arr[i]%2==0) {
				e = e+1;
				
			}
			else {
				o = o+1;
			}
			
		}
		System.out.println("number of even numbers = "+ e);
		System.out.println("number of odd numbers = "+ o);
	}
}
