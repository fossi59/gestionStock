package objetDaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.Connexion;
import objetDao.IClientDao;
import objetJava.Client;

public class ClientDaoImpl implements IClientDao{
	Connexion obj = new Connexion();
	Connection conn = obj.getConnection();
	


	@Override
	public Client readClient(int idClient) {
		
		return null;
	}


	@Override
	public List<Client> listeClientByMc(String mc) {
		List<Client> client = new ArrayList<>();
		
		try {
			PreparedStatement ps = conn.prepareStatement("select*from Client where nomClient LIKE?");
			ps.setString(1, mc);
			ResultSet res = ps.executeQuery();
			//on fait du mapping objet relationnel
			while(res.next()) {
				Client c = new Client ();
				
				c.setNomClient(res.getString("nomClient"));
				c.setPrenomClt(res.getString("prenomClient"));
				c.setDateNaissance(res.getString("dateNaissance"));
				c.setNumRue(res.getInt("numRue"));
				c.setNomRue(res.getString("nomRue"));
				c.setCodePostal(res.getInt("codePostal"));
				c.setVille(res.getString("ville"));
				c.setPays(res.getString("pays"));
				c.setTelephone(res.getInt("telephone"));
				c.setEmail(res.getString("email"));
				c.setIdClient(res.getInt("IdClient"));
				client.add(c);
			}
			//fermeture de l'objet preparedStatement
			ps.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return client;
	}

	@Override
	public List<Client> listeClient() {
		List<Client> listeClients = new ArrayList();
		String query = "SELECT * FROM  `client` ";
	       Statement st;
	       ResultSet rs;
	       
	       try {
	           st = conn.createStatement();
	           rs = st.executeQuery(query);

	           Client client;

	           while(rs.next())
	           {
	client = new Client(rs.getString("nomClient"),rs.getString("prenomClient"),rs.getString("DateNaissance"),rs.getInt("numRue"),rs.getString("nomRue"),rs.getInt("codePostal"),rs.getString("ville"),rs.getString("pays"),rs.getInt("telephone"),rs.getString("email"),rs.getInt("idClient"));
	               listeClients.add(client);
	           }

	       } 
	      catch (Exception e) {
	           e.printStackTrace();
	       }
	       return listeClients;
	   }
	
	

	@Override
	public void cudClient(String query) {
		try {
			Statement st = conn.createStatement();
			st.executeUpdate(query); 
		}catch(Exception ex){
	           ex.printStackTrace();
	       }
	}



}
