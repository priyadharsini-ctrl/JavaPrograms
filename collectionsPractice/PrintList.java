package collectionsPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class PrintList {

	public static void main(String[] args) {
		String s="Bugatti chiron";
		List<Character> ls= new ArrayList<Character>();
		/*
		 * ls.add("B"); ls.add("u"); ls.add("g"); ls.add("a"); ls.add("t"); ls.add("t");
		 * ls.add("i"); ls.add(" "); ls.add("c"); ls.add("h"); ls.add("i"); ls.add("r");
		 * ls.add("o"); ls.add("n");
		 */
		
		for (int i = 0; i < s.length(); i++) {
			ls.add(s.charAt(i));
		}
		
		System.out.println("for loop");
		for (int i = 0; i < ls.size(); i++) {
			System.out.println(ls.get(i));
		}
		System.out.println("ForEach loop");
		for (Character string : ls) {
			System.out.println(string);
		}
		System.out.println("while loop");
		int i=0;
		while(i<ls.size()) {
			System.out.println(ls.get(i));
			i++;
		}
		System.out.println("Iterator");
		Iterator<Character> iterator = ls.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("ListIterator");
		ListIterator<Character> listIterator = ls.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
	}

}
