package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class test1021 {
	public static void main(String[] args) {
		String s = "Mon Oct 21 12:33:00 CST 2019";
		SimpleDateFormat date1 = new SimpleDateFormat("EEE MMM dd hh:mm:ss zzz yyyy", Locale.US);
		try {
			System.out.println(date1.parse(s));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		SimpleDateFormat foo = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date oldDate1 = null;
		try {
		    oldDate1 = foo.parse("2019-10-21 12:40");
		} catch (ParseException e) {
		    e.printStackTrace();
		}
		System.out.println(oldDate1);
		
		
	}
}
