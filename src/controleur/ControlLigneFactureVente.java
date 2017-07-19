package controleur;

import javax.persistence.Query;

import model.Article;
import model.FactureVente;
import model.LigneFactureVente;

public class ControlLigneFactureVente extends Controleur{ 
	
	
	/**
	 * cette méthode permet d'enregistrer une  ligne de commande de facture pour vente d'article
	 * @param art
	 * @param lfac
	 * @param fac
	 */
	public void insert(Article art,LigneFactureVente lfac,FactureVente fac)
	{
		manager.getTransaction().begin();
		art.addLigneFactureVente(lfac);
		fac.addLigneFactureVente(lfac);
		manager.persist(lfac);
		manager.merge(art);
		manager.merge(fac);
		manager.getTransaction().commit();
	}
	
	public void supprimer(LigneFactureVente lfv){
		 final String TEST = "id";
		manager.getTransaction().begin();
		// on supprime un utilisateur dans la bd
		String query = "DELETE FROM ligne_facture_vente WHERE id=:id";
		Query q = manager.createNativeQuery(query);
		q.setParameter(TEST, lfv.getId());
		q.executeUpdate();
		manager.getTransaction().commit();
		manager.close();
		
	}

}
