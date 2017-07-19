package controleur.Recherche;

import java.util.ArrayList;
import model.Client;
import controleur.Controleur;


/**
 * 
 * @author Joy Jedidja NDJAMA
 * <br> <p> cette classe permet d'effectuer la recherche d'un article 
 * dans notre liste d'article </p> 
 *
 */
public class RechercherClient {
	//les attributs de la classe recherche
		private  static ArrayList<Client> listeRecherche;
		private  static ArrayList<Client> resultat = new ArrayList<Client>();
		
		
		/**
		 * les getteurs et setteurs
		 * @return
		 */
		public static ArrayList<Client> getListeRecherche() {
			return listeRecherche;
		}

		public static void setListeRecherche(ArrayList<Client> listeRecherche) {
			RechercherClient.listeRecherche = listeRecherche;
		}

		public static ArrayList<Client> getResultat() {
			return resultat;
		}

		public static void setResultat(ArrayList<Client> resultat) {
			RechercherClient.resultat = resultat;
		}
		
		
		/**
		 * cette methode permet de renvoyer dans le resultat 
		 * les Clients qui contiennent ou sont égales 
		 * à la donnée envoyée.
		 */
		public void searchArt(String designation)
		{
			listeRecherche = Controleur.listeClient;
			resultat.clear();
			if (listeRecherche != null)
			{
				for( Client auto:listeRecherche)
				{
					if (auto.get().contains(designation))
						resultat.add(auto);
				}
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
