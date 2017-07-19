package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ligne_commande_fr database table.
 * 
 */
@Entity
@Table(name="ligne_commande_fr")
@NamedQuery(name="LigneCommandeFr.findAll", query="SELECT l FROM LigneCommandeFr l")
public class LigneCommandeFr implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private int quantite;

	//bi-directional many-to-one association to Article
	@ManyToOne
	@JoinColumn(name="idarticle")
	private Article article;

	//bi-directional many-to-one association to CommandeFr
	@ManyToOne
	@JoinColumn(name="idcommandefr")
	private CommandeFr commandeFr;

	public LigneCommandeFr() {
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

	public CommandeFr getCommandeFr() {
		return this.commandeFr;
	}

	public void setCommandeFr(CommandeFr commandeFr) {
		this.commandeFr = commandeFr;
	}

}