package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ligne_commande_client database table.
 * 
 */
@Entity
@Table(name="ligne_commande_client")
@NamedQuery(name="LigneCommandeClient.findAll", query="SELECT l FROM LigneCommandeClient l")
public class LigneCommandeClient implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private int quantite;

	//bi-directional many-to-one association to Article
	@ManyToOne
	@JoinColumn(name="idarticle")
	private Article article;

	//bi-directional many-to-one association to CommandeClient
	@ManyToOne
	@JoinColumn(name="idcommandecl")
	private CommandeClient commandeClient;

	public LigneCommandeClient() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantite() {
		return this.quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public Article getArticle() {
		return this.article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public CommandeClient getCommandeClient() {
		return this.commandeClient;
	}

	public void setCommandeClient(CommandeClient commandeClient) {
		this.commandeClient = commandeClient;
	}

}