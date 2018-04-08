package it.gov.giua.database.dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import it.gov.giua.model.Prelievi;
import it.gov.giua.model.Utente;

public class UtenteDAO extends BaseDAO {

	public UtenteDAO() {
		super();

	}

	 public Utente getAllUtente(String query) {
		
		Utente u = new Utente();

		try {
			ResultSet rs = getDbm().performQuery(query);
			while (rs.next()) {
				int id = rs.getInt("ID_UTENTE");
				String cognome = rs.getString("NOME");
				String nome = rs.getString("COGNOME");
				Date nascita =rs.getDate("DATA_NASCITA");
				String codiceFiscale=rs.getString("CODICE_FISCALE");

				u.setCodiceFiscale(codiceFiscale);
				u.setCognome(cognome);
				u.setNome(nome);
				u.setID(id);
				u.setNascita(nascita);
				
			}
		} catch (SQLException e) {
			logger.log(Level.SEVERE, "Errore nel recupero delle info ->" + e.getMessage());
			
		}

		return u;
	}

	 public Utente getUtentebyCodFiscale(String CodiceFiscale) {
			return getAllUtente("select * from utenti where utenti.CODICE_FISCALE = '"+CodiceFiscale+"';");
		}	
	 
	 public boolean controlloCF(String cf) throws SQLException {
		 ResultSet rs = getDbm().performQuery("select 'CODICE_FISCALE' from utenti where utenti.CODICE_FISCALE = '"+cf+"';");
		 if(rs == null)
			 return false;
		 else
			 return true;
	 }
}
