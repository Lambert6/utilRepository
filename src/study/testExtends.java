package study;

public class testExtends {

	public static void main(String[] args) {
		c t = new c();
		t.a1 = "";
	}
}

class a {
	String a1;

	public String getA1() {
		return a1;
	}

	public void setA1(String a1) {
		this.a1 = a1;
	}
}

class b extends a {
	String b1;

	public String getB1() {
		return b1;
	}

	public void setB1(String b1) {
		this.b1 = b1;
	}

}

class c extends b {
	String c1;

	public String getC1() {
		return c1;
	}

	public void setC1(String c1) {
		this.c1 = c1;
	}

}
