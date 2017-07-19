package controleur;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.persistence.Query;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import model.Article;
import vue.Ajouter;
import vue.I_tablePrincipale;
import vue.ModifierArticle;
import vue.SuppressionArticle;
import vue.SupprimerArticle;
import controleur.Recherche.RechercherArticle;


/**
 * 
 * @author Joy Jedidja NDJAMA
 * 
 * <br><p>Cette classe est en charge de tous
 * les controles pouvant s'effectuer sur un 
 * article</p>
 *
 */
public class ControlArticle extends Controleur{ 
	
	
	private boolean DEBUG = true;
	boolean selection = false;
	private Object[][] data;
	private JTable jTable2 = new JTable();
	Article result = new Article();
	I_tablePrincipale princip;
	
	//ce controleur est appelé lorsque on gère les articles avec un tableau

	
	/**
	 * @return the data
	 */
	public Object[][] getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Object[][] data) {
		this.data = data;
	}


	/**
	 * cette méthode effectue le traitement du 2ème constructeur
	 * @param data
	 */
	public Object[][]  chargerAticle(int j) {
		
		Object[][] data;
		int i = 0;
	
		/**
		 * lorsqu'on lance une recherche
		 */
		if(j == 2)
		{
			//on instatie le tableau
			data = new Object[RechercherArticle.getResultat().size()][12];
			//on le remplit
			for (Article auto : RechercherArticle.getResultat())
			{
				data[i][0] = auto.getIdarticle();
				data[i][1] = auto.getDesignation();
				data[i][2] = auto.getMarque();
				data[i][3] = auto.getPrixUH();
				data[i][4] = auto.getQuantite();
				data[i][5] = auto.getTaux();
				data[i][6] = auto.getPrixvente();
				data[i][7] = boola( auto.getPrixvariable());
				data[i][8] = auto.getRemise();
				data[i][9] = auto.getPrixUH();
				data[i][9] = auto.getPrixUTTC();
				data[i][10] = auto.getStockmin();
				data[i][11] = auto.getBenefice();
				i++;
			}
		}
		else
		{
			/**
			 * ici on recupère de la BD pour le test
			 */
			if (j == 0)
			{
				createEntity();
				RecupArticle();
				finish();//*/
			}
			
			/**
			 * on instantie data
			 */
			data = new Object[listeArticle.size()][12];
			
			/**
			 * on remplit data
			 */
			for (Article auto : listeArticle)
			{
				data[i][0] = auto.getIdarticle();
				data[i][1] = auto.getDesignation();
				data[i][2] = auto.getMarque();
				data[i][3] = auto.getPrixUH();
				data[i][4] = auto.getQuantite();
				data[i][5] = auto.getTaux();
				data[i][6] = auto.getPrixvente();
				data[i][7] = boola( auto.getPrixvariable());
				data[i][8] = auto.getRemise();
				data[i][9] = auto.getPrixUH();
				data[i][9] = auto.getPrixUTTC();
				data[i][10] = auto.getStockmin();
				data[i][11] = auto.getBenefice();
				i++;
			}
		}
		
		
		return data;
	}

	
	private Boolean boola(byte prixvariable) {
		// TODO Auto-generated method stub
		if(prixvariable == 0 )
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	/**
	 * cette méthode permet de recuperer les attributs d'un article
	 * @param i
	 * @param table
	 * @param buts 
	 */
	public void printDebugData(int i,JTable table, ArrayList<JButton> buts) {
		//javax.swing.table.TableModel model = table.getModel();
		
		if((i <= listeArticle.size()) && (i >= 0))
		{
			result = listeArticle.get(i);
			buts.get(0).setEnabled(true);
			buts.get(1).setEnabled(true);
			buts.get(2).setEnabled(true);
			buts.get(3).setEnabled(true);
		}
		/*result.setIdarticle((int)model.getValueAt(i,0));
		result.setDescription((String) model.getValueAt(i,1));
		result.setMarque((String)model.getValueAt(i,2));
		result.setPrixUH((double)model.getValueAt(i,3));
		result.setQuantite((int)model.getValueAt(i,4));
		result.setTaux((double)model.getValueAt(i,5));
		result.setPrixvente((double)model.getValueAt(i,6));
		result.setPrixvariable(bool((boolean)model.getValueAt(i,7)));
		result.setRemise((double)model.getValueAt(i,8));
		result.setPrixUTTC((double)model.getValueAt(i,9));
		result.setStockmin((int)model.getValueAt(i,10));
		result.setBenefice((double)model.getValueAt(i,11));*/
		
    }

	
	/**
	 * cette méthode transforme un boolean en byte
	 * @param b
	 * @return
	 */
	private byte bool(boolean b) {
	
		
		if(b)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public void supprimer(Article art){
		 final String TEST = "idarticle";
		manager.getTransaction().begin();
		// on supprime un utilisateur dans la bd
		String query = "DELETE FROM Article WHERE idarticle=:idarticle";
		Query q = manager.createNativeQuery(query);
		q.setParameter(TEST, art.getIdarticle());
		q.executeUpdate();
		manager.getTransaction().commit();
		manager.close();
		
	}

	
	/**
	 * cette méthode gère l'ajout d'un nouvel article
	 * @param itablePrincipale
	 * @param data 
	 */
	public void DebutAjoutArticle(JFrame itablePrincipale, JTable jTable2) {
		// TODO Auto-generated method stub
		
		itablePrincipale.setEnabled(false);
		Ajouter ajout = new Ajouter();
		ajout.reset(itablePrincipale, this);
		this.jTable2 = jTable2;
	}

	
	/**
	 * gère l'annulation de l'ajout
	 * @param frameprinc
	 * @param ajouter
	 */
	public void AnnulerAjoutArticle(JFrame frameprinc, JFrame ajouter) {
		// TODO Auto-generated method stub
		
		frameprinc.setEnabled(true);
		ajouter.dispose();
		
	}

	public void finAjouterArticle(ArrayList<JTextField> jtext,
			@SuppressWarnings("rawtypes") ArrayList<JComboBox> jcombo, JFrame frameprinc, JFrame ajouter) {
		
		result = new Article();
		//on recupère les données de l'article
		result.setDesignation(jtext.get(0).getText());
		result.setMarque(jtext.get(9).getText());
		result.setPrixUH(doub(jtext.get(1),0));
		result.setTaux(doub(jtext.get(3),1));
		result.setQuantite((integ(jtext.get(1))));
		result.setPrixvente(doub(jtext.get(4),0));
		result.setRemise(doub(jtext.get(5),0));
		result.setPrixUTTC(doub(jtext.get(6),0));
		result.setStockmin(integ(jtext.get(7)));
		result.setBenefice(doub(jtext.get(8),0));
		result.setCategorie((String)(jcombo.get(3)).getSelectedItem());
		result.setTaille((String)(jcombo.get(2)).getSelectedItem());
		result.setPrixvariable(bool(Boolean.parseBoolean((String)(jcombo.get(1)).getSelectedItem())));
		
		if((!result.getDesignation().isEmpty()) && (result.getPrixvente() != 0))
		{
			//on enregistre l'article dans la BD
			createEntity();
			enregistrer(result);
			finish();
			listeArticle.add(result);
			
			//on recharge le tableau
			jTable2.setModel(CreateModel(1));
		}
		
		//on ferme la fenêtre et on rend la fentre principale active
		frameprinc.setEnabled(true);
		closeWindow(ajouter);			
	}

	

	public DefaultTableModel CreateModel(int i)
	{
		
	        
	        String[] nomColonne = new String [] {"Code", "Nom", "Marque", "Prix Unitaire HT",
	        		"Quantité", "Taux", "Prix Vente", "Prix Variable", "Remise",
	        		"Prix TTC", "Stock min", "Benefice"};
	        

	    	/**
	    	 * on remplit le tableau en faisant appel au controleur
	    	 */
	        try
	        {
	        	data = chargerAticle(i);
	        }
			catch(Exception e)
			{
				Controleur.printStrace(e);
			}
			
	        
	        javax.swing.table.DefaultTableModel Model = new javax.swing.table.DefaultTableModel(data,nomColonne) {
	            /**
				 * 
				 */
				private static final long serialVersionUID = 1L;
				@SuppressWarnings("rawtypes")
				Class[] types = new Class [] {
	                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Boolean.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class
	            };
	            boolean[] canEdit = new boolean [] {
	                false, false, false, false, false, false, false, false, false, false, false, false, false, false
	            };

	            @SuppressWarnings({ "unchecked", "rawtypes" })
				public Class getColumnClass(int columnIndex) {
	                return types [columnIndex];
	            }

	            public boolean isCellEditable(int rowIndex, int columnIndex) {
	                return canEdit [columnIndex];
	            }
	        };
			
		return Model;
	}

	

	/**
	 * s'enclenche lorsqu'on commence à ecrire
	 * @param jtext
	 * @param comboBox
	 */
	public void typing(ArrayList<JTextField> jtext, @SuppressWarnings("rawtypes") JComboBox comboBox) {
		
		double prixUnitaire = doub(jtext.get(1),0);
		double taux = doub(jtext.get(3),1)/100;
		double remise = doub(jtext.get(5),2)/100;
		double tva = doub((String)(comboBox.getSelectedItem()));
		int  prixUTTC = arrondi( ((prixUnitaire * tva / 100 ) + prixUnitaire));
		jtext.get(4).setText(""+(arrondi(prixUTTC + prixUTTC * taux - remise * prixUTTC)));
		jtext.get(6).setText(""+ prixUTTC);
		jtext.get(8).setText(""+(arrondi(prixUTTC * taux - remise * prixUTTC)));
	
	}

	

	/**
	 * convertit un String en double
	 * @param string
	 * @return
	 */
	private double doub(String string) {
		
		try
		{
			return Double.parseDouble(string);
		}
		catch(Exception e)
		{
			printStrace(e);
			return 0.0;
		}
	}

	/**
	 * cette méthode vérifie qu'on a bien selectionné une case du tableau
	 * @param itablePrincipale
	 * @param jTable2
	 * @param buts 
	 */
	public void select(JFrame itablePrincipale, JTable jTable2, ArrayList<JButton> buts) {
		// 

		if (DEBUG) {
	           jTable2.addMouseListener(new MouseAdapter() {
	               public void mouseClicked(MouseEvent e) {
	               	selection = true;
	                   printDebugData(jTable2.getSelectedRow(),jTable2,buts);
	               }
	           });
	       }
		
	}

	/**
	 * cette méthode s'occupe de la recherche d'un article
	 * @param tfSearchArt
	 */
	public void typResearch(JTextField tfSearchArt,JTable jTable2) {
		
		RechercherArticle rec = new RechercherArticle();
		String designation = tfSearchArt.getText();
		this.jTable2 = jTable2;
		
		rec.searchArt(designation);
		
		jTable2.setModel(CreateModel(2));
		
	}

	
	/**
	 * Cette méthode permet de lancer la fenêtre permettant la modification 
	 * d'un article
	 * @param itablePrincipale
	 * @param jTable22
	 */
	public void DebutModifArticle(JFrame itablePrincipale, JTable jTable22) {
		// TODO Auto-generated method stub
		
		itablePrincipale.setEnabled(false);
		ModifierArticle modif = new ModifierArticle();
		modif.reset(itablePrincipale, this);
		Remplissage(modif.getJcombo(),modif.getJtext());
		this.jTable2 = jTable22;
	}

	
	/**
	 * Cette méthode permet de remplir les jcombo et les Jtext de la vue ModifierArticle
	 * @param jcombo
	 * @param jtext
	 */
	@SuppressWarnings("rawtypes")
	private void Remplissage(ArrayList<JComboBox> jcombo,
			ArrayList<JTextField> jtext) {
		// TODO Auto-generated method stub
		
		jtext.get(0).setText(result.getDesignation());
		jtext.get(9).setText(result.getMarque());
		jtext.get(1).setText(""+result.getPrixUH());
		jtext.get(3).setText(""+result.getTaux());
		jtext.get(1).setText(""+result.getQuantite());
		jtext.get(4).setText(""+result.getPrixvente());
		jtext.get(5).setText(""+result.getRemise());
		jtext.get(6).setText(""+result.getPrixUTTC());
		jtext.get(7).setText(""+result.getStockmin());
		jtext.get(8).setText(""+result.getBenefice());
		jcombo.get(3).setSelectedItem(result.getCategorie());
		jcombo.get(2).setSelectedItem(result.getTaille());
		jcombo.get(1).setSelectedItem(""+boola(result.getPrixvariable()));
	}

	@SuppressWarnings("rawtypes")
	public void finModifierArticle(ArrayList<JTextField> jtext,
			ArrayList<JComboBox> jcombo, JFrame frameprinc, JFrame ajouter) {
		// TODO Auto-generated method stub
		
		//on recupère les données de l'article
		result.setDesignation(jtext.get(0).getText());
		result.setMarque(jtext.get(9).getText());
		result.setPrixUH(doub(jtext.get(1),0));
		result.setTaux(doub(jtext.get(3),1));
		result.setQuantite((integ(jtext.get(1))));
		result.setPrixvente(doub(jtext.get(4),0));
		result.setRemise(doub(jtext.get(5),0));
		result.setPrixUTTC(doub(jtext.get(6),0));
		result.setStockmin(integ(jtext.get(7)));
		result.setBenefice(doub(jtext.get(8),0));
		result.setCategorie((String)(jcombo.get(3)).getSelectedItem());
		result.setTaille((String)(jcombo.get(2)).getSelectedItem());
		result.setPrixvariable(bool(Boolean.parseBoolean((String)(jcombo.get(1)).getSelectedItem())));

		if(((!result.getDesignation().isEmpty()) && (result.getPrixvente() != 0)))
		{
			//on enregistre l'article dans la BD
			createEntity();
			modifier(result);
			finish();
		
			//on recharge le tableau
			jTable2.setModel(CreateModel(1));
		}
		
		//on ferme la fenêtre et on rend la fentre principale active
		frameprinc.setEnabled(true);
		closeWindow(ajouter);			
	}

	/**
	 * cette méthode s'eclenche lorsque l'on clique sur le bouton supprimer 
	 * pour un article donné
	 * @param itablePrincipale
	 * @param jTable22
	 */
	public void DebutSupprimArticle(JFrame itablePrincipale, JTable jTable22) {
		itablePrincipale.setEnabled(false);
		SupprimerArticle delete = new SupprimerArticle();
		delete.reset(itablePrincipale, this);
		Remplissage(delete.getJcombo(),delete.getJtext());
		this.jTable2 = jTable22;
		
	}

	
	/**
	 * s'actionne lorsqu'on veut supprimer effectivement
	 * @param frameprinc
	 * @param supprimer
	 */
	public void finSupprimArticle(JFrame frameprinc, JFrame supprimer) {
		supprimer.setEnabled(false);
		SuppressionArticle sup = new SuppressionArticle(result.getDesignation());
		sup.reset(frameprinc,supprimer);
		
	}

	
	/**
	 * s'actionne lorsqu'on annule la suppression
	 * @param itable
	 * @param supprim
	 * @param suppressionArticle
	 */
	public void annulerSuppression(JFrame itable, JFrame supprim,
			JFrame suppressionArticle) {
		itable.setEnabled(true);
		closeWindow(suppressionArticle);
		closeWindow(supprim);
		
		
	}

	
	/**
	 * s'actionne lorsqu'on confirme la suppression
	 * @param itable
	 * @param supprim
	 * @param suppressionArticle
	 * @param i
	 */
	public void finSuppression(JFrame itable, JFrame supprim,
			JFrame suppressionArticle, int i) {
		
		itable.setEnabled(true);
		closeWindow(suppressionArticle);
		closeWindow(supprim);
		
		/*
		 * a completer
		 */
	}
		

	
}
