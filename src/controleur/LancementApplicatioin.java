package controleur;

import vue.I_Connexion;

public class LancementApplicatioin {
	
	public static void main(String[] args)
	{
		Controleur control = new Controleur();
		control.createEntity();
		control.Recuperation();
		control.finish();
		System.out.println(Boolean.parseBoolean("true"));
		I_Connexion con = new I_Connexion();
		con.getI_Connexion().setVisible(true);
	}

}
