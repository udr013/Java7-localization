package com.udr013.localization;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class FormatNumbers{

	public static void main(String[] args){
		double num = 1234.1111;

		defaultLocale(num);
		specificLocale(Locale.GERMANY, num);
		specificLocale(Locale.FRANCE, num);
		specificLocale(Locale.US, num);
	}

	private static void defaultLocale(double num){

		NumberFormat nfDefault = NumberFormat.getInstance();
		p("\nDefault Locale");
		p("formatting: " + nfDefault.format(num));

		try{
			p("parsing : " + nfDefault.parse("1234.1111"));
		} catch(ParseException e){
			p(e.toString());
		}

	}

	private static void specificLocale(Locale locale, double num){

		NumberFormat nfSpecific = NumberFormat.getInstance();
		p("\nLocale: " + locale.getDisplayCountry());
		p("formatting: " + nfSpecific.format(num));

		try{
			p("parsing : " + nfSpecific.parse("1234.1111"));
		} catch(ParseException e){
			p(e.toString());
		}
	}

	static void p(String s){
		System.out.println(s);
	}
}
