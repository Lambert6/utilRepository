package Date;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DateTest {

	public static void main(String[] args) {
		System.out.println(isSendTime(new Date()));
	}

	public static boolean isSendTime(Date now) {
		// 当前的时间
		long realnow = now.getTime();
		// 当天的零点日期
		long day = DateUtil.getStartTimeOfDate(now).getTime();
		// 一个小时有多少毫秒
		long hour = 1000 * 60 * 60;
		// 一分钟多少毫秒
		long min = 1000 * 60;

		List<DateBean> datelist = new ArrayList<>();
		// 早上9:20到10:00不可以
		DateBean d1 = new DateBean();
		d1.setStart(day + (hour * 9 + min * 20));// 9:20
		d1.setEnd(day + (hour * 10));//10:00
		datelist.add(d1);

		for (DateBean d : datelist) {
			if (realnow >= d.getStart() && realnow <= d.getEnd()) {
				return false;
			}
		}
		return true;
	}

}
