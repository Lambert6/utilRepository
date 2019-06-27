package study;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestLambda {
	public static void main(String[] args) {
		String[] atp = { "Rafael Nadal", "Novak Djokovic", "Stanislas Wawrinka", "David Ferrer", "Roger Federer",
				"Andy Murray", "Tomas Berdych", "Juan Martin Del Potro" };
		

//		// ��ǰ��ѭ����ʽ
//		for (String player : players) {
//			System.out.print(player + "; ");
//		}
		String[] layers = {"Rafael Nadal", "Novak Djokovic",   
			    "Stanislas Wawrinka", "David Ferrer",  
			    "Roger Federer", "Andy Murray",  
			    "Tomas Berdych", "Juan Martin Del Potro",  
			    "Richard Gasquet", "John Isner"};  
		// ʹ�� lambda ���ʽ�Լ���������(functional operation)  
		Arrays.sort(layers,(String s1, String s2) -> (s1.compareTo(s2)));  
		List<String> players = Arrays.asList(layers);
		//players.forEach((player) -> System.out.print(player + "; "));  
		players.forEach((String player) -> System.out.print(player + "; "));  
	}
}
