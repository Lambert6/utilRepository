package study.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class testIO {
	public static void main(String[] args) throws Exception {
		InputStream in = new FileInputStream("D:\\testIO\\99_��ѧ��_���_java300����ȫ�γ�_����_��������_Collection_Set_List�ӿڽ���.wmv");
		OutputStream out = new FileOutputStream(
				"D:\\testIO2\\99_��ѧ��_���_java300����ȫ�γ�_����_��������_Collection_Set_List�ӿڽ���.wmv");
		int len;
		byte[] buff = new byte[1024];
		long beginTime = System.currentTimeMillis();
		while ((len = in.read()) != -1) {
			out.write(buff, 0, len);
		}
		System.out.println("�ķ�ʱ��:" + (System.currentTimeMillis() - beginTime));
		in.close();
		out.close();
	}
}
