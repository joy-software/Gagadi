package controleur;

import javax.persistence.Query;

import model.CommandeFr;
import model.Fournisseur;
import model.Utilisateur;

public class ControlCommandeFr extends Controleur{ 
	
	/**
	 * cette méthode permet d'enregistrer une commande faite à un fournisseur
	 * @param art
	 * @param lfac
	 * @param fac
	 */
	public void insert(Fournisseur art,CommandeFr lfac,Utilisateur fac)
	{
		manager.getTransaction().begin();
		art.addCommandeFr(lfac);
		fac.addCommandeFr(lfac);
		manager.persist(lfac);
		manager.merge(art);
		manager.merge(fac);
		manager.getTransaction().commit();
	}
	
	
	public void supprimer(CommandeFr Cfr){
		final String TEST = "idcommandefr";
		manager.getTransaction().begin();
		// on supprime un utilisateur dans la bd
		String query = "DELETE FROM commande_fr WHERE idcommandefr=:idcommandefr";
		Query q = manager.createNativeQuery(query);
		q.setParameter(TEST, Cfr.getIdcommandefr());
		q.executeUpdate();
		manager.getTransaction().commit();
		manager.close();
		
	}
	

}
