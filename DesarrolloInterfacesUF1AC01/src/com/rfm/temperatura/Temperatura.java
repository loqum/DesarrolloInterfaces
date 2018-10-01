package com.rfm.temperatura;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.GridBagLayout;
import javax.swing.JSlider;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.event.ChangeListener;

import com.rfm.utils.Utils;

import javax.swing.event.ChangeEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Temperatura {

	private JFrame frameTemperature;
	private JTextField inputCentigrades;
	private JTextField inputFahrenheit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Temperatura window = new Temperatura();
					window.frameTemperature.setVisible(true);
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
	public Temperatura() throws Exception {
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

		frameTemperature = new JFrame();
		frameTemperature.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\rfernandezm\\git\\DesarrolloInterfaces\\DesarrolloInterfacesUF1AC01\\resources\\thermometer.png"));
		frameTemperature.setTitle("Temperatura");
		frameTemperature.setResizable(false);
		frameTemperature.setBounds(700, 300, 420, 360);
		frameTemperature.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menuSup = new JMenuBar();
		frameTemperature.setJMenuBar(menuSup);

		JMenu buttonMenu = new JMenu("Menú");
		menuSup.add(buttonMenu);

		JMenuItem buttonMenuOut = new JMenuItem("Salir");
		buttonMenuOut.setHorizontalAlignment(SwingConstants.CENTER);
		buttonMenu.add(buttonMenuOut);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 50, 0, 28, 10, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		frameTemperature.getContentPane().setLayout(gridBagLayout);
		
		JPanel panelTemperature = new JPanel();
		panelTemperature.setBorder(new TitledBorder(null, "Temperatura", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(59, 59, 59)));
		GridBagConstraints gbc_panelTemperature = new GridBagConstraints();
		gbc_panelTemperature.fill = GridBagConstraints.BOTH;
		gbc_panelTemperature.insets = new Insets(0, 0, 5, 0);
		gbc_panelTemperature.gridx = 0;
		gbc_panelTemperature.gridy = 1;
		frameTemperature.getContentPane().add(panelTemperature, gbc_panelTemperature);
		GridBagLayout gbl_panelTemperature = new GridBagLayout();
		gbl_panelTemperature.columnWidths = new int[]{0, 0};
		gbl_panelTemperature.rowHeights = new int[]{50, 0};
		gbl_panelTemperature.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panelTemperature.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panelTemperature.setLayout(gbl_panelTemperature);
		
		JSlider sliderTemperature = new JSlider(-100, 100, 0);
		sliderTemperature.setPaintLabels(true);
		
		sliderTemperature.setMajorTickSpacing(25);
		sliderTemperature.setMinorTickSpacing(10);
		sliderTemperature.setPaintTicks(true);
				
		Hashtable<Object, Object> position = new Hashtable<>();
		position.put(0, new JLabel("0"));
		position.put(25, new JLabel("25"));
		position.put(-25, new JLabel("-25"));
		position.put(50, new JLabel("50"));
		position.put(-50, new JLabel("-50"));
		position.put(75, new JLabel("75"));
		position.put(-75, new JLabel("-75"));
		position.put(100, new JLabel("100"));
		position.put(-100, new JLabel("-100"));

		sliderTemperature.setLabelTable(position);
		
		GridBagConstraints gbc_sliderTemperature = new GridBagConstraints();
		gbc_sliderTemperature.fill = GridBagConstraints.HORIZONTAL;
		gbc_sliderTemperature.gridx = 0;
		gbc_sliderTemperature.gridy = 0;
		panelTemperature.add(sliderTemperature, gbc_sliderTemperature);
		
		JPanel panelDegrees = new JPanel();
		panelDegrees.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(59, 59, 59)));
		GridBagConstraints gbc_panelDegrees = new GridBagConstraints();
		gbc_panelDegrees.fill = GridBagConstraints.BOTH;
		gbc_panelDegrees.insets = new Insets(0, 0, 5, 0);
		gbc_panelDegrees.gridx = 0;
		gbc_panelDegrees.gridy = 3;
		frameTemperature.getContentPane().add(panelDegrees, gbc_panelDegrees);
		GridBagLayout gbl_panelDegrees = new GridBagLayout();
		gbl_panelDegrees.columnWidths = new int[]{0, 0, 0};
		gbl_panelDegrees.rowHeights = new int[]{28, 0};
		gbl_panelDegrees.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_panelDegrees.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panelDegrees.setLayout(gbl_panelDegrees);
		
		JPanel panelCentigrades = new JPanel();
		panelCentigrades.setBorder(new TitledBorder(null, "Grados Cent\u00EDgrados", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panelCentigrades = new GridBagConstraints();
		gbc_panelCentigrades.fill = GridBagConstraints.BOTH;
		gbc_panelCentigrades.insets = new Insets(0, 0, 0, 5);
		gbc_panelCentigrades.gridx = 0;
		gbc_panelCentigrades.gridy = 0;
		panelDegrees.add(panelCentigrades, gbc_panelCentigrades);
		GridBagLayout gbl_panelCentigrades = new GridBagLayout();
		gbl_panelCentigrades.columnWidths = new int[]{0, 0};
		gbl_panelCentigrades.rowHeights = new int[]{0, 28, 0};
		gbl_panelCentigrades.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panelCentigrades.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panelCentigrades.setLayout(gbl_panelCentigrades);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\rfernandezm\\git\\DesarrolloInterfaces\\DesarrolloInterfacesUF1AC01\\resources\\celsius.png"));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panelCentigrades.add(lblNewLabel, gbc_lblNewLabel);
		
		inputCentigrades = new JTextField();
		
		GridBagConstraints gbc_inputCentigrades = new GridBagConstraints();
		gbc_inputCentigrades.gridx = 0;
		gbc_inputCentigrades.gridy = 1;
		panelCentigrades.add(inputCentigrades, gbc_inputCentigrades);
		inputCentigrades.setEditable(false);
		inputCentigrades.setColumns(10);
		
		JPanel panelFahrenheit = new JPanel();
		panelFahrenheit.setBorder(new TitledBorder(null, "Grados Fahrenheit", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panelFahrenheit = new GridBagConstraints();
		gbc_panelFahrenheit.fill = GridBagConstraints.BOTH;
		gbc_panelFahrenheit.gridx = 1;
		gbc_panelFahrenheit.gridy = 0;
		panelDegrees.add(panelFahrenheit, gbc_panelFahrenheit);
		GridBagLayout gbl_panelFahrenheit = new GridBagLayout();
		gbl_panelFahrenheit.columnWidths = new int[]{0, 0};
		gbl_panelFahrenheit.rowHeights = new int[]{0, 28, 0};
		gbl_panelFahrenheit.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panelFahrenheit.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panelFahrenheit.setLayout(gbl_panelFahrenheit);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\rfernandezm\\git\\DesarrolloInterfaces\\DesarrolloInterfacesUF1AC01\\resources\\fahrenheit.png"));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 0;
		panelFahrenheit.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		inputFahrenheit = new JTextField();
		GridBagConstraints gbc_inputFahrenheit = new GridBagConstraints();
		gbc_inputFahrenheit.gridx = 0;
		gbc_inputFahrenheit.gridy = 1;
		panelFahrenheit.add(inputFahrenheit, gbc_inputFahrenheit);
		inputFahrenheit.setEditable(false);
		inputFahrenheit.setColumns(10);
		
		JPanel panelButtonOut = new JPanel();
		GridBagConstraints gbc_panelButtonOut = new GridBagConstraints();
		gbc_panelButtonOut.fill = GridBagConstraints.BOTH;
		gbc_panelButtonOut.gridx = 0;
		gbc_panelButtonOut.gridy = 4;
		frameTemperature.getContentPane().add(panelButtonOut, gbc_panelButtonOut);
		GridBagLayout gbl_panelButtonOut = new GridBagLayout();
		gbl_panelButtonOut.columnWidths = new int[]{0, 0};
		gbl_panelButtonOut.rowHeights = new int[]{50, 0};
		gbl_panelButtonOut.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panelButtonOut.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panelButtonOut.setLayout(gbl_panelButtonOut);
		
		JButton buttonOut = new JButton("Salir");
		buttonOut.setFont(new Font("SansSerif", Font.BOLD, 16));
		GridBagConstraints gbc_buttonOut = new GridBagConstraints();
		gbc_buttonOut.fill = GridBagConstraints.HORIZONTAL;
		gbc_buttonOut.gridx = 0;
		gbc_buttonOut.gridy = 0;
		panelButtonOut.add(buttonOut, gbc_buttonOut);
		
		
		buttonOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int dialogButton = JOptionPane.showConfirmDialog(frameTemperature, "¿Seguro que desea salir del programa?",
						"Temperatura", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
				if (dialogButton == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});

		buttonMenuOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int dialogButton = JOptionPane.showConfirmDialog(frameTemperature, "¿Seguro que desea salir del programa?",
						"Temperatura", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
				if (dialogButton == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		
		sliderTemperature.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				inputCentigrades.setText(String.valueOf(((JSlider) e.getSource()).getValue()));
				inputFahrenheit.setText(Utils.centigradeToFahrenheit(Double.parseDouble(String.valueOf(inputCentigrades.getText()))));
			}
		});
		
	}
}
