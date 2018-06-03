package connection;


import java.sql.Connection;
import java.sql.DriverManager;



public class Connexion {
	
 public Connection getConnection() {
	 String url ="jdbc:mysql://localhost/gestiondesstocks";
	 String user="root";
	 String password ="";
	 Connection con;
	 try {
		 //charger driver
		 Class.forName("com.mysql.jdbc.Driver");
		 System.out.println("Driver ok");
		 
		 //Etablir connexion avec bdd
		 con = DriverManager.getConnection(url, user, password);
		 System.out.println("connexion ok");
		 
		 return con;
	 }catch(Exception e) {
		 e.printStackTrace();
		 return null;
	 }
 }
 
}
