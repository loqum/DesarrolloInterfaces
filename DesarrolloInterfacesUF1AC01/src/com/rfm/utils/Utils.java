package com.rfm.utils;

import javax.swing.JRadioButton;

public class Utils {
	
	public static boolean isSelectedButton(JRadioButton boton1, JRadioButton boton2, JRadioButton boton3) {
		if (boton1.isSelected() == false && boton2.isSelected() == false && boton3.isSelected() == false) {
			return false;
		} else {
			return true;
		}
		
	}

}
