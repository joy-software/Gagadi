
package controleur;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;

import model.Article;
import model.Client;
import model.CommandeClient;
import model.CommandeFr;
import model.FactureAchat;
import model.FactureVente;
import model.Fournisseur;
import model.LigneCommandeClient;
import model.LigneCommandeFr;
import model.LigneFactureAchat;
import model.LigneFactureVente;
import model.Utilisateur;

public class Controleur extends Variable{
	
	
	/**
	 * il nous permet de manipuler les transactions avec la base de données
	 */
	protected EntityManager manager; 
	
	/**
	 * les ArrayList permettant de manipuler les objets enregistrés dans la BD
	 */
	public static ArrayList<Article> listeArticle;
	public static ArrayList<Client> listeClient;
	public static ArrayList<CommandeClient> listeCommandeClient;
	public static ArrayList<CommandeFr> listeCommandeFr;
	public static ArrayList<FactureAchat> listeFactureAchat;
	public static ArrayList<FactureVente> listeFactureVente;
	public static ArrayList<Fournisseur> listeFournisseur;
	public static ArrayList<LigneCommandeClient> listeLigneCommandeClient;
	public static ArrayList<LigneCommandeFr> listeLigneCommandeFr;
	public static ArrayList<LigneFactureAchat> listeLigneFactureAchat;
	public static ArrayList<LigneFactureVente> listeLigneFactureVente;
	public static ArrayList<Utilisateur> listeUtilisateur;
	
	
	/**
	 * cette méthode permet de creer un entité qui nous reliera à notre BD
	 */
	protected void createEntity()
	{
		manager = Persistence.createEntityManagerFactory("ProjetBD").createEntityManager();
	}
	
	
	/**
	 * cette méthode permet de vérifier qu'on utilise pas les caractères
	 * spéciaux
	 * @param string
	 * @return
	 */
	protected boolean ChaineValide(String string){
		
		for(int i = 0; i < caractInt.length; i++){
			if(string.indexOf(caractInt[i]) != -1){
				return false;
			}
		}
		
		return true;
	}
	
	
	
	/**
     * Méthode qui consiste à vérifier si une saisie est une date respectant un format donné
     * @param st la date saisie
     * @param f le format à faire subir
     * @return true, si la date est valide et false au cas contraire.
     */
   protected boolean verifierFormatdate(String st, String f) {
        boolean v = false;
        
        if (f.isEmpty())
        {
        	f = "dd-MM-yyyy";
        }
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(f);
            sdf.setLenient(false);
            sdf.parse(st);
            v = true;
        } catch (Exception e) {
            v = false;
        }
        return v;
    }
	
   
   
   /**
	 * cette méhode transforme un double en int en arrondissant
	 * @param d
	 * @return
	 */
	protected int arrondi(double d) {
		
		int result = (int)d;
		
		if((d - result) >= 0.5)
		{
			return result + 1; 
		}
		else
		{
			return result;
		}	
	}
   
   
	
   /**
    * permet de verifier que le texte contenu dans le jTExtField est un double
    * et renvoit un message d'erreur sinon
    * @param jtext
    * @param i
    * @return
    */
   protected double doub(JTextField jtext, int i)
   {
	   try
	   {
		   if(jtext.getText().contains("Chiffre"))
		   {
			  
			   jtext.setForeground(Color.BLACK);
			   jtext.setText(""+jtext.getText().charAt(7));
			   return doub(jtext,i);
		   }
		   
		   if(jtext.getText().contains("Nombre"))
		   {
			   jtext.setForeground(Color.BLACK);
			   jtext.setText(""+jtext.getText().charAt(12));
			   return doub(jtext,1);
		   }
		  
			   
		   if(jtext.getText().isEmpty())
		   {
			   return 0.0;
		   }
		   else
		   {
			   if(i == 0)
			   {
				   return Double.parseDouble(jtext.getText());
			   }
			   else
			   {
				   if (Double.parseDouble(jtext.getText()) > 100)
				   {
					   jtext.setText("Nombre < 100");
					   jtext.setForeground(new Color(169, 169, 169));
				   }
				   else
				   {
					   return Double.parseDouble(jtext.getText());
				   }
			   }
		   }
	   }
	   catch(Exception e)
	   {
		   printStrace(e);
		   jtext.setText("Chiffre");
		   jtext.setForeground(new Color(169, 169, 169));
	   }
	   
	   return 0.0;
	   
   }
   
   
   
   /**
    * permet de verifier que le texte contenu dans le jTExtField est un entier positif
    * et renvoit un message d'erreur sinon
    * @param jtext
    * @param i
    * @return
    */
   protected int integ(JTextField jtext) {
	   
	   try
	   {
		   if(jtext.getText().contains("Nombre"))
		   {
			   jtext.setForeground(Color.WHITE);
			   jtext.setText(""+jtext.getText().charAt(10));
			   return integ(jtext);
		   }
		   
			   
		   if(jtext.getText().isEmpty())
		   {
			   return 0;
		   }
		   else
		   {
			  
				   if(Integer.parseInt(jtext.getText()) > 0)
				   {
					   return Integer.parseInt(jtext.getText());
				   }
				   else
				   {
					   return 0;
				   }
		   }
	   }
	   catch(Exception e)
	   {
		   printStrace(e);
		   jtext.setText("Nombre > 0");
		   jtext.setForeground(new Color(169, 169, 169));
	   }
	   
	   return 0;  
	}
   
   
   
   /**
	 * Cette méthode permet de transformer une chaine de char en string
	 * @param pass
	 * @return
	 */
	protected String ConvertToString(char[] pass)
	{
		String password = "";
		
		for(char auto : pass)
		{
			password = password + auto;
		}		
		
		return password;
	}
   
   
   
   /**
    * cette fonction vérifie que l'email entré a été bien saisie
    * @param email
    * @return boolean
    */
   protected boolean verifierEmail(String email)
   {
	   
	   
	   for(int i = 0; i < caractInt.length; i++){
			if(email.indexOf(caractInt[i]) != -1){
				return false;
			}
			if(email.indexOf(caracEmail[0]) > (email.lastIndexOf(caracEmail[1])))
			{
				return false;
			}
		}
	   
	   return true;
   }
   
   
   
	/**
	 * Cette méthode permet de recuperer une erreur
	 * et de l'afficher
	 * @param e
	 * @return
	 */
   protected static String getStackTrace( Exception e ) { 
	    Writer result = new StringWriter(); 
	    PrintWriter printWriter = new PrintWriter( result ); 
	    e.printStackTrace( printWriter ); 
	    return result.toString(); 
	  }
   
   
   /**
	 * ecrire dans notre fichier log
	 * @param e
	 */
  public static void printStrace(Exception e)
  {
	   
	    String nom = "log.del";
	    
	    PrintWriter fich = null;

	    try {
			fich = new PrintWriter(new BufferedWriter(new FileWriter(nom, true)));
			//true c'est elle qui permet d'écrire à la suite des donnée enregistrer et non de les remplacé 
		} catch (IOException e1) {
		
			printStrace(e1);
		} 
	    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy  HH:mm:ss");
	    String dateStr = sdf.format(new Date());
	    fich.println(dateStr + " " + getStackTrace(e));
	    fich.println();
	    fich.println();
	    fich.close();
  }

  
	/**
	 * cette méthode permet de renvoyer une date
	 * @param args
	 */
	protected Date giveDate(String date)
	{
		if(verifierFormatdate(date, ""))
		{
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
				
				try {
					return sdf.parse(date);
				} catch (ParseException e) {
					printStrace(e);
				}
		}
		return null;
	}
	
	
	
	/**
	 * getteur de l'entity manager
	 * @return
	 */
	protected EntityManager getManager() {
		return manager;
	}

	/**
	 * setteur de l'entity manager
	 * @param manager
	 */
	protected void setManager(EntityManager manager) {
		this.manager = manager;
	}
	
	
	
	/**
	 * elle permet d'enregistrer un objet dans la BD
	 * @param art
	 */
	protected void enregistrer(Object art){
		
		manager.getTransaction().begin();
		manager.persist(art);
		//on enregistre un élément dans la bd
		manager.getTransaction().commit();
	}
	
	
	
	/**
	 * elle permet d'enregistrer les modifications sur un objet dans la BD
	 * @param art
	 */
	protected void modifier(Object art){
		
		manager.getTransaction().begin();
		manager.merge(art);
		// on enregistre les modifications d'un élément dans la bd
		manager.getTransaction().commit();
	}
	

	
	
	/**
	 * pour redimensionner les images
	 * @param srcImg
	 * @param w
	 * @param h
	 * @return
	 */
	public Image getScaledImage(String source, int w, int h){
		
		BufferedImage srcImg = null;
		try {
			srcImg = ImageIO.read(new File(source));
		} catch (IOException e) {
			
			printStrace(e);
		}
		
        BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
		Graphics2D g2 = resizedImg.createGraphics();
		g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		g2.drawImage(srcImg, 0, 0, w, h, null);
		g2.dispose();
		return resizedImg;
	}
	
	
	/**
	 * pour transformer les images en imageIcon
	 * @param srcImg
	 * @param w
	 * @param h
	 * @return
	 */
	public ImageIcon getScaledIcon(String source, int w, int h){
		
		
		return (new ImageIcon(getScaledImage(source, w, h)));
	}
	
	
	
	/**
	 * Elle ferme l'entity manager
	 */
	protected void finish()
	{
		manager.close();
	}
	
	/**
	 * ici dans ces fonctions on récupère les données de la BD pour pouvoir les utiliser
	 * @return
	 */
	public ArrayList<Article> RecupArticle()
	{
		listeArticle = (ArrayList<Article>) manager.createNamedQuery("Article.findAll").getResultList();
		//System.out.println(listeArticle);
		return listeArticle;
	}
	
	public ArrayList<Client> RecupClient()
	{
		return listeClient = (ArrayList<Client>) manager.createNamedQuery("Client.findAll").getResultList();
	}
	
	public ArrayList<CommandeClient> RecupCommandeClient()
	{
		return listeCommandeClient = (ArrayList<CommandeClient>) manager.createNamedQuery("CommandeClient.findAll").getResultList();
	}
	
	public ArrayList<CommandeFr> RecupCommandeFr()
	{
		return listeCommandeFr = (ArrayList<CommandeFr>) manager.createNamedQuery("CommandeFr.findAll").getResultList();
	}
	
	public ArrayList<FactureAchat> RecupFactureAchat()
	{
		return listeFactureAchat = (ArrayList<FactureAchat>) manager.createNamedQuery("FactureAchat.findAll").getResultList();
	}
	
	public ArrayList<FactureVente> RecupFactureVente()
	{
		return listeFactureVente = (ArrayList<FactureVente>) manager.createNamedQuery("FactureVente.findAll").getResultList();
	}
	
	public ArrayList<Fournisseur> RecupFournisseur()
	{
		return listeFournisseur = (ArrayList<Fournisseur>) manager.createNamedQuery("Fournisseur.findAll").getResultList();
	}
	
	public ArrayList<LigneCommandeClient> RecupLigneCommandeClient()
	{
		return listeLigneCommandeClient = (ArrayList<LigneCommandeClient>) manager.createNamedQuery("LigneCommandeClient.findAll").getResultList();
	}
	
	public ArrayList<LigneCommandeFr> RecupLigneCommandeFr()
	{
		return listeLigneCommandeFr = (ArrayList<LigneCommandeFr>) manager.createNamedQuery("LigneCommandeFr.findAll").getResultList();
	}
	
	public ArrayList<LigneFactureAchat> RecupLigneFactureAchat()
	{
		return listeLigneFactureAchat = (ArrayList<LigneFactureAchat>) manager.createNamedQuery("LigneFactureAchat.findAll").getResultList();
	}
	
	public ArrayList<LigneFactureVente> RecupLigneFactureVente()
	{
		return listeLigneFactureVente = (ArrayList<LigneFactureVente>) manager.createNamedQuery("LigneFactureVente.findAll").getResultList();
	}
	
	public ArrayList<Utilisateur> RecupUtilisateur()
	{
	   listeUtilisateur = (ArrayList<Utilisateur>) manager.createNamedQuery("Utilisateur.findAll").getResultList();
	   return listeUtilisateur;
	}
	
	public void Recuperation()
	{
		RecupUtilisateur();
		RecupArticle();
		RecupClient();
		RecupCommandeClient();
		RecupCommandeFr();
		RecupFactureAchat();
		RecupFactureVente();
		RecupFournisseur();
		RecupLigneCommandeClient();
		RecupLigneCommandeFr();
		RecupLigneFactureAchat();
		RecupLigneFactureVente();
		
	}
	
	/**
	 * Les Getteurs et setteurs de nos listes
	 * @return
	 */
	public ArrayList<Article> getListeArticle() {
		return listeArticle;
	}

	public void setListeArticle(ArrayList<Article> listeArticle) {
		Controleur.listeArticle = listeArticle;
	}

	public ArrayList<Client> getListeClient() {
		return listeClient;
	}

	public void setListeClient(ArrayList<Client> listeClient) {
		Controleur.listeClient = listeClient;
	}

	public ArrayList<CommandeClient> getListeCommandeClient() {
		return listeCommandeClient;
	}

	public void setListeCommandeClient(ArrayList<CommandeClient> listeCommandeClient) {
		Controleur.listeCommandeClient = listeCommandeClient;
	}

	public ArrayList<CommandeFr> getListeCommandeFr() {
		return listeCommandeFr;
	}

	public void setListeCommandeFr(ArrayList<CommandeFr> listeCommandeFr) {
		Controleur.listeCommandeFr = listeCommandeFr;
	}

	public ArrayList<FactureAchat> getListeFactureAchat() {
		return listeFactureAchat;
	}

	public void setListeFactureAchat(ArrayList<FactureAchat> listeFactureAchat) {
		Controleur.listeFactureAchat = listeFactureAchat;
	}

	public ArrayList<FactureVente> getListeFactureVente() {
		return listeFactureVente;
	}

	public void setListeFactureVente(ArrayList<FactureVente> listeFactureVente) {
		Controleur.listeFactureVente = listeFactureVente;
	}

	public ArrayList<Fournisseur> getListeFournisseur() {
		return listeFournisseur;
	}

	public void setListeFournisseur(ArrayList<Fournisseur> listeFournisseur) {
		Controleur.listeFournisseur = listeFournisseur;
	}

	public ArrayList<LigneCommandeClient> getListeLigneCommandeClient() {
		return listeLigneCommandeClient;
	}

	public void setListeLigneCommandeClient(
			ArrayList<LigneCommandeClient> listeLigneCommandeClient) {
		Controleur.listeLigneCommandeClient = listeLigneCommandeClient;
	}

	public ArrayList<LigneCommandeFr> getListeLigneCommandeFr() {
		return listeLigneCommandeFr;
	}

	public void setListeLigneCommandeFr(
			ArrayList<LigneCommandeFr> listeLigneCommandeFr) {
		Controleur.listeLigneCommandeFr = listeLigneCommandeFr;
	}

	public ArrayList<LigneFactureAchat> getListeLigneFactureAchat() {
		return listeLigneFactureAchat;
	}

	public void setListeLigneFactureAchat(
			ArrayList<LigneFactureAchat> listeLigneFactureAchat) {
		Controleur.listeLigneFactureAchat = listeLigneFactureAchat;
	}

	public ArrayList<LigneFactureVente> getListeLigneFactureVente() {
		return listeLigneFactureVente;
	}

	public void setListeLigneFactureVente(
			ArrayList<LigneFactureVente> listeLigneFactureVente) {
		Controleur.listeLigneFactureVente = listeLigneFactureVente;
	}

	public ArrayList<Utilisateur> getListeUtilisateur() {
		return listeUtilisateur;
	}

	public void setListeUtilisateur(ArrayList<Utilisateur> listeUtilisateur) {
		Controleur.listeUtilisateur = listeUtilisateur;
	}

	
	/**
	 * Cette méthode permet de fermer une fenêtre
	 * @param args
	 */
	public void closeWindow(JFrame frame)
	{
		frame.dispose();
	}
	
	
		
	

}
