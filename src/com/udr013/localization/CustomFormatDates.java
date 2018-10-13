package com.udr013.localization;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class CustomFormatDates {

	public static void main(String[] args) {
		Locale.setDefault(Locale.FRANCE);
		Date date = new Date();

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
		simpleDateFormat.applyPattern("dd-MM-YY"); // Y = 2019 YY = 19
		p(simpleDateFormat.format(date));

		p("--------------------------------------------");
		simpleDateFormat = new SimpleDateFormat("y-M-d");
		p(simpleDateFormat.format(date));
		simpleDateFormat = new SimpleDateFormat("yy-MM-dd");
		p(simpleDateFormat.format(date));
		simpleDateFormat = new SimpleDateFormat("yyy-MMM-ddd");
		p(simpleDateFormat.format(date));
		simpleDateFormat = new SimpleDateFormat("yyyy-MMMM-dddd");
		p(simpleDateFormat.format(date));

		p("--------------------------------------------");

		simpleDateFormat = new SimpleDateFormat(
				"'tijd:' HH:mm:ss z, ' Datum' dd MMMM Y 'Week: ' w  'Dag:' EEEE 'de' D'ste van het jaar'");
		p(simpleDateFormat.format(date));

		simpleDateFormat = new SimpleDateFormat("'tijd:' H:m:s Z, ' Datum' dd MMM yy G 'Dag:' E");
		p(simpleDateFormat.format(date));

	}

	static void p(String s) {
		System.out.println(s);
	}
}
