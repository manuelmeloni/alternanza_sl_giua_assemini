package it.gov.giua.database.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.Date;
import it.gov.giua.model.Dipendente;
import it.gov.giua.model.News;
import it.gov.giua.model.Utente;

public class DipendentiDAO extends BaseDAO {

	public DipendentiDAO() {
		super();

	}
	
	
	
	public List<Dipendente> getAllDipendenti(String query) { //da rivedere; query giusta, ma logica errata
		logger.info("Recupero tutti i dipendenti");
		List<Dipendente> dip = new ArrayList<Dipendente>();

		try {
			ResultSet rs = getDbm().performQuery(query);
			while (rs.next()) {
				int id_dipendente = rs.getInt("id_dipendente");
				Date data_nascita=	rs.getDate("data_nascita");
				String nome = rs.getString("nome");
				String cognome = rs.getString("cognome");
				String codice_fiscale= rs.getString("codice_fiscale");
				String mail= rs.getString("mail");
				Date data_assunzione=	rs.getDate("data_assunzione");			
				Date data_licenziamento = rs.getDate("data_licenziamento");
				int categoria= rs.getInt("categoria");
				String username= rs.getString("username");
				String password= rs.getString("password");
				int id_reparto = rs.getInt("reparti_ID_REPARTO");

				Dipendente current = new Dipendente(id_dipendente, data_nascita,nome,cognome,codice_fiscale,mail,data_assunzione,data_licenziamento,categoria,username,password,id_reparto);
				
				dip.add(current);
			}
		} catch (SQLException e) {
			logger.log(Level.SEVERE, "Errore nel recupero delle info ->" + e.getMessage());
			dip = new ArrayList<Dipendente>();
		}

		return dip;
		
	}
	
	public List<Utente> getAllUtentiWithRepartoId(int id_reparto) {
		List<Utente> uList = new ArrayList<Utente>();
		String query = "SELECT * FROM utenti WHERE reparti_ID_REPARTO = '" + id_reparto + "'";
		try {
			ResultSet rs = getDbm().performQuery(query);
			while(rs.next()) {
				int id_utente = rs.getInt("ID-UTENTE");
				Date data_nascita=	rs.getDate("DATA_NASCITA");
				String nome = rs.getString("NOME");
				String cognome = rs.getString("COGNOME");
				String codice_fiscale = rs.getString("CODICE_FISCALE");
				int id_rep = rs.getInt("reparti_ID_REPARTO");
				Utente current = new Utente(data_nascita, nome, cognome, codice_fiscale, id_utente, id_rep);
				uList.add(current);
			}
			return uList;
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Utente> getAllUtenti() {
		List<Utente> uList = new ArrayList<Utente>();
		String query = "SELECT * FROM utenti";
		try {
			ResultSet rs = getDbm().performQuery(query);
			while(rs.next()) {
				int id_utente = rs.getInt("ID-UTENTE");
				Date data_nascita=	rs.getDate("DATA_NASCITA");
				String nome = rs.getString("NOME");
				String cognome = rs.getString("COGNOME");
				String codice_fiscale = rs.getString("CODICE_FISCALE");
				int id_rep = rs.getInt("reparti_ID_REPARTO");
				Utente current = new Utente(data_nascita, nome, cognome, codice_fiscale, id_utente, id_rep);
				uList.add(current);
			}
			return uList;
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void addUtentInList(Utente u) {
		try {
			String query = "INSERT INTO `utenti` (`ID-UTENTE`, `DATA_NASCITA`, `NOME`, `COGNOME`, `CODICE_FISCALE`, `reparti_ID_REPARTO`) VALUES (NULL, '" + u.getNascita() + "', '" + u.getNome() + "', '" + u.getCognome() + "', '" + u.getCodiceFiscale() + "', '" + u.getIdReparto() + "');";
			getDbm().performQuery(query);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public Dipendente getDipendente(String username) {
		Dipendente d = null;
		try {
			ResultSet rs = getDbm().performQuery("SELECT * FROM dipendenti WHERE username = '" + username + "' LIMIT 1");
			rs.next();
			int id_dipendente = rs.getInt("ID_DIPENDENTE");
			Date data_nascita=	rs.getDate("DATA_NASCITA");
			String nome = rs.getString("NOME");
			String cognome = rs.getString("COGNOME");
			String codice_fiscale= rs.getString("CODICE_FISCALE");
			String mail= rs.getString("MAIL");
			Date data_assunzione=	rs.getDate("DATA_ASSUNZIONE");			
			Date data_licenziamento = rs.getDate("DATA_LICENZIAMENTO");
			int categoria= rs.getInt("CATEGORIA");
			String user= rs.getString("USERNAME");
			String password= rs.getString("PASSWORD");
			int id_reparto = rs.getInt("reparti_ID_REPARTO");
			d = new Dipendente(id_dipendente, data_nascita, nome, cognome, codice_fiscale, mail, data_assunzione, data_licenziamento, categoria, user, password, id_reparto);
			return d;
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/*public Dipendente deleteDipendente(String username, String password) {
		return (Dipendente) getAllDipendenti("DELETE FROM Dipendenti WHERE password="+password+" username="+username);
		
	}*/
	
	public boolean getDipendente(String username, String password) {
		boolean st =false;
	      try{
	    	 System.out.println("SONO DENTRO AL TRY");
	    	 String query = "SELECT * FROM Dipendenti WHERE password = '" + password + "' AND username = '" + username + "'";
	  		 ResultSet rs = getDbm().performQuery(query); 
	         System.out.println("HO SCRITTO LA QUERY");
	         System.out.println("HO PASSATO " + username + " e " + password + " ALLA QUERY");
	         st = rs.next();
	      }catch(Exception e) {
	          e.printStackTrace();
	      }
	      return st;
	}
	
	public int getIdDipendente(String username) {
		try{
	    	 System.out.println("SONO DENTRO AL TRY");
	    	 String query = "SELECT dipendenti.ID_DIPENDENTE FROM Dipendenti WHERE username = '" + username + "'";
	  		 ResultSet rs = getDbm().performQuery(query);
	  		 rs.next();
	  		 int id = rs.getInt("ID_DIPENDENTE");
	         System.out.println("HO SCRITTO LA QUERY");
	         System.out.println("HO PASSATO " + username);
	         return id;
	      }catch(Exception e) {
	          e.printStackTrace();
	          return -1;
	      }
	}
	
	public Dipendente setDipendente(Date data_nascita,String nome, String cognome, String codice_fiscale, String email, Date data_assunzione,Date data_licenziamento,int categoria, String username, String password, int id_reparto) {
		return (Dipendente) getAllDipendenti("Insert into (DATA_NASCITA,NOME,COGNOME,CODICE_FISCALE,MAIL,DATA_ASSUNZIONE,DATA_LICENZIAMENTO,CATEGORIA,USERNAME,PASSWORD,reparti_ID_REPARTO) "
				+ "values('"+data_nascita+"','"+nome+"','"+cognome+"'"+"'"+id_reparto+"')");
	}
	
	public boolean setUsername(String username, int id) {
		boolean st =false;
	      try{
	    	 String query = "UPDATE `dipendenti` SET `USERNAME` = '" + username + "' WHERE `dipendenti`.`ID_DIPENDENTE` = '" + id + "'";
	  		 ResultSet rs = getDbm().performQuery(query); 
	         st = rs.next();
	      }catch(Exception e) {
	          e.printStackTrace();
	      }
	      return st;
	}
	
	public boolean setEmail(String email, int id) {
		boolean st =false;
	      try{
	    	 String query = "UPDATE `dipendenti` SET `MAIL` = '" + email + "' WHERE `dipendenti`.`ID_DIPENDENTE` = '" + id + "'";
	  		 ResultSet rs = getDbm().performQuery(query); 
	         st = rs.next();
	      }catch(Exception e) {
	          e.printStackTrace();
	      }
	      return st;
	}
	
	public boolean setPassword(String password, int id) {
		boolean st =false;
	      try{
	    	 String query = "UPDATE `dipendenti` SET `PASSWORD` = '" + password + "' WHERE `dipendenti`.`ID_DIPENDENTE` = '" + id + "'";
	  		 ResultSet rs = getDbm().performQuery(query); 
	         st = rs.next();
	      }catch(Exception e) {
	          e.printStackTrace();
	      }
	      return st;
	}
}
