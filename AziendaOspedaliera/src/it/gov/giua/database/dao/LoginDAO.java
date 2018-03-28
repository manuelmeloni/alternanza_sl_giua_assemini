package it.gov.giua.database.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import it.gov.giua.model.Login;
import it.gov.giua.model.News;

public class LoginDAO extends BaseDAO{

	public LoginDAO() {
		super();
	}
	
	public Login getUser(String query) {
		logger.info("Recupero tutte le news");
		try {
			
			ResultSet rs = getDbm().performQuery(query);
				int id = rs.getInt("id");
				String nome = rs.getString("titolo");
				String cognome = rs.getString("sottotitolo");
				int categoria = rs.getInt(1);
				String username = rs.getString("username");
				String password= rs.getString("password");
				
				Login log = new Login(id,nome,cognome,categoria,username,password);
				return log;
		} catch (SQLException e) {
			logger.log(Level.SEVERE, "Errore nel recupero delle info ->" + e.getMessage());
		}

	}
	
	
	
}
