package ca.qc.cgodin.Vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;

public class Desktop extends JFrame {

	private JPanel contentPane;
	private ImageIcon depot;
	private ImageIcon retrait;
	private ImageIcon virement;
	private ImageIcon client;
	private ImageIcon compte;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Desktop frame = new Desktop();
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
	public Desktop() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1370, 730);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFichier = new JMenu("Fichier");
		menuBar.add(mnFichier);
		
		JMenuItem menuItem = new JMenuItem("New menu item");
		mnFichier.add(menuItem);
		
		JMenu mnEdition = new JMenu("Edition");
		menuBar.add(mnEdition);
		
		JMenu mnClient = new JMenu("Client");
		menuBar.add(mnClient);
		
		JMenu mnGestion = new JMenu("Gestion");
		menuBar.add(mnGestion);
		
		JMenu mnSession = new JMenu("Session");
		menuBar.add(mnSession);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		
		
		JBackground desktopPane = new JBackground();
		contentPane.add(desktopPane, BorderLayout.CENTER);
		
		JToolBar toolBar = new JToolBar();
		contentPane.add(toolBar, BorderLayout.NORTH);
		
		depot = new ImageIcon("resources\\Depot.png");
		retrait = new ImageIcon("resources\\Retrait.png");
		virement = new ImageIcon("resources\\Virement.png");
		client = new ImageIcon("resources\\Client.png");
		compte = new ImageIcon("resources\\Compte.png");
		
		JButton btn1 = new JButton("Dépot ");
		btn1.setSize(90, 50);
		btn1.setIcon(depot);
		toolBar.addSeparator();
		toolBar.add(btn1);
		
		JButton btn2 = new JButton("Retrait ");
		btn2.setSize(90, 50);
		btn2.setIcon(retrait);
		toolBar.addSeparator();
		toolBar.add(btn2);
		
		JButton btn3 = new JButton("Virement ");
		btn3.setSize(90, 50);
		btn3.setIcon(virement);
		toolBar.addSeparator();
		toolBar.add(btn3);
		
		JButton btn4 = new JButton("Client ");
		btn4.setSize(90, 50);
		btn4.setIcon(client);
		toolBar.addSeparator();
		toolBar.add(btn4);
		
		JButton btn5 = new JButton("Transactions ");
		btn5.setSize(90, 50);
		btn5.setIcon(compte);
		toolBar.addSeparator();
		toolBar.add(btn5);
	}
}
