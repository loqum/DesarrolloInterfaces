package com.rfm.utils;

import java.util.Calendar;
import java.util.Date;

import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Utils {

	private static String PATTERN = "\\d+";
	private static String PATTERN_DECIMAL = "%.2f";


	public static boolean isSelectedButton(JRadioButton button1, JRadioButton button2, JRadioButton button3) {
		if (button1.isSelected() == false && button2.isSelected() == false && button3.isSelected() == false) {
			return false;
		} else {
			return true;
		}
	}

	public static double add(double a, double b) {
		return a + b;
	}

	public static double substract(double a, double b) {
		return a - b;
	}

	public static double multiply(double a, double b) {
		return a * b;
	}

	public static double divide(double a, double b) {
		return a / b;
	}

	public static boolean isEmpty(JTextField operand) {
		if (operand.getText().equals("")) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean isNumeric(JTextField operand) {
		if (operand.getText().matches(PATTERN)) {
			return true;
		} else {
			return false;
		}
	}

	public static String centigradeToFahrenheit(double centigrade) {
		double result = (centigrade * 1.8) + 32;		
		return String.valueOf(String.format(PATTERN_DECIMAL, result));
	}
	
	public static String setTime(Calendar calendar) {
		String time = null;
		
		Date date = new Date();
		
		calendar.setTime(date);
		
		time = String.format("%1$tH:%1$tM:%1$tS", calendar);
		
		return time;
	}
	
	public static String setDate(Calendar calendar) {
		return PATTERN;
//		String 
	}

}
