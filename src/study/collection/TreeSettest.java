package study.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class TreeSettest {
	public static void main(String[] args) {
		TreeSet<Map<Integer,Integer>> s = new TreeSet<>();
		Map<Integer,Integer> m = new HashMap<>();
		m.put(1, 10);
		s.add(m);
		Map<Integer,Integer> m1 = new HashMap<>();
		m.put(2, 12);
		s.add(m1);
		System.out.println(s);
	}
}
