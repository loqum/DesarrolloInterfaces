package com.rfm.colores;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.BoxLayout;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.SystemColor;

public class Colores {

	private JFrame frameColores;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {
					Colores window = new Colores();
					window.frameColores.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
					throw e;
				}
			}
		});
	}

	public Colores() {
		initialize();
	}

	private void initialize() {
		frameColores = new JFrame();
		frameColores.getContentPane().setBackground(SystemColor.menu);
		frameColores.setResizable(false);
		frameColores.setTitle("Colores");
		frameColores.setBounds(100, 100, 600, 400);
		frameColores.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameColores.getContentPane().setLayout(null);

		JPanel panelColors = new JPanel();
		panelColors.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panelColors.setBounds(25, 25, 160, 143);
		frameColores.getContentPane().add(panelColors);
		panelColors.setLayout(new BoxLayout(panelColors, BoxLayout.X_AXIS));

		JRadioButton radioButtonBlue = new JRadioButton("Azul");
		panelColors.add(radioButtonBlue);

		JRadioButton radioButtonRed = new JRadioButton("Rojo");
		panelColors.add(radioButtonRed);

		JRadioButton radioButtonYellow = new JRadioButton("Amarillo");
		panelColors.add(radioButtonYellow);

		JPanel panelPosition = new JPanel();
		panelPosition.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panelPosition.setBounds(25, 200, 160, 143);
		frameColores.getContentPane().add(panelPosition);
		panelPosition.setLayout(new BoxLayout(panelPosition, BoxLayout.X_AXIS));

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Abajo");
		panelPosition.add(rdbtnNewRadioButton_1);

		JRadioButton radioButtonUp = new JRadioButton("Arriba");
		panelPosition.add(radioButtonUp);

		JPanel panel = new JPanel();
		panel.setBounds(359, 66, 10, 10);
		frameColores.getContentPane().add(panel);
	}

}
