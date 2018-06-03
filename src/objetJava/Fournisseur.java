package objetJava;

public class Fournisseur {
	private String nomFournisseur,nomContact, nomProduit, email;
	private int idFournisseur, nombrePoduit, telephone;
	public Fournisseur() {
		super();
	}
	public Fournisseur(String nomFournisseur, String nomContact, String nomProduit, String email, int nombrePoduit,
			int telephone) {
		super();
		this.nomFournisseur = nomFournisseur;
		this.nomContact = nomContact;
		this.nomProduit = nomProduit;
		this.email = email;
		this.nombrePoduit = nombrePoduit;
		this.telephone = telephone;
	}
	public String getNomFournisseur() {
		return nomFournisseur;
	}
	public void setNomFournisseur(String nomFournisseur) {
		this.nomFournisseur = nomFournisseur;
	}
	public String getNomContact() {
		return nomContact;
	}
	public void setNomContact(String nomContact) {
		this.nomContact = nomContact;
	}
	public String getNomProduit() {
		return nomProduit;
	}
	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdFournisseur() {
		return idFournisseur;
	}
	public void setIdFournisseur(int idFournisseur) {
		this.idFournisseur = idFournisseur;
	}
	public int getNombrePoduit() {
		return nombrePoduit;
	}
	public void setNombrePoduit(int nombrePoduit) {
		this.nombrePoduit = nombrePoduit;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	
	
}
