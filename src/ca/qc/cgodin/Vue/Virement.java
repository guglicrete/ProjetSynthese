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
import javax.swing.JEditorPane;
import java.awt.SystemColor;
import javax.swing.border.TitledBorder;
import java.awt.Color;

public class Virement extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private ImageIcon virement;
	private ImageIcon logo;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Virement frame = new Virement();
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
	public Virement() {
		setTitle("Virement");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		virement = new ImageIcon("resources\\Virement.png");
		
		JLabel lblVirement = new JLabel("Virement");
		lblVirement.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblVirement.setBounds(21, 11, 200, 42);
		lblVirement.setIcon(virement);
		contentPane.add(lblVirement);
		
		JLabel lblDuCompte = new JLabel("du Compte :");
		lblDuCompte.setBounds(21, 82, 86, 14);
		contentPane.add(lblDuCompte);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(108, 79, 185, 20);
		contentPane.add(textField);
		
		JLabel label_2 = new JLabel("Montant :");
		label_2.setBounds(21, 153, 76, 14);
		contentPane.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(108, 150, 127, 20);
		contentPane.add(textField_1);
		
		JButton btnEffectuerLeVirement = new JButton("Effectuer le virement");
		btnEffectuerLeVirement.setBounds(110, 198, 152, 23);
		contentPane.add(btnEffectuerLeVirement);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(21, 246, 479, 14);
		contentPane.add(separator);
		
		logo = new ImageIcon("resources\\BGG_ico.png");
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(417, 28, 140, 148);
		lblLogo.setIcon(logo);
		contentPane.add(lblLogo);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBorder((new TitledBorder(null, "Confirmation", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE)));
		editorPane.setBackground(SystemColor.menu);
		editorPane.setBounds(51, 276, 449, 42);
		contentPane.add(editorPane);
		
		JLabel lblVersCompte = new JLabel("vers Compte :");
		lblVersCompte.setBounds(21, 110, 86, 14);
		contentPane.add(lblVersCompte);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(108, 107, 185, 20);
		contentPane.add(textField_2);
	}

}
