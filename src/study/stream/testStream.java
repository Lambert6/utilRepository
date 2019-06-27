package study.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import suanfa.face.StrBean;

public class testStream {
	public static void main(String[] args) {
		List<StrBean> list = new ArrayList<>();
		StrBean s = new StrBean("c", 11);
		StrBean s1 = new StrBean("a", 9);
		StrBean s2 = new StrBean("b", 56);
		StrBean s3 = new StrBean("c", 11);
		list.add(s);
		list.add(s1);
		list.add(s2);
		list.add(s3);

		long c =  list.parallelStream().filter(p -> p.getHz() > 11).count();
		System.out.println(c);
		

	}
}
