package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the client database table.
 * 
 */
@Entity
@NamedQuery(name="Client.findAll", query="SELECT c FROM Client c")
public class Client implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idclient;

	private String adress;

	private String cellphone;

	private String email;

	private String name;

	private String sexe;

	private String surname;

	//bi-directional many-to-one association to CommandeClient
	@OneToMany(mappedBy="client", cascade={CascadeType.ALL})
	private List<CommandeClient> commandeClients;

	//bi-directional many-to-one association to FactureVente
	@OneToMany(mappedBy="client")
	private List<FactureVente> factureVentes;

	public Client() {
	}

	public int getIdclient() {
		return this.idclient;
	}

	public void setIdclient(int idclient) {
		this.idclient = idclient;
	}

	public String getAdress() {
		return this.adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
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

	public String getSexe() {
		return this.sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public List<CommandeClient> getCommandeClients() {
		return this.commandeClients;
	}

	public void setCommandeClients(List<CommandeClient> commandeClients) {
		this.commandeClients = commandeClients;
	}

	public CommandeClient addCommandeClient(CommandeClient commandeClient) {
		getCommandeClients().add(commandeClient);
		commandeClient.setClient(this);

		return commandeClient;
	}

	public CommandeClient removeCommandeClient(CommandeClient commandeClient) {
		getCommandeClients().remove(commandeClient);
		commandeClient.setClient(null);

		return commandeClient;
	}

	public List<FactureVente> getFactureVentes() {
		return this.factureVentes;
	}

	public void setFactureVentes(List<FactureVente> factureVentes) {
		this.factureVentes = factureVentes;
	}

	public FactureVente addFactureVente(FactureVente factureVente) {
		getFactureVentes().add(factureVente);
		factureVente.setClient(this);

		return factureVente;
	}

	public FactureVente removeFactureVente(FactureVente factureVente) {
		getFactureVentes().remove(factureVente);
		factureVente.setClient(null);

		return factureVente;
	}

}