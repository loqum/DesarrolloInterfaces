package com.rfm.reloj;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Reloj {

	private JFrame frameClock;
	private JTextField inputTime;
	private JPanel panelTime;
	private JPanel panelButtons;
	private JPanel panelClock;
	private JTextField inputDate;
	private JPanel panelDate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reloj window = new Reloj();
					window.frameClock.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * 
	 * @throws Exception
	 */
	public Reloj() throws Exception {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * 
	 * @throws Exception
	 */
	private void initialize() throws Exception {

		try {
			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (Exception e) {
			throw e;
		}

		frameClock = new JFrame();
		frameClock.setResizable(false);
		frameClock.setTitle("Reloj");
		frameClock.setBounds(100, 100, 450, 250);
		frameClock.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0 };
		gridBagLayout.rowHeights = new int[] { 10, 0, 0, 10, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		frameClock.getContentPane().setLayout(gridBagLayout);

		panelClock = new JPanel();
		GridBagConstraints gbc_panelClock = new GridBagConstraints();
		gbc_panelClock.fill = GridBagConstraints.BOTH;
		gbc_panelClock.insets = new Insets(0, 0, 5, 0);
		gbc_panelClock.gridx = 0;
		gbc_panelClock.gridy = 1;
		frameClock.getContentPane().add(panelClock, gbc_panelClock);
		GridBagLayout gbl_panelClock = new GridBagLayout();
		gbl_panelClock.columnWidths = new int[] { 0, 0, 0 };
		gbl_panelClock.rowHeights = new int[] { 0, 0, 0 };
		gbl_panelClock.columnWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
		gbl_panelClock.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		panelClock.setLayout(gbl_panelClock);

		panelTime = new JPanel();
		GridBagConstraints gbc_panelTime = new GridBagConstraints();
		gbc_panelTime.insets = new Insets(0, 0, 5, 5);
		gbc_panelTime.fill = GridBagConstraints.HORIZONTAL;
		gbc_panelTime.gridx = 0;
		gbc_panelTime.gridy = 0;
		panelClock.add(panelTime, gbc_panelTime);
		panelTime.setBorder(
				new TitledBorder(null, "Fecha", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagLayout gbl_panelTime = new GridBagLayout();
		gbl_panelTime.columnWidths = new int[] { 0, 0 };
		gbl_panelTime.rowHeights = new int[] { 0, 0 };
		gbl_panelTime.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_panelTime.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		panelTime.setLayout(gbl_panelTime);

		inputTime = new JTextField();
		GridBagConstraints gbc_inputTime = new GridBagConstraints();
		gbc_inputTime.fill = GridBagConstraints.HORIZONTAL;
		gbc_inputTime.gridx = 0;
		gbc_inputTime.gridy = 0;
		panelTime.add(inputTime, gbc_inputTime);
		inputTime.setEditable(false);
		inputTime.setColumns(10);

		panelDate = new JPanel();
		panelDate.setBorder(
				new TitledBorder(null, "Hora", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(59, 59, 59)));
		GridBagConstraints gbc_panelDate = new GridBagConstraints();
		gbc_panelDate.insets = new Insets(0, 0, 5, 0);
		gbc_panelDate.fill = GridBagConstraints.HORIZONTAL;
		gbc_panelDate.gridx = 1;
		gbc_panelDate.gridy = 0;
		panelClock.add(panelDate, gbc_panelDate);
		GridBagLayout gbl_panelDate = new GridBagLayout();
		gbl_panelDate.columnWidths = new int[] { 0, 0 };
		gbl_panelDate.rowHeights = new int[] { 0, 0 };
		gbl_panelDate.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_panelDate.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		panelDate.setLayout(gbl_panelDate);

		inputDate = new JTextField();
		inputDate.setEditable(false);
		GridBagConstraints gbc_inputDate = new GridBagConstraints();
		gbc_inputDate.fill = GridBagConstraints.HORIZONTAL;
		gbc_inputDate.gridx = 0;
		gbc_inputDate.gridy = 0;
		panelDate.add(inputDate, gbc_inputDate);
		inputDate.setColumns(10);

		panelButtons = new JPanel();
		GridBagConstraints gbc_panelButtons = new GridBagConstraints();
		gbc_panelButtons.insets = new Insets(0, 0, 5, 0);
		gbc_panelButtons.fill = GridBagConstraints.BOTH;
		gbc_panelButtons.gridx = 0;
		gbc_panelButtons.gridy = 2;
		frameClock.getContentPane().add(panelButtons, gbc_panelButtons);
		GridBagLayout gbl_panelButtons = new GridBagLayout();
		gbl_panelButtons.columnWidths = new int[] { 0, 0, 0 };
		gbl_panelButtons.rowHeights = new int[] { 0, 0 };
		gbl_panelButtons.columnWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
		gbl_panelButtons.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		panelButtons.setLayout(gbl_panelButtons);

		JButton buttonStartTime = new JButton("Iniciar");
		GridBagConstraints gbc_buttonStartTime = new GridBagConstraints();
		gbc_buttonStartTime.fill = GridBagConstraints.HORIZONTAL;
		gbc_buttonStartTime.insets = new Insets(0, 0, 0, 5);
		gbc_buttonStartTime.gridx = 0;
		gbc_buttonStartTime.gridy = 0;
		panelButtons.add(buttonStartTime, gbc_buttonStartTime);

		JButton buttonStopTime = new JButton("Parar");
		GridBagConstraints gbc_buttonStopTime = new GridBagConstraints();
		gbc_buttonStopTime.fill = GridBagConstraints.HORIZONTAL;
		gbc_buttonStopTime.gridx = 1;
		gbc_buttonStopTime.gridy = 0;
		panelButtons.add(buttonStopTime, gbc_buttonStopTime);
		
		buttonStartTime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		buttonStartTime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	
	}

}
