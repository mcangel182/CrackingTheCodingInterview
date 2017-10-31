package Question1_7;

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
		int[][] matrix = randomMatrix(10, 10, 0, 9);
		printMatrix(matrix);
		rotate(matrix);
		System.out.println();
		printMatrix(matrix);
	}

	
	/* Assorted methods taken from https://github.com/careercup/ctci/*/
	
	public static int randomInt(int n) {
		return (int) (Math.random() * n);
	}
	
	public static int randomIntInRange(int min, int max) {
		return randomInt(max + 1 - min) + min;
	}
	
	public static int[][] randomMatrix(int M, int N, int min, int max) {
		int[][] matrix = new int[M][N];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				matrix[i][j] = randomIntInRange(min, max);
			}
		}
		return matrix;
	}
	
	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] < 10 && matrix[i][j] > -10) {
					System.out.print(" ");
				}
				if (matrix[i][j] < 100 && matrix[i][j] > -100) {
					System.out.print(" ");
				}
				if (matrix[i][j] >= 0) {
					System.out.print(" ");
				}
				System.out.print(" " + matrix[i][j]);
			}
			System.out.println();
		}
	}
}
