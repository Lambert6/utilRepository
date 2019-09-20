package Date;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class 汉语编程练习 {
	public static boolean isSendTime(Date 时间) {
		// 当前的时间
		long 当前的时间 = 时间.getTime();
		// 当天的零点日期
		long 当天的零点日期 = DateUtil.getStartTimeOfDate(时间).getTime();
		// 一个小时有多少毫秒
		long 小时 = 1000 * 60 * 60;
		// 一分钟多少毫秒
		long 分钟 = 1000 * 60;

		List<DateBean> 数据集合 = new ArrayList<>();
		// 早上9:20到10:00不可以
		DateBean 对象1 = new DateBean();
		对象1.setStart(当前的时间 + (小时 * 9 + 分钟 * 20));// 9:20
		对象1.setEnd(当前的时间 + (小时 * 10));//10:00
		数据集合.add(对象1);

		for (DateBean 一个集合 : 数据集合) {
			if (当前的时间 >= 一个集合.getStart() && 当前的时间 <= 一个集合.getEnd()) {
				return false;
			}
		}
		return true;
	}
}
