package arrayWeek3Day1Practice;

public class SumTwoMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix1= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] matrix2= {{9,8,7},{6,5,4},{3,2,1}};
		
		
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix2.length; j++) {
				 int[][] matrix = new int[3][3];
				matrix[i][j] = matrix1[i][j]+matrix2[i][j];
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

}
