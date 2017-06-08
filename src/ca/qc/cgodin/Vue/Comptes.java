package ca.qc.cgodin.Vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.border.EtchedBorder;
import javax.swing.JComboBox;
import java.awt.Font;

public class Comptes extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private ImageIcon logo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Comptes frame = new Comptes();
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
	public Comptes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCompte = new JLabel("Compte :");
		lblCompte.setBounds(40, 61, 74, 14);
		contentPane.add(lblCompte);
		
		textField = new JTextField();
		textField.setBounds(109, 55, 194, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		table = new JTable();
		table.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(0, 0, 255), null));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{new Integer(1), "2017-04-04", "Depot", "4321-000001-120001", "n/a", new Double(100.0), new Double(2318.25)},
				{new Integer(2), "2017-04-09", "Depot", "4321-000001-120001", "n/a", new Double(250.25), new Double(2568.5)},
				{new Integer(3), "2017-04-23", "Virement", "4321-000001-120001", "4321-000002-160008", new Double(300.25), new Double(2268.25)},
				{new Integer(4), "2017-05-05", "Retrait", "4321-000001-120001", "n/a", new Double(400.0), new Double(1868.25)},
				{new Integer(5), "2017-06-01", "Depot", "4321-000001-120001", "n/a", new Double(50.0), new Double(1918.25)},
				{new Integer(6), null, null, null, null, null, null},
				{new Integer(7), null, null, null, null, null, null},
				{new Integer(8), null, null, null, null, null, null},
				{new Integer(9), null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"Id", "Date", "Transaction", "Du Compte ...", "... vers Compte", "Montant", "Solde"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, Object.class, String.class, String.class, Double.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(28);
		table.getColumnModel().getColumn(1).setPreferredWidth(90);
		table.getColumnModel().getColumn(2).setPreferredWidth(66);
		table.getColumnModel().getColumn(3).setPreferredWidth(160);
		table.getColumnModel().getColumn(4).setPreferredWidth(160);
		table.getColumnModel().getColumn(6).setPreferredWidth(92);
		table.setBounds(40, 242, 582, 160);
		contentPane.add(table);
		
		JLabel lblId = new JLabel("Id");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblId.setBounds(40, 229, 26, 14);
		contentPane.add(lblId);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDate.setBounds(64, 229, 46, 14);
		contentPane.add(lblDate);
		
		JLabel lblInfo = new JLabel("Info1");
		lblInfo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblInfo.setBounds(145, 229, 46, 14);
		contentPane.add(lblInfo);
		
		JLabel lblInfo_1 = new JLabel("Info2");
		lblInfo_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblInfo_1.setBounds(201, 229, 46, 14);
		contentPane.add(lblInfo_1);
		
		JLabel lblInfo_2 = new JLabel("Info3");
		lblInfo_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblInfo_2.setBounds(339, 229, 46, 14);
		contentPane.add(lblInfo_2);
		
		JLabel lblSolde = new JLabel("solde");
		lblSolde.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSolde.setBounds(543, 229, 46, 14);
		contentPane.add(lblSolde);
		
		JLabel lblInfo_3 = new JLabel("Info4");
		lblInfo_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblInfo_3.setBounds(477, 229, 46, 14);
		contentPane.add(lblInfo_3);
		
		JLabel lblPriodeDeVisualisation = new JLabel("P\u00E9riode de visualisation :");
		lblPriodeDeVisualisation.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPriodeDeVisualisation.setBounds(40, 111, 151, 14);
		contentPane.add(lblPriodeDeVisualisation);
		
		JComboBox cboAnnee = new JComboBox();
		cboAnnee.setBounds(111, 136, 97, 20);
		cboAnnee.addItem("Année...");
		for(int i=2017;i>1989;i--){
			cboAnnee.addItem(""+i);
		}
		contentPane.add(cboAnnee);
		
		JComboBox cboMois = new JComboBox();
		cboMois.setBounds(218, 136, 89, 20);
		cboMois.addItem("Mois...");
		cboMois.addItem("Janvier");
		cboMois.addItem("Février");
		cboMois.addItem("Mars");
		cboMois.addItem("Avril");
		cboMois.addItem("Mai");
		cboMois.addItem("Juin");
		cboMois.addItem("Juillet");
		cboMois.addItem("Aout");
		cboMois.addItem("Septembre");
		cboMois.addItem("Octobre");
		cboMois.addItem("Novembre");
		cboMois.addItem("Décembre");
		contentPane.add(cboMois);
		
		JComboBox cboJour = new JComboBox();
		cboJour.setBounds(317, 136, 62, 20);
		cboJour.addItem("Jour...");
		for(int j=1; j<=31; j++){
			cboJour.addItem(j);
		}
		contentPane.add(cboJour);
		
		JLabel lblDebut = new JLabel("D\u00E9but :");
		lblDebut.setBounds(53, 136, 46, 14);
		contentPane.add(lblDebut);
		
		JComboBox cboAnneeFin = new JComboBox();
		cboAnneeFin.setBounds(111, 165, 97, 20);
		cboAnneeFin.addItem("Année...");
		for(int i=2017;i>1999;i--){
			cboAnneeFin.addItem(""+i);
		}
		contentPane.add(cboAnneeFin);
		
		JComboBox cboMoisFin = new JComboBox();
		cboMoisFin.setBounds(218, 165, 89, 20);
		cboMoisFin.addItem("Mois...");
		cboMoisFin.addItem("Janvier");
		cboMoisFin.addItem("Février");
		cboMoisFin.addItem("Mars");
		cboMoisFin.addItem("Avril");
		cboMoisFin.addItem("Mai");
		cboMoisFin.addItem("Juin");
		cboMoisFin.addItem("Juillet");
		cboMoisFin.addItem("Aout");
		cboMoisFin.addItem("Septembre");
		cboMoisFin.addItem("Octobre");
		cboMoisFin.addItem("Novembre");
		cboMoisFin.addItem("Décembre");
		contentPane.add(cboMoisFin);
		
		JComboBox cboJourFin = new JComboBox();
		cboJourFin.setBounds(317, 165, 62, 20);
		cboJourFin.addItem("Jour...");
		for(int j=1; j<=31; j++){
			cboJourFin.addItem(j);
		}
		contentPane.add(cboJourFin);
		
		JLabel lblFin = new JLabel("Fin :");
		lblFin.setBounds(53, 168, 46, 14);
		contentPane.add(lblFin);
		
		logo = new ImageIcon("resources\\BGG_ico.png");
		
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(561, 16, 140, 148);
		lblLogo.setIcon(logo);
		contentPane.add(lblLogo);
		
		
		
		
	}
}
