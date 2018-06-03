package objetDao;

import java.util.List;

import objetJava.Vente;

public interface IVenteDao {
	//methode pour ajouter, supprimer et mettre à jour une vente qui prend 2 parametres
	public void cudClient (String query, String message);
		
		//methode pour consulter une vente qui prend en parametre la reference de la vente pour
		//retourner la fiche de la vente
		public Vente readVente (int idVente);
		
		//methode pour consulter les ventes par un mot clé
		List<Vente>listeVentesByMc (String mc);
		
		//methode pour consulter toutes les pesonnes
		List<Vente>listeVente();

}
