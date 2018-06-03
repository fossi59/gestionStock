package interfaceGraphique;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import objetDao.IClientDao;
import objetDaoImpl.ClientDaoImpl;
import objetJava.Client;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class MyApp extends JFrame {
	IClientDao mode = new ClientDaoImpl();
	

	private JPanel contentPane;
	private JTextField textFieldNom;
	private JTextField textFieldPrenom;
	private JTextField textFieldDateNaissance;
	private JTextField textFieldNumRue;
	private JTextField textFieldNomRue;
	private JTextField textFieldCodePostal;
	private JTextField textFieldVille;
	private JTextField textFieldPays;
	private JTextField textFieldTelephone;
	private JTextField textFieldEmail;
	public JTable table;
	private JTextField textFieldMc;
	private JTextField textFieldIdClient;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyApp frame = new MyApp();
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
	public MyApp() {
		setTitle("Gestion des stocks");
		setForeground(Color.CYAN);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 959, 495);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNom = new JLabel("Nom");
		
		JLabel lblPrenom = new JLabel("Pr\u00E9nom");
		
		JLabel lblDateNaissance = new JLabel("Date Naissance");
		
		JLabel lblNumRue = new JLabel("Num\u00E9ro rue");
		
		JLabel lblNomRue = new JLabel("Nom rue");
		
		JLabel lblCodePostal = new JLabel("CodePostal");
		
		JLabel lblVille = new JLabel("Ville");
		
		JLabel lblPays = new JLabel("Pays");
		
		JLabel lblTelephone = new JLabel("T\u00E9l\u00E9phone");
		
		JLabel lblEmail = new JLabel("Email");
		
		textFieldNom = new JTextField();
		textFieldNom.setColumns(10);
		
		textFieldPrenom = new JTextField();
		textFieldPrenom.setColumns(10);
		
		textFieldDateNaissance = new JTextField();
		textFieldDateNaissance.setColumns(10);
		
		textFieldNumRue = new JTextField();
		textFieldNumRue.setColumns(10);
		
		textFieldNomRue = new JTextField();
		textFieldNomRue.setColumns(10);
		
		textFieldCodePostal = new JTextField();
		textFieldCodePostal.setColumns(10);
		
		textFieldVille = new JTextField();
		textFieldVille.setColumns(10);
		
		textFieldPays = new JTextField();
		textFieldPays.setColumns(10);
		
		textFieldTelephone = new JTextField();
		textFieldTelephone.setColumns(10);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnAjouter) {
					try {
						String query = "insert into client(nomClient, prenomClient, DateNaissance, numRue, nomRue, codePostal, ville, pays, telephone, email) values('"
					+textFieldNom.getText()+"','"+textFieldPrenom.getText()+"','"+textFieldDateNaissance.getText()+"','"+textFieldNumRue.getText()+"','"+textFieldNomRue.getText()+"','"+textFieldCodePostal.getText()+"','"+textFieldVille.getText()+"','"+textFieldPays.getText()+"','"+textFieldTelephone.getText()+"','"+textFieldEmail.getText()+"')";
					
						mode.cudClient(query);
					//Rafraichissement des données de la Jtable
					DefaultTableModel model = (DefaultTableModel)table.getModel();
					model.setRowCount(0);
					afficherClientsDansJtable();
					}catch(Exception ev) {
						ev.printStackTrace();
					}
				}
			}
		});
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnModifier) {
					try {
						String query = "update client set nomClient="+textFieldNom.getText()+", prenomClient="+textFieldPrenom.getText()+", dateNaissance ="+textFieldDateNaissance.getText()+",numRue="+textFieldNumRue.getText()+",nomRue="+textFieldNomRue.getText()+",codePostal="+textFieldCodePostal.getText()+",ville="+textFieldVille.getText()+",pays="+textFieldPays.getText()+", telephone="+textFieldTelephone.getText()+", email="+textFieldEmail.getText()+" where idClient="+textFieldIdClient;
						
						mode.cudClient(query);
						//Rafraichissement des données de la Jtable
						DefaultTableModel model = (DefaultTableModel)table.getModel();
						model.setRowCount(0);
						afficherClientsDansJtable();
					}catch(Exception ev) {
						ev.printStackTrace();
					}
				}
			}
		});
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnSupprimer) {
					try {
						String query = "delete from client where idClient ="+textFieldIdClient;
						mode.cudClient(query);
					}catch(Exception ev) {
					ev.printStackTrace();
				}
			}}
		});
		
		JLabel lblListeDesClients = new JLabel("LISTE DES CLIENTS");
		lblListeDesClients.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		
		textFieldMc = new JTextField();
		textFieldMc.setColumns(10);
		
		JButton btnRechercher = new JButton("Rechercher");
		btnRechercher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnRechercher) {
					try {
						String mc = textFieldMc.getText();
						List<Client> clients = mode.listeClientByMc(mc);
						DefaultTableModel model = (DefaultTableModel) table.getModel();
						model.setRowCount(0);
						Object[] row = new Object[10];
						for(int i=0; i<clients.size();i++) {
							row[0] = clients.get(i).getNomClient();
							row[1] = clients.get(i).getPrenomClt();
							row[2] = clients.get(i).getDateNaissance();
							row[3] = clients.get(i).getNumRue();
							row[4] = clients.get(i).getNomRue();
							row[5] = clients.get(i).getCodePostal();
							row[6] = clients.get(i).getVille();
							row[7] = clients.get(i).getPays();
							row[8] = clients.get(i).getTelephone();
							row[9] = clients.get(i).getEmail();
						
							
							model.addRow(row);
						}
						
					}catch(Exception ev) {
					ev.printStackTrace();
				}
			} 
			}
		});
		
		textFieldIdClient = new JTextField();
		textFieldIdClient.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(68)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblDateNaissance)
								.addComponent(lblNumRue)
								.addComponent(lblNomRue)
								.addComponent(lblCodePostal)
								.addComponent(lblPays)
								.addComponent(lblTelephone)
								.addComponent(lblEmail)
								.addComponent(lblPrenom)
								.addComponent(lblNom))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(textFieldNom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textFieldDateNaissance, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textFieldNumRue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textFieldNomRue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textFieldCodePostal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textFieldTelephone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textFieldPays, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textFieldEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textFieldVille, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textFieldPrenom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(lblVille))
					.addGap(50)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(textFieldIdClient, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
							.addGap(282)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnAjouter)
									.addGap(18)
									.addComponent(btnModifier)
									.addGap(18)
									.addComponent(btnSupprimer))
								.addComponent(lblListeDesClients))
							.addGap(55))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(textFieldMc, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(btnRechercher)
								.addGap(91))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(panel, GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
								.addContainerGap()))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblListeDesClients)
							.addGap(33)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(textFieldMc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnRechercher))
							.addGap(14))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNom)
							.addGap(18))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(textFieldNom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(textFieldPrenom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblPrenom))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblDateNaissance)
								.addComponent(textFieldDateNaissance, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNumRue)
								.addComponent(textFieldNumRue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNomRue)
								.addComponent(textFieldNomRue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCodePostal)
								.addComponent(textFieldCodePostal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblVille)
								.addComponent(textFieldVille, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPays)
								.addComponent(textFieldPays, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblTelephone)
								.addComponent(textFieldTelephone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblEmail)
								.addComponent(textFieldEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnSupprimer)
										.addComponent(btnModifier)
										.addComponent(btnAjouter)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(18)
									.addComponent(textFieldIdClient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap())
		);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int i = table.getSelectedRow();
				TableModel model = table.getModel();
				textFieldNom.setText(model.getValueAt(i, 0).toString());
				textFieldPrenom.setText(model.getValueAt(i, 1).toString());
				textFieldDateNaissance.setText(model.getValueAt(i, 2).toString());
				textFieldNumRue.setText(model.getValueAt(i, 3).toString());
				textFieldNomRue.setText(model.getValueAt(i, 4).toString());
				textFieldCodePostal.setText(model.getValueAt(i, 5).toString());
				textFieldVille.setText(model.getValueAt(i, 6).toString());
				textFieldPays.setText(model.getValueAt(i, 7).toString());
				textFieldTelephone.setText(model.getValueAt(i, 8).toString());
				textFieldEmail.setText(model.getValueAt(i, 9).toString());
				textFieldIdClient.setText(model.getValueAt(i, 10).toString());
			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"", "", "", "", "", "", "", "", "", "", null},
				{"", null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Nom", "Prenom", "Date Naissance", "Numero rue", "Nom rue", "Code Postal", "Ville", "Pays", "Telephone", "Email", "IdClient"
			}
		));
		table.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(table, GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(28, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}

	protected void afficherClientsDansJtable() {
		// TODO Auto-generated method stub
		List<Client>liste = mode.listeClient();
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		Object[] row = new Object[11];
		for(int i=0; i<liste.size();i++) {
			row[0] = liste.get(i).getNomClient();
			row[1] = liste.get(i).getPrenomClt();
			row[2] = liste.get(i).getDateNaissance();
			row[3] = liste.get(i).getNumRue();
			row[4] = liste.get(i).getNomRue();
			row[5] = liste.get(i).getCodePostal();
			row[6] = liste.get(i).getVille();
			row[7] = liste.get(i).getPays();
			row[8] = liste.get(i).getTelephone();
			row[9] = liste.get(i).getEmail();
			row[10] = liste.get(i).getIdClient();
			
			model.addRow(row);
		}
	}
}
