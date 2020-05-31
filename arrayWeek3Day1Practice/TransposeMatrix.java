package arrayWeek3Day1Practice;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int array[][] ={{1,2,3},{4,5,6},{7,8,9}};

		/*
		 * for (int[] is : array) { for (int is2 : is) { //System.out.print(is2 +" ");
		 * 
		 * } }
		 */
	System.out.println("Original Matrix");

	for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array.length; j++) {
			System.out.print(array[i][j] + " ");
		}
		System.out.println();

	}
	System.out.println("Transpose Matrix");

	for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j][i]+" ");
		}
		System.out.println();
	}
	}

}
