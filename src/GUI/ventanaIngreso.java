package GUI;

import java.awt.EventQueue;
import java.awt.event.ActionListener ;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import java.awt.Button;
import javax.swing.JMenuItem;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;

public class ventanaIngreso extends JFrame {

	private JPanel panelIngresoUsuarios;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Create the frame.
	 */
	public ventanaIngreso() {
		setTitle("INGRESO");
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		panelIngresoUsuarios = new JPanel();
		panelIngresoUsuarios.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panelIngresoUsuarios);
		panelIngresoUsuarios.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USER :");
		lblNewLabel.setBounds(21, 40, 47, 32);
		panelIngresoUsuarios.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(67, 40, 139, 33);
		textField.setColumns(10);
		panelIngresoUsuarios.add(textField);
		
		JLabel lblPass = new JLabel("PASS :");
		lblPass.setBounds(21, 84, 47, 32);
		panelIngresoUsuarios.add(lblPass);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(67, 84, 139, 32);
		panelIngresoUsuarios.add(passwordField);
		
		JLabel lblNewLabel_1 = new JLabel("Selecionar Plataforma");
		lblNewLabel_1.setBounds(258, 35, 129, 14);
		panelIngresoUsuarios.add(lblNewLabel_1);
		
		JComboBox comboBoxPlataformas = new JComboBox();
		comboBoxPlataformas.setBounds(218, 60, 188, 22);
		comboBoxPlataformas.addItem("Opncion 1");
		comboBoxPlataformas.addItem("Opncion 2");
		comboBoxPlataformas.addItem("Opncion 3");
		comboBoxPlataformas.addItem("Opncion 4");
		comboBoxPlataformas.addItem("Opncion 5");
		panelIngresoUsuarios.add(comboBoxPlataformas);
		
		Button buttonIngresoUsuario = new Button("Ingresar");
		buttonIngresoUsuario.setBounds(153, 149, 99, 38);
		panelIngresoUsuarios.add(buttonIngresoUsuario);
	}
}
