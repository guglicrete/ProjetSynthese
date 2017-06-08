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
import javax.swing.JSeparator;
import javax.swing.JTable;
import java.awt.SystemColor;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import javax.swing.JEditorPane;

public class Retrait extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private ImageIcon retrait;
	private ImageIcon logo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Retrait frame = new Retrait();
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
	public Retrait() {
		setTitle("Retrait");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		retrait = new ImageIcon("resources\\Retrait.png");
		
		JLabel lblRetrait = new JLabel("Retrait");
		lblRetrait.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblRetrait.setBounds(36, 11, 178, 42);
		lblRetrait.setIcon(retrait);
		contentPane.add(lblRetrait);
		
		JLabel label_1 = new JLabel("Compte :");
		label_1.setBounds(36, 82, 76, 14);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(109, 79, 244, 20);
		contentPane.add(textField);
		
		JLabel label_2 = new JLabel("Montant :");
		label_2.setBounds(36, 134, 76, 14);
		contentPane.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(109, 131, 127, 20);
		contentPane.add(textField_1);
		
		JButton btnEffectuerLeRetrait = new JButton("Effectuer le retrait");
		btnEffectuerLeRetrait.setBounds(109, 180, 152, 23);
		contentPane.add(btnEffectuerLeRetrait);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(36, 246, 479, 14);
		contentPane.add(separator);
		
		logo = new ImageIcon("resources\\BGG_ico.png");
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(417, 28, 140, 148);
		lblLogo.setIcon(logo);
		contentPane.add(lblLogo);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBackground(SystemColor.control);
		editorPane.setBounds(66, 276, 449, 42);
		editorPane.setBorder((new TitledBorder(null, "Confirmation", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE)));
		contentPane.add(editorPane);
	}

}
