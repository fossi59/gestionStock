package objetJava;

public class Client {
	
private int idClient;
private int numRue;
private int codePostal;
private int telephone;
private String nomClient, prenomClt, nomRue, ville, email, pays;
private String dateNaissance;
public Client() {
	super();
}
public Client(String nomClient, String prenomClt,String dateNaissance, int numRue, String nomRue, int codePostal, String ville, String pays, int telephone,   
		 String email, int idClient) {
	super();
	this.numRue = numRue;
	this.codePostal = codePostal;
	this.telephone = telephone;
	this.nomClient = nomClient;
	this.prenomClt = prenomClt;
	this.nomRue = nomRue;
	this.ville = ville;
	this.email = email;
	this.pays = pays;
	this.dateNaissance = dateNaissance;
	this.idClient = idClient;
}
public  int getIdClient() {
	return idClient;
}
public void setIdClient(int idClient) {
	this.idClient = idClient;
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
public String getNomClient() {
	return nomClient;
}
public void setNomClient(String nomClient) {
	this.nomClient = nomClient;
}
public String getPrenomClt() {
	return prenomClt;
}
public void setPrenomClt(String prenomClt) {
	this.prenomClt = prenomClt;
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
public String getDateNaissance() {
	return dateNaissance;
}
public void setDateNaissance(String dateNaissance) {
	this.dateNaissance = dateNaissance;
}



}
