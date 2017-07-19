package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ligne_facture_vente database table.
 * 
 */
@Entity
@Table(name="ligne_facture_vente")
@NamedQuery(name="LigneFactureVente.findAll", query="SELECT l FROM LigneFactureVente l")
public class LigneFactureVente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private int quantite;

	//bi-directional many-to-one association to Article
	@ManyToOne
	@JoinColumn(name="idarticle")
	private Article article;

	//bi-directional many-to-one association to FactureVente
	@ManyToOne
	@JoinColumn(name="idfactureVente")
	private FactureVente factureVente;

	public LigneFactureVente() {
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

	public FactureVente getFactureVente() {
		return this.factureVente;
	}

	public void setFactureVente(FactureVente factureVente) {
		this.factureVente = factureVente;
	}

}