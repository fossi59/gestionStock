package objetDao;

import java.util.List;

import objetJava.Produit;

public interface IProduitDao {
	//methode pour ajouter, supprimer et mettre à jour  un produit qui prend 2 parametres
	public void cudClient (String query, String message);
		
		//methode pour consulter un produit qui prend en parametre la reference du produit pour
		//retourner la fiche du produit
		public Produit readPersonne (int idProduit);
		
		//methode pour consulter les produits par un mot clé
		List<Produit>listeProduitByMc (String mc);
		
		//methode pour consulter tous les produits
		List<Produit>listeProduit();
}
