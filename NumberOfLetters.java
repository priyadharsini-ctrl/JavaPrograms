package practice;

public class NumberOfLetters {

	public static void main(String[] args) {

		String s="1. It is Work from Home  not Work for Home";
		String upperCase = s.replaceAll("[^A-Z]", "");
		System.out.println("uppercase letters: " +upperCase.length());
		
		String lowerCase = s.replaceAll("[^a-z]", "");
		System.out.println("lowercase letters: " +lowerCase.length());

		String number = s.replaceAll("[^0-9]", "");
		System.out.println("Numbers in the string: " +number.length());
		
		String space = s.replaceAll("\\S", "");
		System.out.println("Total Number of spaces in the string: " +space.length());

	}

}
