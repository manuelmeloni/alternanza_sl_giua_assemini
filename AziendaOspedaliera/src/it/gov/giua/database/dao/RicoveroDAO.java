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

import it.gov.giua.model.Prelievi;
import it.gov.giua.model.Ricovero;

public class RicoveroDAO extends BaseDAO {

	public RicoveroDAO() {
		super();

	}

	 public Ricovero getAllRicovero(String query) {
		logger.info("Recupero tutti i ricoveri");
		Ricovero ricoveri = new Ricovero();

		try {
			ResultSet rs = getDbm().performQuery(query);
			while (rs.next()) {
				int ID = rs.getInt("ID");
				String terapia = rs.getString("terapia");
				String diagnosi = rs.getString("diagnosi");
				String codice_ricovero= rs.getString("codice_ricovero");
				Date data_ora_ricovero=	rs.getDate("data_ora_ricovero");			
				Date data_ora_dimissione = rs.getDate("data_ora_dimissione");
				
				
				ricoveri.setCodice_ricovero(codice_ricovero);
				ricoveri.setData_ora_dimissione(data_ora_dimissione);
				ricoveri.setData_ora_ricovero(data_ora_ricovero);
				ricoveri.setDiagnosi(diagnosi);
				ricoveri.setID(ID);
				ricoveri.setTerapia(terapia);
				
			}
		} catch (SQLException e) {
			logger.log(Level.SEVERE, "Errore nel recupero delle info ->" + e.getMessage());
			
		}

		return ricoveri;
	}
	 
		 

	public Ricovero getRicoverobyUtente(String codiceFiscale,int codice_ricovero) {
		return getAllRicovero("select * from ricoveri,utenti where utenti.ID_UTENTE = ricoveri.utenti_ID_UTENTE and utenti.CODICE_FISCALE ="+codiceFiscale+" and ricoveri.CODICE_RICOVERO="+codice_ricovero);
	}
	
	
	public Ricovero getRicoveroByCodicePrelieviandCodiceFiscale(String CodiceFiscale, String CodicePrelievo) {
		return getAllRicovero("select * from utenti, ricoveri where utenti.ID_UTENTE = ricoveri.utenti_ID_UTENTE AND ricoveri.CODICE_RICOVERO = ' "+CodicePrelievo+"' AND utenti.CODICE_FISCALE = '"+CodiceFiscale+"';");
	}
	
	//metodo per inserire un ricovero nel DB (nuovo)
	public void setRicovero(String diagnosi, String terapia, String codice_ricovero) throws SQLException {
		
		String query="Insert into ricoveri (diagnosi,terapia,CODICE_RICOVERO) values ("+diagnosi+ "," + terapia+","+codice_ricovero+")";
		int rs = getDbm().executeUpdate(query);
		
	
	}
	
	
	
	
}