package it.gov.giua.database.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import it.gov.giua.model.Login;

public class LoginDAO extends BaseDAO{

	public LoginDAO() {
		super();
	}
	
	public Login getUser(String query) {
		logger.info("Recupero tutte le news");
		try {
			
			ResultSet rs = getDbm().performQuery(query);
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				String cognome = rs.getString("cognome");
				int categoria = rs.getInt("categoria");
				String username = rs.getString("username");
				String password= rs.getString("password");
				
				Login log = new Login(id,nome,cognome,categoria,username,password);
				return log;
		} catch (SQLException e) {
			logger.log(Level.SEVERE, "Errore nel recupero delle info ->" + e.getMessage());
			Login log = new Login();
			return log;
		}

	}
	
	/*
	 * public Login checkUser(String username, String password) {
		return getUser("select id,nome,cognome,categoria,username,password from dipendenti where username = "+username+" and password = "+password);
	}
	*/
	 public static boolean checkUser(String username,String pass) 
     {
		 
      boolean st =false;
      try{
    	  System.out.println("SONO DENTRO AL TRY");
	 //loading drivers for mysql
         Class.forName("com.mysql.jdbc.Driver");

 	 //creating connection with the database 
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aziendaospedaliera","root","");
         PreparedStatement ps =con.prepareStatement
        		 ("select * from dipendenti where USERNAME = ? and PASSWORD = ?");
        System.out.println("HO SCRITTO LA QUERY");
         ps.setString(1, username);
         ps.setString(2, pass);
         System.out.println("HO PASSATO "+username+" e "+pass+" ALLA QUERY");
         ResultSet rs =ps.executeQuery();
         st = rs.next();
        
      }catch(Exception e)
      {
          e.printStackTrace();
      }
         return st;                 
  }   
	 public static int getCategoria(String username) {
		 try{
	    	  System.out.println("SONO DENTRO AL TRY");
		 //loading drivers for mysql
	         Class.forName("com.mysql.jdbc.Driver");
	 	 //creating connection with the database 
	         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aziendaospedaliera","root","");
	         PreparedStatement ps =con.prepareStatement("select * from dipendenti where USERNAME = '"+username+"'");
	        System.out.println("HO SCRITTO LA QUERY");
	        ResultSet rs =ps.executeQuery();
	        rs.next();
	        System.out.println("CATEGORIA: "+rs.getInt("CATEGORIA"));
	         return rs.getInt("CATEGORIA");
	         
	        
	      }catch(Exception e)
	      {
	          e.printStackTrace();
	          return -1;  
	      }
	                     
	 }
}
