package com.rfm.colores;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.BoxLayout;
import javax.swing.border.BevelBorder;

import java.awt.SystemColor;
import java.awt.Component;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		frameColores.setBounds(100, 100, 450, 400);
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
		radioButtonRed.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelColors.add(radioButtonRed);

		JRadioButton radioButtonYellow = new JRadioButton("Amarillo");
		panelColors.add(radioButtonYellow);

		JPanel panelPosition = new JPanel();
		panelPosition.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panelPosition.setBounds(25, 200, 160, 143);
		frameColores.getContentPane().add(panelPosition);
		panelPosition.setLayout(new BoxLayout(panelPosition, BoxLayout.X_AXIS));

		JRadioButton radioButtonDown = new JRadioButton("Abajo");
		panelPosition.add(radioButtonDown);

		JRadioButton radioButtonUp = new JRadioButton("Arriba");
		panelPosition.add(radioButtonUp);
		
		JPanel panelCanvas = new JPanel();
		panelCanvas.setBounds(234, 25, 178, 143);
		frameColores.getContentPane().add(panelCanvas);
		panelCanvas.setLayout(null);
		
		Canvas canvas = new Canvas();
		canvas.setBounds(0, 0, 178, 143);
		panelCanvas.add(canvas);
		
		
		radioButtonBlue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				canvas.setBackground(Color.BLUE);
				radioButtonRed.setSelected(false);
				radioButtonYellow.setSelected(false);
				
			}
		});
		
		radioButtonRed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				canvas.setBackground(Color.RED);
				radioButtonBlue.setSelected(false);
				radioButtonYellow.setSelected(false);
			}
		});
		
		radioButtonYellow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				canvas.setBackground(Color.YELLOW);
				radioButtonRed.setSelected(false);
				radioButtonBlue.setSelected(false);
			}
		});
		
		radioButtonUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelCanvas.setBounds(234, 25, 178, 143);
				radioButtonDown.setSelected(false);
			}
		});
		
		radioButtonDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelCanvas.setBounds(234, 200, 178, 143);
				radioButtonUp.setSelected(false);
			}
		});
	}
}
