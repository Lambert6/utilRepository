package study.IO;

import java.io.File;
import java.util.ArrayList;

public class testFilename {
	public static void main(String[] args) {
		File f = new File("F:\\Users\\65629\\Desktop\\ËÑ¹·´ÊµäÎÄ¼þ");
		if (f.isDirectory()) {
			String[] names = f.list();
			for (String a : names) {
				if (a.equals("")) {

				}
				System.out.println(a);
			}
		}
	}
}
