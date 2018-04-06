package it.gov.giua.database.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.xml.crypto.Data;

import it.gov.giua.model.Ricovero;
import it.gov.giua.model.Utente;

public class UtenteDAO extends BaseDAO {
	
	public UtenteDAO() {
		super();

	}

	 public List<Utente> getAllUtente(String query) {
		logger.info("Recupero tutti gli utenti");
		List<Utente> utenti = new ArrayList<Utente>();

		try {
			ResultSet rs = getDbm().performQuery(query);
			while (rs.next()) {
				int ID = rs.getInt("ID_UTENTE");
				int id_reparto = rs.getInt("reparti_ID_REPARTO");
				String nome = rs.getString("NOME");
				String cognome = rs.getString("COGNOME");
				Date nascita = rs.getDate("DATA_NASCITA");
				String codiceFiscale = rs.getString("CODICE_FISCALE");
				
				

				Utente current = new Utente(ID,id_reparto,nascita,nome,cognome,codiceFiscale);
				current.setID(ID);
				utenti.add(current);
			}
		} catch (SQLException e) {
			logger.log(Level.SEVERE, "Errore nel recupero delle info ->" + e.getMessage());
			utenti = new ArrayList<Utente>();
		}

		return utenti;
	}
	 
	 public Utente getUtente(String query) {
			logger.info("Recupero utente");
			Utente utente =new Utente();
			try {
				ResultSet rs = getDbm().performQuery(query);
				while (rs.next()) {
					int ID = rs.getInt("ID");
					String nome = rs.getString("nome");
					String cognome = rs.getString("cognome");
					Date nascita = rs.getDate("nascita");
					String codiceFiscale = rs.getString("codice fiscale");
					

					utente.setCodiceFiscale(codiceFiscale);
					utente.setNome(nome);
					utente.setCognome(cognome);
					utente.setNascita(nascita);
					utente.setID(ID);
				}
			} catch (SQLException e) {
				logger.log(Level.SEVERE, "Errore nel recupero delle info ->" + e.getMessage());
				
			}

			return utente;
		}
	 
	 

	public List<Utente> getUtentebyColor(int color) {
		return getAllUtente("select utenti.NOME utenti.COGNOME from ricoveri,utenti where utenti.ID_UTENTE = ricoveri.utenti_ID_UTENTE and CODICE_COLORE ="+color+" ORDER BY utenti.COGNOME");
	}
	
	public Utente getUtentebyCodFiscale(String codiceFiscale) {
		return getUtente("select * from utenti where utenti.CODICE_FISCALE = "+codiceFiscale);
	}
	
	//metodo per inserire un utente nel DB (nuovo)
	public void setUtente(Utente u) throws SQLException {
		
		String query="Insert into utenti (nome,cognome,codiceFiscale,) values ("+u.getNome()+ "," + u.getCognome()+","+u.getCodiceFiscale()+")";
		ResultSet rs = getDbm().performQuery(query);
		
	
	}
	
}
