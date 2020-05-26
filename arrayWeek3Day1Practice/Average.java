package arrayWeek3Day1Practice;

public class Average {

	public static void main(String[] args) {
		int sum=0;
		int avg=0;
		int[] array= {20, 30, 25, 35, -16, 60, -100};
		for (int i = 0; i < array.length; i++) {
			 sum=sum+array[i];
		}
		avg=sum/array.length;
		System.out.println(avg);
	}

}
