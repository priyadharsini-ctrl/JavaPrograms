package practice;

import java.text.StringCharacterIterator;

public class Java1 {

	public static void main(String[] args) {
		
		
		// palindrome code
		/*
		 * String s="testleaf"; StringBuffer sbf = new StringBuffer(s);
		 * System.out.println("String buffer = " + sbf); StringBuffer reverse =
		 * sbf.reverse(); System.out.println("reversed" +reverse);
		 * if(s.contentEquals(reverse)) {
		 * 
		 * System.out.println("its palindrome"); } else {
		 * System.out.println("Not a palindrome"); }
		 */
		
		//Occurance of character 'o' in the string
		
		String s="You have no choice other than following me!";
		int count=0;
		char c = s.charAt(1);
		for (int i = 0; i < s.length(); i++) {
			//System.out.println(i);
			if(c==s.charAt(i)) {
				count=count+1;
			}
		}
		System.out.println(count);

		
	}
	

}
