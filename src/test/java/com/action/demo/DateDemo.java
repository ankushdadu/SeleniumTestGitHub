package com.action.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateDemo {

	public static void main(String arg[]) throws ParseException{
		Date date = new Date();
		System.out.println("date :"+date.toString());
		
		SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		System.out.println("formatted date: "+ft.format(date));
		
		System.out.println("time : "+date.getTime());
		
		//difference in time in milliseconds
		String time1 = "16:00:00";
		String time2 = "19:00:00";
		
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		Date date1 = sdf.parse(time1);
		Date date2 = sdf.parse(time2);
		long difference = date2.getTime() - date1.getTime();
		System.out.println("time difference: "+difference);
		Date date3 = sdf.parse("16:00:00");
		if(date1.compareTo(date2)>0) {
			System.out.println("date1 after date2");
		}
		if(date1.compareTo(date3)==0) {
			System.out.println("date1 and date3 are equal");
		}
		
		if(date2.compareTo(date3)>0) {
			System.out.println("date2 after date 3");
		}
		
		Calendar calendar = new GregorianCalendar();
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
		int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);
		
		System.out.println("year" +year);
		System.out.println("month" +month);
		System.out.println("dayOfMonth" +dayOfMonth);
		System.out.println("dayOfWeek" +dayOfWeek);
		System.out.println("weekOfYear" +weekOfYear);
		System.out.println("weekOfMonth" +weekOfMonth);
		
		int hour = calendar.get(Calendar.HOUR);
		int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		int millisecond = calendar.get(Calendar.MILLISECOND);
		
		System.out.println("hour" +hour);
		System.out.println("hourOfDay" +hourOfDay);
		System.out.println("minute" +minute);
		System.out.println("second" +second);
		System.out.println("millisecond" +millisecond);
		
		calendar.add(Calendar.DAY_OF_MONTH, 1);
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		
		
	}
}
 