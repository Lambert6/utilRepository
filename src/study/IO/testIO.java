package study.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class testIO {
	public static void main(String[] args) throws Exception {
		InputStream in = new FileInputStream("D:\\testIO\\99_尚学堂_高淇_java300集最全课程_容器_基本概念_Collection_Set_List接口介绍.wmv");
		OutputStream out = new FileOutputStream(
				"D:\\testIO2\\99_尚学堂_高淇_java300集最全课程_容器_基本概念_Collection_Set_List接口介绍.wmv");
		int len;
		byte[] buff = new byte[1024];
		long beginTime = System.currentTimeMillis();
		while ((len = in.read()) != -1) {
			out.write(buff, 0, len);
		}
		System.out.println("耗费时间:" + (System.currentTimeMillis() - beginTime));
		in.close();
		out.close();
	}
}
