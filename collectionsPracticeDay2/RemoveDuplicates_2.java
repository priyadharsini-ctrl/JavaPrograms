package collectionsPracticeDay2;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates_2 {

	public static void main(String[] args) {
		List<String> str = new ArrayList<String>();
		str.add("A");
		str.add("B");
		str.add("C");
		str.add("D");
		str.add("A");
		str.add("D");
		str.add("E");
		str.add("F");
		List<String> ls = new ArrayList<String>(str);

		for (int i = 0; i < str.size(); i++) {
			int count = 0;
			String eachString = str.get(i);
			for (int j = 0; j < ls.size(); j++) {
				if (ls.get(j) == eachString) {
					count++;
				}
			}

			if (count > 1) {
				ls.remove(eachString);
			}

		}
		System.out.println(ls);

	}

}
