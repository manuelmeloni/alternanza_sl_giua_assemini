package it.gov.giua.database.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;

import it.gov.giua.model.Dipendenti;
import it.gov.giua.model.News;

public class DipendentiDAO extends BaseDAO {

	public DipendentiDAO() {
		super();

	}
	
	
	
	public List<Dipendenti> getAllDipendenti(String query) {
		logger.info("Recupero tutti i dipendenti");
		List<Dipendenti> dip = new ArrayList<Dipendenti>();

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

				Dipendenti current = new Dipendenti(data_nascita,nome,cognome,codice_fiscale,mail,data_assunzione,data_licenziamento,categoria,username,password);
				current.setID(ID);
				dip.add(current);
			}
		} catch (SQLException e) {
			logger.log(Level.SEVERE, "Errore nel recupero delle info ->" + e.getMessage());
			dip = new ArrayList<Dipendenti>();
		}

		return dip;
		
	}
	
	
	public Dipendenti getDipendente(String username, String password) {
		return (Dipendenti) getAllDipendenti("Select * FROM Dipendenti WHERE password="+password+" username="+username);
		
	}
	
	public Dipendenti deleteDipendente(String username, String password) {
		return (Dipendenti) getAllDipendenti("DELETE FROM Dipendenti WHERE password="+password+" username="+username);
		
	}
	
	public Dipendenti setDipendente(Date data_nascita,String nome, String cognome, String codice_fiscale, String email, Date data_assunzione,Date data_licenziamento,int categoria, String username, String password) {
		return (Dipendenti) getAllDipendenti("Insert into (DATA_NASCITA,NOME,COGNOME,CODICE_FISCALE,MAIL,DATA_ASSUNZIONE,DATA_LICENZIAMENTO,CATEGORIA,USERNAME,PASSWORD) "
				+ "values('"+data_nascita+"','"+nome+"','"+cognome+"')");
		
		
	}
}
