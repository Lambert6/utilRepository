package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DateSubstract {
	public static void main(String[] args) throws ParseException {
		List<Map<String, Date>> resultlist = new ArrayList<>();
		Date start = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-07-01 00:00:00");
		Date end = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-07-05 00:00:00");
		int between = Integer.valueOf((String.valueOf((end.getTime() - start.getTime()) / (1000 * 60 * 60 * 24))));
		System.out.println(between);
		Date flag = start;
		for (int i = 0; i <= between; i++) {
			Map<String, Date> map = new HashMap<>();
			// System.out.println("第" + i + "次循环");
			Date temStart = DateUtil.getStartTimeOfDate(flag);
			// System.out.println("开始日期" + temStart);
			Date temEnd = DateUtil.getEndTimeOfDate(flag);
			// System.out.println("结束日期" + temEnd);
			// long temflag = ;
			flag = new Date((flag.getTime() + (1000 * 60 * 60 * 24)));
			map.put("start", temStart);
			map.put("end", temEnd);
			resultlist.add(map);
		}
		
		for(Map<String, Date> m : resultlist) {
			System.out.println(m);
		}
	}
}
