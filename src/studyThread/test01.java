package studyThread;

public class test01 {
	public static void main(String[] args) {
		testThread01 t = new testThread01(1);
		testThread01 t2 = new testThread01(2);
		t.start();
		t2.start();
		while (true) {
			System.out.println("��ͨ���С�������������������������������������������");
		}
	}
}

class testThread01 extends Thread {
	int a;

	public testThread01(int a) {// ����������Ĺ��캯��,�ﵽ��ʼ���߳��ڱ�����ֵ
		this.a = a;
	}

	public void run() {
		while (true) {
			this.a++;
			System.out.println("�߳���������+++++++++" + this.a++);
		}
	}
}
