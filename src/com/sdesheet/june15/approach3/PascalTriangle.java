package com.sdesheet.june15.approach3;

import java.util.*;

// Approach 3

/*
Time Complexity: O(N^2)
Space complexity: O(1)

Where N denotes the number of Rows.
*/


public class PascalTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println("Approach 3: ");
		System.out.println(printPascal(n));
		
	}
	
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
		ArrayList<ArrayList<Long>> triangle = new ArrayList<ArrayList<Long>>();

		for (int row = 1; row <= n; row++) {
			long rCe = 1;
			ArrayList<Long> add = new ArrayList<Long>();
			for (int i = 1; i <= row; i++) {

				add.add(rCe);
				rCe = rCe * (row - (long) i) / (long) i;
			}
			triangle.add(add);
		}
		return triangle;
	}
	
}
