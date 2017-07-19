package controleur;

import javax.persistence.Query;

import model.FactureAchat;
import model.Fournisseur;
import model.Utilisateur;

public class ControlFactureAchat extends Controleur { 
	
	/**
	 * cette méthode permet d'enregistrer une facture pour achat d'article
	 * @param art
	 * @param lfac
	 * @param fac
	 */
	public void insert(Fournisseur art,FactureAchat lfac,Utilisateur fac)
	{
		manager.getTransaction().begin();
		art.addFactureAchat(lfac);
		fac.addFactureAchat(lfac);
		manager.persist(lfac);
		manager.merge(art);
		manager.merge(fac);
		manager.getTransaction().commit();
	}
	
	
	public void supprimer(FactureAchat fa){
		 final String TEST = "idfactureAchat";
		manager.getTransaction().begin();
		// on supprime un utilisateur dans la bd
		String query = "DELETE FROM facture_achat WHERE idfactureAchat=:idfactureAchat";
		Query q = manager.createNativeQuery(query);
		q.setParameter(TEST, fa.getIdfactureAchat());
		q.executeUpdate();
		manager.getTransaction().commit();
		manager.close();
		
	}
	
	
}
