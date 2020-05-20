package collectionsPracticeDay2;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String s ="A,B,C,D,A,D,E,F";
		List<Character> ls= new ArrayList<Character>();

		for (int i = 0; i < s.length(); i++) {
			//ls.add(s.charAt(i));
			if(!ls.contains(s.charAt(i))) {
				ls.add(s.charAt(i));
			}else {
			System.out.print(s.charAt(i));
			}
		}
		
	}

}
