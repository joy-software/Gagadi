package vue;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

/**
 *
 * @author DOCTEURWAMBA
 */

/**
 * CompteFournisseur est une classe qui permettra de créer les nouveaux
 * fournisseurs dans la base de données*/

@SuppressWarnings("serial")
public class ModificationFournisseur extends JFrame{

	private JPanel contentPane;
	private JButton jButton1_Reset;
	private JButton jButton2_Enregistrer;
	private JButton jButton3_Annuler;
	private JLabel jLabel1_Titre;
	private JLabel jLabel10;
	private JLabel jLabel11_Pays;
	private JLabel jLabel2_fournisseur;
	private JLabel jLabel3_prenom;
	private JLabel jLabel4_catégorie;
	private JLabel jLabel5_Tel;
	private JLabel jLabel6_Email;
	private JLabel jLabel7_Adresse;
	private JLabel jLabel8;
	private JLabel jLabel9;
	private JTextField jTextField1_Nom;
	private JTextField jTextField2_Prenom;
	private JTextField jTextField3_Tel;
	private JTextField jTextField4_Email;
	private JTextField jTextField5_Adresse;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JSeparator separator;
	private JLabel label_icone;
	private JLabel lblIdentifiant;
	private JTextField textField_Identifiant;
	private JComboBox comboBox_Catégorie;
	private JComboBox comboBox_1_Pays;
	private String[] values0;
	private String[] values1;
	private JFrame detailClient0;
	private ArrayList<JTextField> jTextField0;
	
    /**
     * Creates new form CompteClient
     */
    public ModificationFournisseur(String[] values, JFrame detailClient, ArrayList<JTextField> jTextField) {
        initComponents(values, detailClient, jTextField);
    }

    /**
     * initComponents() permettra d'initialiser tous les composants
     * et de gérer les évènements*/                         
    private void initComponents(String[] values, JFrame detailClient, ArrayList<JTextField> jTextField) {

    	Cursor c = new Cursor(12);
    	
    	values0 = values;
        
    	jLabel10 = new JLabel();
        jLabel10.setCursor(c);
        
        jLabel1_Titre = new JLabel();
        jLabel1_Titre.setForeground(new Color(199, 21, 133));
        jLabel1_Titre.setCursor(c);
        
        jLabel2_fournisseur = new JLabel();
        jLabel2_fournisseur.setCursor(c);
        
        jLabel3_prenom = new JLabel();
        jLabel3_prenom.setCursor(c);
        
        jLabel4_catégorie = new JLabel();
        jLabel4_catégorie.setCursor(c);
        
        jLabel5_Tel = new JLabel();
        jLabel5_Tel.setCursor(c);
        
        jLabel6_Email = new JLabel();
        jLabel6_Email.setCursor(c);

        jLabel7_Adresse = new JLabel();
        jLabel7_Adresse.setCursor(c);

        jLabel8 = new JLabel();
        jLabel8.setBounds(10, 0, 183, 20);
        jLabel8.setCursor(c);

        jLabel9 = new JLabel();
        jLabel9.setBounds(10, 0, 209, 20);
        jLabel9.setCursor(c);

        jLabel11_Pays = new JLabel();
        jLabel11_Pays.setCursor(c);

        jButton1_Reset = new JButton();
        jButton1_Reset.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		jTextField1_Nom.setText(values0[1]);
        		jTextField2_Prenom.setText(values0[2]);
        		jTextField3_Tel.setText(values0[4]);
        		jTextField4_Email.setText(values0[5]);
        		jTextField5_Adresse.setText(values0[6]);
        		comboBox_Catégorie.setSelectedItem(values0[3]);
        		comboBox_1_Pays.setSelectedItem(values0[7]);
        	}
        });
        jButton1_Reset.setCursor(c);

        
        jButton2_Enregistrer = new JButton();
        jButton2_Enregistrer.setCursor(c);
        jButton2_Enregistrer.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
                jTextField0.get(0).setText(jTextField1_Nom.getText());
                jTextField0.get(1).setText(jTextField2_Prenom.getText());
                jTextField0.get(2).setText((String) comboBox_Catégorie.getSelectedItem());
                jTextField0.get(3).setText(jTextField3_Tel.getText());
                jTextField0.get(4).setText(jTextField4_Email.getText());
                jTextField0.get(4).setText(jTextField5_Adresse.getText());
                jTextField0.get(6).setText((String) comboBox_1_Pays.getSelectedItem());
                
                detailClient0.setEnabled(true);
                dispose();
        	}
        });

        jButton3_Annuler = new JButton();
        jButton3_Annuler.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		detailClient0.setEnabled(true);
        		dispose();
        	}
        });
        jButton3_Annuler.setCursor(c);

        jTextField1_Nom = new JTextField();
        jTextField1_Nom.setBackground(new Color(230, 230, 250));
        jTextField1_Nom.setFont(new Font("Cambria", Font.PLAIN, 13));
        jTextField1_Nom.setCursor(c);
        jTextField1_Nom.setText(values[1]);

        jTextField2_Prenom = new JTextField();
        jTextField2_Prenom.setBackground(new Color(230, 230, 250));
        jTextField2_Prenom.setFont(new Font("Cambria", Font.PLAIN, 13));
        jTextField2_Prenom.setCursor(c);
        jTextField2_Prenom.setText(values[2]);

        jTextField3_Tel = new JTextField();
        jTextField3_Tel.setBackground(new Color(230, 230, 250));
        jTextField3_Tel.setFont(new Font("Cambria", Font.PLAIN, 13));
        jTextField3_Tel.setCursor(c);
        jTextField3_Tel.setText(values[4]);

        jTextField4_Email = new JTextField();
        jTextField4_Email.setBackground(new Color(230, 230, 250));
        jTextField4_Email.setFont(new Font("Cambria", Font.PLAIN, 13));
        jTextField4_Email.setCursor(c);
        jTextField4_Email.setText(values[5]);

        jTextField5_Adresse = new JTextField();
        jTextField5_Adresse.setBackground(new Color(230, 230, 250));
        jTextField5_Adresse.setFont(new Font("Cambria", Font.PLAIN, 13));
        jTextField5_Adresse.setCursor(c);
        jTextField5_Adresse.setText(values[6]);
        
        String[] tableau = {"janvier","fevri"};


        jLabel10.setText("jLabel10");

        contentPane = new JPanel();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Modification InfoFournisseur");
        setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
        setBounds(450, 70, 613, 613);
        
        /**
         * @todo Arranger la taille de la fenêtre
         * */

        jLabel1_Titre.setBackground(new Color(102, 102, 102));
        jLabel1_Titre.setFont(new Font("Cambria", Font.BOLD, 18));
        jLabel1_Titre.setText("Modifier les param\u00E8tres du client");
        
        jLabel2_fournisseur.setFont(new Font("Cambria", 0, 14));
        jLabel2_fournisseur.setText("Noms :");

        jLabel3_prenom.setFont(new Font("Cambria", 0, 14));
        jLabel3_prenom.setText("Prénoms : ");

        jLabel4_catégorie.setFont(new Font("Cambria", 0, 14));
        jLabel4_catégorie.setText("Cat\u00E9gorie :");

        jLabel5_Tel.setFont(new Font("Cambria", 0, 14));
        jLabel5_Tel.setText("Téléphone :");

        jLabel6_Email.setFont(new Font("Cambria", 0, 14));
        jLabel6_Email.setText("Email :");

        jLabel7_Adresse.setFont(new Font("Cambria", 0, 14));
        jLabel7_Adresse.setText("Adresse :");

        jLabel8.setFont(new Font("Cambria", 0, 16));
        jLabel8.setText("Informations personnelles");
        
        JPanel jPanel1 = new JPanel();

        
        jLabel9.setFont(new Font("Cambria", 0, 16));
        jLabel9.setText("Informations supplémentaires");
        
        JPanel jPanel2 = new JPanel();

        jLabel11_Pays.setFont(new Font("Cambria", 0, 14));
        jLabel11_Pays.setText("Pays :");

        jButton1_Reset.setFont(new Font("Cambria", 0, 12));
        jButton1_Reset.setText("Reset");

        jButton2_Enregistrer.setFont(new Font("Cambria", 0, 12));
        jButton2_Enregistrer.setText("Enregistrer");

        jButton3_Annuler.setFont(new Font("Cambria", 0, 12));
        jButton3_Annuler.setText("Annuler");
        
        separator = new JSeparator();
        
        label_icone = new JLabel("");
        label_icone.setIcon(new ImageIcon("C:\\Users\\DOCTEURWAMBA\\Pictures\\Photo_BD\\gar.png"));
        
        lblIdentifiant = new JLabel("Identifiant :");
        lblIdentifiant.setFont(new Font("Cambria", Font.PLAIN, 14));
        
        textField_Identifiant = new JTextField();
        textField_Identifiant.setBackground(new Color(230, 230, 250));
        textField_Identifiant.setFont(new Font("Cambria", Font.PLAIN, 13));
        textField_Identifiant.setEditable(false);
        textField_Identifiant.setColumns(10);
        textField_Identifiant.setText(values[0]);
        
        /**
         * jTextField est un tableau de JTextField
         * Ceci nous permettra de modifier ces champs dans la table modifier
         * */
        jTextField = new ArrayList<JTextField>();
        jTextField.add(jTextField1_Nom);
        jTextField.add(jTextField2_Prenom);
        jTextField.add(jTextField3_Tel);
        jTextField.add(jTextField4_Email);
        jTextField.add(jTextField5_Adresse);
        
        comboBox_Catégorie = new JComboBox();
        comboBox_Catégorie.setBackground(new Color(230, 230, 250));
        comboBox_Catégorie.setFont(new Font("Cambria", Font.PLAIN, 12));
        String[] Catégorie_values = new String[] {"gdfshh"};
        comboBox_Catégorie.setModel(new DefaultComboBoxModel(Catégorie_values));
        comboBox_Catégorie.setSelectedItem(values[3]);
        
        comboBox_1_Pays = new JComboBox();
        comboBox_1_Pays.setBackground(new Color(230, 230, 250));
        comboBox_1_Pays.setFont(new Font("Cambria", Font.PLAIN, 12));
        String[] values1 = new String[] { "Cameroun", "France", "Autre" };
        comboBox_1_Pays.setModel(new DefaultComboBoxModel(values1));
        comboBox_1_Pays.setSelectedItem(values[7]);

        GroupLayout layout = new GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(37)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jLabel3_prenom)
        								.addComponent(jLabel2_fournisseur))
        							.addGap(18)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jTextField1_Nom, GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
        								.addComponent(jTextField2_Prenom, GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)))
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jLabel5_Tel)
        								.addComponent(jLabel6_Email))
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jTextField3_Tel, GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
        								.addComponent(jTextField4_Email, GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jLabel4_catégorie)
        							.addGap(18)
        							.addComponent(comboBox_Catégorie, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)))
        					.addGap(222))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(39)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel11_Pays)
        						.addComponent(jLabel7_Adresse))
        					.addGap(27)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(comboBox_1_Pays, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jTextField5_Adresse, GroupLayout.PREFERRED_SIZE, 304, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(18)
        					.addComponent(label_icone)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(118)
        							.addComponent(lblIdentifiant)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(textField_Identifiant, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addGap(79)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(separator, GroupLayout.PREFERRED_SIZE, 282, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jLabel1_Titre, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE))))
        					.addPreferredGap(ComponentPlacement.RELATED, 207, Short.MAX_VALUE))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
        						.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE))))
        			.addContainerGap())
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(305, Short.MAX_VALUE)
        			.addComponent(jButton1_Reset)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jButton2_Enregistrer)
        			.addGap(18)
        			.addComponent(jButton3_Annuler)
        			.addGap(82))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(label_icone))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(19)
        					.addComponent(jLabel1_Titre)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)))
        			.addGap(1)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblIdentifiant)
        				.addComponent(textField_Identifiant, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2_fournisseur)
        				.addComponent(jTextField1_Nom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel3_prenom)
        				.addComponent(jTextField2_Prenom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel4_catégorie)
        				.addComponent(comboBox_Catégorie, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel5_Tel)
        				.addComponent(jTextField3_Tel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel6_Email)
        				.addComponent(jTextField4_Email, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(26)
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jTextField5_Adresse, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel7_Adresse))
        			.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel11_Pays)
        				.addComponent(comboBox_1_Pays, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
        			.addGap(31)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButton1_Reset)
        				.addComponent(jButton2_Enregistrer)
        				.addComponent(jButton3_Annuler))
        			.addGap(57))
        );
        jPanel2.setLayout(null);
        jPanel2.add(jLabel9);
        jPanel1.setLayout(null);
        jPanel1.add(jLabel8);
        contentPane.setLayout(layout);
        pack();
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
            java.util.logging.Logger.getLogger(ModificationFournisseur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificationFournisseur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificationFournisseur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificationFournisseur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            	String[] values = new String[] {"oie","jfskd","jdlkjf","jhgjg","jkdfd","kfdjl","France","France","dkfjl"};
            	JFrame detailClient = new JFrame();
            	ArrayList<JTextField> jTextField = new ArrayList<JTextField>();
            	new ModificationFournisseur(values, detailClient, jTextField).setVisible(true);
            }
        });
    }
}
