package vue;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JRadioButton;
import javax.swing.JButton;

import controleur.ControlArticle;
import controleur.Controleur;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SuppressionArticle  {

	private JFrame suppressionArticle = new JFrame();
	private JPanel contentPane;
	public JFrame supprim;
	public JFrame itable;
	private ControlArticle con = new ControlArticle();
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnNewRadioButton_2;
	private JRadioButton rdbtnSupprimerCetArticle;
	private int i = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new SuppressionArticle("joy dress");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SuppressionArticle(String designation) {
		
		suppressionArticle.setTitle("Suppression");
		suppressionArticle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		suppressionArticle.setBounds(100, 100, 420, 319);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		suppressionArticle.setContentPane(contentPane);
		suppressionArticle.setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		JLabel lblQueVoulezvousFaire = new JLabel("Que voulez-vous faire?");
		lblQueVoulezvousFaire.setForeground(new Color(30, 144, 255));
		lblQueVoulezvousFaire.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblQueVoulezvousFaire.setBounds(94, 34, 203, 34);
		contentPane.add(lblQueVoulezvousFaire);
		
		rdbtnSupprimerCetArticle = new JRadioButton("Supprimer <dynamic> de la liste des articles");
		rdbtnSupprimerCetArticle.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				rdbtnNewRadioButton.setSelected(false);
				rdbtnNewRadioButton_1.setSelected(false);
				rdbtnNewRadioButton_2.setSelected(false);
				rdbtnSupprimerCetArticle.setSelected(true);
				setI(1);
			}
		});
		rdbtnSupprimerCetArticle.setSelected(true);
		rdbtnSupprimerCetArticle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnSupprimerCetArticle.setBounds(21, 78, 292, 50);
		contentPane.add(rdbtnSupprimerCetArticle);
		
		rdbtnNewRadioButton = new JRadioButton("Supprimer toutes les commandes li\u00E9es \u00E0 "+designation);
		rdbtnNewRadioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setI(2);
				rdbtnSupprimerCetArticle.setSelected(false);
				rdbtnNewRadioButton.setSelected(true);
				rdbtnNewRadioButton_1.setSelected(false);
				rdbtnNewRadioButton_2.setSelected(false);
			}
		});
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton.setBounds(21, 119, 337, 50);
		contentPane.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("Supprimer les factures li\u00E9es \u00E0 "+designation);
		rdbtnNewRadioButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				rdbtnSupprimerCetArticle.setSelected(false);
				rdbtnNewRadioButton.setSelected(false);
				rdbtnNewRadioButton_1.setSelected(true);
				setI(3);
				rdbtnNewRadioButton_2.setSelected(false);
			}
		});
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_1.setBounds(21, 160, 276, 50);
		contentPane.add(rdbtnNewRadioButton_1);
		
	    rdbtnNewRadioButton_2 = new JRadioButton("Supprimer toutes les r\u00E9f\u00E9rences de "+designation);
	    rdbtnNewRadioButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setI(4);
				rdbtnSupprimerCetArticle.setSelected(false);
				rdbtnNewRadioButton.setSelected(false);
				rdbtnNewRadioButton_1.setSelected(false);
				rdbtnNewRadioButton_2.setSelected(true);
			}
		});
	    rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_2.setBounds(21, 201, 325, 40);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try
				{
					con.finSuppression(itable, supprim, suppressionArticle,getI());
				}
				catch(Exception e)
				{
					Controleur.printStrace(e);
				}
			}
		});
		btnNewButton.setBounds(250, 246, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnAnnuler = new JButton("ANNULER");
		btnAnnuler.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try
				{
					con.annulerSuppression(itable, supprim, suppressionArticle);
				}
				catch(Exception e)
				{
					Controleur.printStrace(e);
				}
			}
		});
		btnAnnuler.setBounds(108, 246, 89, 23);
		contentPane.add(btnAnnuler);
		suppressionArticle.setVisible(true);
	}

	public void reset(JFrame frameprinc, JFrame supprimer) {
		// TODO Auto-generated method stub
		itable = frameprinc;
		supprim = supprimer;
		
	}

	/**
	 * @return the i
	 */
	public int getI() {
		return i;
	}

	/**
	 * @param i the i to set
	 */
	public void setI(int i) {
		this.i = i;
	}
}
