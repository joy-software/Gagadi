/**
 * CompteClient est la classe permettra de créer le compte d'un client en 
 * entrant ses informations personnelles*/

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
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

/**
 *
 * @author DOCTEURWAMBA
 */
@SuppressWarnings("serial")
public class CompteClient extends JFrame {

	private JPanel contentPane;
	private JButton jButton1_Reset;
	private JButton jButton2_Valider;
	private JButton jButton3_Fermer;
	private JComboBox jComboBox_Pays;
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
	private JRadioButton jRadioButton1_Fem;
	private JRadioButton jRadioButton2_Hom;
	private JTextField jTextField1_Nom;
	private JTextField jTextField2_Prénom;
	private JTextField jTextField3_Tel;
	private JTextField jTextField4_Email;
	private JTextField jTextField5_Adresse;
	private JTextField jTextField6_BP;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel label;
	
    /**
     * Creates new form CompteClient
     */
    public CompteClient() {
        initComponents();
    }

    /**
     * initComponents() permettra d'initialiser tous les composants
     * et de gérer les évènements*/                         
    private void initComponents() {

    	Cursor c = new Cursor(12);
        
    	jLabel10 = new JLabel();
        jLabel10.setCursor(c);
        
        jLabel1_Titre = new JLabel();
        jLabel1_Titre.setForeground(new Color(199, 21, 133));
        jLabel1_Titre.setCursor(c);
        
        jLabel2_Nom = new JLabel();
        jLabel2_Nom.setCursor(c);
        
        jLabel3_Prénom = new JLabel();
        jLabel3_Prénom.setCursor(c);
        
        jLabel4_Sexe = new JLabel();
        jLabel4_Sexe.setCursor(c);
        
        jLabel5_Tél = new JLabel();
        jLabel5_Tél.setCursor(c);
        
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

        jLabel8_Pays = new JLabel();
        jLabel8_Pays.setCursor(c);

        jLabel9_BP = new JLabel();
        jLabel9_BP.setCursor(c);

        jButton1_Reset = new JButton();
        jButton1_Reset.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		jTextField1_Nom.setText("");
        		jTextField2_Prénom.setText("");
        		jTextField3_Tel.setText("");
        		jTextField4_Email.setText("");
        		jTextField5_Adresse.setText("");
        		jTextField6_BP.setText("");
        	}
        });
        jButton1_Reset.setCursor(c);

        
        jButton2_Valider = new JButton();
        jButton2_Valider.setCursor(c);

        jButton3_Fermer = new JButton();
        jButton3_Fermer.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		System.exit(0);
        	}
        });
        jButton3_Fermer.setCursor(c);

        jTextField1_Nom = new JTextField();
        jTextField1_Nom.setCursor(c);

        jTextField2_Prénom = new JTextField();
        jTextField2_Prénom.setCursor(c);

        jTextField3_Tel = new JTextField();
        jTextField3_Tel.setCursor(c);

        jTextField4_Email = new JTextField();
        jTextField4_Email.setCursor(c);

        jTextField5_Adresse = new JTextField();
        jTextField5_Adresse.setCursor(c);

        jTextField6_BP = new JTextField();
        jTextField6_BP.setCursor(c);

        jRadioButton1_Fem = new JRadioButton();
        buttonGroup.add(jRadioButton1_Fem);
        jRadioButton1_Fem.setCursor(c);

        jRadioButton2_Hom = new JRadioButton();
        buttonGroup.add(jRadioButton2_Hom);
        jRadioButton2_Hom.setCursor(c);

        jComboBox_Pays = new JComboBox();
        jComboBox_Pays.setCursor(c);


        jLabel10.setText("jLabel10");

        contentPane = new JPanel();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Nouveau client");
        setContentPane(contentPane);
        contentPane.setBackground(new Color(255, 255, 255));
        setBounds(500, 100, 500, 500);
        setAlwaysOnTop(true);

        jLabel1_Titre.setBackground(new Color(102, 102, 102));
        jLabel1_Titre.setFont(new Font("Cambria", Font.BOLD, 18));
        jLabel1_Titre.setText("Veuillez entrer les informations sur le client");
        
        jLabel2_Nom.setFont(new Font("Cambria", 0, 14));
        jLabel2_Nom.setText("Noms :");

        jLabel3_Prénom.setFont(new Font("Cambria", 0, 14));
        jLabel3_Prénom.setText("Prénoms : ");

        jLabel4_Sexe.setFont(new Font("Cambria", 0, 14));
        jLabel4_Sexe.setText("Sexe :");

        jLabel5_Tél.setFont(new Font("Cambria", 0, 14));
        jLabel5_Tél.setText("Téléphone :");

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

        jLabel8_Pays.setFont(new Font("Cambria", 0, 14));
        jLabel8_Pays.setText("Pays :");

        jLabel9_BP.setFont(new Font("Cambria", 0, 14));
        jLabel9_BP.setText("Boîte postale :");

        jButton1_Reset.setFont(new Font("Cambria", 0, 12));
        jButton1_Reset.setText("Reset");

        jButton2_Valider.setFont(new Font("Cambria", 0, 12));
        jButton2_Valider.setText("Valider");

        jButton3_Fermer.setFont(new Font("Cambria", 0, 12));
        jButton3_Fermer.setText("Fermer");

        jRadioButton1_Fem.setText("F");

        jRadioButton2_Hom.setText("M");

        jComboBox_Pays.setFont(new Font("Cambria", 0, 12));
        jComboBox_Pays.setModel(new DefaultComboBoxModel(new String[] { "Cameroun", "France", "Autre" }));
        
        JSeparator separator = new JSeparator();
        
        label = new JLabel("");
        label.setIcon(new ImageIcon("C:\\Users\\DOCTEURWAMBA\\Pictures\\Ora\\client.png"));

        GroupLayout layout = new GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(37)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jLabel2_Nom)
        								.addComponent(jLabel3_Prénom))
        							.addGap(23)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        								.addComponent(jTextField1_Nom)
        								.addComponent(jTextField2_Prénom, GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jLabel4_Sexe)
        							.addGap(69)
        							.addComponent(jRadioButton1_Fem)
        							.addGap(18)
        							.addComponent(jRadioButton2_Hom))
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jLabel5_Tél)
        								.addComponent(jLabel6_Email))
        							.addGap(18)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jTextField3_Tel, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jTextField4_Email, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE))))
        					.addPreferredGap(ComponentPlacement.RELATED, 102, Short.MAX_VALUE))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE))
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(39)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(jLabel7_Adresse)
        									.addPreferredGap(ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
        									.addComponent(jTextField5_Adresse, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE))
        								.addGroup(layout.createSequentialGroup()
        									.addGroup(layout.createParallelGroup(Alignment.LEADING)
        										.addComponent(jLabel9_BP)
        										.addComponent(jLabel8_Pays))
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addGroup(layout.createParallelGroup(Alignment.LEADING)
        										.addComponent(jComboBox_Pays, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        										.addComponent(jTextField6_BP, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
        									.addPreferredGap(ComponentPlacement.RELATED, 84, Short.MAX_VALUE))))
        						.addGroup(layout.createSequentialGroup()
        							.addGap(247)
        							.addComponent(jButton1_Reset)))
        					.addPreferredGap(ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
        					.addComponent(jButton2_Valider)
        					.addGap(26)
        					.addComponent(jButton3_Fermer)
        					.addGap(24)))
        			.addContainerGap())
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addGap(26)
        			.addComponent(label)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel1_Titre, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(separator, GroupLayout.PREFERRED_SIZE, 375, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(label))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(22)
        					.addComponent(jLabel1_Titre)
        					.addGap(8)
        					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        			.addGap(34)
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2_Nom)
        				.addComponent(jTextField1_Nom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel3_Prénom)
        				.addComponent(jTextField2_Prénom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel4_Sexe)
        				.addComponent(jRadioButton1_Fem)
        				.addComponent(jRadioButton2_Hom))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel5_Tél)
        				.addComponent(jTextField3_Tel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel6_Email)
        				.addComponent(jTextField4_Email, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel7_Adresse)
        				.addComponent(jTextField5_Adresse, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel8_Pays)
        				.addComponent(jComboBox_Pays, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel9_BP)
        				.addComponent(jTextField6_BP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(70)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButton1_Reset)
        				.addComponent(jButton2_Valider)
        				.addComponent(jButton3_Fermer))
        			.addContainerGap())
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
            java.util.logging.Logger.getLogger(CompteClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompteClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompteClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompteClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CompteClient().setVisible(true);
            }
        });
    }
}
