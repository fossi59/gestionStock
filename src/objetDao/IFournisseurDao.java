package objetDao;

import java.util.List;

import objetJava.Fournisseur;

public interface IFournisseurDao {
	//methode pour ajouter, supprimer et mettre à jour un fournisseur qui prend 2 parametres
	public void cudClient (String query, String message);
		
		//methode pour consulter un Fournisseur qui prend en parametre la reference du fournisseur pour
		//retourner l'identité du Fournisseur
		public Fournisseur readFournisseur (int idFournisseur);
		
		//methode pour consulter les Fournisseurs par un mot clé
		List<Fournisseur>listeFournisseursByMc (String mc);
		
		//methode pour consulter tous les fournisseurs
		List<Fournisseur>listeFournisseur();

}
