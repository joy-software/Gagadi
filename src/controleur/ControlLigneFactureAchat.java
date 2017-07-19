package controleur;

import javax.persistence.Query;

import model.Article;
import model.FactureAchat;
import model.LigneFactureAchat;

public class ControlLigneFactureAchat extends Controleur{ 
	
	
	
	/**
	 * cette méthode permet d'enregistrer une  ligne de facture pour achat d'article
	 * @param art
	 * @param lfac
	 * @param fac
	 */
	public void insert(Article art,LigneFactureAchat lfac,FactureAchat fac)
	{
		manager.getTransaction().begin();
		art.addLigneFactureAchat(lfac);
		fac.addLigneFactureAchat(lfac);
		manager.persist(lfac);
		manager.merge(art);
		manager.merge(fac);
		manager.getTransaction().commit();
	}
	
	
	
	public void supprimer(LigneFactureAchat lfa){
		 final String TEST = "id";
		
		// on supprime un utilisateur dans la bd
		String query = "DELETE FROM ligne_facture_achat WHERE id=:id";
		Query q = manager.createNativeQuery(query);
		q.setParameter(TEST, lfa.getId());
		q.executeUpdate();
		manager.getTransaction().commit();
		
	}
	

}
