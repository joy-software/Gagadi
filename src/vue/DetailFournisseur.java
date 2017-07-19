package vue;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

/**
 *
 * @author DOCTEURWAMBA
 */

/**
 * CompteFournisseur est une classe qui permettra de créer les nouveaux
 * fournisseurs dans la base de données*/

@SuppressWarnings("serial")
public class DetailFournisseur {

	public JFrame detailFournisseur;
	private JPanel contentPane;
	private JButton jButton1_Modifier;
	private JButton jButton2_Supprimer;
	private JButton jButton3_Fermer;
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
	private JTextField textField_1_Catégorie;
	private JTextField textField_1_Pays;
	private String[] values2;
	private ArrayList<JTextField> jTextField;
	private String[] values1;
	
    /**
     * Creates new form CompteClient
     */
    public DetailFournisseur(String[] values) {
        initComponents(values);
    }

    /**
     * initComponents() permettra d'initialiser tous les composants
     * et de gérer les évènements*/                         
    private void initComponents(String[] values) {

    	detailFournisseur = new JFrame();
    	Cursor c = new Cursor(12);
    	
    	/**
         * values1 est un tableau de String où sera stocké les différentes valeurs des champs de saisie
         * C'est à dire les informations sur le client
         * */
        values1 = values;
        
        /**
         * values2 contiendra le nom et le prénom du client que l'on veut supprimer
         * */
        values2 = new String[2];
        
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

        jButton1_Modifier = new JButton();
        jButton1_Modifier.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		ModificationFournisseur modifierFournisseur = new ModificationFournisseur(values1, detailFournisseur, jTextField);
        		modifierFournisseur.setVisible(true);
        		modifierFournisseur.setAlwaysOnTop(true);
        		detailFournisseur.setEnabled(false);
        	}
        });
        jButton1_Modifier.setCursor(c);

        
        jButton2_Supprimer = new JButton();
        jButton2_Supprimer.setCursor(c);
        jButton2_Supprimer.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		values2[0] = jTextField1_Nom.getText();
                values2[1] = jTextField2_Prenom.getText();
        		SuppressionFournisseur supprimerFournisseur = new SuppressionFournisseur(values2,detailFournisseur);
        		supprimerFournisseur.setVisible(true);
        		detailFournisseur.setEnabled(false);
        	}
        });

        jButton3_Fermer = new JButton();
        jButton3_Fermer.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		System.exit(0);
        	}
        });
        jButton3_Fermer.setCursor(c);

        jTextField1_Nom = new JTextField();
        jTextField1_Nom.setBackground(new Color(230, 230, 250));
        jTextField1_Nom.setFont(new Font("Cambria", Font.PLAIN, 13));
        jTextField1_Nom.setEditable(false);
        jTextField1_Nom.setCursor(c);
        jTextField1_Nom.setText(values[1]);

        jTextField2_Prenom = new JTextField();
        jTextField2_Prenom.setBackground(new Color(230, 230, 250));
        jTextField2_Prenom.setFont(new Font("Cambria", Font.PLAIN, 13));
        jTextField2_Prenom.setEditable(false);
        jTextField2_Prenom.setCursor(c);
        jTextField2_Prenom.setText(values[2]);

        jTextField3_Tel = new JTextField();
        jTextField3_Tel.setBackground(new Color(230, 230, 250));
        jTextField3_Tel.setFont(new Font("Cambria", Font.PLAIN, 13));
        jTextField3_Tel.setEditable(false);
        jTextField3_Tel.setCursor(c);
        jTextField3_Tel.setText(values[4]);

        jTextField4_Email = new JTextField();
        jTextField4_Email.setBackground(new Color(230, 230, 250));
        jTextField4_Email.setFont(new Font("Cambria", Font.PLAIN, 13));
        jTextField4_Email.setEditable(false);
        jTextField4_Email.setCursor(c);
        jTextField4_Email.setText(values[5]);

        jTextField5_Adresse = new JTextField();
        jTextField5_Adresse.setBackground(new Color(230, 230, 250));
        jTextField5_Adresse.setFont(new Font("Cambria", Font.PLAIN, 13));
        jTextField5_Adresse.setEditable(false);
        jTextField5_Adresse.setCursor(c);
        jTextField5_Adresse.setText(values[6]);
        
        String[] tableau = {"janvier","fevri"};


        jLabel10.setText("jLabel10");

        contentPane = new JPanel();
        detailFournisseur.setDefaultCloseOperation(detailFournisseur.DISPOSE_ON_CLOSE);
        detailFournisseur.setTitle("Nouveau fournisseur");
        detailFournisseur.setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
        detailFournisseur.setBounds(450, 70, 613, 613);
        
        /**
         * @todo Arranger la taille de la fenêtre
         * */

        jLabel1_Titre.setBackground(new Color(102, 102, 102));
        jLabel1_Titre.setFont(new Font("Cambria", Font.BOLD, 18));
        jLabel1_Titre.setText("Veuillez entrer les informations sur le fournisseur");
        
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

        jButton1_Modifier.setFont(new Font("Cambria", 0, 12));
        jButton1_Modifier.setText("Modifier");

        jButton2_Supprimer.setFont(new Font("Cambria", 0, 12));
        jButton2_Supprimer.setText("Supprimer");

        jButton3_Fermer.setFont(new Font("Cambria", 0, 12));
        jButton3_Fermer.setText("Fermer");
//        String[] values1 = new String[] { "Cameroun", "France", "Autre" };
//        String[] values = new String[] {"gdfshh"};
        
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
        
        textField_1_Catégorie = new JTextField();
        textField_1_Catégorie.setFont(new Font("Cambria", Font.PLAIN, 13));
        textField_1_Catégorie.setEditable(false);
        textField_1_Catégorie.setBackground(new Color(230, 230, 250));
        textField_1_Catégorie.setText(values[3]);
        
        textField_1_Pays = new JTextField();
        textField_1_Pays.setFont(new Font("Cambria", Font.PLAIN, 13));
        textField_1_Pays.setEditable(false);
        textField_1_Pays.setBackground(new Color(230, 230, 250));
        textField_1_Pays.setText(values[7]);
        
        /**
         * jTextField est un tableau de JTextField
         * Ceci nous permettra de modifier ces champs dans la table modifier
         * */
        jTextField = new ArrayList<JTextField>();
        jTextField.add(jTextField1_Nom);
        jTextField.add(jTextField2_Prenom);
        jTextField.add(textField_1_Catégorie);
        jTextField.add(jTextField3_Tel);
        jTextField.add(jTextField4_Email);
        jTextField.add(jTextField5_Adresse);
        jTextField.add(textField_1_Pays);

        GroupLayout layout = new GroupLayout(detailFournisseur.getContentPane());
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
        							.addComponent(textField_1_Catégorie, GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)))
        					.addGap(222))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(39)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel11_Pays)
        						.addComponent(jLabel7_Adresse))
        					.addGap(27)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(jTextField5_Adresse)
        						.addComponent(textField_1_Pays, GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE))
        					.addGap(107))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(18)
        					.addComponent(label_icone)
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel1_Titre, GroupLayout.PREFERRED_SIZE, 444, GroupLayout.PREFERRED_SIZE)
        						.addComponent(separator, GroupLayout.PREFERRED_SIZE, 419, GroupLayout.PREFERRED_SIZE)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(100)
        							.addComponent(lblIdentifiant)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(textField_Identifiant, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)))
        					.addPreferredGap(ComponentPlacement.RELATED, 127, Short.MAX_VALUE))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
        						.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE))))
        			.addContainerGap())
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(305, Short.MAX_VALUE)
        			.addComponent(jButton1_Modifier)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jButton2_Supprimer)
        			.addGap(18)
        			.addComponent(jButton3_Fermer)
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
        				.addComponent(textField_1_Catégorie, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
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
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
        					.addComponent(jLabel11_Pays)
        					.addGap(31))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(18)
        					.addComponent(textField_1_Pays, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)))
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButton1_Modifier)
        				.addComponent(jButton2_Supprimer)
        				.addComponent(jButton3_Fermer))
        			.addGap(57))
        );
        jPanel2.setLayout(null);
        jPanel2.add(jLabel9);
        jPanel1.setLayout(null);
        jPanel1.add(jLabel8);
        contentPane.setLayout(layout);
        detailFournisseur.pack();
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
            java.util.logging.Logger.getLogger(DetailFournisseur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailFournisseur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailFournisseur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailFournisseur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            	String[] values = new String[] {"oie","douglas","Wamba","Femme","jkdfd","kfdjl","France","France","dlksj"};
                new DetailFournisseur(values).detailFournisseur.setVisible(true);
            }
        });
    }
}
