package Date;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ��������ϰ {
	public static boolean isSendTime(Date ʱ��) {
		// ��ǰ��ʱ��
		long ��ǰ��ʱ�� = ʱ��.getTime();
		// ������������
		long ������������ = DateUtil.getStartTimeOfDate(ʱ��).getTime();
		// һ��Сʱ�ж��ٺ���
		long Сʱ = 1000 * 60 * 60;
		// һ���Ӷ��ٺ���
		long ���� = 1000 * 60;

		List<DateBean> ���ݼ��� = new ArrayList<>();
		// ����9:20��10:00������
		DateBean ����1 = new DateBean();
		����1.setStart(��ǰ��ʱ�� + (Сʱ * 9 + ���� * 20));// 9:20
		����1.setEnd(��ǰ��ʱ�� + (Сʱ * 10));//10:00
		���ݼ���.add(����1);

		for (DateBean һ������ : ���ݼ���) {
			if (��ǰ��ʱ�� >= һ������.getStart() && ��ǰ��ʱ�� <= һ������.getEnd()) {
				return false;
			}
		}
		return true;
	}
}
