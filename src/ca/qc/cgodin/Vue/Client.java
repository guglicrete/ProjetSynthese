package ca.qc.cgodin.Vue;


import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import ca.qc.cgodin.Modele.Compte;

import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class Client extends JFrame  implements ActionListener, KeyListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panelClient;
	private JRadioButton rdbtnParticulier;
	private JRadioButton rdbtnEntreprise;
	private JRadioButton rdbtnFemme;
	private JRadioButton rdbtnHomme;
	private JButton btnEnregistrer;
	private JButton btnDepot;
	private JButton btnRetrait;
	private JButton btnVirement;
	private JButton btnVisualiser;
	private JTextField txtId;
	private JTextField txtNom;
	private JTextField txtTelprinc;
	private JTextField txtTelsec;
	private JTextField txtTelmobile;
	private JTextField txtFax;
	private JTextField txtPostePr;
	private JTextField txtPosteSc;
	private JTextField txtNAS;
	private JTextField txtNEQ;
	private JTextField txtURL;
	private JLabel lblNAS;
	private JLabel lblSexe;
	private JLabel lblNEQ;
	private JLabel lblURL;
	private JTextArea textArea;
	private ImageIcon logo;
	private ImageIcon depot;
	private ImageIcon retrait;
	private ImageIcon virement;
	private ImageIcon client;
	private ImageIcon compte;
	private ArrayList<Compte> listeComptes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Client frame = new Client();
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
	public Client() {
		super("Client");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(160, 80, 900, 550);
		panelClient = new JPanel();
		panelClient.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelClient);
		panelClient.setLayout(null);
		
		rdbtnParticulier = new JRadioButton("Particulier");
		rdbtnParticulier.setBounds(6, 7, 109, 23);
		rdbtnParticulier.setSelected(true);
		rdbtnParticulier.addActionListener(this);
		panelClient.add(rdbtnParticulier);
		
		rdbtnEntreprise = new JRadioButton("Entreprise");
		rdbtnEntreprise.setBounds(117, 7, 109, 23);
		rdbtnEntreprise.setSelected(false);
		rdbtnEntreprise.addActionListener(this);
		panelClient.add(rdbtnEntreprise);
		
		ButtonGroup groupClient = new ButtonGroup();
		groupClient.add(rdbtnParticulier);
		groupClient.add(rdbtnEntreprise);
		
		
		// section Id
		
		JLabel lblId = new JLabel("ID :");
		lblId.setBounds(6, 43, 46, 14);
		panelClient.add(lblId);
		
		txtId = new JTextField();
		txtId.setBounds(70, 37, 266, 20);
		txtId.setColumns(10);
		txtId.setEditable(false);
		panelClient.add(txtId);
		
		JLabel lblNom = new JLabel("Nom :");
		lblNom.setBounds(6, 68, 46, 14);
		panelClient.add(lblNom);
		
		txtNom = new JTextField();
		txtNom.setBounds(70, 62, 266, 20);
		txtNom.setColumns(10);
		txtNom.addKeyListener(this);
		panelClient.add(txtNom);
		
		
		
		// section qui alterne si particulier ou entreprise 
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 157, 336, 2);
		panelClient.add(separator);
		
		afficherParticulier();
		afficherEntreprise();
		
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 93, 336, 2);
		panelClient.add(separator_2);
		
		// section adresse
		
		JLabel lblAdresse = new JLabel("Adresse :");
		lblAdresse.setBounds(6, 180, 60, 14);
		panelClient.add(lblAdresse);
		
		textArea = new JTextArea();
		textArea.setBounds(70, 177, 266, 98);
		textArea.addKeyListener(this);
		Border loweredbevel;
		loweredbevel = BorderFactory.createLoweredBevelBorder();
		textArea.setBorder(loweredbevel);
		panelClient.add(textArea);
		
		// section telephone
		
		JLabel lblTelephones = new JLabel("T\u00E9l\u00E9phones :");
		lblTelephones.setBounds(6, 292, 91, 14);
		panelClient.add(lblTelephones);
		
		JLabel lblPrincipale = new JLabel("Principale :");
		lblPrincipale.setBounds(31, 317, 66, 14);
		panelClient.add(lblPrincipale);
		
		txtTelprinc = new JTextField();
		txtTelprinc.setBounds(107, 314, 135, 20);
		txtTelprinc.setColumns(10);
		txtTelprinc.addKeyListener(this);
		panelClient.add(txtTelprinc);
		
		
		JLabel lblSecondaire = new JLabel("Secondaire :");
		lblSecondaire.setBounds(23, 342, 74, 14);
		panelClient.add(lblSecondaire);
		
		txtTelsec = new JTextField();
		txtTelsec.setBounds(107, 339, 135, 20);
		txtTelsec.setColumns(10);
		txtTelsec.addKeyListener(this);
		panelClient.add(txtTelsec);
		
		
		JLabel lblMobile = new JLabel("Mobile :");
		lblMobile.setBounds(46, 367, 51, 14);
		panelClient.add(lblMobile);
		
		txtTelmobile = new JTextField();
		txtTelmobile.setBounds(107, 364, 135, 20);
		txtTelmobile.setColumns(10);
		txtTelmobile.addKeyListener(this);
		panelClient.add(txtTelmobile);
		
		
		JLabel lblFax = new JLabel("Fax :");
		lblFax.setBounds(58, 392, 39, 14);
		panelClient.add(lblFax);
		
		txtFax = new JTextField();
		txtFax.setBounds(107, 389, 135, 20);
		txtFax.setColumns(10);
		txtFax.addKeyListener(this);
		panelClient.add(txtFax);
		
		
		JLabel lblPostes = new JLabel("Postes :");
		lblPostes.setBounds(256, 292, 46, 14);
		panelClient.add(lblPostes);
		
		txtPostePr = new JTextField();
		txtPostePr.setBounds(252, 314, 46, 20);
		txtPostePr.setColumns(10);
		txtPostePr.addKeyListener(this);
		panelClient.add(txtPostePr);
		
		
		txtPosteSc = new JTextField();
		txtPosteSc.setBounds(252, 339, 46, 20);
		txtPosteSc.setColumns(10);
		txtPosteSc.addKeyListener(this);
		panelClient.add(txtPosteSc);

		
		btnEnregistrer = new JButton("Enregistrer");
		btnEnregistrer.setBounds(117, 460, 108, 23);
		btnEnregistrer.addActionListener(this);
		panelClient.add(btnEnregistrer);
		
		JLabel lblComptes_1 = new JLabel("Compte(s) :");
		lblComptes_1.setBounds(399, 40, 66, 14);
		panelClient.add(lblComptes_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(475, 40, 283, 20);
		listeComptes = listeComptes();
		comboBox.addItem("Choisir un compte...");
		for(int i = 0 ; i < listeComptes.size(); i++){
			comboBox.addItem(listeComptes.get(i).getNumero());
		}
		panelClient.add(comboBox);
		
		//Boutons pour transactions sur le compte
		
		depot = new ImageIcon("resources\\Depot.png");
		retrait = new ImageIcon("resources\\Retrait.png");
		virement = new ImageIcon("resources\\Virement.png");
		client = new ImageIcon("resources\\Client.png");
		compte = new ImageIcon("resources\\Compte.png");
		
		btnDepot = new JButton("Depot");
		btnDepot.setBounds(385, 128, 90, 50);
		btnDepot.setMargin(new Insets(0, 0, 0, 0));
		btnDepot.setIcon(depot);
		panelClient.add(btnDepot);
		
		btnRetrait = new JButton("Retrait");
		btnRetrait.setBounds(498, 128, 90, 50);
		btnRetrait.setMargin(new Insets(0, 0, 0, 0));
		btnRetrait.setIcon(retrait);
		panelClient.add(btnRetrait);
		
		btnVirement = new JButton("Virement");
		btnVirement.setBounds(610, 128, 90, 50);
		btnVirement.setMargin(new Insets(0, 0, 0, 0));
		btnVirement.setIcon(virement);
		panelClient.add(btnVirement);
		
		btnVisualiser = new JButton("Transactions");
		btnVisualiser.setBounds(720, 128, 110, 50);
		btnVisualiser.setMargin(new Insets(0, 0, 0, 0));
		btnVisualiser.setIcon(compte);
		panelClient.add(btnVisualiser);
		
		
		//Insertion du logo
		
		logo = new ImageIcon("resources\\BGG_ico.png");
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(504, 270, 141, 231);
		lblLogo.setIcon(logo);
		panelClient.add(lblLogo);
		
		
		
	}

	private ArrayList<Compte> listeComptes() {
		ArrayList<Compte> listeComptes = new ArrayList<Compte>();	
		Compte c1 = new Compte("123-03944-2034305", "Cheque", 2000.00, "CAD"); 
		Compte c2 = new Compte("123-03944-2034307", "Epargne", 500.00, "CAD"); 
		Compte c3 = new Compte("123-03944-2034304", "Cheque", 20000.00, "CAD"); 
		Compte c4 = new Compte("123-03944-2034306", "Epargne", 7000.00, "CAD"); 
		listeComptes.add(c1);
		listeComptes.add(c2);
		listeComptes.add(c3);
		listeComptes.add(c4);
		
		return listeComptes;
	}

	private void afficherParticulier() {
		lblNAS = new JLabel("NAS :");
		lblNAS.setBounds(6, 107, 46, 14);
		panelClient.add(lblNAS);
		
		txtNAS = new JTextField();
		txtNAS.setBounds(70, 104, 266, 20);
		panelClient.add(txtNAS);
		txtNAS.setColumns(10);
		
		lblSexe = new JLabel("Sexe :");
		lblSexe.setBounds(6, 132, 46, 14);
		panelClient.add(lblSexe);
		
		rdbtnFemme = new JRadioButton("Femme");
		rdbtnFemme.setBounds(70, 131, 85, 23);
		panelClient.add(rdbtnFemme);
		
		rdbtnHomme = new JRadioButton("Homme");
		rdbtnHomme.setBounds(157, 131, 91, 23);
		panelClient.add(rdbtnHomme);
		
		ButtonGroup groupSexe = new ButtonGroup();
		groupSexe.add(rdbtnFemme);
		groupSexe.add(rdbtnHomme);
		
	}
	
	private void afficherEntreprise() {
		lblNEQ = new JLabel("NEQ :");
		lblNEQ.setBounds(6, 107, 46, 14);
		panelClient.add(lblNEQ);
		
		txtNEQ = new JTextField();
		txtNEQ.setBounds(70, 104, 266, 20);
		panelClient.add(txtNEQ);
		txtNEQ.setColumns(10);
		
		lblURL = new JLabel("URL :");
		lblURL.setBounds(6, 132, 46, 14);
		panelClient.add(lblURL);
		
		txtURL = new JTextField();
		txtURL.setBounds(70, 132, 266, 20);
		panelClient.add(txtURL);
		txtURL.setColumns(10);
		
		lblNEQ.setVisible(false);
		lblURL.setVisible(false);
		txtNEQ.setVisible(false);
		txtURL.setVisible(false);
		lblNAS.setVisible(true);
		
		
		
	}

	// Actions
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == rdbtnParticulier){
			lblNEQ.setVisible(false);
			lblURL.setVisible(false);
			txtNEQ.setVisible(false);
			txtURL.setVisible(false);
			lblNAS.setVisible(true);
			lblSexe.setVisible(true);
			txtNAS.setVisible(true);
			rdbtnFemme.setVisible(true);
			rdbtnHomme.setVisible(true);
			
		}
		else if(e.getSource() == rdbtnEntreprise){
			lblNAS.setVisible(false);
			lblSexe.setVisible(false);
			txtNAS.setVisible(false);
			rdbtnFemme.setVisible(false);
			rdbtnHomme.setVisible(false);
			lblNEQ.setVisible(true);
			lblURL.setVisible(true);
			txtNEQ.setVisible(true);
			txtURL.setVisible(true);
		}
	}
	
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
	// Getters & Setters   
	
	public JTextField getTxtId() {
		return txtId;
	}

	public JTextField getTxtNom() {
		return txtNom;
	}

	public void setTxtNom(JTextField txtNom) {
		this.txtNom = txtNom;
	}

	public JTextField getTxtTelprinc() {
		return txtTelprinc;
	}

	public void setTxtTelprinc(JTextField txtTelprinc) {
		this.txtTelprinc = txtTelprinc;
	}

	public JTextField getTxtTelsec() {
		return txtTelsec;
	}

	public void setTxtTelsec(JTextField txtTelsec) {
		this.txtTelsec = txtTelsec;
	}

	public JTextField getTxtTelmobile() {
		return txtTelmobile;
	}

	public void setTxtTelmobile(JTextField txtTelmobile) {
		this.txtTelmobile = txtTelmobile;
	}

	public JTextField getTxtFax() {
		return txtFax;
	}

	public void setTxtFax(JTextField txtFax) {
		this.txtFax = txtFax;
	}

	public JTextField getTxtPostePr() {
		return txtPostePr;
	}

	public void setTxtPostePr(JTextField txtPostePr) {
		this.txtPostePr = txtPostePr;
	}

	public JTextField getTxtPosteSc() {
		return txtPosteSc;
	}

	public void setTxtPosteSc(JTextField txtPosteSc) {
		this.txtPosteSc = txtPosteSc;
	}

	public JTextField getTxtNAS() {
		return txtNAS;
	}

	public void setTxtNAS(JTextField txtNAS) {
		this.txtNAS = txtNAS;
	}

	public JTextField getTxtNEQ() {
		return txtNEQ;
	}

	public void setTxtNEQ(JTextField txtNEQ) {
		this.txtNEQ = txtNEQ;
	}

	public JTextField getTxtURL() {
		return txtURL;
	}

	public void setTxtURL(JTextField txtURL) {
		this.txtURL = txtURL;
	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}

	
	// Listener non utilisés
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}


}
