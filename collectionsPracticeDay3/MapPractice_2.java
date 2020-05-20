package collectionsPracticeDay3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapPractice_2 {

	public static void main(String[] args) {

		Map<String, Integer> map= new HashMap<String, Integer>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		map.put("D", 4);
		map.put("E", 5);
		Set<Entry<String, Integer>> set = map.entrySet();
		
		Iterator<Entry<String, Integer>> iterator = set.iterator();
		while(iterator.hasNext()) {
		Map.Entry entry =(Map.Entry)iterator.next();
		System.out.println(entry.getKey()+"->"+entry.getValue());
		}
	}

}
