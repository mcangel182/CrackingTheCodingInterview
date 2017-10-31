package Question1_7;

import Helpers.HelperMethods;

public class Question1_7 {
	
	public static void rotate(int[][] matrix) {
		int n = matrix.length-1;
		for(int i = 0; i < matrix.length/2; i++){
			for(int j = i; j < matrix.length - 1 - i; j++){
				int top = matrix[i][j];
				matrix[i][j] = matrix[n-j][i];
				matrix[n-j][i] = matrix[n-i][n-j];
				matrix[n-i][n-j] = matrix[j][n-i];
				matrix[j][n-i] = top;
			}
		}
	}
	
	public static void main(String[] args) {
		int[][] matrix = HelperMethods.randomMatrix(10, 10, 0, 9);
		HelperMethods.printMatrix(matrix);
		rotate(matrix);
		System.out.println();
		HelperMethods.printMatrix(matrix);
	}
}
