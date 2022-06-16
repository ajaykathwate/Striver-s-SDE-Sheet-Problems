package com.sdesheet.june16.nextpermutations;

public class NextPermutation {
	
	public static void nextPermutation(int[] A) {
		// check if array is null or it's length is less than zero
		// if yes then return
		if(A == null || A.length <= 1) return;
		
		int i = A.length - 2;
		
		while(i >= 0 && A[i] >= A[i+1])i--;
		if(i >= 0) {
			int j = A.length - 1;
			while(A[j] <= A[i]) j--;
			swap(A, i, j);
		}
		reverse(A, i+1, A.length - 1);
		for(int a: A) {
			System.out.println(a);
		}
		return;
	}
	
	// swap method
	public static void swap(int[] A, int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
	
	// reverse method
	public static void reverse(int[] A, int i, int j) {
		while(i < j ) swap(A, i++, j--);
	}
	
	
	public static void main(String[] args) {
		int[] A = {1,3,2};
		// calling nextPermutation method
		nextPermutation(A);
	}
}
