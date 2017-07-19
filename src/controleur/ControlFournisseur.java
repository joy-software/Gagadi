package controleur;

import javax.persistence.Query;

import model.Fournisseur;

public class ControlFournisseur extends Controleur { 
	
	
	
	public void supprimer(Fournisseur fr){
		 final String TEST = "idFournisseur";
		manager.getTransaction().begin();
		// on supprime un utilisateur dans la bd
		String query = "DELETE FROM Fournisseur WHERE idFournisseur=:idFournisseur";
		Query q = manager.createNativeQuery(query);
		q.setParameter(TEST, fr.getIdfournisseur());
		q.executeUpdate();
		manager.getTransaction().commit();
		manager.close();
		
	}

}
