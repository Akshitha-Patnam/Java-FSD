package com.arrys;

import java.util.Arrays;
import java.util.List;

public class ArrayDemo2 {
	
	public static void main(String[] args) {
		
		Integer[] arr = {15,22,3,43,3,25,6};
		
		System.out.println("before sorting array : ");
		
		for(int x : arr)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		Arrays.sort(arr);
		System.out.println("after sorting array : ");
		
		for(int y : arr)
		{
			System.out.print(y+" ");
		}
		
		String[] names = new String[5];
		names[0] = "java";
		int[][] arr1 = new int[3][3];
		
		//array to list
		
		List<Integer> list = Arrays.asList(arr);
		
		Arrays.binarySearch(arr, 20);
		
	}
}
