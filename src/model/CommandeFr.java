package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the commande_fr database table.
 * 
 */
@Entity
@Table(name="commande_fr")
@NamedQuery(name="CommandeFr.findAll", query="SELECT c FROM CommandeFr c")
public class CommandeFr implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idcommandefr;

	private byte bool;

	@Temporal(TemporalType.DATE)
	private Date datecomF;

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

	//bi-directional many-to-one association to LigneCommandeFr
	@OneToMany(mappedBy="commandeFr")
	private List<LigneCommandeFr> ligneCommandeFrs;

	public CommandeFr() {
	}

	public int getIdcommandefr() {
		return this.idcommandefr;
	}

	public void setIdcommandefr(int idcommandefr) {
		this.idcommandefr = idcommandefr;
	}

	public byte getBool() {
		return this.bool;
	}

	public void setBool(byte bool) {
		this.bool = bool;
	}

	public Date getDatecomF() {
		return this.datecomF;
	}

	public void setDatecomF(Date datecomF) {
		this.datecomF = datecomF;
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

	public List<LigneCommandeFr> getLigneCommandeFrs() {
		return this.ligneCommandeFrs;
	}

	public void setLigneCommandeFrs(List<LigneCommandeFr> ligneCommandeFrs) {
		this.ligneCommandeFrs = ligneCommandeFrs;
	}

	public LigneCommandeFr addLigneCommandeFr(LigneCommandeFr ligneCommandeFr) {
		getLigneCommandeFrs().add(ligneCommandeFr);
		ligneCommandeFr.setCommandeFr(this);

		return ligneCommandeFr;
	}

	public LigneCommandeFr removeLigneCommandeFr(LigneCommandeFr ligneCommandeFr) {
		getLigneCommandeFrs().remove(ligneCommandeFr);
		ligneCommandeFr.setCommandeFr(null);

		return ligneCommandeFr;
	}

}