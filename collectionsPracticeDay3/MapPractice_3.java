package collectionsPracticeDay3;

import java.util.HashMap;
import java.util.Map;

public class MapPractice_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map= new HashMap<String, Integer>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		map.put("D", 4);
		map.put("E", 5);
		
		map.forEach((k,v) -> System.out.println(k+"->"+v));
	}

}
