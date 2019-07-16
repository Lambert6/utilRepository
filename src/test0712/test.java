package test0712;

import java.util.HashMap;
import java.util.Map;

public class test {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(1, 2);
        // 1. entrySet遍历，在键和值都需要时使用（最常用）
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
        }
	}
}
