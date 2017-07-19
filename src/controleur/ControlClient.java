package controleur;

import javax.persistence.Query;

import controleur.Recherche.RechercherArticle;
import model.Article;
import model.Client;

public class ControlClient extends Controleur{ 
	
	
	
	public void supprimer(Client cl){
		 final String TEST = "idclient";
		manager.getTransaction().begin();
		// on supprime un utilisateur dans la bd
		String query = "DELETE FROM client WHERE idclient=:idclient";
		Query q = manager.createNativeQuery(query);
		q.setParameter(TEST, cl.getIdclient());
		q.executeUpdate();
		manager.getTransaction().commit();
		manager.close();
		
	}

	/**
	 * cette méthode permet de récuperer tous les clients de la BD pour
	 * les mettre dans notre tableau
	 * @param i
	 * @return
	 */
	public Object[][] chargerClient(int j) {
		// TODO Auto-generated method stub
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
				data[i][0] = auto.get();
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
	
}
