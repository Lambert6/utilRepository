package Date;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DateTest {

	public static void main(String[] args) {
		System.out.println(isSendTime(new Date()));
	}

	public static boolean isSendTime(Date now) {
		// ��ǰ��ʱ��
		long realnow = now.getTime();
		// ������������
		long day = DateUtil.getStartTimeOfDate(now).getTime();
		// һ��Сʱ�ж��ٺ���
		long hour = 1000 * 60 * 60;
		// һ���Ӷ��ٺ���
		long min = 1000 * 60;

		List<DateBean> datelist = new ArrayList<>();
		// ����9:20��10:00������
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
