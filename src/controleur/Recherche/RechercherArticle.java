package controleur.Recherche;

import java.util.ArrayList;
import model.Article;
import controleur.Controleur;


/**
 * 
 * @author Joy Jedidja NDJAMA
 * <br> <p> cette classe permet d'effectuer la recherche d'un article 
 * dans notre liste d'article </p> 
 *
 */
public class RechercherArticle {
	//les attributs de la classe recherche
		private  static ArrayList<Article> listeRecherche;
		private  static ArrayList<Article> resultat = new ArrayList<Article>();
		
		
		/**
		 * les getteurs et setteurs
		 * @return
		 */
		public static ArrayList<Article> getListeRecherche() {
			return listeRecherche;
		}

		public static void setListeRecherche(ArrayList<Article> listeRecherche) {
			RechercherArticle.listeRecherche = listeRecherche;
		}

		public static ArrayList<Article> getResultat() {
			return resultat;
		}

		public static void setResultat(ArrayList<Article> resultat) {
			RechercherArticle.resultat = resultat;
		}
		
		
		/**
		 * cette methode permet de renvoyer dans le resultat 
		 * les articles qui contiennent ou sont égales 
		 * à la donnée envoyée.
		 */
		public void searchArt(String designation)
		{
			listeRecherche = Controleur.listeArticle;
			resultat.clear();
			if (listeRecherche != null)
			{
				for( Article auto:listeRecherche)
				{
					if (auto.getDesignation().contains(designation))
						resultat.add(auto);
				}
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
