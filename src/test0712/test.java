package test0712;

import java.util.HashMap;
import java.util.Map;

public class test {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(1, 2);
        // 1. entrySet�������ڼ���ֵ����Ҫʱʹ�ã���ã�
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
        }
	}
}
