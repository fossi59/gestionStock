package objetDao;

import java.util.List;

import objetJava.Personnel;

public interface IPersonnelDao {
	//methode pour ajouter, supprimer et mettre à jour une personne qui prend 2 parametres
	public void cudClient (String query, String message);
		
		//methode pour consulter une personne qui prend en parametre la reference de la pesonne pour
		//retourner l'identité de la personne
		public Personnel readPersonne (int idPersonnel);
		
		//methode pour consulter les personnes par un mot clé
		List<Personnel>listePersonnelsByMc (String mc);
		
		//methode pour consulter toutes les pesonnes
		List<Personnel>listePersonnel();

}
