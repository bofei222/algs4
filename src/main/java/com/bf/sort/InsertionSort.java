package com.bf.sort;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
//		int[] brr = new int[10];
		int[] arr = {6,5,4,3,2,1};
		
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void sort(int[] arr) {
		int k = 0;
		int l = 0;
		for (int j = 1; j < arr.length; j++) {
			System.out.println("-----------" + ++l);
			int key = arr[j];
			int i = j - 1;
			while (i >= 0 && arr[i] > key) {
				System.out.println("======" + ++k);
				arr[i+1] = arr[i];
				i = i - 1;
			}
			arr[i+1] = key;
		}
	}
}
