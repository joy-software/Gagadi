package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the facture_vente database table.
 * 
 */
@Entity
@Table(name="facture_vente")
@NamedQuery(name="FactureVente.findAll", query="SELECT f FROM FactureVente f")
public class FactureVente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idfactureVente;

	private byte bool;

	@Temporal(TemporalType.DATE)
	private Date datefacV;

	private String magasin;

	private double montant;

	//bi-directional many-to-one association to Client
	@ManyToOne
	@JoinColumn(name="idclient")
	private Client client;

	//bi-directional many-to-one association to Utilisateur
	@ManyToOne
	@JoinColumn(name="login")
	private Utilisateur utilisateur;

	//bi-directional many-to-one association to LigneFactureVente
	@OneToMany(mappedBy="factureVente")
	private List<LigneFactureVente> ligneFactureVentes;

	public FactureVente() {
	}

	public int getIdfactureVente() {
		return this.idfactureVente;
	}

	public void setIdfactureVente(int idfactureVente) {
		this.idfactureVente = idfactureVente;
	}

	public byte getBool() {
		return this.bool;
	}

	public void setBool(byte bool) {
		this.bool = bool;
	}

	public Date getDatefacV() {
		return this.datefacV;
	}

	public void setDatefacV(Date datefacV) {
		this.datefacV = datefacV;
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

	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Utilisateur getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public List<LigneFactureVente> getLigneFactureVentes() {
		return this.ligneFactureVentes;
	}

	public void setLigneFactureVentes(List<LigneFactureVente> ligneFactureVentes) {
		this.ligneFactureVentes = ligneFactureVentes;
	}

	public LigneFactureVente addLigneFactureVente(LigneFactureVente ligneFactureVente) {
		getLigneFactureVentes().add(ligneFactureVente);
		ligneFactureVente.setFactureVente(this);

		return ligneFactureVente;
	}

	public LigneFactureVente removeLigneFactureVente(LigneFactureVente ligneFactureVente) {
		getLigneFactureVentes().remove(ligneFactureVente);
		ligneFactureVente.setFactureVente(null);

		return ligneFactureVente;
	}

}