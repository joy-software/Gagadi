package controleur;

import javax.persistence.Query;

import model.Client;
import model.CommandeClient;
import model.Utilisateur;

public class ControlCommandeClient extends Controleur { 
	
	/**
	 * cette méthode permet d'enregistrer une commande pour achat d'article par client
	 * @param art
	 * @param lfac
	 * @param fac
	 */
	public void insert(Client art,CommandeClient lfac,Utilisateur fac)
	{
		manager.getTransaction().begin();
		art.addCommandeClient(lfac);
		fac.addCommandeClient(lfac);
		manager.persist(lfac);
		manager.merge(art);
		manager.merge(fac);
		manager.getTransaction().commit();
	}
	
	
	public void supprimer(CommandeClient Ccl){
		 final String TEST = "idcommandecl";
		manager.getTransaction().begin();
		// on supprime un utilisateur dans la bd
		String query = "DELETE FROM commande_client WHERE idcommandecl=:idcommandecl";
		Query q = manager.createNativeQuery(query);
		q.setParameter(TEST, Ccl.getIdcommandecl());
		q.executeUpdate();
		manager.getTransaction().commit();
		manager.close();
		
	}

}
