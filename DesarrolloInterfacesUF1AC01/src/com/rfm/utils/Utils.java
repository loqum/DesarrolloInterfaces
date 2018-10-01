package com.rfm.utils;

import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Utils {
	
	private static String PATTERN = "\\d+";

	public static boolean isSelectedButton(JRadioButton boton1, JRadioButton boton2, JRadioButton boton3) {
		if (boton1.isSelected() == false && boton2.isSelected() == false && boton3.isSelected() == false) {
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

	public static boolean isEmpty(JTextField operando) {
		if (operando.getText().equals("")) {
			return true;
		} else {
			return false;
		}

	}
	
	public static boolean isNumeric(JTextField operando) {
		
		if (operando.getText().matches(PATTERN)) {
			return true;
		} else {
			return false;
		}
	}

}
