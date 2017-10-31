package Question1_8;

import java.util.ArrayList;
import Helpers.HelperMethods;

public class Question1_8 {
	
	public static void setZeros(int[][] matrix){
		ArrayList<Integer> rows = new ArrayList<Integer>();
		ArrayList<Integer> cols = new ArrayList<Integer>();
		
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				if (matrix[i][j] == 0){
					rows.add(i);
					cols.add(j);
				}
			}
		}
		
		for(Integer i : rows){
			for(int j = 0; j < matrix[0].length; j++){
				matrix[i][j] = 0;
			}
		}
		
		for(Integer j : cols){
			for(int i = 0; i < matrix.length; i++){
				matrix[i][j] = 0;
			}
		}
	}

	public static void main(String[] args) {
		
		int nrows = 10;
		int ncols = 15;
		int[][] matrix1 = HelperMethods.randomMatrix(nrows, ncols, 0, 100);		

		HelperMethods.printMatrix(matrix1);
		setZeros(matrix1);
		System.out.println();
		HelperMethods.printMatrix(matrix1);

	}

}
