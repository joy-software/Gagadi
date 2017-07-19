package vue;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

import controleur.ControlArticle;
import controleur.Controleur;
import controleur.Variable;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



public class Ajouter {


	private JFrame ajouter = new JFrame();
	private JFrame frameprinc = new JFrame();
	private ControlArticle con = new ControlArticle();
	private JPanel contentPane;
	private JTextField textField;
	private ArrayList<JTextField> jtext = new ArrayList<JTextField>();
	@SuppressWarnings("rawtypes")
	private ArrayList<JComboBox> jcombo = new ArrayList<JComboBox>();
	private JTextField textField_9;
	private JTextField textField_1;
	private JTextField textField_6;
	private JTextField textField_2;
	private JTextField textField_7;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_4;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ajouter frame = new Ajouter();
					frame.ajouter.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param itablePrincipale 
	 * @param result 
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Ajouter() {
		
		ajouter.setLocationRelativeTo(null);
		ajouter.setTitle("Ajouter");
		ajouter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ajouter.setBounds(100, 100, 625, 394);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.BLUE);
		contentPane.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Ajouter un article", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 255)));
		ajouter.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("D\u00E9signation");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 29, 89, 25);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setToolTipText("la d\u00E9signation de l'article");
		textField.setForeground(Color.WHITE);
		textField.setBackground(new Color(119, 136, 153));
		textField.setBounds(166, 27, 406, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblUnite = new JLabel("P. Variable");
		lblUnite.setFont(new Font("Arial", Font.BOLD, 12));
		lblUnite.setBounds(10, 269, 89, 20);
		contentPane.add(lblUnite);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(new Color(119, 136, 153));
		panel.setBounds(301, 98, 299, 215);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setToolTipText("indique si le prix de vente sera discutable ou pas");
		comboBox_1.setModel(new DefaultComboBoxModel(Variable.BOOL));
		comboBox_1.setBounds(166, 264, 113, 25);
		contentPane.add(comboBox_1);
		
		JLabel label = new JLabel("");
		label.setBounds(71, 150, 94, 160);
		try
		{
			label.setIcon(con.getScaledIcon("./Photo/enr.jpg",label.getWidth(),label.getHeight()));
		
		}
		catch(Exception e)
		{
			Controleur.printStrace(e);
		}
		contentPane.add(label);
		ajouter.setLocationRelativeTo(null);
		ajouter.setVisible(true);
		
		textField_9 = new JTextField();
		textField_9.setToolTipText("indique la marque de l'article");
		textField_9.setForeground(Color.WHITE);
		textField_9.setColumns(10);
		textField_9.setBackground(new Color(119, 136, 153));
		textField_9.setBounds(166, 62, 247, 28);
		contentPane.add(textField_9);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(Variable.TVA));
		comboBox.setBounds(166, 166, 113, 25);
		contentPane.add(comboBox);
		
		JLabel label_2 = new JLabel("Prix unitaire");
		label_2.setFont(new Font("Arial", Font.BOLD, 12));
		label_2.setBounds(6, 19, 89, 20);
		panel.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				try
				{
					con.typing(jtext, comboBox);
				}
				catch(Exception e)
				{
					Controleur.printStrace(e);
				}
			}
		});
		textField_1.setToolTipText("indique le prix avec lequel on a achet\u00E9 le produit");
		textField_1.setForeground(Color.BLACK);
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(230, 230, 250));
		textField_1.setBounds(109, 11, 170, 28);
		panel.add(textField_1);
		
		JLabel label_8 = new JLabel("Prix UTTC");
		label_8.setFont(new Font("Arial", Font.BOLD, 12));
		label_8.setBounds(6, 58, 77, 15);
		panel.add(label_8);
		
		textField_6 = new JTextField();
		textField_6.setToolTipText("Represente la somme du prix d'achat et de la TVA");
		textField_6.setEnabled(false);
		textField_6.setColumns(10);
		textField_6.setBackground(new Color(230, 230, 250));
		textField_6.setBounds(109, 45, 170, 28);
		panel.add(textField_6);
		
		JLabel label_11 = new JLabel("Taux");
		label_11.setFont(new Font("Arial", Font.BOLD, 12));
		label_11.setBounds(6, 84, 89, 20);
		panel.add(label_11);
		
		textField_3 = new JTextField();
		textField_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				try
				{
					con.typing(jtext, comboBox);
				}
				catch(Exception e)
				{
					Controleur.printStrace(e);
				}
			}
		});
		textField_3.setToolTipText("indique la marge b\u00E9n\u00E9ficiaire \u00E0 appliquer sur le produit, il s'exprime en %");
		textField_3.setForeground(Color.BLACK);
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(230, 230, 250));
		textField_3.setBounds(109, 79, 170, 28);
		panel.add(textField_3);
		
		JLabel label_4 = new JLabel("Remise");
		label_4.setFont(new Font("Arial", Font.BOLD, 12));
		label_4.setBounds(6, 119, 77, 22);
		panel.add(label_4);
		
		textField_5 = new JTextField();
		textField_5.setToolTipText("indique la remise a appliquer sur l'article");
		textField_5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				try
				{
					con.typing(jtext, comboBox);
				}
				catch(Exception e)
				{
					Controleur.printStrace(e);
				}
			}
		});
		textField_5.setColumns(10);
		textField_5.setBackground(new Color(230, 230, 250));
		textField_5.setBounds(109, 113, 170, 28);
		panel.add(textField_5);
		
		textField_4 = new JTextField();
		textField_4.setToolTipText("Repr\u00E9sente le prix avec lequel l'article sera vendu");
		textField_4.setForeground(Color.BLACK);
		textField_4.setEnabled(false);
		textField_4.setColumns(10);
		textField_4.setBackground(new Color(230, 230, 250));
		textField_4.setBounds(109, 147, 170, 28);
		panel.add(textField_4);
		
		JLabel label_6 = new JLabel("Prix de vente");
		label_6.setFont(new Font("Arial", Font.BOLD, 12));
		label_6.setBounds(6, 155, 92, 20);
		panel.add(label_6);
		
		JLabel label_10 = new JLabel("B\u00E9n\u00E9fice");
		label_10.setFont(new Font("Arial", Font.BOLD, 12));
		label_10.setBounds(6, 194, 60, 14);
		panel.add(label_10);
		
		textField_8 = new JTextField();
		textField_8.setToolTipText("indique la marge b\u00E9nificiaire de l'entreprise sur un produit");
		textField_8.setEnabled(false);
		textField_8.setColumns(10);
		textField_8.setBounds(109, 180, 170, 28);
		panel.add(textField_8);
		
		
		JLabel lblMarque = new JLabel("Marque");
		lblMarque.setFont(new Font("Arial", Font.BOLD, 12));
		lblMarque.setBounds(10, 65, 89, 20);
		contentPane.add(lblMarque);
		
		JLabel label_3 = new JLabel("Categorie");
		label_3.setFont(new Font("Arial", Font.BOLD, 12));
		label_3.setBounds(10, 105, 77, 14);
		contentPane.add(label_3);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setToolTipText("indique la cat\u00E9gorie ");
		comboBox_3.setModel(new DefaultComboBoxModel(Variable.CATEGORIE));
		comboBox_3.setBounds(166, 98, 113, 25);
		contentPane.add(comboBox_3);
		
		JLabel label_1 = new JLabel("Taille");
		label_1.setFont(new Font("Arial", Font.BOLD, 12));
		label_1.setBounds(10, 135, 77, 20);
		contentPane.add(label_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setToolTipText("indique la taille de l'article");
		comboBox_2.setModel(new DefaultComboBoxModel(Variable.TAILLE));
		comboBox_2.setBounds(166, 130, 113, 25);
		contentPane.add(comboBox_2);
		
		textField_2 = new JTextField();
		textField_2.setToolTipText("indique la quantit\u00E9 de marchandise \u00E0 stocker");
		textField_2.setForeground(Color.WHITE);
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(119, 136, 153));
		textField_2.setBounds(166, 194, 113, 28);
		contentPane.add(textField_2);
		
		JLabel label_9 = new JLabel("Stock Min");
		label_9.setFont(new Font("Arial", Font.BOLD, 12));
		label_9.setBounds(10, 240, 77, 20);
		contentPane.add(label_9);
		
		textField_7 = new JTextField();
		textField_7.setForeground(Color.WHITE);
		textField_7.setToolTipText("indique la quantit\u00E9 minimale \u00E0 avoir en stock");
		textField_7.setColumns(10);
		textField_7.setBackground(new Color(119, 136, 153));
		textField_7.setBounds(166, 229, 113, 28);
		contentPane.add(textField_7);
		
		JButton button = new JButton("Enregistrer");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try
				{
					con.finAjouterArticle(jtext, jcombo, frameprinc, ajouter);
				}
				catch(Exception e)
				{
					Controleur.printStrace(e);
				}
			}
		});
		
		button.setIcon(new ImageIcon("./Photo/iconmodifier.png"));
		button.setFont(new Font("Arial", Font.BOLD, 12));
		button.setBounds(440, 324, 132, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Annuler");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try
				{
					con.AnnulerAjoutArticle(frameprinc, ajouter);
				}
				catch(Exception e)
				{
					Controleur.printStrace(e);
				}
			}
		});
		
		button_1.setIcon(new ImageIcon("./Photo/annuler.png"));
		button_1.setFont(new Font("Arial", Font.BOLD, 12));
		button_1.setBounds(301, 324, 101, 23);
		contentPane.add(button_1);
		
		JLabel label_7 = new JLabel("Quantite");
		label_7.setFont(new Font("Arial", Font.BOLD, 12));
		label_7.setBounds(10, 201, 89, 20);
		contentPane.add(label_7);
		
		JLabel label_5 = new JLabel("TVA");
		label_5.setFont(new Font("Arial", Font.BOLD, 12));
		label_5.setBounds(10, 167, 89, 20);
		contentPane.add(label_5);
		
		jtext.add(textField);
		jtext.add(textField_1);
		jtext.add(textField_2);
		jtext.add(textField_3);
		jtext.add(textField_4);
		jtext.add(textField_5);
		jtext.add(textField_6);
		jtext.add(textField_7);
		jtext.add(textField_8);
		jtext.add(textField_9);
		
		jcombo.add(comboBox);
		jcombo.add(comboBox_1);
		jcombo.add(comboBox_2);
		jcombo.add(comboBox_3);
		
	}

	public JFrame getFrameprinc() {
		return frameprinc;
	}

	public void setFrameprinc(JFrame frameprinc) {
		this.frameprinc = frameprinc;
	}

	public void reset( JFrame itablePrincipale, ControlArticle controlArticle)
	{
		frameprinc = itablePrincipale;
		con = controlArticle;
	}
	
}
