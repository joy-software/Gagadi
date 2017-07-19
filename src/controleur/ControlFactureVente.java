package controleur;

import javax.persistence.Query;

import model.Client;
import model.FactureVente;
import model.Utilisateur;

public class ControlFactureVente extends Controleur{ 
	
	/**
	 * cette méthode permet d'enregistrer une facture pour vendre un article
	 * @param art
	 * @param lfac
	 * @param fac
	 */
	public void insert(Client art,FactureVente lfac,Utilisateur fac)
	{
		manager.getTransaction().begin();
		art.addFactureVente(lfac);
		fac.addFactureVente(lfac);
		manager.persist(lfac);
		manager.merge(art);
		manager.merge(fac);
		manager.getTransaction().commit();
	}
	
	public void supprimer(FactureVente fv){
		 final String TEST = "idfactureVente";
		manager.getTransaction().begin();
		// on supprime un utilisateur dans la bd
		String query = "DELETE FROM facture_vente WHERE idfactureVente=:idfactureVente";
		Query q = manager.createNativeQuery(query);
		q.setParameter(TEST, fv.getIdfactureVente());
		q.executeUpdate();
		manager.getTransaction().commit();
		manager.close();
		
	}
	

}
