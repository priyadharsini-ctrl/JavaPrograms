package collectionsPracticeDay2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ValFromSet_2 {

	public static void main(String[] args) {
		Set<Integer> s = new LinkedHashSet<Integer>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		s.add(6);
		s.add(7);
		s.add(8);
		s.add(9);
		List<Integer> ls = new ArrayList<Integer>(s);
		System.out.println(ls.get(6));
	}

}
