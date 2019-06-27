package study.IO;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class testIO2 extends JFrame {
	public static void main(String[] args) {
		String path = "F:/Users/65629/Desktop/ËÑ¹·´ÊµäÎÄ¼þ";
		File f = new File(path);
		if (f.isDirectory()) {
			String names[] = f.list();
			List<String> n = new ArrayList<>();
			for (String a : names) {
				// if(a.endsWith(".csv")) {
				n.add(a);
				// }
				System.out.println(a);
			}
			for (String s : n) {

				// System.out.println(deleteFile(path+"\\"+s));
			}
		}
	}

	public static boolean deleteFile(String file) {
		File f = new File(file);
		if (f.exists()) {
			f.delete();
			return true;
		}
		return false;

	}
}
