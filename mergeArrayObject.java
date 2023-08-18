package com.kn.array;

public class mergeArrayObject {

	public void arrayMerge(int[] arr, int[] brr) {
		int[] crr = new int[arr.length+brr.length];
		for(int i = 0 ;i<arr.length;i++) {
			crr[i]=arr[i];
		}
		for(int i =arr.length;i<crr.length;i++) {
			for(int j=0;j<brr.length;j++)
			crr[i]=brr[j];
		}
		
		//traversing
		for(int i=0;i<crr.length;i++) {
			System.out.println(crr[i]);
		}
		
	}

}
