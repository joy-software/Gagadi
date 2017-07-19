package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ligne_facture_achat database table.
 * 
 */
@Entity
@Table(name="ligne_facture_achat")
@NamedQuery(name="LigneFactureAchat.findAll", query="SELECT l FROM LigneFactureAchat l")
public class LigneFactureAchat implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private int quantite;

	//bi-directional many-to-one association to Article
	@ManyToOne
	@JoinColumn(name="idarticle")
	private Article article;

	//bi-directional many-to-one association to FactureAchat
	@ManyToOne
	@JoinColumn(name="idfactureAchat")
	private FactureAchat factureAchat;

	public LigneFactureAchat() {
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

	public FactureAchat getFactureAchat() {
		return this.factureAchat;
	}

	public void setFactureAchat(FactureAchat factureAchat) {
		this.factureAchat = factureAchat;
	}

}