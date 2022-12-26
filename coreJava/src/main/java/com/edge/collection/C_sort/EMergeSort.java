package com.edge.collection.C_sort;

public class EMergeSort {
	public static void main(String[] args) {
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
		mergeSort(intArray, 0, intArray.length);
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}

	// { 20, 35, -15, 7, 55, 1, -22 }
	public static void mergeSort(int[] input, int start, int end) {
		if (end - start < 2) return;
		int mid = (start + end) / 2;
		mergeSort(input, start, mid);
		mergeSort(input, mid, end);
		merge(input, start, mid, end);
	}

	// { 20, 35, -15, 7, 55, 1, -22 }
	public static void merge(int[] input, int start, int mid, int end) {
		//This part is optional and just for efficiency, when the biggest item of the left array is smaller than the smallest item of the right array then its already sorted .
		if (input[mid - 1] <= input[mid])return;
		// at this point it is as simple as merging two sorted array . 
		int i = start;
		int j = mid;
		int tempIndex = 0;
		int[] temp = new int[end - start];
		while (i < mid && j < end) {
			temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
		}
		System.arraycopy(input, i, input, start + tempIndex, mid - i);
		//(source,sourceIndex,target,targetIndex,length/number of elements to copy )
		//this will copy the left over elements from left side of the array to the end of the array, if leftover in right, they are already in place		
		System.arraycopy(temp, 0, input, start, tempIndex);
		//this copies from the temp array to the input array
	}
}
