package com.sdesheet.june14;

public class SetMatrixZerosCode {
	public static void main(String[] args) {
		// driver code
		SetMatrixZerosCode m = new SetMatrixZerosCode();
		int[][] matrix = { 
				{ 1,1,1,1 },
                { 1,0,1,1 },
                { 1,1,0,1 },
                { 0,0,0,1 }
                };
		m.setZeros(matrix);
	}
	
	// method for setting zeros
	public void setZeros(int[][] matrix) {
		int col0 = 1, rows = matrix.length, cols = matrix[0].length;
		
		// traversing inti matrix
		for (int i = 0; i < rows; i++) {
			// checking if the index is 0 or not
			if (matrix[i][0] == 0) {
				col0 = 0;
			}
			// traversing through the matrix from 1st index of row and col
			for (int j = 1; j < cols; j++) {
				if (matrix[i][j] == 0) {
					matrix[i][0] = matrix[0][j] = 0;
				}
			}
		}
		
		// reverse traversing
		for (int i = rows - 1; i >= 0; i--) {
			for (int j = cols - 1; j >= 1; j--) {
				if (matrix[i][0] == 0 || matrix[0][j] == 0) {
					matrix[i][j] = 0;
				}
			}
			if (col0 == 0)
				matrix[i][0] = 0;
		}
		
		// printing the array
		// loop through all rows
		for (int i = 0; i < matrix.length; i++) {
			// loop through all elements of current row
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
