package objetDao;

import java.util.List;

import objetJava.Client;

public interface IClientDao {
	//methode pour ajouter , suppimer et mettre à jour un client  
		public void cudClient (String query);
		
		//methode pour consulter un client qui prend en parametre la reference du client pour
		//retourner l'identité du client
		public Client readClient (int idClient);
		
		//methode pour consulter les clients par un mot clé
		List<Client>listeClientByMc (String mc);
		
		//methode pour consulter tous les clients
		List<Client>listeClient();
		
		

}
