package com.rfm.colores;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;

import com.rfm.utils.Utils;

import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Toolkit;

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
		frameColores.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\rfernandezm\\git\\DesarrolloInterfaces\\DesarrolloInterfacesUF1AC01\\resources\\paint-and-brush.png"));
		frameColores.getContentPane().setBackground(SystemColor.menu);
		frameColores.setResizable(false);
		frameColores.setTitle("Colores");
		frameColores.setBounds(100, 100, 450, 400);
		frameColores.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameColores.getContentPane().setLayout(null);

		JPanel panelColors = new JPanel();
		JRadioButton radioButtonBlue = new JRadioButton("Azul");
		JRadioButton radioButtonRed = new JRadioButton("Rojo");
		JRadioButton radioButtonYellow = new JRadioButton("Amarillo");

		JPanel panelPosition = new JPanel();
		JRadioButton radioButtonDown = new JRadioButton("Abajo");
		JRadioButton radioButtonUp = new JRadioButton("Arriba");

		JPanel panelCanvas = new JPanel();
		panelCanvas.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		Canvas canvas = new Canvas();

		panelColors.setToolTipText("");
		panelColors.setBorder(new TitledBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), "Colores",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelColors.setBounds(25, 25, 160, 143);
		frameColores.getContentPane().add(panelColors);
		GridBagLayout gbl_panelColors = new GridBagLayout();
		gbl_panelColors.columnWidths = new int[] { 149, 0 };
		gbl_panelColors.rowHeights = new int[] { 0, 0, 0, 0 };
		gbl_panelColors.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_panelColors.rowWeights = new double[] { 1.0, 1.0, 1.0, Double.MIN_VALUE };
		panelColors.setLayout(gbl_panelColors);

		GridBagConstraints gbc_radioButtonBlue = new GridBagConstraints();
		gbc_radioButtonBlue.anchor = GridBagConstraints.WEST;
		gbc_radioButtonBlue.insets = new Insets(0, 0, 5, 0);
		gbc_radioButtonBlue.gridx = 0;
		gbc_radioButtonBlue.gridy = 0;
		panelColors.add(radioButtonBlue, gbc_radioButtonBlue);

		radioButtonBlue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				canvas.setBackground(Color.BLUE);
				radioButtonRed.setSelected(false);
				radioButtonYellow.setSelected(false);
				if (Utils.isSelectedButton(radioButtonRed, radioButtonBlue, radioButtonYellow) == false) {
					canvas.setBackground(new java.awt.Color(240, 240, 240));
				}

			}
		});

		GridBagConstraints gbc_radioButtonRed = new GridBagConstraints();
		gbc_radioButtonRed.anchor = GridBagConstraints.WEST;
		gbc_radioButtonRed.insets = new Insets(0, 0, 5, 0);
		gbc_radioButtonRed.gridx = 0;
		gbc_radioButtonRed.gridy = 1;
		panelColors.add(radioButtonRed, gbc_radioButtonRed);

		radioButtonRed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				canvas.setBackground(Color.RED);
				radioButtonBlue.setSelected(false);
				radioButtonYellow.setSelected(false);
				if (Utils.isSelectedButton(radioButtonRed, radioButtonBlue, radioButtonYellow) == false) {
					canvas.setBackground(new java.awt.Color(240, 240, 240));
				}
			}
		});

		GridBagConstraints gbc_radioButtonYellow = new GridBagConstraints();
		gbc_radioButtonYellow.anchor = GridBagConstraints.WEST;
		gbc_radioButtonYellow.gridx = 0;
		gbc_radioButtonYellow.gridy = 2;
		panelColors.add(radioButtonYellow, gbc_radioButtonYellow);

		radioButtonYellow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				canvas.setBackground(Color.YELLOW);
				radioButtonRed.setSelected(false);
				radioButtonBlue.setSelected(false);
				if (Utils.isSelectedButton(radioButtonRed, radioButtonBlue, radioButtonYellow) == false) {
					canvas.setBackground(new java.awt.Color(240, 240, 240));
				}
			}
		});

		panelPosition.setBorder(new TitledBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
				"Posici\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelPosition.setBounds(25, 200, 160, 143);
		frameColores.getContentPane().add(panelPosition);
		GridBagLayout gbl_panelPosition = new GridBagLayout();
		gbl_panelPosition.columnWidths = new int[] { 53, 0 };
		gbl_panelPosition.rowHeights = new int[] { 0, 0, 0 };
		gbl_panelPosition.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_panelPosition.rowWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
		panelPosition.setLayout(gbl_panelPosition);

		GridBagConstraints gbc_radioButtonUp = new GridBagConstraints();
		gbc_radioButtonUp.insets = new Insets(0, 0, 5, 0);
		gbc_radioButtonUp.anchor = GridBagConstraints.WEST;
		gbc_radioButtonUp.gridx = 0;
		gbc_radioButtonUp.gridy = 0;
		panelPosition.add(radioButtonUp, gbc_radioButtonUp);

		radioButtonUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelCanvas.setBounds(234, 25, 178, 143);
				radioButtonDown.setSelected(false);
			}
		});

		GridBagConstraints gbc_radioButtonDown = new GridBagConstraints();
		gbc_radioButtonDown.anchor = GridBagConstraints.WEST;
		gbc_radioButtonDown.gridx = 0;
		gbc_radioButtonDown.gridy = 1;
		panelPosition.add(radioButtonDown, gbc_radioButtonDown);

		radioButtonDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelCanvas.setBounds(234, 200, 178, 143);
				radioButtonUp.setSelected(false);
			}
		});

		panelCanvas.setBounds(234, 25, 178, 143);
		frameColores.getContentPane().add(panelCanvas);

		panelCanvas.setLayout(null);

		canvas.setBounds(0, 0, 178, 143);
		panelCanvas.add(canvas);

	}
}
