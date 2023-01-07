package com.tmbv.travel.admin.service;

import java.text.SimpleDateFormat;
import java.util.Date;

@FunctionalInterface
public interface TestInterface {
	
	String doPayment();
	
	default String testDefaultPayment() {
		return "this is a test default method in interface";
	}

	static String TestStaticMethod() {
		return "this is a static method in interface";
	}
	
	static String dateFormat(String dateFormat) {
		SimpleDateFormat dtFormat = new SimpleDateFormat(dateFormat);
		return dtFormat.format(new Date());
	}
}
