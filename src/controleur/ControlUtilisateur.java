package controleur;

import java.awt.Color;

import javax.persistence.Query;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controleur.Recherche.RechercherUtilisateur;
import vue.I_TablePrincipaleGestionnaire;
import vue.I_tablePrincipale;
import vue.I_tablePrincipaleCaisse;
import model.Utilisateur;

public class ControlUtilisateur extends Controleur{ 
	

	/**
	 * Ce constructeur est utiliser lorsqu'on clique sur show password
	 * @param jPasswordField1
	 */
	public ControlUtilisateur(JPasswordField jPasswordField1) {
		
		jPasswordField1.setText(ConvertToString(jPasswordField1.getPassword()));
	}
	
	
	public ControlUtilisateur(JTextField jTextField1,
			JLabel jLabel3, JPasswordField jPasswordField1, JFrame i_Connexion) {
	
		//on récupère le mot de passe et le login
		String login = jTextField1.getText();        		
		String password =  ConvertToString(jPasswordField1.getPassword());
		
		
		/**
		 * on vérifie qu'il y'a pas de caractères spéciaux
		 */
		if(!ChaineValide(login))
		{
			jTextField1.setText(CARACTERE_INVALIDE);
			jTextField1.setForeground(new Color(169, 169, 169));
		}
		else
		{
			/**
			 * on vérifie les paramètres de configuration
			 */
			if(!check(login,password, i_Connexion))
			{
				jLabel3.setVisible(true);
				jTextField1.setText(null);
				jPasswordField1.setText(null);
			}
		}
		
	}



	/**
	 * Cette méthode permet de vérifier les paramètres de Connexion
	 * @param login
	 * @param password
	 * @param i_Connexion
	 * @return
	 */
	public boolean check(String login, String password,JFrame i_Connexion )
	{
		boolean result = false;
		RechercherUtilisateur rec = new RechercherUtilisateur();
		Utilisateur util = null;
		
		//on effectue des transactions
	/*	createEntity();
		RecupUtilisateur();
		finish();*/
		
		//on vérifie qu'il se trouve dans la BD
		rec.checkUser(login);
		
		if (!RechercherUtilisateur.getResultat().isEmpty()) 
		{
			util = RechercherUtilisateur.getResultat().get(0);
		}
					
		if(util != null)
		{
			if (util.getPassword().equals(password))
			{
				if(util.getTypes().equals("Caissière"))
				{
					new I_tablePrincipaleCaisse();
				}
				else
				{
					if(util.getTypes().equals("Gestionnaire"))
					{
						new I_TablePrincipaleGestionnaire();
					}
					else
					{
						new I_tablePrincipale();
					}
				}
				i_Connexion.dispose();
			}
		}
		return result;
	}
	
	
	public void supprimer(Utilisateur user){
		 final String TEST = "login";
		manager.getTransaction().begin();
		// on supprime un utilisateur dans la bd
		String query = "DELETE FROM utilisateur WHERE login=:login";
		Query q = manager.createNativeQuery(query);
		q.setParameter(TEST, user.getLogin());
		q.executeUpdate();
		manager.getTransaction().commit();
		manager.close();
		
	}
	
}
