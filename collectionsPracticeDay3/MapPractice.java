package collectionsPracticeDay3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapPractice {

	public static void main(String[] args) {

		Map<String, Integer> map= new HashMap<String, Integer>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		map.put("D", 4);
		map.put("E", 5);
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() +"->"+ m.getValue());
		}
		
		
	}

}
