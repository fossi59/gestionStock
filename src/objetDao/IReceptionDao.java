package objetDao;

import java.util.List;

import objetJava.Reception;

public interface IReceptionDao {
	//methode pour ajouter, supprimer et mettre � jour une reception qui prend 2 parametres
	public void cudClient (String query, String message);
		
		//methode pour consulter une Reception qui prend en parametre la reference de la reception pour
		//retourner l'identit� de la Reception
		public Reception readReception (int idReception);
		
		//methode pour consulter les Receptions par un mot cl�
		List<Reception>listeReceptionsByMc (String mc);
		
		//methode pour consulter toutes les receptions
		List<Reception>listeReception();

}
