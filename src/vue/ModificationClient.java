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
@SuppressWarnings("serial")
public class ModificationClient extends JFrame {

	private JPanel contentPane;
	private JButton jButton1_Reset;
	private JButton jButton2_Enregistrer;
	private JButton jButton3_Annuler;
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
	private JLabel label_Icone;
	private String[] values0;
	private String[] values1;
	private JLabel lblIdentifiant;
	private JTextField textField_Identifiant;
	private JFrame detailClient0;
	private ArrayList<JTextField> jTextField0;
	
    /**
     * Creates new form CompteClient
     * @param detailClient 
     * @param jTextField 
     */
    public ModificationClient(String[] values, JFrame detailClient, ArrayList<JTextField> jTextField) {
        initComponents(values, detailClient, jTextField);
    }

    /**
     * initComponents() permettra d'initialiser tous les composants
     * et de gérer les évènements*/                         
    private void initComponents(String[] values, JFrame detailClient, ArrayList<JTextField> jTextField) {

    	jTextField0 = jTextField;
    	detailClient0 = detailClient;
    	
    	values0 = values;
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
        		jTextField1_Nom.setText(values0[1]);
        		jTextField2_Prénom.setText(values0[2]);
        		jTextField3_Tel.setText(values0[4]);
        		jTextField4_Email.setText(values0[5]);
        		jTextField5_Adresse.setText(values0[6]);
        		jTextField6_BP.setText(values0[8]);
        	}
        });
        jButton1_Reset.setCursor(c);

        
        jButton2_Enregistrer = new JButton();
        jButton2_Enregistrer.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
                jTextField0.get(0).setText(jTextField1_Nom.getText());
                jTextField0.get(1).setText(jTextField2_Prénom.getText());
                if(jRadioButton1_Fem.isSelected()==true){
                	jTextField0.get(2).setText("Femme");
                }else if(jRadioButton2_Hom.isSelected()==true){
                	jTextField0.get(2).setText("Homme");
                }
                jTextField0.get(3).setText(jTextField3_Tel.getText());
                jTextField0.get(4).setText(jTextField4_Email.getText());
                jTextField0.get(5).setText(jTextField5_Adresse.getText());
                jTextField0.get(6).setText((String) jComboBox_Pays.getSelectedItem());
                jTextField0.get(7).setText(jTextField6_BP.getText());
                
                detailClient0.setEnabled(true);
        		dispose();
        	}
        });
        jButton2_Enregistrer.setCursor(c);

        jButton3_Annuler = new JButton();
        jButton3_Annuler.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		detailClient0.setEnabled(true);
        		dispose();
        	}
        });
        jButton3_Annuler.setCursor(c);

        /**
         * values1 est un tableau qui contiendra les valeurs de la modification
         * */
        values1 = new String[8];
        
        jTextField1_Nom = new JTextField();
        jTextField1_Nom.setBackground(new Color(230, 230, 250));
        jTextField1_Nom.setFont(new Font("Cambria", Font.PLAIN, 13));
        jTextField1_Nom.setCursor(c);
        jTextField1_Nom.setText(values[1]);

        jTextField2_Prénom = new JTextField();
        jTextField2_Prénom.setBackground(new Color(230, 230, 250));
        jTextField2_Prénom.setFont(new Font("Cambria", Font.PLAIN, 13));
        jTextField2_Prénom.setCursor(c);
        jTextField2_Prénom.setText(values[2]);

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

        jTextField6_BP = new JTextField();
        jTextField6_BP.setBackground(new Color(230, 230, 250));
        jTextField6_BP.setFont(new Font("Cambria", Font.PLAIN, 13));
        jTextField6_BP.setCursor(c);
        jTextField6_BP.setText(values[8]);

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
        setTitle("Modification InfoClient");
        setContentPane(contentPane);
        contentPane.setBackground(new Color(255, 255, 255));
        setBounds(500, 80, 500, 500);

        jLabel1_Titre.setBackground(new Color(102, 102, 102));
        jLabel1_Titre.setFont(new Font("Cambria", Font.BOLD, 18));
        jLabel1_Titre.setText("Modification des param\u00E8tres du client");
        
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

        jButton2_Enregistrer.setFont(new Font("Cambria", 0, 12));
        jButton2_Enregistrer.setText("Enregistrer");

        jButton3_Annuler.setFont(new Font("Cambria", 0, 12));
        jButton3_Annuler.setText("Annuler");

        jRadioButton1_Fem.setText("F");

        jRadioButton2_Hom.setText("M");
        
        if(values[3]=="Femme"){
        	jRadioButton1_Fem.setSelected(true);
        }else{
        	jRadioButton2_Hom.setSelected(true);
        }

        jComboBox_Pays.setFont(new Font("Cambria", Font.PLAIN, 13));
        jComboBox_Pays.setModel(new DefaultComboBoxModel(new String[] { "Cameroun", "France", "Autre" }));
        jComboBox_Pays.setSelectedItem(values[7]);
        
        JSeparator separator = new JSeparator();
        
        label_Icone = new JLabel("");
        label_Icone.setIcon(new ImageIcon("C:\\Users\\DOCTEURWAMBA\\Pictures\\Ora\\client.png"));
        
        lblIdentifiant = new JLabel("Identifiant :");
        lblIdentifiant.setFont(new Font("Cambria", Font.PLAIN, 14));
        
        textField_Identifiant = new JTextField();
        textField_Identifiant.setEditable(false);
        textField_Identifiant.setText(values[0]);
        textField_Identifiant.setFont(new Font("Cambria", Font.PLAIN, 13));
        textField_Identifiant.setBackground(new Color(230, 230, 250));

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
        								.addComponent(jTextField4_Email, GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
        								.addComponent(jTextField3_Tel, GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE))))
        					.addGap(138))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE))
        				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jButton1_Reset)
        					.addGap(18)
        					.addComponent(jButton2_Enregistrer)
        					.addGap(18)
        					.addComponent(jButton3_Annuler)
        					.addGap(22))
        				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        					.addGap(39)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jLabel8_Pays)
        								.addComponent(jLabel7_Adresse))
        							.addGap(34))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jLabel9_BP)
        							.addPreferredGap(ComponentPlacement.RELATED)))
        					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(jComboBox_Pays, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jTextField5_Adresse, GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
        						.addComponent(jTextField6_BP))
        					.addPreferredGap(ComponentPlacement.RELATED, 139, Short.MAX_VALUE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(60)
        					.addComponent(label_Icone)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel1_Titre, GroupLayout.PREFERRED_SIZE, 335, GroupLayout.PREFERRED_SIZE)
        						.addComponent(separator, GroupLayout.PREFERRED_SIZE, 317, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED, 90, Short.MAX_VALUE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(170)
        					.addComponent(lblIdentifiant)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(textField_Identifiant, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(24)
        					.addComponent(jLabel1_Titre)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(label_Icone)))
        			.addGap(9)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblIdentifiant)
        				.addComponent(textField_Identifiant, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
        			.addGap(21)
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
        			.addGap(9)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jLabel7_Adresse)
        				.addComponent(jTextField5_Adresse, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(106)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jButton3_Annuler)
        						.addComponent(jButton2_Enregistrer)
        						.addComponent(jButton1_Reset)))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(2)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel8_Pays)
        						.addComponent(jComboBox_Pays, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jTextField6_BP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel9_BP))))
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
            java.util.logging.Logger.getLogger(ModificationClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificationClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificationClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificationClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            	String[] values = new String[] {"oie","jfskd","jdlkjf","jhgjg","jkdfd","kfdjl","France","France","dkfjl"};
            	JFrame detailClient = new JFrame();
            	ArrayList<JTextField> jTextField = new ArrayList<JTextField>();
            	new ModificationClient(values, detailClient, jTextField).setVisible(true);
            }
        });
    }
}

