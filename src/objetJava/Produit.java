package objetJava;

public class Produit {
	private int idProduit, nombreProduit, seuilAlerte, idReception;
	private String nomProduit, categorie, description;
	public Produit() {
		super();
	}
	public Produit(int nombreProduit, int seuilAlerte, int idReception, String nomProduit, String categorie,
			String description) {
		super();
		this.nombreProduit = nombreProduit;
		this.seuilAlerte = seuilAlerte;
		this.idReception = idReception;
		this.nomProduit = nomProduit;
		this.categorie = categorie;
		this.description = description;
	}
	public int getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}
	public int getNombreProduit() {
		return nombreProduit;
	}
	public void setNombreProduit(int nombreProduit) {
		this.nombreProduit = nombreProduit;
	}
	public int getSeuilAlerte() {
		return seuilAlerte;
	}
	public void setSeuilAlerte(int seuilAlerte) {
		this.seuilAlerte = seuilAlerte;
	}
	public int getIdReception() {
		return idReception;
	}
	public void setIdReception(int idReception) {
		this.idReception = idReception;
	}
	public String getNomProduit() {
		return nomProduit;
	}
	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
