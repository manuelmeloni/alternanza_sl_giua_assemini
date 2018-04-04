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


public class PrelieviDAO extends BaseDAO {

	public PrelieviDAO() {
		super();

	}

	public List<Prelievi> getAllPrelievi(String query) {
		logger.info("Recupero tutti i prelievi");
		List<Prelievi> Prelievi = new ArrayList<Prelievi>();

		try {
			ResultSet rs = getDbm().performQuery(query);
			while (rs.next()) {
				int id_prelievo = rs.getInt("id_prelievo");
				Date data_ora_prelievo = rs.getDate("data_ora_prelievo");
				Date data_ora_fine = rs.getDate("data_ora_fine");
				String codice_visita = rs.getString("codice_visita");
				String referto = rs.getString("referto");
				int dipendenti_id_dipendente = rs.getInt("dipendenti_id_dipendente");

				Prelievi current = new Prelievi( id_prelievo,  data_ora_prelievo,  data_ora_fine ,  codice_visita, dipendenti_id_dipendente,referto);
				current.setId_prelievo(id_prelievo);
				Prelievi.add(current);
			}
		} catch (SQLException e) {
			logger.log(Level.SEVERE, "Errore nel recupero dei prelievi ->" + e.getMessage());
			Prelievi = new ArrayList<Prelievi>();
		}

		return Prelievi;
	}


	public List<Prelievi> getPrelievoByCodicePrelievi() {
		return getAllPrelievi("select * from utenti, prelievi where utenti.ID_UTENTE = prelievi.utenti_ID_UTENTE AND prelievi.CODICE_VISITA = 'SALMO';");
	}
	
	public void setPrelievi(Prelievi p) throws SQLException {
		
		String query="Insert into prelievi (codice_visita) values ("+p.getCodice_visita()+")";
		ResultSet rs = getDbm().performQuery(query);
		
	
	}
	
}


