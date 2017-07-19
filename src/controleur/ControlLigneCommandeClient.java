package controleur;

import javax.persistence.Query;

import model.Article;
import model.CommandeClient;
import model.LigneCommandeClient;


public class ControlLigneCommandeClient extends Controleur{ 
	
	
	public void insert(Article art,LigneCommandeClient lfac,CommandeClient fac)
	{
		manager.getTransaction().begin();
		art.addLigneCommandeClient(lfac);
		fac.addLigneCommandeClient(lfac);
		manager.persist(lfac);
		manager.merge(art);
		manager.merge(fac);
		manager.getTransaction().commit();
	}
	
	public void supprimer(LigneCommandeClient lcc){
		 final String TEST = "id";
		manager.getTransaction().begin();
		// on supprime un utilisateur dans la bd
		String query = "DELETE FROM ligne_commande_client WHERE id=:id";
		Query q = manager.createNativeQuery(query);
		q.setParameter(TEST, lcc.getId());
		q.executeUpdate();
		manager.getTransaction().commit();
		manager.close();
		
	}
	
}
