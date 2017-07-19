package test;

import model.Article;
import model.FactureAchat;
import model.LigneFactureAchat;
import controleur.ControlLigneFactureAchat;
import controleur.Controleur;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//ControlClient con1 = new ControlClient();
		ControlLigneFactureAchat con1 = new ControlLigneFactureAchat();
		//ControlArticle con1 = new ControlArticle();
		//FactureAchat fac1 = new FactureAchat("Goodhi",2500,con1.giveDate("12-06-2015"),false);
		//Client clt = new Client("name","surname","masc","654654","etrr","kjhgkgfjghg");
		//Article art = new Article("Robe", "Yves St Loren", "frt", "cette robe coute chere",50000.5, 533, 3.00, 55000, false, 2.000, 560002, 5, 2512, null);
		//Utilisateur user = new Utilisateur("logins", "pass5", "type", "name", "surname", "sexe", "celphone", "email", "adress", con1.giveDate("06-06-2015"),"scrphotos");
		//LigneFactureAchat fac = new LigneFactureAchat(500);
		try{
			//con1.enregistrer(fac);
			//fac.setId(3);
			
			
			
			
			
			
			//con1.finish();
		}catch(Exception e){
			Controleur.printStrace(e);
		}
		
		

	}

}
