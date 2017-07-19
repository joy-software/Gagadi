package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the article database table.
 * 
 */
@Entity
@NamedQuery(name="Article.findAll", query="SELECT a FROM Article a")
public class Article implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idarticle;

	private double benefice;

	private String categorie;

	private String designation;

	private String marque;

	private double prixUH;

	private double prixUTTC;

	private byte prixvariable;

	private double prixvente;

	private int quantite;

	private double remise;

	private String srcimage;

	private int stockmin;

	private String taille;

	private double taux;

	//bi-directional many-to-one association to LigneCommandeClient
	@OneToMany(mappedBy="article")
	private List<LigneCommandeClient> ligneCommandeClients;

	//bi-directional many-to-one association to LigneCommandeFr
	@OneToMany(mappedBy="article")
	private List<LigneCommandeFr> ligneCommandeFrs;

	//bi-directional many-to-one association to LigneFactureAchat
	@OneToMany(mappedBy="article")
	private List<LigneFactureAchat> ligneFactureAchats;

	//bi-directional many-to-one association to LigneFactureVente
	@OneToMany(mappedBy="article")
	private List<LigneFactureVente> ligneFactureVentes;

	public Article() {
	}

	public int getIdarticle() {
		return this.idarticle;
	}

	public void setIdarticle(int idarticle) {
		this.idarticle = idarticle;
	}

	public double getBenefice() {
		return this.benefice;
	}

	public void setBenefice(double benefice) {
		this.benefice = benefice;
	}

	public String getCategorie() {
		return this.categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getMarque() {
		return this.marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public double getPrixUH() {
		return this.prixUH;
	}

	public void setPrixUH(double prixUH) {
		this.prixUH = prixUH;
	}

	public double getPrixUTTC() {
		return this.prixUTTC;
	}

	public void setPrixUTTC(double prixUTTC) {
		this.prixUTTC = prixUTTC;
	}

	public byte getPrixvariable() {
		return this.prixvariable;
	}

	public void setPrixvariable(byte prixvariable) {
		this.prixvariable = prixvariable;
	}

	public double getPrixvente() {
		return this.prixvente;
	}

	public void setPrixvente(double prixvente) {
		this.prixvente = prixvente;
	}

	public int getQuantite() {
		return this.quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public double getRemise() {
		return this.remise;
	}

	public void setRemise(double remise) {
		this.remise = remise;
	}

	public String getSrcimage() {
		return this.srcimage;
	}

	public void setSrcimage(String srcimage) {
		this.srcimage = srcimage;
	}

	public int getStockmin() {
		return this.stockmin;
	}

	public void setStockmin(int stockmin) {
		this.stockmin = stockmin;
	}

	public String getTaille() {
		return this.taille;
	}

	public void setTaille(String taille) {
		this.taille = taille;
	}

	public double getTaux() {
		return this.taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

	public List<LigneCommandeClient> getLigneCommandeClients() {
		return this.ligneCommandeClients;
	}

	public void setLigneCommandeClients(List<LigneCommandeClient> ligneCommandeClients) {
		this.ligneCommandeClients = ligneCommandeClients;
	}

	public LigneCommandeClient addLigneCommandeClient(LigneCommandeClient ligneCommandeClient) {
		getLigneCommandeClients().add(ligneCommandeClient);
		ligneCommandeClient.setArticle(this);

		return ligneCommandeClient;
	}

	public LigneCommandeClient removeLigneCommandeClient(LigneCommandeClient ligneCommandeClient) {
		getLigneCommandeClients().remove(ligneCommandeClient);
		ligneCommandeClient.setArticle(null);

		return ligneCommandeClient;
	}

	public List<LigneCommandeFr> getLigneCommandeFrs() {
		return this.ligneCommandeFrs;
	}

	public void setLigneCommandeFrs(List<LigneCommandeFr> ligneCommandeFrs) {
		this.ligneCommandeFrs = ligneCommandeFrs;
	}

	public LigneCommandeFr addLigneCommandeFr(LigneCommandeFr ligneCommandeFr) {
		getLigneCommandeFrs().add(ligneCommandeFr);
		ligneCommandeFr.setArticle(this);

		return ligneCommandeFr;
	}

	public LigneCommandeFr removeLigneCommandeFr(LigneCommandeFr ligneCommandeFr) {
		getLigneCommandeFrs().remove(ligneCommandeFr);
		ligneCommandeFr.setArticle(null);

		return ligneCommandeFr;
	}

	public List<LigneFactureAchat> getLigneFactureAchats() {
		return this.ligneFactureAchats;
	}

	public void setLigneFactureAchats(List<LigneFactureAchat> ligneFactureAchats) {
		this.ligneFactureAchats = ligneFactureAchats;
	}

	public LigneFactureAchat addLigneFactureAchat(LigneFactureAchat ligneFactureAchat) {
		getLigneFactureAchats().add(ligneFactureAchat);
		ligneFactureAchat.setArticle(this);

		return ligneFactureAchat;
	}

	public LigneFactureAchat removeLigneFactureAchat(LigneFactureAchat ligneFactureAchat) {
		getLigneFactureAchats().remove(ligneFactureAchat);
		ligneFactureAchat.setArticle(null);

		return ligneFactureAchat;
	}

	public List<LigneFactureVente> getLigneFactureVentes() {
		return this.ligneFactureVentes;
	}

	public void setLigneFactureVentes(List<LigneFactureVente> ligneFactureVentes) {
		this.ligneFactureVentes = ligneFactureVentes;
	}

	public LigneFactureVente addLigneFactureVente(LigneFactureVente ligneFactureVente) {
		getLigneFactureVentes().add(ligneFactureVente);
		ligneFactureVente.setArticle(this);

		return ligneFactureVente;
	}

	public LigneFactureVente removeLigneFactureVente(LigneFactureVente ligneFactureVente) {
		getLigneFactureVentes().remove(ligneFactureVente);
		ligneFactureVente.setArticle(null);

		return ligneFactureVente;
	}

}