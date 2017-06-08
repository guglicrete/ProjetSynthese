package ca.qc.cgodin.Vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import java.awt.SystemColor;

public class Depot extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	private ImageIcon depot;
	private ImageIcon logo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Depot frame = new Depot();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Depot() {
		setTitle("D\u00E9p\u00F4t");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		depot = new ImageIcon("resources\\Depot.png");
		
		JLabel lblDpt = new JLabel("D\u00E9p\u00F4t");
		lblDpt.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblDpt.setBounds(54, 11, 127, 42);
		lblDpt.setIcon(depot);
		contentPane.add(lblDpt);
		
		JLabel lblCompte = new JLabel("Compte :");
		lblCompte.setBounds(54, 82, 76, 14);
		contentPane.add(lblCompte);
		
		textField = new JTextField();
		textField.setBounds(127, 79, 244, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblMontant = new JLabel("Montant :");
		lblMontant.setBounds(54, 134, 76, 14);
		contentPane.add(lblMontant);
		
		textField_1 = new JTextField();
		textField_1.setBounds(127, 131, 127, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnEffectuerLeDpt = new JButton("Effectuer le d\u00E9p\u00F4t");
		btnEffectuerLeDpt.setBounds(127, 180, 152, 23);
		contentPane.add(btnEffectuerLeDpt);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(54, 246, 479, 14);
		contentPane.add(separator);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBackground(SystemColor.control);
		editorPane.setBounds(66, 276, 449, 42);
		editorPane.setBorder((new TitledBorder(null, "Confirmation", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE)));
		contentPane.add(editorPane);
		
		logo = new ImageIcon("resources\\BGG_ico.png");
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(417, 28, 140, 148);
		lblLogo.setIcon(logo);
		contentPane.add(lblLogo);
	}
}
