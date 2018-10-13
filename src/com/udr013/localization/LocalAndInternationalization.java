package com.udr013.localization;

import java.util.Locale;
import java.util.Locale.Builder;

public class LocalAndInternationalization {

	public static void main(String[] args) {
		//
		Locale loc = Locale.getDefault(); // en_US
		p(loc);

		Locale.setDefault(Locale.ROOT);
		loc = Locale.getDefault();
		p(loc); // """"

		Locale.Builder builder = new Builder();
		builder.setLanguage("nl"); // language lowercase
		builder.setRegion("NL"); // COUNTRY REGION UPPERCASE
		loc = builder.build();

		p("----------------");
		p(loc.getExtensionKeys()); // []
		p(loc.getUnicodeLocaleAttributes()); // []
		p(loc.getUnicodeLocaleKeys()); // []
		p(loc.getCountry()); // NL
		p(loc.getDisplayCountry()); // Netherlands
		p(loc.getDisplayLanguage()); // Dutch
		p(loc.getISO3Country()); // NLD
		p(loc.getISO3Language()); // nld
		p(loc.toLanguageTag()); // nl-NL

		/* note! Locale defaults sometimes reffer to country others just to language! */

		Locale country = Locale.FRANCE; // fr_FR
		p(country);
		Locale lang = Locale.FRENCH; // fr
		p(lang);

	}

	static void p(Object s) {
		System.out.println(s);
	}
}
