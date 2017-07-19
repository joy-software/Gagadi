package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the fournisseur database table.
 * 
 */
@Entity
@NamedQuery(name="Fournisseur.findAll", query="SELECT f FROM Fournisseur f")
public class Fournisseur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idfournisseur;

	private String adress;

	private String categorie;

	private String cellphone;

	private String email;

	private String name;

	private String pays;

	//bi-directional many-to-one association to CommandeFr
	@OneToMany(mappedBy="fournisseur")
	private List<CommandeFr> commandeFrs;

	//bi-directional many-to-one association to FactureAchat
	@OneToMany(mappedBy="fournisseur")
	private List<FactureAchat> factureAchats;

	public Fournisseur() {
	}

	public int getIdfournisseur() {
		return this.idfournisseur;
	}

	public void setIdfournisseur(int idfournisseur) {
		this.idfournisseur = idfournisseur;
	}

	public String getAdress() {
		return this.adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getCategorie() {
		return this.categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public String getCellphone() {
		return this.cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPays() {
		return this.pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public List<CommandeFr> getCommandeFrs() {
		return this.commandeFrs;
	}

	public void setCommandeFrs(List<CommandeFr> commandeFrs) {
		this.commandeFrs = commandeFrs;
	}

	public CommandeFr addCommandeFr(CommandeFr commandeFr) {
		getCommandeFrs().add(commandeFr);
		commandeFr.setFournisseur(this);

		return commandeFr;
	}

	public CommandeFr removeCommandeFr(CommandeFr commandeFr) {
		getCommandeFrs().remove(commandeFr);
		commandeFr.setFournisseur(null);

		return commandeFr;
	}

	public List<FactureAchat> getFactureAchats() {
		return this.factureAchats;
	}

	public void setFactureAchats(List<FactureAchat> factureAchats) {
		this.factureAchats = factureAchats;
	}

	public FactureAchat addFactureAchat(FactureAchat factureAchat) {
		getFactureAchats().add(factureAchat);
		factureAchat.setFournisseur(this);

		return factureAchat;
	}

	public FactureAchat removeFactureAchat(FactureAchat factureAchat) {
		getFactureAchats().remove(factureAchat);
		factureAchat.setFournisseur(null);

		return factureAchat;
	}

}