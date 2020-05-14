package practice;

public class SumOfNumbers {

	public static void main(String[] args) {

		String s1 = "asdf1qwer9as8d7";
		int count = 0;
		String replaceAll = s1.replaceAll("[a-z]", "");

		for (int i = 0; i < replaceAll.length(); i++) {

			char c = replaceAll.charAt(i);
			int value = Character.getNumericValue(c);
			count = count + value;
		}
		System.out.println(count);

	}

}
