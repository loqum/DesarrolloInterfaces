package com.rfm.utils;

import java.util.Calendar;
import java.util.Date;

import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.ibm.icu.text.SimpleDateFormat;

public class Utils {

	private static String PATTERN = "^(\\d*\\.)?\\d+$";
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

	public static String setFormatTime(Calendar calendar) {
		String timeToString = null;

		Date currentTime = new Date();

		calendar.setTime(currentTime);

		timeToString = String.format("%1$tH:%1$tM:%1$tS", calendar);

		return timeToString;
	}

	public static String setFormatDate(Calendar calendar) {
		String dateToString = null;

		Date currentDate = new Date();

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

		dateToString = simpleDateFormat.format(currentDate);

		return dateToString;
	}

}
