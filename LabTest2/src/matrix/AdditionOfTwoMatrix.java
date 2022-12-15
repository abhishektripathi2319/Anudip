package matrix;

public class AdditionOfTwoMatrix {

	public static void main(String[] args) {
		//initialization of matrix1
		int[][] matrix1 = {
				{10,20,30},
				{40,50,60},
				{70,80,90}
		};
		//initialization of matrix2
		int[][] matrix2 = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		//Declaration of sumMatrix
		int[][] sumMatrix = new int[3][3];
		for(int i=0;i<matrix1.length;i++) {
			for(int j = 0;j<matrix1[i].length;j++) {
				sumMatrix[i][j] = matrix1[i][j]+matrix2[i][j];
			}
		}
		for(int i = 0;i<sumMatrix.length;i++) {
			for(int x:sumMatrix[i]) {
				System.out.print(x+" ");
			}
			System.out.println();
		}
	}

}
