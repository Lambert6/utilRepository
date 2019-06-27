package study;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class playStatic {
	public static void main(String[] args) throws IOException {
		// play012.name = "11";
		play012 p = new play012(1);
		System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024);
		System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024);
		System.out.println(Runtime.getRuntime().availableProcessors());
		System.out.println(Runtime.getRuntime().exec("cmd"));
		Runtime.getRuntime().exec("cmd.exe");
		// var a = new ArrayList<String>();
	}
}

class play012 {
	static String name = "11";
	int a;

	public play012(int a) {
		super();
		this.name = "2";
		this.a = a;
	}
}
