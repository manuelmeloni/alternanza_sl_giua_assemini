package it.gov.giua.database.dao;
//package it.gov.giua.database.dao.UtenteDAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.Date;
import java.util.Calendar;

import it.gov.giua.model.Prelievi;
import it.gov.giua.model.Ricovero;
import it.gov.giua.model.Utente;
import it.gov.giua.model.DateOf;


public class PrelieviDAO extends BaseDAO {

	public PrelieviDAO() {
		super();

	}

	public Prelievi getAllPrelievi(String query) {
		logger.info("Recupero tutti i prelievi");
				Prelievi pre =new Prelievi();
				try {
					ResultSet rs = getDbm().performQuery(query);
					while (rs.next()) {
						int ID = rs.getInt("ID");
					
						Date data_ora_prelievo =rs.getDate("DATA_ORA_PRELIEVO");
						Date data_ora_fine=rs.getDate("DATA_ORE_FINE"); 
						String codice_visita=rs.getString("CODICE_VISITA") ;
						String referto= rs.getString("referto");
						

						pre.setCodice_visita(codice_visita);
						pre.setData_ora_fine(data_ora_fine);
						pre.setData_ora_prelievo(data_ora_prelievo);
						pre.setId_prelievo(ID);
						pre.setReferto(referto);
					}
				} catch (SQLException e) {
					logger.log(Level.SEVERE, "Errore nel recupero delle info ->" + e.getMessage());
					
				}

				return pre;
			}


	public Prelievi getPrelievoByCodicePrelieviandCodiceFiscale(String CodiceFiscale, String CodicePrelievo) {
		return getAllPrelievi("select * from utenti, prelievi where utenti.ID_UTENTE = prelievi.utenti_ID_UTENTE AND prelievi.CODICE_VISITA = ' "+CodicePrelievo+"' AND utenti.CODICE_FISCALE = '"+CodiceFiscale+"';");
	}
	
	public void setPrelievi(Prelievi p) throws SQLException {
		
		String query="Insert into prelievi (codice_visita) values ("+p.getCodice_visita()+")";
		ResultSet rs = getDbm().performQuery(query);
		
	
	}
	
}


