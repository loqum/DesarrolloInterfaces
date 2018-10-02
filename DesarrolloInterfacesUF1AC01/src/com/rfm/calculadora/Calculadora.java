package com.rfm.calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import com.rfm.utils.Utils;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Label;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Toolkit;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager.*;

public class Calculadora {

	private JFrame frameCalculadora;
	private JTextField inputOperandoUno;
	private JTextField inputOperandoDos;
	private JTextField inputResultado;
	private double resultado = 0;

	private static String ERROR_ENTRADA = "Debe introducir un valor numérico.";
	private static String ERROR_TITULO = "Error!";

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frameCalculadora.setVisible(true);
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
	public Calculadora() throws Exception {
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

		frameCalculadora = new JFrame();
		frameCalculadora.setIconImage(Toolkit.getDefaultToolkit().getImage(
				"C:\\Users\\rfernandezm\\git\\DesarrolloInterfaces\\DesarrolloInterfacesUF1AC01\\resources\\calculator.png"));
		frameCalculadora.setTitle("Calculadora");
		frameCalculadora.setResizable(false);
		frameCalculadora.setBounds(100, 100, 520, 175);
		frameCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 473, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 40, 41, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		frameCalculadora.getContentPane().setLayout(gridBagLayout);

		JPanel panelOperandos = new JPanel();
		GridBagConstraints gbc_panelOperandos = new GridBagConstraints();
		gbc_panelOperandos.fill = GridBagConstraints.HORIZONTAL;
		gbc_panelOperandos.insets = new Insets(0, 0, 5, 5);
		gbc_panelOperandos.gridx = 1;
		gbc_panelOperandos.gridy = 1;
		frameCalculadora.getContentPane().add(panelOperandos, gbc_panelOperandos);
		GridBagLayout gbl_panelOperandos = new GridBagLayout();
		gbl_panelOperandos.columnWidths = new int[] { 100, 25, 100, 25, 0, 0 };
		gbl_panelOperandos.rowHeights = new int[] { 46, 0 };
		gbl_panelOperandos.columnWeights = new double[] { 1.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_panelOperandos.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		panelOperandos.setLayout(gbl_panelOperandos);

		JPanel panelOperandoUno = new JPanel();
		GridBagConstraints gbc_panelOperandoUno = new GridBagConstraints();
		gbc_panelOperandoUno.fill = GridBagConstraints.BOTH;
		gbc_panelOperandoUno.insets = new Insets(0, 0, 0, 5);
		gbc_panelOperandoUno.gridx = 0;
		gbc_panelOperandoUno.gridy = 0;
		panelOperandos.add(panelOperandoUno, gbc_panelOperandoUno);
		panelOperandoUno.setLayout(null);
		inputOperandoUno = new JTextField();
		inputOperandoUno.setBounds(0, 0, 125, 46);
		panelOperandoUno.add(inputOperandoUno);
		inputOperandoUno.setHorizontalAlignment(SwingConstants.CENTER);
		inputOperandoUno.setColumns(10);

		JLabel labelOperador = new JLabel("");
		GridBagConstraints gbc_labelOperador = new GridBagConstraints();
		gbc_labelOperador.fill = GridBagConstraints.HORIZONTAL;
		gbc_labelOperador.insets = new Insets(0, 0, 0, 5);
		gbc_labelOperador.gridx = 1;
		gbc_labelOperador.gridy = 0;
		panelOperandos.add(labelOperador, gbc_labelOperador);

		labelOperador.setHorizontalAlignment(SwingConstants.CENTER);
		JPanel panelOperandoDos = new JPanel();
		GridBagConstraints gbc_panelOperandoDos = new GridBagConstraints();
		gbc_panelOperandoDos.fill = GridBagConstraints.BOTH;
		gbc_panelOperandoDos.insets = new Insets(0, 0, 0, 5);
		gbc_panelOperandoDos.gridx = 2;
		gbc_panelOperandoDos.gridy = 0;
		panelOperandos.add(panelOperandoDos, gbc_panelOperandoDos);
		inputOperandoDos = new JTextField();
		inputOperandoDos.setHorizontalAlignment(SwingConstants.CENTER);
		panelOperandoDos.setLayout(null);

		inputOperandoDos.setBounds(0, 0, 125, 46);
		panelOperandoDos.add(inputOperandoDos);
		inputOperandoDos.setColumns(10);

		Label labelEsIgual = new Label("=");
		GridBagConstraints gbc_labelEsIgual = new GridBagConstraints();
		gbc_labelEsIgual.fill = GridBagConstraints.HORIZONTAL;
		gbc_labelEsIgual.insets = new Insets(0, 0, 0, 5);
		gbc_labelEsIgual.gridx = 3;
		gbc_labelEsIgual.gridy = 0;
		panelOperandos.add(labelEsIgual, gbc_labelEsIgual);
		labelEsIgual.setAlignment(Label.CENTER);
		labelEsIgual.setFont(new Font("Dialog", Font.BOLD, 18));

		JScrollPane panelResultado = new JScrollPane();
		panelResultado.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		GridBagConstraints gbc_panelResultado = new GridBagConstraints();
		gbc_panelResultado.fill = GridBagConstraints.BOTH;
		gbc_panelResultado.gridx = 4;
		gbc_panelResultado.gridy = 0;
		panelOperandos.add(panelResultado, gbc_panelResultado);
		inputResultado = new JTextField();
		inputResultado.setEditable(false);
		panelResultado.setViewportView(inputResultado);
		inputResultado.setHorizontalAlignment(SwingConstants.CENTER);
		inputResultado.setColumns(10);

		JPanel panelOperadores = new JPanel();
		GridBagConstraints gbc_panelOperadores = new GridBagConstraints();
		gbc_panelOperadores.insets = new Insets(0, 0, 5, 5);
		gbc_panelOperadores.fill = GridBagConstraints.HORIZONTAL;
		gbc_panelOperadores.gridx = 1;
		gbc_panelOperadores.gridy = 2;
		frameCalculadora.getContentPane().add(panelOperadores, gbc_panelOperadores);
		GridBagLayout gbl_panelOperadores = new GridBagLayout();
		gbl_panelOperadores.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_panelOperadores.rowHeights = new int[] { 36, 0 };
		gbl_panelOperadores.columnWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gbl_panelOperadores.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		panelOperadores.setLayout(gbl_panelOperadores);
		JButton buttonSuma = new JButton("");
		buttonSuma.setIcon(new ImageIcon(
				"C:\\Users\\rfernandezm\\git\\DesarrolloInterfaces\\DesarrolloInterfacesUF1AC01\\resources\\add.png"));
		GridBagConstraints gbc_buttonSuma = new GridBagConstraints();
		gbc_buttonSuma.fill = GridBagConstraints.HORIZONTAL;
		gbc_buttonSuma.insets = new Insets(0, 0, 0, 5);
		gbc_buttonSuma.gridx = 0;
		gbc_buttonSuma.gridy = 0;
		panelOperadores.add(buttonSuma, gbc_buttonSuma);

		JButton buttonResta = new JButton("");
		buttonResta.setIcon(new ImageIcon(
				"C:\\Users\\rfernandezm\\git\\DesarrolloInterfaces\\DesarrolloInterfacesUF1AC01\\resources\\minus.png"));
		GridBagConstraints gbc_buttonResta = new GridBagConstraints();
		gbc_buttonResta.fill = GridBagConstraints.HORIZONTAL;
		gbc_buttonResta.insets = new Insets(0, 0, 0, 5);
		gbc_buttonResta.gridx = 1;
		gbc_buttonResta.gridy = 0;
		panelOperadores.add(buttonResta, gbc_buttonResta);

		JButton buttonMultiplicacion = new JButton("");
		buttonMultiplicacion.setIcon(new ImageIcon(
				"C:\\Users\\rfernandezm\\git\\DesarrolloInterfaces\\DesarrolloInterfacesUF1AC01\\resources\\multiply.png"));
		GridBagConstraints gbc_buttonMultiplicacion = new GridBagConstraints();
		gbc_buttonMultiplicacion.fill = GridBagConstraints.HORIZONTAL;
		gbc_buttonMultiplicacion.insets = new Insets(0, 0, 0, 5);
		gbc_buttonMultiplicacion.gridx = 2;
		gbc_buttonMultiplicacion.gridy = 0;
		panelOperadores.add(buttonMultiplicacion, gbc_buttonMultiplicacion);

		JButton buttonDivision = new JButton("");
		buttonDivision.setIcon(new ImageIcon(
				"C:\\Users\\rfernandezm\\git\\DesarrolloInterfaces\\DesarrolloInterfacesUF1AC01\\resources\\divide.png"));
		GridBagConstraints gbc_buttonDivision = new GridBagConstraints();
		gbc_buttonDivision.fill = GridBagConstraints.HORIZONTAL;
		gbc_buttonDivision.insets = new Insets(0, 0, 0, 5);
		gbc_buttonDivision.gridx = 3;
		gbc_buttonDivision.gridy = 0;
		panelOperadores.add(buttonDivision, gbc_buttonDivision);

		JButton buttonLimpiar = new JButton("AC");
		buttonLimpiar.setFont(new Font("Tahoma", Font.BOLD, 12));

		buttonSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (Utils.isNumeric(inputOperandoUno) && Utils.isNumeric(inputOperandoDos)
						&& Utils.isEmpty(inputOperandoUno) == false && Utils.isEmpty(inputOperandoDos) == false) {
					resultado = Utils.add(Double.parseDouble(inputOperandoUno.getText()),
							Double.parseDouble(inputOperandoDos.getText()));
					inputResultado.setText(String.valueOf(resultado));
					labelOperador.setIcon(new ImageIcon(
							"C:\\Users\\rfernandezm\\git\\DesarrolloInterfaces\\DesarrolloInterfacesUF1AC01\\resources\\add.png"));
				} else {
					JOptionPane.showMessageDialog(frameCalculadora, ERROR_ENTRADA, ERROR_TITULO,
							JOptionPane.WARNING_MESSAGE);
				}
			}
		});

		buttonResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (Utils.isNumeric(inputOperandoUno) && Utils.isNumeric(inputOperandoDos)
						&& Utils.isEmpty(inputOperandoUno) == false && Utils.isEmpty(inputOperandoDos) == false) {
					resultado = Utils.substract(Double.parseDouble(inputOperandoUno.getText()),
							Double.parseDouble(inputOperandoDos.getText()));
					inputResultado.setText(String.valueOf(resultado));
					labelOperador.setIcon(new ImageIcon(
							"C:\\Users\\rfernandezm\\git\\DesarrolloInterfaces\\DesarrolloInterfacesUF1AC01\\resources\\minus.png"));
				} else {
					JOptionPane.showMessageDialog(frameCalculadora, ERROR_ENTRADA, ERROR_TITULO,
							JOptionPane.WARNING_MESSAGE);
				}
			}
		});

		buttonMultiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (Utils.isNumeric(inputOperandoUno) && Utils.isNumeric(inputOperandoDos)
						&& Utils.isEmpty(inputOperandoUno) == false && Utils.isEmpty(inputOperandoDos) == false) {
					resultado = Utils.multiply(Double.parseDouble(inputOperandoUno.getText()),
							Double.parseDouble(inputOperandoDos.getText()));
					inputResultado.setText(String.valueOf(resultado));
					labelOperador.setIcon(new ImageIcon(
							"C:\\Users\\rfernandezm\\git\\DesarrolloInterfaces\\DesarrolloInterfacesUF1AC01\\resources\\multiply.png"));
				} else {
					JOptionPane.showMessageDialog(frameCalculadora, ERROR_ENTRADA, ERROR_TITULO,
							JOptionPane.WARNING_MESSAGE);
				}
			}
		});

		buttonDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (Utils.isNumeric(inputOperandoUno) && Utils.isNumeric(inputOperandoDos)
						&& Utils.isEmpty(inputOperandoUno) == false && Utils.isEmpty(inputOperandoDos) == false) {
					resultado = Utils.divide(Double.parseDouble(inputOperandoUno.getText()),
							Double.parseDouble(inputOperandoDos.getText()));
					inputResultado.setText(String.valueOf(resultado));
					labelOperador.setIcon(new ImageIcon(
							"C:\\Users\\rfernandezm\\git\\DesarrolloInterfaces\\DesarrolloInterfacesUF1AC01\\resources\\divide.png"));
				} else {
					JOptionPane.showMessageDialog(frameCalculadora, ERROR_ENTRADA, ERROR_TITULO,
							JOptionPane.WARNING_MESSAGE);
				}
			}
		});

		buttonLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputOperandoUno.setText("");
				inputOperandoDos.setText("");
				inputResultado.setText("");
				labelOperador.setIcon(null);
			}
		});

		GridBagConstraints gbc_buttonLimpiar = new GridBagConstraints();
		gbc_buttonLimpiar.fill = GridBagConstraints.BOTH;
		gbc_buttonLimpiar.gridx = 4;
		gbc_buttonLimpiar.gridy = 0;
		panelOperadores.add(buttonLimpiar, gbc_buttonLimpiar);

	}
}
