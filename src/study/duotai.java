package study;

public class duotai {
	static class A {
		public String show(D obj) {
			return ("A and D");
		}

		public String show(A obj) {
			return ("A and A");
		}
	}
	static class B extends A {
		public String show(B obj) {
			return ("B and B");
		}

		public String show(A obj) {
			return ("B and A");
		}
	}
	static class C extends B {
	}
	static class D extends B {
	}
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new B();
		B b = new B();
		C c = new C();
		D d = new D();
		System.out.println(a1.show(b)); // ①a1.show(b));Class A 中没有show（B obj），B转向B的父类A，执行A show（A obj）--->return "A and A"
		System.out.println(a1.show(c)); // ②
		System.out.println(a1.show(d)); // ③
		System.out.println(a2.show(b)); // ④a2.show(b));Class A 中没有show（B obj），B转向B的父类A，执行A show（A obj）,A的show 方法被重写,执行B show（A obj）--->return "B and A"
		System.out.println(a2.show(c)); // ⑤a2.show(c));Class A 中没有show（C obj）,C转向C的父类B,Class A 中没有show（B obj）,B转向父类A，执行A show（A obj）,A的show 方法被重写,执行B show（A obj）--->return "B and A"
		System.out.println(a2.show(d)); // ⑥
		System.out.println(b.show(b)); // ⑦
		System.out.println(b.show(c)); // ⑧
		System.out.println(b.show(d)); // ⑨

	}

}
