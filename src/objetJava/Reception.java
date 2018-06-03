package objetJava;

import java.sql.Date;

public class Reception {
private int idReception, nombreLot, idFournisseur, idPersonnel;
private String referenceLot;
private Double prixUnitaire, prixTotal;
private Date dateReception;
public Reception() {
	super();
}
public Reception(int nombreLot, int idFournisseur, int idPersonnel, String referenceLot, Double prixUnitaire,
		Double prixTotal, Date dateReception) {
	super();
	this.nombreLot = nombreLot;
	this.idFournisseur = idFournisseur;
	this.idPersonnel = idPersonnel;
	this.referenceLot = referenceLot;
	this.prixUnitaire = prixUnitaire;
	this.prixTotal = prixTotal;
	this.dateReception = dateReception;
}
public int getIdReception() {
	return idReception;
}
public void setIdReception(int idReception) {
	this.idReception = idReception;
}
public int getNombreLot() {
	return nombreLot;
}
public void setNombreLot(int nombreLot) {
	this.nombreLot = nombreLot;
}
public int getIdFournisseur() {
	return idFournisseur;
}
public void setIdFournisseur(int idFournisseur) {
	this.idFournisseur = idFournisseur;
}
public int getIdPersonnel() {
	return idPersonnel;
}
public void setIdPersonnel(int idPersonnel) {
	this.idPersonnel = idPersonnel;
}
public String getReferenceLot() {
	return referenceLot;
}
public void setReferenceLot(String referenceLot) {
	this.referenceLot = referenceLot;
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
public Date getDateReception() {
	return dateReception;
}
public void setDateReception(Date dateReception) {
	this.dateReception = dateReception;
}


}
