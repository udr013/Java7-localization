package com.udr013.localization;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class CalendarDates {

	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance(Locale.FRANCE);
		System.out.println(calendar.getTime());

		calendar.set(Calendar.ERA, 0); // ERA
		calendar.set(Calendar.YEAR, 2018); // year
		calendar.set(Calendar.MONTH, Calendar.JULY); // month 0 based , use the constants
		calendar.set(Calendar.WEEK_OF_YEAR, 1);
		calendar.set(Calendar.WEEK_OF_MONTH, 7);
		calendar.set(Calendar.DATE, 18);
		calendar.set(Calendar.DAY_OF_YEAR, 180);
		calendar.set(Calendar.DAY_OF_WEEK, 3);
		calendar.set(Calendar.DAY_OF_WEEK_IN_MONTH, 4);
		calendar.set(Calendar.AM_PM, 0);
		calendar.set(Calendar.HOUR, 11);
		calendar.set(Calendar.HOUR_OF_DAY,1); // will override AM/PM
		calendar.set(Calendar.MINUTE, 54);
		calendar.set(Calendar.SECOND, 33);
		calendar.set(Calendar.MILLISECOND, 18);
		calendar.set(Calendar.ZONE_OFFSET, 4);
		calendar.set(Calendar.DST_OFFSET, 5); // not sure about this

		Date date = calendar.getTime();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);
		System.out.println(dateFormat.format(date));

		calendar.set(2017, Calendar.JULY, 18, 21, 56, 11);
		System.out.println(dateFormat.format(calendar.getTime()));
	}

}
