package com.sdesheet.june15.approach2;

import java.util.*;
// Approach 2

/*
Time Complexity: O(N^2)
Space complexity: O(N^2)

Where N denotes the number of Rows.
*/

public class PascalTriangle {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println("Approach 2: ");
		System.out.println(printPascal(n));
		
	}

	public static ArrayList<ArrayList<Long>> printPascal(int n) {
		ArrayList<ArrayList<Long>> triangle = new ArrayList<ArrayList<Long>>();

		for (int row = 0; row < n; row++) {
			ArrayList<Long> add = new ArrayList<Long>();
			for (int i = 0; i <= row; i++) {
				if (row == i || i == 0) {
					add.add((long) 1);
				} else {
					add.add(triangle.get(row - 1).get(i - 1) + triangle.get(row - 1).get(i));
				}
			}
			triangle.add(add);
		}
		return triangle;
	}
	
}
