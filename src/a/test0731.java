package a;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class test0731 {
	public static void main(String[] args) {
		Map<Integer, HashSet<Integer>> fontFailMobile = new HashMap<>();
		HashSet<Integer> temset = fontFailMobile.get(1);
		if (null == temset) {
			temset = new HashSet<>();
		}
		temset.add(5);
		fontFailMobile.put(1, temset);
		System.out.println(fontFailMobile);
	}
}
