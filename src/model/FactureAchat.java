package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * @author  Joy Jedidja NDJAMA
 */
/**
 * The persistent class for the facture_achat database table.
 * 
 */
@Entity
@Table(name="facture_achat")
@NamedQuery(name="FactureAchat.findAll", query="SELECT f FROM FactureAchat f")
public class FactureAchat implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idfactureAchat;

	private byte bool;

	@Temporal(TemporalType.DATE)
	private Date datefacA;

	private String magasin;

	private double montant;

	//bi-directional many-to-one association to Fournisseur
	@ManyToOne
	@JoinColumn(name="idfournisseur")
	private Fournisseur fournisseur;

	//bi-directional many-to-one association to Utilisateur
	@ManyToOne
	@JoinColumn(name="login")
	private Utilisateur utilisateur;

	//bi-directional many-to-one association to LigneFactureAchat
	@OneToMany(mappedBy="factureAchat")
	private List<LigneFactureAchat> ligneFactureAchats;

	public FactureAchat() {
	}

	public int getIdfactureAchat() {
		return this.idfactureAchat;
	}

	public void setIdfactureAchat(int idfactureAchat) {
		this.idfactureAchat = idfactureAchat;
	}

	public byte getBool() {
		return this.bool;
	}

	public void setBool(byte bool) {
		this.bool = bool;
	}

	public Date getDatefacA() {
		return this.datefacA;
	}

	public void setDatefacA(Date datefacA) {
		this.datefacA = datefacA;
	}

	public String getMagasin() {
		return this.magasin;
	}

	public void setMagasin(String magasin) {
		this.magasin = magasin;
	}

	public double getMontant() {
		return this.montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public Fournisseur getFournisseur() {
		return this.fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}

	public Utilisateur getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public List<LigneFactureAchat> getLigneFactureAchats() {
		return this.ligneFactureAchats;
	}

	public void setLigneFactureAchats(List<LigneFactureAchat> ligneFactureAchats) {
		this.ligneFactureAchats = ligneFactureAchats;
	}

	public LigneFactureAchat addLigneFactureAchat(LigneFactureAchat ligneFactureAchat) {
		getLigneFactureAchats().add(ligneFactureAchat);
		ligneFactureAchat.setFactureAchat(this);

		return ligneFactureAchat;
	}

	public LigneFactureAchat removeLigneFactureAchat(LigneFactureAchat ligneFactureAchat) {
		getLigneFactureAchats().remove(ligneFactureAchat);
		ligneFactureAchat.setFactureAchat(null);

		return ligneFactureAchat;
	}

}