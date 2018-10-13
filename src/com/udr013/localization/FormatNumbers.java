package com.udr013.localization;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class FormatNumbers {

	public static void main(String[] args) {
		double num = 1234.1111;

		defaultLocale(num);
		specificLocale(Locale.UK, num);
		specificLocale(Locale.GERMANY, num);
		specificLocale(Locale.JAPAN, num);
		specificLocale(Locale.FRANCE, num);
		// specificLocale(Locale.US, num);
	}

	private static void defaultLocale(double num) {

		// DecimalFormat nfDefault = NumberFormat.getInstance(); //not allowed
		// NumberFormat nfDefault = DecimalFormat.getInstance();
		NumberFormat nfDefault = NumberFormat.getInstance();
		NumberFormat curDefault = NumberFormat.getCurrencyInstance();
		p("\nDefault Locale");
		p("formatting as number: " + nfDefault.format(num));

		try {
			p("parsing : " + nfDefault.parse("1234.1111"));
		} catch (ParseException e) {
			p(e.toString());
		}

		p("formatting as currency: " + nfDefault.getCurrency());
		p(curDefault.format(num) + "\n");
	}

	private static void specificLocale(Locale locale, double num) {
		// parsing the locale to the overloaded get methods
		NumberFormat nfSpecific = NumberFormat.getInstance(locale);
		NumberFormat curSpecific = NumberFormat.getCurrencyInstance(locale);
		p("\nLocale: " + locale.getDisplayCountry());
		p("formatting: " + nfSpecific.format(num));

		try {
			p("parsing : " + nfSpecific.parse("1234.1111"));
		} catch (ParseException e) {
			p(e.toString());
		}
		p("formatting as currency: " + curSpecific.getCurrency());
		p(curSpecific.format(num) + "\n");
	}

	static void p(String s) {
		System.out.println(s);
	}
}
