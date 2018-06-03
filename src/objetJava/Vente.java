package objetJava;

import java.sql.Date;

public class Vente {
	private int idVente, idProduit, idClient, idPersonnel, nombreVente;
	private Double prixUnitaire, prixTotal;
	private Date dateVente;
	public Vente() {
		super();
	}
	public Vente(int idProduit, int idClient, int idPersonnel, int nombreVente, Double prixUnitaire, Double prixTotal,
			Date dateVente) {
		super();
		this.idProduit = idProduit;
		this.idClient = idClient;
		this.idPersonnel = idPersonnel;
		this.nombreVente = nombreVente;
		this.prixUnitaire = prixUnitaire;
		this.prixTotal = prixTotal;
		this.dateVente = dateVente;
	}
	public int getIdVente() {
		return idVente;
	}
	public void setIdVente(int idVente) {
		this.idVente = idVente;
	}
	public int getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}
	public int getIdClient() {
		return idClient;
	}
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	public int getIdPersonnel() {
		return idPersonnel;
	}
	public void setIdPersonnel(int idPersonnel) {
		this.idPersonnel = idPersonnel;
	}
	public int getNombreVente() {
		return nombreVente;
	}
	public void setNombreVente(int nombreVente) {
		this.nombreVente = nombreVente;
	}
	public Double getPrixUnitaire() {
		return prixUnitaire;
	}
	public void setPrixUnitaire(Double prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}
	public Double getPrixTotal() {
		return prixTotal;
	}
	public void setPrixTotal(Double prixTotal) {
		this.prixTotal = prixTotal;
	}
	public Date getDateVente() {
		return dateVente;
	}
	public void setDateVente(Date dateVente) {
		this.dateVente = dateVente;
	}
	

}
