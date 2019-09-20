package a;

import java.util.HashSet;
import java.util.Set;

public class test {
	public static void main(String[] args) {
		Set<Integer> a = new HashSet<>();
		Integer s = 9;
		a.add(s);
		Integer b = 9;
		if(b == s) {
			System.out.println("111111");
		}else {
			System.out.println("22222");
		}
	}
}
