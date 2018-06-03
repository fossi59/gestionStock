package objetJava;

import java.sql.Date;

public class Personnel {
	private int idPersonnel, numRue, codePostal, telephone;
	private String nomPersonnel, prenomPersonnel, fonction, nomRue, ville, email, pays;
	private Date dateNaissance;
	public Personnel() {
		super();
	}
	public Personnel(int numRue, int codePostal, int telephone, String nomPersonnel, String prenomPersonnel,
			String fonction, String nomRue, String ville, String email, String pays, Date dateNaissance) {
		super();
		this.numRue = numRue;
		this.codePostal = codePostal;
		this.telephone = telephone;
		this.nomPersonnel = nomPersonnel;
		this.prenomPersonnel = prenomPersonnel;
		this.fonction = fonction;
		this.nomRue = nomRue;
		this.ville = ville;
		this.email = email;
		this.pays = pays;
		this.dateNaissance = dateNaissance;
	}
	public int getIdPersonnel() {
		return idPersonnel;
	}
	public void setIdPersonnel(int idPersonnel) {
		this.idPersonnel = idPersonnel;
	}
	public int getNumRue() {
		return numRue;
	}
	public void setNumRue(int numRue) {
		this.numRue = numRue;
	}
	public int getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public String getNomPersonnel() {
		return nomPersonnel;
	}
	public void setNomPersonnel(String nomPersonnel) {
		this.nomPersonnel = nomPersonnel;
	}
	public String getPrenomPersonnel() {
		return prenomPersonnel;
	}
	public void setPrenomPersonnel(String prenomPersonnel) {
		this.prenomPersonnel = prenomPersonnel;
	}
	public String getFonction() {
		return fonction;
	}
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	public String getNomRue() {
		return nomRue;
	}
	public void setNomRue(String nomRue) {
		this.nomRue = nomRue;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	

}
