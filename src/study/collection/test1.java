package study.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class test1 {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("q1");
		v.add("q2");
		Iterator i = v.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
