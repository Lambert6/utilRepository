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
		System.out.println(a1.show(b)); // ��a1.show(b));Class A ��û��show��B obj����Bת��B�ĸ���A��ִ��A show��A obj��--->return "A and A"
		System.out.println(a1.show(c)); // ��
		System.out.println(a1.show(d)); // ��
		System.out.println(a2.show(b)); // ��a2.show(b));Class A ��û��show��B obj����Bת��B�ĸ���A��ִ��A show��A obj��,A��show ��������д,ִ��B show��A obj��--->return "B and A"
		System.out.println(a2.show(c)); // ��a2.show(c));Class A ��û��show��C obj��,Cת��C�ĸ���B,Class A ��û��show��B obj��,Bת����A��ִ��A show��A obj��,A��show ��������д,ִ��B show��A obj��--->return "B and A"
		System.out.println(a2.show(d)); // ��
		System.out.println(b.show(b)); // ��
		System.out.println(b.show(c)); // ��
		System.out.println(b.show(d)); // ��

	}

}
