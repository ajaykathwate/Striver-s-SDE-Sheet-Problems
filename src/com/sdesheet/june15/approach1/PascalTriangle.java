package com.sdesheet.june15.approach1;

import java.util.*;

// Approach 1

/*
Time Complexity: O(2^N)
Space complexity: O(N)

Where N denotes the number of Rows.
*/

public class PascalTriangle {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println("Approach 1: ");
		System.out.println(printPascal(n));
		
	}
	
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
		ArrayList<ArrayList<Long>> triangle = new ArrayList<ArrayList<Long>>();
		for (int i = 0; i < n; i++) {
			ArrayList<Long> add = new ArrayList<Long>();
			for (int j = 0; j <= i; j++) {
				add.add(calPascal((long) i, (long) j));
			}
			triangle.add(add);
		}
		
		return triangle;
	}

	public static long calPascal(long i, long j) {
		if (j == 0 || j == i) {
			return 1;
		} else {
			return calPascal(i - 1, j - 1) + calPascal(i - 1, j);
		}
	}

}
