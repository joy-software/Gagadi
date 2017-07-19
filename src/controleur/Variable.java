package controleur;

import model.Fournisseur;

/**
 * 
 * @author Joy Jedidja NDJAMA
 *
 *<br><p>Cette classe contient les principales variables et constantes 
 *utilisé pour le controle des données et l'affichage </p>
 */
public class Variable {

	
	public final String CARACTERE_INVALIDE = "Eviter les caractères spéciaux";
	public final String EMAIL_INVALIDE = "Cet email est invalide ressayer";
	public static  String[] CATEGORIE =  {"T-Shirt","Tricot","Pantalon","Short","Robe","Jupe","Autres"};
	public static String[] caractInt = {"'", ",", ";", "\\", "/", "{", "}", "[", "]", "." };
	public static String[] caracEmail = {"@","."};
	public static  String[] TVA = { "19.25", "17.5"};
	public static String[] UNITE = {"balot","sac","Kg","paquet"};
	public static String[] TAILLE = {"X","XL","XXL"};
	public static String[] BOOL = {"true","false"};
	
	
	public static String[] Fournisseurnom() {
		Controleur con = new Controleur();
		String[] result = { "Anonyme"};
		
		con.createEntity();
		con.RecupFournisseur();
		con.finish();
		result = new String[Controleur.listeFournisseur.size()];
		int i = 0;
		
		for(Fournisseur auto : Controleur.listeFournisseur)
		{
			result[i] = auto.getName();
			i++;
		}
		
		return result;
	}
	
	/**
	 * les getteurs et setteurs
	 * @return
	 */
	public static String[] getFOURNISSEUR() {
		return CATEGORIE;
	}
	
	public static void setCATEGORIE(String[] CATEGOR) {
		CATEGORIE = CATEGOR;
	}
	public static String[] getCaractInt() {
		return caractInt;
	}
	public static void setCaractInt(String[] caractInt) {
		Variable.caractInt = caractInt;
	}
	public static String[] getCaracEmail() {
		return caracEmail;
	}
	public static void setCaracEmail(String[] caracEmail) {
		Variable.caracEmail = caracEmail;
	}
	public static String[] getTVA() {
		return TVA;
	}
	public static void setTVA(String[] tVA) {
		TVA = tVA;
	}
	public static String[] getUNITE() {
		return UNITE;
	}
	public static void setUNITE(String[] uNITE) {
		UNITE = uNITE;
	}

	public static String[] getTAILLE() {
		return TAILLE;
	}

	public static void setTAILLE(String[] tAILLE) {
		TAILLE = tAILLE;
	}

	public static String[] getCATEGORIE() {
		return CATEGORIE;
	}
}
