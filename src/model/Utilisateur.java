package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the utilisateur database table.
 * 
 */
@Entity
@NamedQuery(name="Utilisateur.findAll", query="SELECT u FROM Utilisateur u")
public class Utilisateur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String login;

	private String adress;

	@Temporal(TemporalType.DATE)
	private Date birth;

	private String cellphone;

	private String email;

	private String name;

	private String password;

	private String sexe;

	private String srcPhoto;

	private String surname;

	private String types;

	//bi-directional many-to-one association to CommandeClient
	@OneToMany(mappedBy="utilisateur")
	private List<CommandeClient> commandeClients;

	//bi-directional many-to-one association to CommandeFr
	@OneToMany(mappedBy="utilisateur")
	private List<CommandeFr> commandeFrs;

	//bi-directional many-to-one association to FactureAchat
	@OneToMany(mappedBy="utilisateur")
	private List<FactureAchat> factureAchats;

	//bi-directional many-to-one association to FactureVente
	@OneToMany(mappedBy="utilisateur")
	private List<FactureVente> factureVentes;

	public Utilisateur() {
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getAdress() {
		return this.adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Date getBirth() {
		return this.birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
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

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSexe() {
		return this.sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getSrcPhoto() {
		return this.srcPhoto;
	}

	public void setSrcPhoto(String srcPhoto) {
		this.srcPhoto = srcPhoto;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getTypes() {
		return this.types;
	}

	public void setTypes(String types) {
		this.types = types;
	}

	public List<CommandeClient> getCommandeClients() {
		return this.commandeClients;
	}

	public void setCommandeClients(List<CommandeClient> commandeClients) {
		this.commandeClients = commandeClients;
	}

	public CommandeClient addCommandeClient(CommandeClient commandeClient) {
		getCommandeClients().add(commandeClient);
		commandeClient.setUtilisateur(this);

		return commandeClient;
	}

	public CommandeClient removeCommandeClient(CommandeClient commandeClient) {
		getCommandeClients().remove(commandeClient);
		commandeClient.setUtilisateur(null);

		return commandeClient;
	}

	public List<CommandeFr> getCommandeFrs() {
		return this.commandeFrs;
	}

	public void setCommandeFrs(List<CommandeFr> commandeFrs) {
		this.commandeFrs = commandeFrs;
	}

	public CommandeFr addCommandeFr(CommandeFr commandeFr) {
		getCommandeFrs().add(commandeFr);
		commandeFr.setUtilisateur(this);

		return commandeFr;
	}

	public CommandeFr removeCommandeFr(CommandeFr commandeFr) {
		getCommandeFrs().remove(commandeFr);
		commandeFr.setUtilisateur(null);

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
		factureAchat.setUtilisateur(this);

		return factureAchat;
	}

	public FactureAchat removeFactureAchat(FactureAchat factureAchat) {
		getFactureAchats().remove(factureAchat);
		factureAchat.setUtilisateur(null);

		return factureAchat;
	}

	public List<FactureVente> getFactureVentes() {
		return this.factureVentes;
	}

	public void setFactureVentes(List<FactureVente> factureVentes) {
		this.factureVentes = factureVentes;
	}

	public FactureVente addFactureVente(FactureVente factureVente) {
		getFactureVentes().add(factureVente);
		factureVente.setUtilisateur(this);

		return factureVente;
	}

	public FactureVente removeFactureVente(FactureVente factureVente) {
		getFactureVentes().remove(factureVente);
		factureVente.setUtilisateur(null);

		return factureVente;
	}

}