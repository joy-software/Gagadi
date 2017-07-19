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

/**
 * CompteFournisseur est une classe qui permettra de créer les nouveaux
 * fournisseurs dans la base de données*/

@SuppressWarnings("serial")
public class CompteFournisseur extends JFrame {

	private JPanel contentPane;
	private JButton jButton1;
	private JButton jButton2;
	private JButton jButton3;
	private JComboBox jComboBox1;
	private JComboBox comboBox;
	private JLabel jLabel1;
	private JLabel jLabel10;
	private JLabel jLabel11;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JLabel jLabel7;
	private JLabel jLabel8;
	private JLabel jLabel9;
	private JTextField jTextField1;
	private JTextField jTextField2;
	private JTextField jTextField3;
	private JTextField jTextField4;
	private JTextField jTextField5;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JSeparator separator;
	private JLabel label;
	
    /**
     * Creates new form CompteClient
     */
    public CompteFournisseur() {
        initComponents();
    }

    /**
     * initComponents() permettra d'initialiser tous les composants
     * et de gérer les évènements*/                         
    private void initComponents() {

    	Cursor c = new Cursor(12);
        
    	jLabel10 = new JLabel();
        jLabel10.setCursor(c);
        
        jLabel1 = new JLabel();
        jLabel1.setForeground(new Color(199, 21, 133));
        jLabel1.setCursor(c);
        
        jLabel2 = new JLabel();
        jLabel2.setCursor(c);
        
        jLabel3 = new JLabel();
        jLabel3.setCursor(c);
        
        jLabel4 = new JLabel();
        jLabel4.setCursor(c);
        
        jLabel5 = new JLabel();
        jLabel5.setCursor(c);
        
        jLabel6 = new JLabel();
        jLabel6.setCursor(c);

        jLabel7 = new JLabel();
        jLabel7.setCursor(c);

        jLabel8 = new JLabel();
        jLabel8.setBounds(10, 0, 183, 20);
        jLabel8.setCursor(c);

        jLabel9 = new JLabel();
        jLabel9.setBounds(10, 0, 209, 20);
        jLabel9.setCursor(c);

        jLabel11 = new JLabel();
        jLabel11.setCursor(c);

        jButton1 = new JButton();
        jButton1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		jTextField1.setText("");
        		jTextField2.setText("");
        		jTextField3.setText("");
        		jTextField4.setText("");
        		jTextField5.setText("");
        	}
        });
        jButton1.setCursor(c);

        
        jButton2 = new JButton();
        jButton2.setCursor(c);

        jButton3 = new JButton();
        jButton3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		System.exit(0);
        	}
        });
        jButton3.setCursor(c);

        jTextField1 = new JTextField();
        jTextField1.setCursor(c);

        jTextField2 = new JTextField();
        jTextField2.setCursor(c);

        jTextField3 = new JTextField();
        jTextField3.setCursor(c);

        jTextField4 = new JTextField();
        jTextField4.setCursor(c);

        jTextField5 = new JTextField();
        jTextField5.setCursor(c);
        
        String[] tableau = {"janvier","fevri"};

        jComboBox1 = new JComboBox(tableau);
        jComboBox1.setCursor(c);


        jLabel10.setText("jLabel10");

        contentPane = new JPanel();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Nouveau fournisseur");
        setContentPane(contentPane);
        contentPane.setBackground(new Color(255, 255, 255));
        setBounds(500, 100, 564, 500);
        setAlwaysOnTop(true);
        
        /**
         * @todo Arranger la taille de la fenêtre
         * */

        jLabel1.setBackground(new Color(102, 102, 102));
        jLabel1.setFont(new Font("Cambria", Font.BOLD, 18));
        jLabel1.setText("Veuillez entrer les informations sur le fournisseur");
        
        jLabel2.setFont(new Font("Cambria", 0, 14));
        jLabel2.setText("Noms :");

        jLabel3.setFont(new Font("Cambria", 0, 14));
        jLabel3.setText("Prénoms : ");

        jLabel4.setFont(new Font("Cambria", 0, 14));
        jLabel4.setText("Cat\u00E9gorie :");

        jLabel5.setFont(new Font("Cambria", 0, 14));
        jLabel5.setText("Téléphone :");

        jLabel6.setFont(new Font("Cambria", 0, 14));
        jLabel6.setText("Email :");

        jLabel7.setFont(new Font("Cambria", 0, 14));
        jLabel7.setText("Adresse :");

        jLabel8.setFont(new Font("Cambria", 0, 16));
        jLabel8.setText("Informations personnelles");
        
        JPanel jPanel1 = new JPanel();

        
        jLabel9.setFont(new Font("Cambria", 0, 16));
        jLabel9.setText("Informations supplémentaires");
        
        JPanel jPanel2 = new JPanel();

        jLabel11.setFont(new Font("Cambria", 0, 14));
        jLabel11.setText("Pays :");

        jButton1.setFont(new Font("Cambria", 0, 12));
        jButton1.setText("Reset");

        jButton2.setFont(new Font("Cambria", 0, 12));
        jButton2.setText("Valider");

        jButton3.setFont(new Font("Cambria", 0, 12));
        jButton3.setText("Fermer");

        jComboBox1.setFont(new Font("Cambria", 0, 12));
        String[] values1 = new String[] { "Cameroun", "France", "Autre" };
        jComboBox1.setModel(new DefaultComboBoxModel(values1));
        
        comboBox = new JComboBox();
        String[] values = new String[] {"gdfshh"};
        comboBox.setModel(new DefaultComboBoxModel(values));
        comboBox.setFont(new Font("Cambria", Font.PLAIN, 12));
        
        separator = new JSeparator();
        
        label = new JLabel("");
        label.setIcon(new ImageIcon("C:\\Users\\DOCTEURWAMBA\\Pictures\\Photo_BD\\gar.png"));

        GroupLayout layout = new GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(37)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jLabel4)
        							.addGap(18)
        							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jLabel3)
        								.addComponent(jLabel2))
        							.addGap(18)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        								.addComponent(jTextField2)
        								.addComponent(jTextField1, GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)))
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jLabel5)
        								.addComponent(jLabel6))
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))))
        					.addGap(110))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(18)
        					.addComponent(label)
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 444, GroupLayout.PREFERRED_SIZE)
        						.addComponent(separator, GroupLayout.PREFERRED_SIZE, 419, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED, 23, Short.MAX_VALUE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(39)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel11)
        						.addComponent(jLabel7))
        					.addGap(27)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(238)))
        			.addContainerGap())
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
        			.addContainerGap())
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(276, Short.MAX_VALUE)
        			.addComponent(jButton1)
        			.addGap(18)
        			.addComponent(jButton2)
        			.addGap(18)
        			.addComponent(jButton3)
        			.addGap(35))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(label))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(19)
        					.addComponent(jLabel1)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)))
        			.addGap(26)
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2)
        				.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel3)
        				.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel4)
        				.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel5)
        				.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel6)
        				.addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(26)
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel7))
        			.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel11))
        			.addGap(31)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButton1)
        				.addComponent(jButton2)
        				.addComponent(jButton3))
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
            java.util.logging.Logger.getLogger(CompteFournisseur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompteFournisseur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompteFournisseur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompteFournisseur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CompteFournisseur().setVisible(true);
            }
        });
    }
}
