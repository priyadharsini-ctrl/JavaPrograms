package collectionsPracticeDay3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapPractice_5 {

	public static void main(String[] args) {
		// Using forEachRemaining
		Map<String, Integer> map= new HashMap<String, Integer>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		map.put("D", 4);
		map.put("E", 5);
		Iterator<Entry<String, Integer>> iterator = map.entrySet().iterator();
		iterator.forEachRemaining((eachEntry)-> System.out.println(eachEntry.getKey()+"->"+eachEntry.getValue()));
	}

}
