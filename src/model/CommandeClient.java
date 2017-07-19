package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the commande_client database table.
 * 
 */
@Entity
@Table(name="commande_client")
@NamedQuery(name="CommandeClient.findAll", query="SELECT c FROM CommandeClient c")
public class CommandeClient implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idcommandecl;

	private byte bool;

	@Temporal(TemporalType.DATE)
	private Date datecomC;

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

	//bi-directional many-to-one association to LigneCommandeClient
	@OneToMany(mappedBy="commandeClient")
	private List<LigneCommandeClient> ligneCommandeClients;

	public CommandeClient() {
	}

	public int getIdcommandecl() {
		return this.idcommandecl;
	}

	public void setIdcommandecl(int idcommandecl) {
		this.idcommandecl = idcommandecl;
	}

	public byte getBool() {
		return this.bool;
	}

	public void setBool(byte bool) {
		this.bool = bool;
	}

	public Date getDatecomC() {
		return this.datecomC;
	}

	public void setDatecomC(Date datecomC) {
		this.datecomC = datecomC;
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

	public List<LigneCommandeClient> getLigneCommandeClients() {
		return this.ligneCommandeClients;
	}

	public void setLigneCommandeClients(List<LigneCommandeClient> ligneCommandeClients) {
		this.ligneCommandeClients = ligneCommandeClients;
	}

	public LigneCommandeClient addLigneCommandeClient(LigneCommandeClient ligneCommandeClient) {
		getLigneCommandeClients().add(ligneCommandeClient);
		ligneCommandeClient.setCommandeClient(this);

		return ligneCommandeClient;
	}

	public LigneCommandeClient removeLigneCommandeClient(LigneCommandeClient ligneCommandeClient) {
		getLigneCommandeClients().remove(ligneCommandeClient);
		ligneCommandeClient.setCommandeClient(null);

		return ligneCommandeClient;
	}

}