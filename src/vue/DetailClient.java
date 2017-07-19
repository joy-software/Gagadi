package vue;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

/**
 *
 * @author DOCTEURWAMBA
 */
@SuppressWarnings("serial")
public class DetailClient {

	public JFrame detailClient;
	private JPanel contentPane;
	private JButton jButton1_Modifier;
	private JButton jButton2_Supprimer;
	private JButton jButton3_Fermer;
	private JLabel jLabel1_Titre;
	private JLabel jLabel10;
	private JLabel jLabel8_Pays;
	private JLabel jLabel9_BP;
	private JLabel jLabel2_Nom;
	private JLabel jLabel3_Prénom;
	private JLabel jLabel4_Sexe;
	private JLabel jLabel5_Tél;
	private JLabel jLabel6_Email;
	private JLabel jLabel7_Adresse;
	private JLabel jLabel8;
	private JLabel jLabel9;
	private JTextField jTextField1_Nom;
	private JTextField jTextField2_Prénom;
	private JTextField jTextField3_Tel;
	private JTextField jTextField4_Email;
	private JTextField jTextField5_Adresse;
	private JTextField jTextField6_BP;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel label_Icone;
	private String[] values1;
	private JTextField jTextField_Pays;
	private JTextField jTextField_1_Sexe;
	private JLabel lblIdentifiant;
	private JTextField textField_Identifiant;
	private String[] values2;
	private ArrayList<JTextField> jTextField;
	
    /**
     * Creates new form CompteClient
     */
    public DetailClient(String[] values) {
        initComponents(values);
    }

    /**
     * initComponents() permettra d'initialiser tous les composants
     * et de gérer les évènements*/                         
    private void initComponents(String[] values) {

    	detailClient = new JFrame();
    	Cursor c = new Cursor(12);
        
    	jLabel10 = new JLabel();
        jLabel10.setCursor(c);

        /**
         * values1 est un tableau de String où sera stocké les différentes valeurs des champs de saisie
         * C'est à dire les informations sur le client
         * */
        values1 = values;
        
        /**
         * values2 contiendra le nom et le prénom du client que l'on veut supprimer
         * */
        values2 = new String[2];

        jLabel10.setText("jLabel10");

        contentPane = new JPanel();
        detailClient.setDefaultCloseOperation(detailClient.DISPOSE_ON_CLOSE);
        detailClient.setTitle("Paramètres du client");
        detailClient.setContentPane(contentPane);
        contentPane.setBackground(new Color(255, 255, 255));
        detailClient.setBounds(400, 50, 566, 503);
        
        GridBagLayout gbl_contentPane = new GridBagLayout();
        gbl_contentPane.columnWidths = new int[]{69, 43, 15, 97, 133, 89, 84, 0};
        gbl_contentPane.rowHeights = new int[]{35, 22, 20, 27, 22, 22, 22, 22, 22, 27, 24, 22, 22, 46, 0, 23, 0};
        gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        contentPane.setLayout(gbl_contentPane);
                        
        label_Icone = new JLabel("");
        label_Icone.setIcon(new ImageIcon("C:\\Users\\DOCTEURWAMBA\\Pictures\\Ora\\client.png"));
        GridBagConstraints gbc_label_Icone = new GridBagConstraints();
        gbc_label_Icone.anchor = GridBagConstraints.NORTHWEST;
        gbc_label_Icone.insets = new Insets(0, 0, 5, 5);
        gbc_label_Icone.gridheight = 2;
        gbc_label_Icone.gridwidth = 2;
        gbc_label_Icone.gridx = 1;
        gbc_label_Icone.gridy = 0;
        contentPane.add(label_Icone, gbc_label_Icone);
        
        jLabel1_Titre = new JLabel();
        jLabel1_Titre.setForeground(new Color(199, 21, 133));
        jLabel1_Titre.setCursor(c);
                        
        jLabel1_Titre.setBackground(new Color(102, 102, 102));
        jLabel1_Titre.setFont(new Font("Cambria", Font.BOLD, 18));
        jLabel1_Titre.setText("Informations sur le client");
        GridBagConstraints gbc_jLabel1_Titre = new GridBagConstraints();
        gbc_jLabel1_Titre.anchor = GridBagConstraints.SOUTHWEST;
        gbc_jLabel1_Titre.insets = new Insets(0, 0, 5, 5);
        gbc_jLabel1_Titre.gridwidth = 2;
        gbc_jLabel1_Titre.gridx = 3;
        gbc_jLabel1_Titre.gridy = 0;
        contentPane.add(jLabel1_Titre, gbc_jLabel1_Titre);

        JSeparator separator = new JSeparator();
        GridBagConstraints gbc_separator = new GridBagConstraints();
        gbc_separator.anchor = GridBagConstraints.NORTH;
        gbc_separator.fill = GridBagConstraints.HORIZONTAL;
        gbc_separator.insets = new Insets(0, 0, 5, 5);
        gbc_separator.gridwidth = 2;
        gbc_separator.gridx = 3;
        gbc_separator.gridy = 1;
        contentPane.add(separator, gbc_separator);
                
        lblIdentifiant = new JLabel("Identifiant :");
        lblIdentifiant.setFont(new Font("Cambria", Font.PLAIN, 14));
        GridBagConstraints gbc_lblIdentifiant = new GridBagConstraints();
        gbc_lblIdentifiant.anchor = GridBagConstraints.NORTHEAST;
        gbc_lblIdentifiant.insets = new Insets(0, 0, 5, 5);
        gbc_lblIdentifiant.gridx = 3;
        gbc_lblIdentifiant.gridy = 2;
        contentPane.add(lblIdentifiant, gbc_lblIdentifiant);
        
        textField_Identifiant = new JTextField();
        textField_Identifiant.setEditable(false);
        textField_Identifiant.setColumns(10);
        textField_Identifiant.setText(values[0]);
        GridBagConstraints gbc_textField_Identifiant = new GridBagConstraints();
        gbc_textField_Identifiant.anchor = GridBagConstraints.NORTHWEST;
        gbc_textField_Identifiant.insets = new Insets(0, 0, 5, 5);
        gbc_textField_Identifiant.gridx = 4;
        gbc_textField_Identifiant.gridy = 2;
        contentPane.add(textField_Identifiant, gbc_textField_Identifiant);

        jLabel8 = new JLabel();
        jLabel8.setBounds(10, 0, 183, 20);
        jLabel8.setCursor(c);
                                
	    jLabel8.setFont(new Font("Cambria", 0, 16));
	    jLabel8.setText("Informations personnelles");
	    
	    JPanel jPanel1 = new JPanel();
	    jPanel1.setLayout(null);
	    jPanel1.add(jLabel8);
	    GridBagConstraints gbc_jPanel1 = new GridBagConstraints();
	    gbc_jPanel1.fill = GridBagConstraints.BOTH;
	    gbc_jPanel1.insets = new Insets(0, 0, 5, 0);
	    gbc_jPanel1.gridwidth = 7;
	    gbc_jPanel1.gridx = 0;
	    gbc_jPanel1.gridy = 3;
	    contentPane.add(jPanel1, gbc_jPanel1);
                        
	    jLabel2_Nom = new JLabel();
	    jLabel2_Nom.setCursor(c);
	    
	    jLabel2_Nom.setFont(new Font("Cambria", 0, 14));
	    jLabel2_Nom.setText("Noms :");
	    GridBagConstraints gbc_jLabel2_Nom = new GridBagConstraints();
	    gbc_jLabel2_Nom.anchor = GridBagConstraints.EAST;
	    gbc_jLabel2_Nom.insets = new Insets(0, 0, 5, 5);
	    gbc_jLabel2_Nom.gridx = 0;
	    gbc_jLabel2_Nom.gridy = 4;
	    contentPane.add(jLabel2_Nom, gbc_jLabel2_Nom);
	    
        jTextField2_Prénom = new JTextField();
        jTextField2_Prénom.setBackground(new Color(230, 230, 250));
        jTextField2_Prénom.setFont(new Font("Cambria", Font.PLAIN, 13));
        jTextField2_Prénom.setEditable(false);
        jTextField2_Prénom.setCursor(c);
        jTextField2_Prénom.setText(values[2]);
	            
        jTextField1_Nom = new JTextField();
        jTextField1_Nom.setBackground(new Color(230, 230, 250));
        jTextField1_Nom.setFont(new Font("Cambria", Font.PLAIN, 13));
        jTextField1_Nom.setEditable(false);
        jTextField1_Nom.setCursor(c);
        jTextField1_Nom.setText(values[1]);
        GridBagConstraints gbc_jTextField1_Nom = new GridBagConstraints();
        gbc_jTextField1_Nom.anchor = GridBagConstraints.NORTH;
        gbc_jTextField1_Nom.fill = GridBagConstraints.HORIZONTAL;
        gbc_jTextField1_Nom.insets = new Insets(0, 0, 5, 5);
        gbc_jTextField1_Nom.gridwidth = 4;
        gbc_jTextField1_Nom.gridx = 2;
        gbc_jTextField1_Nom.gridy = 4;
        contentPane.add(jTextField1_Nom, gbc_jTextField1_Nom);
	            
	    jLabel3_Prénom = new JLabel();
	    jLabel3_Prénom.setCursor(c);
	            
        jLabel3_Prénom.setFont(new Font("Cambria", 0, 14));
        jLabel3_Prénom.setText("Prénoms : ");
        GridBagConstraints gbc_jLabel3_Prénom = new GridBagConstraints();
        gbc_jLabel3_Prénom.insets = new Insets(0, 0, 5, 5);
        gbc_jLabel3_Prénom.gridwidth = 2;
        gbc_jLabel3_Prénom.gridx = 0;
		gbc_jLabel3_Prénom.gridy = 5;
        contentPane.add(jLabel3_Prénom, gbc_jLabel3_Prénom);
        GridBagConstraints gbc_jTextField2_Prénom = new GridBagConstraints();
        gbc_jTextField2_Prénom.anchor = GridBagConstraints.NORTH;
        gbc_jTextField2_Prénom.fill = GridBagConstraints.HORIZONTAL;
        gbc_jTextField2_Prénom.insets = new Insets(0, 0, 5, 5);
        gbc_jTextField2_Prénom.gridwidth = 4;
        gbc_jTextField2_Prénom.gridx = 2;
        gbc_jTextField2_Prénom.gridy = 5;
        contentPane.add(jTextField2_Prénom, gbc_jTextField2_Prénom);
                        
        jLabel4_Sexe = new JLabel();
        jLabel4_Sexe.setCursor(c);
                        
        jLabel4_Sexe.setFont(new Font("Cambria", 0, 14));
        jLabel4_Sexe.setText("Sexe :");
        GridBagConstraints gbc_jLabel4_Sexe = new GridBagConstraints();
        gbc_jLabel4_Sexe.anchor = GridBagConstraints.EAST;
        gbc_jLabel4_Sexe.insets = new Insets(0, 0, 5, 5);
        gbc_jLabel4_Sexe.gridx = 0;
        gbc_jLabel4_Sexe.gridy = 6;
        contentPane.add(jLabel4_Sexe, gbc_jLabel4_Sexe);
                        
        jTextField_1_Sexe = new JTextField();
        jTextField_1_Sexe.setText(values[3]);
        jTextField_1_Sexe.setFont(new Font("Cambria", Font.PLAIN, 13));
        jTextField_1_Sexe.setEditable(false);
        jTextField_1_Sexe.setBackground(new Color(230, 230, 250));
        GridBagConstraints gbc_jTextField_1_Sexe = new GridBagConstraints();
        gbc_jTextField_1_Sexe.anchor = GridBagConstraints.NORTH;
        gbc_jTextField_1_Sexe.fill = GridBagConstraints.HORIZONTAL;
        gbc_jTextField_1_Sexe.insets = new Insets(0, 0, 5, 5);
        gbc_jTextField_1_Sexe.gridwidth = 4;
        gbc_jTextField_1_Sexe.gridx = 2;
        gbc_jTextField_1_Sexe.gridy = 6;
        contentPane.add(jTextField_1_Sexe, gbc_jTextField_1_Sexe);
                        
        jLabel5_Tél = new JLabel();
        jLabel5_Tél.setCursor(c);
                        
        jLabel5_Tél.setFont(new Font("Cambria", 0, 14));
        jLabel5_Tél.setText("Téléphone :");
        GridBagConstraints gbc_jLabel5_Tél = new GridBagConstraints();
        gbc_jLabel5_Tél.insets = new Insets(0, 0, 5, 5);
        gbc_jLabel5_Tél.gridwidth = 2;
        gbc_jLabel5_Tél.gridx = 0;
        gbc_jLabel5_Tél.gridy = 7;
        contentPane.add(jLabel5_Tél, gbc_jLabel5_Tél);
                
        jTextField3_Tel = new JTextField();
        jTextField3_Tel.setBackground(new Color(230, 230, 250));
        jTextField3_Tel.setFont(new Font("Cambria", Font.PLAIN, 13));
        jTextField3_Tel.setEditable(false);
        jTextField3_Tel.setCursor(c);
        jTextField3_Tel.setText(values[4]);
        GridBagConstraints gbc_jTextField3_Tel = new GridBagConstraints();
        gbc_jTextField3_Tel.anchor = GridBagConstraints.NORTH;
        gbc_jTextField3_Tel.fill = GridBagConstraints.HORIZONTAL;
        gbc_jTextField3_Tel.insets = new Insets(0, 0, 5, 5);
        gbc_jTextField3_Tel.gridwidth = 4;
        gbc_jTextField3_Tel.gridx = 2;
        gbc_jTextField3_Tel.gridy = 7;
        contentPane.add(jTextField3_Tel, gbc_jTextField3_Tel);
                                
        jLabel6_Email = new JLabel();
        jLabel6_Email.setCursor(c);
                                
        jLabel6_Email.setFont(new Font("Cambria", 0, 14));
        jLabel6_Email.setText("Email :");
        GridBagConstraints gbc_jLabel6_Email = new GridBagConstraints();
        gbc_jLabel6_Email.anchor = GridBagConstraints.EAST;
        gbc_jLabel6_Email.insets = new Insets(0, 0, 5, 5);
        gbc_jLabel6_Email.gridx = 0;
        gbc_jLabel6_Email.gridy = 8;
        contentPane.add(jLabel6_Email, gbc_jLabel6_Email);

        jTextField4_Email = new JTextField();
        jTextField4_Email.setBackground(new Color(230, 230, 250));
        jTextField4_Email.setFont(new Font("Cambria", Font.PLAIN, 13));
        jTextField4_Email.setEditable(false);
        jTextField4_Email.setCursor(c);
        jTextField4_Email.setText(values[5]);
        GridBagConstraints gbc_jTextField4_Email = new GridBagConstraints();
        gbc_jTextField4_Email.anchor = GridBagConstraints.NORTH;
        gbc_jTextField4_Email.fill = GridBagConstraints.HORIZONTAL;
        gbc_jTextField4_Email.insets = new Insets(0, 0, 5, 5);
        gbc_jTextField4_Email.gridwidth = 4;
        gbc_jTextField4_Email.gridx = 2;
        gbc_jTextField4_Email.gridy = 8;
        contentPane.add(jTextField4_Email, gbc_jTextField4_Email);

        jLabel9 = new JLabel();
        jLabel9.setBounds(10, 0, 209, 20);
        jLabel9.setCursor(c);
        
                                                
        jLabel9.setFont(new Font("Cambria", 0, 16));
        jLabel9.setText("Informations supplémentaires");
        
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(null);
        jPanel2.add(jLabel9);
        GridBagConstraints gbc_jPanel2 = new GridBagConstraints();
        gbc_jPanel2.fill = GridBagConstraints.BOTH;
        gbc_jPanel2.insets = new Insets(0, 0, 5, 0);
        gbc_jPanel2.gridwidth = 7;
        gbc_jPanel2.gridx = 0;
        gbc_jPanel2.gridy = 9;
        contentPane.add(jPanel2, gbc_jPanel2);
                        
        jLabel7_Adresse = new JLabel();
        jLabel7_Adresse.setCursor(c);
                                
        jLabel7_Adresse.setFont(new Font("Cambria", 0, 14));
        jLabel7_Adresse.setText("Adresse :");
        GridBagConstraints gbc_jLabel7_Adresse = new GridBagConstraints();
        gbc_jLabel7_Adresse.insets = new Insets(0, 0, 5, 5);
        gbc_jLabel7_Adresse.gridwidth = 2;
        gbc_jLabel7_Adresse.gridx = 0;
        gbc_jLabel7_Adresse.gridy = 10;
        contentPane.add(jLabel7_Adresse, gbc_jLabel7_Adresse);
                                
        jTextField5_Adresse = new JTextField();
        jTextField5_Adresse.setBackground(new Color(230, 230, 250));
        jTextField5_Adresse.setFont(new Font("Cambria", Font.PLAIN, 13));
        jTextField5_Adresse.setEditable(false);
        jTextField5_Adresse.setCursor(c);
        jTextField5_Adresse.setText(values[6]);
        GridBagConstraints gbc_jTextField5_Adresse = new GridBagConstraints();
        gbc_jTextField5_Adresse.fill = GridBagConstraints.BOTH;
        gbc_jTextField5_Adresse.insets = new Insets(0, 0, 5, 5);
        gbc_jTextField5_Adresse.gridwidth = 4;
        gbc_jTextField5_Adresse.gridx = 2;
        gbc_jTextField5_Adresse.gridy = 10;
        contentPane.add(jTextField5_Adresse, gbc_jTextField5_Adresse);
                        
        jLabel8_Pays = new JLabel();
        jLabel8_Pays.setCursor(c);
                                
        jLabel8_Pays.setFont(new Font("Cambria", 0, 14));
        jLabel8_Pays.setText("Pays :");
        GridBagConstraints gbc_jLabel8_Pays = new GridBagConstraints();
        gbc_jLabel8_Pays.anchor = GridBagConstraints.EAST;
        gbc_jLabel8_Pays.insets = new Insets(0, 0, 5, 5);
        gbc_jLabel8_Pays.gridx = 0;
        gbc_jLabel8_Pays.gridy = 11;
        contentPane.add(jLabel8_Pays, gbc_jLabel8_Pays);
        
        jTextField_Pays = new JTextField();
        jTextField_Pays.setText(values[7]);
        jTextField_Pays.setFont(new Font("Cambria", Font.PLAIN, 13));
        jTextField_Pays.setEditable(false);
        jTextField_Pays.setBackground(new Color(230, 230, 250));
        GridBagConstraints gbc_jTextField_Pays = new GridBagConstraints();
        gbc_jTextField_Pays.anchor = GridBagConstraints.NORTH;
        gbc_jTextField_Pays.fill = GridBagConstraints.HORIZONTAL;
        gbc_jTextField_Pays.insets = new Insets(0, 0, 5, 5);
        gbc_jTextField_Pays.gridwidth = 4;
        gbc_jTextField_Pays.gridx = 2;
        gbc_jTextField_Pays.gridy = 11;
        contentPane.add(jTextField_Pays, gbc_jTextField_Pays);

        jLabel9_BP = new JLabel();
        jLabel9_BP.setCursor(c);
                                        
        jLabel9_BP.setFont(new Font("Cambria", 0, 14));
        jLabel9_BP.setText("Boîte postale :");
        GridBagConstraints gbc_jLabel9_BP = new GridBagConstraints();
        gbc_jLabel9_BP.anchor = GridBagConstraints.EAST;
        gbc_jLabel9_BP.insets = new Insets(0, 0, 5, 5);
        gbc_jLabel9_BP.gridwidth = 2;
        gbc_jLabel9_BP.gridx = 0;
        gbc_jLabel9_BP.gridy = 12;
        contentPane.add(jLabel9_BP, gbc_jLabel9_BP);
                        
        jTextField6_BP = new JTextField();
        jTextField6_BP.setBackground(new Color(230, 230, 250));
        jTextField6_BP.setFont(new Font("Cambria", Font.PLAIN, 13));
        jTextField6_BP.setEditable(false);
        jTextField6_BP.setCursor(c);
        jTextField6_BP.setText(values[8]);
        GridBagConstraints gbc_jTextField6_BP = new GridBagConstraints();
        gbc_jTextField6_BP.anchor = GridBagConstraints.NORTH;
        gbc_jTextField6_BP.fill = GridBagConstraints.HORIZONTAL;
        gbc_jTextField6_BP.insets = new Insets(0, 0, 5, 5);
        gbc_jTextField6_BP.gridwidth = 4;
        gbc_jTextField6_BP.gridx = 2;
        gbc_jTextField6_BP.gridy = 12;
        contentPane.add(jTextField6_BP, gbc_jTextField6_BP);
                        
        jButton1_Modifier = new JButton();
        jButton1_Modifier.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		ModificationClient modifierClient = new ModificationClient(values1, detailClient, jTextField);
        		modifierClient.setVisible(true);
        		modifierClient.setAlwaysOnTop(true);
        		detailClient.setEnabled(false);
        	}
        });
        jButton1_Modifier.setCursor(c);
        
        jButton1_Modifier.setFont(new Font("Cambria", 0, 12));
        jButton1_Modifier.setText("Modifier");
        GridBagConstraints gbc_jButton1_Modifier = new GridBagConstraints();
        gbc_jButton1_Modifier.anchor = GridBagConstraints.NORTHEAST;
        gbc_jButton1_Modifier.insets = new Insets(0, 0, 5, 5);
        gbc_jButton1_Modifier.gridx = 4;
        gbc_jButton1_Modifier.gridy = 14;
        contentPane.add(jButton1_Modifier, gbc_jButton1_Modifier);

        jButton2_Supprimer = new JButton();
        jButton2_Supprimer.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		values2[0] = jTextField1_Nom.getText();
                values2[1] = jTextField2_Prénom.getText();
        		SuppressionClient supprimerClient = new SuppressionClient(values2,detailClient);
        		supprimerClient.setVisible(true);
        		detailClient.setEnabled(false);
        	}
        });
        jButton2_Supprimer.setCursor(c);
                        
        jButton2_Supprimer.setFont(new Font("Cambria", 0, 12));
        jButton2_Supprimer.setText("Supprimer");
        GridBagConstraints gbc_jButton2_Supprimer = new GridBagConstraints();
        gbc_jButton2_Supprimer.anchor = GridBagConstraints.NORTHWEST;
        gbc_jButton2_Supprimer.insets = new Insets(0, 0, 5, 5);
        gbc_jButton2_Supprimer.gridx = 5;
        gbc_jButton2_Supprimer.gridy = 14;
        contentPane.add(jButton2_Supprimer, gbc_jButton2_Supprimer);

        jButton3_Fermer = new JButton();
        jButton3_Fermer.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		detailClient.dispose();
        	}
        });
        jButton3_Fermer.setCursor(c);
	
	    jButton3_Fermer.setFont(new Font("Cambria", 0, 12));
	    jButton3_Fermer.setText("Fermer");
	    GridBagConstraints gbc_jButton3_Fermer = new GridBagConstraints();
	    gbc_jButton3_Fermer.insets = new Insets(0, 0, 5, 0);
	    gbc_jButton3_Fermer.anchor = GridBagConstraints.NORTHWEST;
	    gbc_jButton3_Fermer.gridx = 6;
	    gbc_jButton3_Fermer.gridy = 14;
	    contentPane.add(jButton3_Fermer, gbc_jButton3_Fermer);
        detailClient.pack();
        
        /**
         * jTextField est un tableau de JTextField
         * Ceci nous permettra de modifier ces champs dans la table modifier
         * */
        jTextField = new ArrayList<JTextField>();
        jTextField.add(jTextField1_Nom);
        jTextField.add(jTextField2_Prénom);
        jTextField.add(jTextField_1_Sexe);
        jTextField.add(jTextField3_Tel);
        jTextField.add(jTextField4_Email);
        jTextField.add(jTextField5_Adresse);
        jTextField.add(jTextField_Pays);
        jTextField.add(jTextField6_BP);
    }
 
	/**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DetailClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            	String[] values = new String[] {"oie","douglas","Wamba","Femme","jkdfd","kfdjl","France","France","dlksj"};
            	new DetailClient(values).detailClient.setVisible(true);
            }
        });
    }
}

