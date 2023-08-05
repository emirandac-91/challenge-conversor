package GUI;

import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class ventanaCalculo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the frame.
	 */
	public ventanaCalculo() {
		

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Moneda :");
		lblNewLabel.setBounds(38, 71, 47, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblMonto = new JLabel("Monto :");
		lblMonto.setBounds(38, 124, 47, 23);
		contentPane.add(lblMonto);
		
		JLabel lblTipoDeCamcbio = new JLabel("Tipo de camcbio :");
		lblTipoDeCamcbio.setBounds(150, 174, 100, 23);
		contentPane.add(lblTipoDeCamcbio);
		
		JComboBox comboBoxMonedaIngreso = new JComboBox();
		comboBoxMonedaIngreso.setBounds(107, 71, 151, 22);
		comboBoxMonedaIngreso.addItem("SOLES");
		comboBoxMonedaIngreso.addItem("DOLARES");
		comboBoxMonedaIngreso.addItem("EUROS");
		comboBoxMonedaIngreso.addItem("YENES");
		comboBoxMonedaIngreso.addItem("won");
		comboBoxMonedaIngreso.addItem("LIBRAS ESTERLINAS");
		comboBoxMonedaIngreso.addItem("RENMINBI(YUAN)");
		contentPane.add(comboBoxMonedaIngreso);
		
		JComboBox comboBoxMonedaSalida = new JComboBox();
		comboBoxMonedaSalida.setBounds(320, 71, 151, 22);
		comboBoxMonedaSalida.addItem("SOLES");
		comboBoxMonedaSalida.addItem("DOLARES");
		comboBoxMonedaSalida.addItem("EUROS");
		comboBoxMonedaSalida.addItem("YENES");
		comboBoxMonedaSalida.addItem("won");
		comboBoxMonedaSalida.addItem("LIBRAS ESTERLINAS");
		comboBoxMonedaSalida.addItem("RENMINBI(YUAN)");
		contentPane.add(comboBoxMonedaSalida);
		
		textField = new JTextField();
		textField.setBounds(107, 125, 151, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(320, 125, 151, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(249, 175, 89, 20);
		contentPane.add(textField_2);
		
		JButton btnNewButton = new JButton("CALCULAR");
		btnNewButton.setBounds(226, 256, 100, 23);
		contentPane.add(btnNewButton);
	}
}
