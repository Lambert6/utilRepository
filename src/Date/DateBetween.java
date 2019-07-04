package Date;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DateBetween {
	public static List<Map<String, Date>> getDateBetween(Date start, Date end) {
		List<Map<String, Date>> resultlist = new ArrayList<>();
		start = DateUtil.getStartTimeOfDate(start);
		end = DateUtil.getStartTimeOfDate(end);
		int between = Integer.valueOf((String.valueOf((end.getTime() - start.getTime()) / (1000 * 60 * 60 * 24))));
		Date flag = start;
		for (int i = 0; i <= between; i++) {
			Map<String, Date> map = new HashMap<>();
			Date temStart = DateUtil.getStartTimeOfDate(flag);
			Date temEnd = DateUtil.getEndTimeOfDate(flag);
			flag = new Date((flag.getTime() + (1000 * 60 * 60 * 24)));
			map.put("start", temStart);
			map.put("end", temEnd);
			resultlist.add(map);
		}
		return resultlist;
	}
}
