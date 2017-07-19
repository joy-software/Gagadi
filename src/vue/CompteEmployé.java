package vue;

import java.awt.Color;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;

/**
 *
 * @author DOCTEURWAMBA
 */
public class CompteEmployé extends javax.swing.JFrame {

	private JPanel contentPane;
	private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4_Parcourir;
    private javax.swing.JButton jButton5_Prendre;
    private javax.swing.JComboBox jComboBox_Poste;
    private javax.swing.JComboBox jComboBox2_Jour;
    private javax.swing.JComboBox jComboBox3_Mois;
    private javax.swing.JComboBox jComboBox4_Année;
    private javax.swing.JLabel jLabel1_Login;
    private javax.swing.JLabel jLabel9_Naissance;
    private javax.swing.JLabel jLabel11_Photo;
    private javax.swing.JLabel jLabel13_Titre;
    private javax.swing.JLabel jLabel10_Jour;
    private javax.swing.JLabel jLabel11_Mois;
    private javax.swing.JLabel jLabel12_Année;
    private javax.swing.JLabel jLabel2_Motdepasse;
    private javax.swing.JLabel jLabel3_Poste;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel4_Nom;
    private javax.swing.JLabel jLabel5_Prénom;
    private javax.swing.JLabel jLabel7_Tel;
    private javax.swing.JLabel jLabel6_Sexe;
    private javax.swing.JLabel jLabel8_Email;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1_Fem;
    private javax.swing.JRadioButton jRadioButton2_Hom;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1_Login;
    private javax.swing.JTextField jTextField2_Motdepasse;
    private javax.swing.JTextField jTextField3_Nom;
    private javax.swing.JTextField jTextField4_Prénom;
    private javax.swing.JTextField jTextField5_Tel;
    private javax.swing.JTextField jTextField7_Email; 
    private final ButtonGroup buttonGroup = new ButtonGroup();
    private JLabel label_icone;
    private JSeparator separator1;
    /**
     * Creates new form CompteEmployé
     */
    public CompteEmployé() {
        initComponents();
    }
                        
    private void initComponents() {

    	contentPane = new JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1_Login = new javax.swing.JLabel();
        jLabel2_Motdepasse = new javax.swing.JLabel();
        jLabel3_Poste = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel4_Nom = new javax.swing.JLabel();
        jLabel5_Prénom = new javax.swing.JLabel();
        jLabel7_Tel = new javax.swing.JLabel();
        jLabel6_Sexe = new javax.swing.JLabel();
        jLabel8_Email = new javax.swing.JLabel();
        jLabel9_Naissance = new javax.swing.JLabel();
        jLabel13_Titre = new javax.swing.JLabel();
        jLabel13_Titre.setForeground(new Color(199, 21, 133));
        jTextField1_Login = new javax.swing.JTextField();
        jTextField2_Motdepasse = new javax.swing.JTextField();
        jComboBox_Poste = new javax.swing.JComboBox();
        jTextField3_Nom = new javax.swing.JTextField();
        jTextField4_Prénom = new javax.swing.JTextField();
        jTextField5_Tel = new javax.swing.JTextField();
        jTextField7_Email = new javax.swing.JTextField();
        jComboBox2_Jour = new javax.swing.JComboBox();
        jComboBox3_Mois = new javax.swing.JComboBox();
        jComboBox4_Année = new javax.swing.JComboBox();
        jLabel10_Jour = new javax.swing.JLabel();
        jLabel10_Jour.setFont(new Font("Cambria", Font.PLAIN, 13));
        jLabel11_Mois = new javax.swing.JLabel();
        jLabel11_Mois.setFont(new Font("Cambria", Font.PLAIN, 13));
        jLabel12_Année = new javax.swing.JLabel();
        jLabel12_Année.setFont(new Font("Cambria", Font.PLAIN, 13));
        jSeparator2 = new javax.swing.JSeparator();
        jRadioButton1_Fem = new javax.swing.JRadioButton();
        buttonGroup.add(jRadioButton1_Fem);
        jRadioButton2_Hom = new javax.swing.JRadioButton();
        buttonGroup.add(jRadioButton2_Hom);
        jButton1 = new javax.swing.JButton();
        jButton1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		jTextField1_Login.setText("");
        		jTextField2_Motdepasse.setText("");
        		jTextField3_Nom.setText("");
        		jTextField4_Prénom.setText("");
        		jTextField5_Tel.setText("");
        		jTextField7_Email.setText("");
        	}
        });
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		System.exit(0);
        	}
        });
        jPanel1 = new javax.swing.JPanel();
        jButton4_Parcourir = new javax.swing.JButton();
        jButton4_Parcourir.setFont(new Font("Cambria", Font.PLAIN, 12));
        jButton5_Prendre = new javax.swing.JButton();
        jButton5_Prendre.setFont(new Font("Cambria", Font.PLAIN, 12));
        jLabel11_Photo = new javax.swing.JLabel();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nouvel employ\u00E9");
        contentPane.setBackground(new Color(255, 255, 255));
        setContentPane(contentPane);
        setBounds(500, 50, 500, 500);
        setAlwaysOnTop(true);
        	
        jLabel1_Login.setFont(new Font("Cambria", 0, 14)); // NOI18N
        jLabel1_Login.setText("Login : ");

        jLabel2_Motdepasse.setFont(new Font("Cambria", 0, 14)); // NOI18N
        jLabel2_Motdepasse.setText("Mot de passe :");

        jLabel3_Poste.setFont(new Font("Cambria", 0, 14)); // NOI18N
        jLabel3_Poste.setText("Poste : ");

        jLabel4.setFont(new Font("Cambria", 0, 16)); // NOI18N
        jLabel4.setText("Informations personnelles ");

        jLabel4_Nom.setFont(new Font("Cambria", 0, 14)); // NOI18N
        jLabel4_Nom.setText("Noms : ");

        jLabel5_Prénom.setFont(new Font("Cambria", 0, 14)); // NOI18N
        jLabel5_Prénom.setText("Prénoms : ");

        jLabel7_Tel.setFont(new Font("Cambria", 0, 14)); // NOI18N
        jLabel7_Tel.setText("Téléphone :");

        jLabel6_Sexe.setFont(new Font("Cambria", 0, 14)); // NOI18N
        jLabel6_Sexe.setText("Sexe :");

        jLabel8_Email.setFont(new Font("Cambria", 0, 14)); // NOI18N
        jLabel8_Email.setText("Email :");

        jLabel9_Naissance.setFont(new Font("Cambria", 0, 14)); // NOI18N
        jLabel9_Naissance.setText("Année de naissance :");

        jLabel13_Titre.setFont(new Font("Cambria", Font.BOLD, 18)); // NOI18N
        jLabel13_Titre.setText("Veuillez entrer les informations sur l'employé");

        jComboBox_Poste.setFont(new Font("Cambria", Font.PLAIN, 13)); // NOI18N
        jComboBox_Poste.setModel(new DefaultComboBoxModel(new String[] {"Caissier(e)", "Administrateur"}));

        jComboBox2_Jour.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jComboBox3_Mois.setModel(new DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jComboBox4_Année.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010" }));

        jLabel10_Jour.setText("jour ");

        jLabel11_Mois.setText("mois");

        jLabel12_Année.setText("année");

        jRadioButton1_Fem.setText("F");

        jRadioButton2_Hom.setText("M");

        jButton1.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jButton1.setText("Reset");

        jButton2.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jButton2.setText("Valider");

        jButton3.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jButton3.setText("Fermer");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton4_Parcourir.setText("Parcourir");

        jButton5_Prendre.setText("Prendre");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton4_Parcourir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5_Prendre))
            .addComponent(jLabel11_Photo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel11_Photo, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4_Parcourir)
                    .addComponent(jButton5_Prendre)))
        );
        
        label_icone = new JLabel("");
        label_icone.setIcon(new ImageIcon("C:\\Users\\DOCTEURWAMBA\\Pictures\\Photo_BD\\gar.png"));
        
        separator1 = new JSeparator();

        GroupLayout layout = new GroupLayout(contentPane);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(54)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addGroup(layout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel2_Motdepasse)
        						.addComponent(jLabel1_Login)
        						.addComponent(jLabel3_Poste))
        					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        							.addComponent(jTextField2_Motdepasse, GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
        							.addComponent(jTextField1_Login))
        						.addComponent(jComboBox_Poste, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(60))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(10)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        							.addComponent(jTextField4_Prénom, GroupLayout.PREFERRED_SIZE, 317, GroupLayout.PREFERRED_SIZE)
        							.addGroup(layout.createSequentialGroup()
        								.addGroup(layout.createParallelGroup(Alignment.LEADING)
        									.addComponent(jLabel5_Prénom)
        									.addComponent(jLabel6_Sexe)
        									.addComponent(jLabel4_Nom))
        								.addGap(28)
        								.addGroup(layout.createParallelGroup(Alignment.LEADING)
        									.addComponent(jTextField3_Nom, GroupLayout.PREFERRED_SIZE, 317, GroupLayout.PREFERRED_SIZE)
        									.addGroup(layout.createSequentialGroup()
        										.addComponent(jRadioButton2_Hom)
        										.addGap(18)
        										.addComponent(jRadioButton1_Fem)))))
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(jLabel9_Naissance)
        									.addPreferredGap(ComponentPlacement.UNRELATED)
        									.addComponent(jLabel10_Jour)
        									.addGap(2)
        									.addComponent(jComboBox2_Jour, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        									.addGap(26)
        									.addComponent(jLabel11_Mois)
        									.addGap(3)
        									.addComponent(jComboBox3_Mois, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(jButton1)
        									.addGap(15)))
        							.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(jButton2)
        									.addGap(18)
        									.addComponent(jButton3))
        								.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        									.addGap(28)
        									.addComponent(jLabel12_Année)
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(jComboBox4_Année, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jLabel7_Tel)
        								.addComponent(jLabel8_Email))
        							.addGap(18)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jTextField7_Email, GroupLayout.PREFERRED_SIZE, 292, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jTextField5_Tel, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))))))
        			.addContainerGap())
        		.addGroup(layout.createSequentialGroup()
        			.addGap(24)
        			.addComponent(label_icone)
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabel13_Titre, GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
        					.addGap(35))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jSeparator2, GroupLayout.PREFERRED_SIZE, 386, GroupLayout.PREFERRED_SIZE)
        					.addContainerGap())))
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addGap(37)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(10)
        					.addComponent(jLabel4))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(7)
        					.addComponent(separator1, GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)))
        			.addContainerGap(35, GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap(20, Short.MAX_VALUE)
        					.addComponent(jLabel13_Titre)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jSeparator2, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
        					.addGap(32))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(label_icone)
        					.addPreferredGap(ComponentPlacement.RELATED)))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel1_Login)
        						.addComponent(jTextField1_Login, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel2_Motdepasse)
        						.addComponent(jTextField2_Motdepasse, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel3_Poste)
        						.addComponent(jComboBox_Poste, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(44))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)))
        			.addComponent(separator1, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
        			.addGap(5)
        			.addComponent(jLabel4)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel4_Nom)
        				.addComponent(jTextField3_Nom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel5_Prénom)
        				.addComponent(jTextField4_Prénom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel6_Sexe)
        						.addComponent(jRadioButton1_Fem)
        						.addComponent(jRadioButton2_Hom))
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel7_Tel)
        						.addComponent(jTextField5_Tel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel8_Email)
        						.addComponent(jTextField7_Email, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel9_Naissance)
        						.addComponent(jComboBox2_Jour, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jComboBox3_Mois, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel10_Jour)
        						.addComponent(jLabel11_Mois)
        						.addComponent(jLabel12_Année)
        						.addComponent(jComboBox4_Année, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(0, 56, Short.MAX_VALUE))
        				.addGroup(layout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jButton3)
        						.addComponent(jButton2)
        						.addComponent(jButton1))
        					.addContainerGap())))
        );
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
            java.util.logging.Logger.getLogger(CompteEmployé.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompteEmployé.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompteEmployé.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompteEmployé.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CompteEmployé().setVisible(true);
            }
        });
    }
      
}
