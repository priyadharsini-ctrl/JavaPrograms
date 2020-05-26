package arrayWeek3Day1Practice;

import java.util.Arrays;

public class ArrayPrac {

	public static void main(String[] args) {

		int[] array = {5,1,33,79,22,11,45};
		Arrays.sort(array);
			System.out.println(Arrays.toString(array));
		for (int  i = array.length-1; i>=0; i--) {
			System.out.println(array[i]);
		}
	}

}
