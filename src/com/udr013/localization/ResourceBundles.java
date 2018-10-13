package com.udr013.localization;

import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public class ResourceBundles {

	public static void main(String[] args) {

		// Thou it works
		// ResourceBundle bundle = ListResourceBundle.getBundle("some", new Locale("fr"));

		ResourceBundle bundle = PropertyResourceBundle.getBundle("some", new Locale("fr"));
		System.out.println(bundle.getString("How_are_you?"));
		ResourceBundle bundle2 = PropertyResourceBundle.getBundle("some", new Locale("nl", "NL"));
		System.out.println(bundle2.getString("How_are_you?"));

		ResourceBundle bundle4 = ListResourceBundle.getBundle("Somemore", new Locale("fo", "BA"));
		System.out.println(bundle4.getString("How_are_you?"));

		// java.util.MissingResourceException: Can't find resource for bundle java.util.PropertyResourceBundle
		ResourceBundle bundle3 = ResourceBundle.getBundle("some", new Locale("foo", "BAR"));
		System.out.println(bundle3.getString("How_are_you?"));
	}
}
