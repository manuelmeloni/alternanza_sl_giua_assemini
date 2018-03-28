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

public class RicoveroDAO extends BaseDAO {

	public RicoveroDAO() {
		super();

	}

	 public List<Ricovero> getAllRicovero(String query) {
		logger.info("Recupero tutti i ricoveri");
		List<Ricovero> ricoveri = new ArrayList<Ricovero>();

		try {
			ResultSet rs = getDbm().performQuery(query);
			while (rs.next()) {
				int ID = rs.getInt("ID");
				String terapia = rs.getString("terapia");
				String diagnosi = rs.getString("diagnosi");
				String codice_ricovero= rs.getString("codice_ricovero");
				Date data_ora_ricovero=	rs.getDate("data_ora_ricovero");			
				Date data_ora_dimissione = rs.getDate("data_ora_dimissione");
				
				

				Ricovero current = new Ricovero(data_ora_ricovero,data_ora_dimissione,diagnosi,terapia,codice_ricovero);
				current.setID(ID);
				ricoveri.add(current);
			}
		} catch (SQLException e) {
			logger.log(Level.SEVERE, "Errore nel recupero delle info ->" + e.getMessage());
			ricoveri = new ArrayList<Ricovero>();
		}

		return ricoveri;
	}
	 
		 

	public List<Ricovero> getRicoverobyUtente(String codiceFiscale,int ID_utente) {
		return getAllRicovero("select ricoveri.* from ricoveri,utenti where utenti.ID-UTENTE = ricoveri.utenti_ID-UTENTE and utenti.CODICE_FISCALE ="+codiceFiscale+"and ricoveri.utenti_ID-UTENTE="+ID_utente);
	}
	
	
	
	
	
}