package controleur.Recherche;

import java.util.ArrayList;

import controleur.Controleur;
import model.Utilisateur;

/**
 * 
 * @author NDJAMA
 *
 */
public class RechercherUtilisateur {

	//les attributs de la classe recherche
	private  static ArrayList<Utilisateur> listeRecherche;
	private  static ArrayList<Utilisateur> resultat = new ArrayList<Utilisateur>();
	
	
	/**
	 * les getteurs et setteurs
	 * @return
	 */
	public static ArrayList<Utilisateur> getListeRecherche() {
		return listeRecherche;
	}

	public static void setListeRecherche(ArrayList<Utilisateur> listeRecherche) {
		RechercherUtilisateur.listeRecherche = listeRecherche;
	}

	public static ArrayList<Utilisateur> getResultat() {
		return resultat;
	}

	public static void setResultat(ArrayList<Utilisateur> resultat) {
		RechercherUtilisateur.resultat = resultat;
	}
	
	
	/**
	 * cette methode permet de renvoyer dans le resultat les données des utilisateurs qui contiennent ou sont égales au login entré
	 */
	public void checkUser(String Login)
	{
		listeRecherche = Controleur.listeUtilisateur;
		resultat.clear();
		if (listeRecherche != null)
		{
			for( Utilisateur auto:listeRecherche)
			{
				if (auto.getLogin().contains(Login))
					resultat.add(auto);
			}
		}
	}


	public static void main(String[] args) {
	
	

	}

}
