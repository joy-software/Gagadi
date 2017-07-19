package controleur;

import javax.persistence.Query;

import model.Article;
import model.CommandeFr;
import model.LigneCommandeFr;


public class ControlLigneCommandeFr extends Controleur { 
	
	
	/**
	 * cette méthode permet d'enregistrer une  ligne de commande facture pour achat d'article
	 * @param art
	 * @param lfac
	 * @param fac
	 */
	public void insert(Article art,LigneCommandeFr lfac,CommandeFr fac)
	{
		manager.getTransaction().begin();
		art.addLigneCommandeFr(lfac);
		fac.addLigneCommandeFr(lfac);
		manager.persist(lfac);
		manager.merge(art);
		manager.merge(fac);
		manager.getTransaction().commit();
	}
	
	public void supprimer(LigneCommandeFr lcfr){
		 final String TEST = "id";
		manager.getTransaction().begin();
		// on supprime un utilisateur dans la bd
		String query = "DELETE FROM Ligne_commande_fr WHERE id=:id";
		Query q = manager.createNativeQuery(query);
		q.setParameter(TEST, lcfr.getId());
		q.executeUpdate();
		manager.getTransaction().commit();
		manager.close();
		
	}
	

}
