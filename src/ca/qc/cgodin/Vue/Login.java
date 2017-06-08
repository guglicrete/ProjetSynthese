package ca.qc.cgodin.Vue;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String utilisateur;
	protected String mdp;
	private JPanel panelLogin;
	private JLabel lblUtilisateur;
	private JLabel lblMdp;
	private JTextField txtUtilisateur;
	private JPasswordField txtMdp;
	private JComboBox<String> cboSuccursale;
	private JComboBox<String> cboPoste;	
	private JButton btnValider;
	
	public Login(){
		super("Login");
		setBounds(500,260,350,150);
		setUndecorated(true);
		construireLogin();
		setVisible(true);
	}

	private void construireLogin() {
		panelLogin = new JPanel();
		panelLogin.setLayout(null);
		setContentPane(panelLogin);
		
		lblUtilisateur = new JLabel("Utilisateur :");
		lblUtilisateur.setBounds(20, 20, 120, 30);
		txtUtilisateur = new JTextField();
		txtUtilisateur.setBounds(130, 20, 180, 30);
		lblMdp = new JLabel("Mot de passe :");
		lblMdp.setBounds(20, 60, 120, 30);
		txtMdp = new JPasswordField();
		txtMdp.setBounds(130, 60, 180, 30);
		btnValider = new JButton("Valider");
		btnValider.setBounds(90, 110, 150, 30);
		btnValider.setEnabled(false);
		
		
		panelLogin.add(lblUtilisateur);
		panelLogin.add(txtUtilisateur);
		panelLogin.add(lblMdp);
		panelLogin.add(txtMdp);
		panelLogin.add(btnValider);
		
		
		
	}
}
