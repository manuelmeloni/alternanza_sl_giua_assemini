package it.gov.giua.database.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.Date;
import it.gov.giua.model.Amministratore;
import it.gov.giua.model.Dipendente;
import it.gov.giua.model.News;
import it.gov.giua.model.Utente;

public class AdminDAO extends BaseDAO {
	
	public AdminDAO() {
		super();
	}
	
	public Dipendente getAmministratore() {
		String query = "SELECT * FROM dipendenti WHERE CATEGORIA = 0";
		try {
			ResultSet rs = getDbm().performQuery(query);
			while(rs.next()) {
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
				Dipendente admin = new Dipendente(id_dipendente, data_nascita,nome,cognome,codice_fiscale,mail,data_assunzione,data_licenziamento,categoria,username,password,id_reparto);
				return admin;
			}
			
				return null;
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void modificaDipendente(Dipendente dip) {
		String query="UPDATE dipendenti SET  DATA_LICENZIAMENTO = ?";
		try {
			ResultSet rs = getDbm().performQuery(query);
			//rs.update(1, dip.getDataLicenziamento());
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return;
	}
	public List<Utente> getAllUsers(String query) {
		logger.info("Recupero di tutti i pazienti");
		List<Utente> listaUtenti = new ArrayList<>();

		try {
			ResultSet rs = getDbm().performQuery(query); 	//restituisce il risultato della query eseguita sul db
			while (rs.next()) {//scorre le righe della tabella/resultSet/ rs.next()=metodo che scorre le riche nella tabella

				// recuperare i campi dal result set
				 int id_utente=  rs.getInt("ID_UTENTE");
				 int id_reparto=  rs.getInt("reparto_ID_REPARTO");
				 Date data_nascita= rs.getDate("DATA_NASCITA");
				 String nome= rs.getString("NOME");
				 String cognome= rs.getString("COGNOME");
				 String codice_fiscale=rs.getString("CODICE_FISCALE");
				 
				 //Creare un nuovo oggetto di tipo Utente
				 Utente utente= new Utente(data_nascita,nome,cognome,codice_fiscale,id_utente,id_reparto);
				 listaUtenti.add(utente);
				//inserirlo nella lista da restituire in uscita
				
			}
		} catch (SQLException e) {
			logger.log(Level.SEVERE, "Errore nel recupero delle info ->" + e.getMessage());
			listaUtenti = new ArrayList<Utente>();
		}

		return listaUtenti;
	}
	/**
	 * Aggiungi dipendente
	 */
	public String insertUser(String query) {
		///QUERY
		
		try {
			int rs = getDbm().executeUpdate(query); 	//restituisce il risultato della query eseguita sul db
			if(rs>0) {
				return "Inserimento eseguito correttamente";
				
			}else return "Errore nell'inserimento";
			
		} catch (SQLException e) {
			logger.log(Level.SEVERE, "Errore nel recupero delle info ->" + e.getMessage());
			return "Errore nell'esecuzione della query";
		}

	}
	
	
	/**
	 * lista Dipendenti  
	 */
	public List<Dipendente> getAllDipendenti(String query) {
		logger.info("Recupero di tutti i dipendenti ");
		List<Dipendente> listaDipendenti = new ArrayList<>();

		try {
			ResultSet rs = getDbm().performQuery(query); 	//restituisce il risultato della query eseguita sul db
			while (rs.next()) {//scorre le righe della tabella/resultSet/ rs.next()=metodo che scorre le riche nella tabella

				// recuperare i campi dal result set
				 int id_utente=  rs.getInt("ID_UTENTE");
				 int id_reparto=  rs.getInt("reparto_ID_REPARTO");
				 Date data_nascita= rs.getDate("DATA_NASCITA");
				 String nome= rs.getString("NOME");
				 String cognome= rs.getString("COGNOME");
				 String codice_fiscale=rs.getString("CODICE_FISCALE");
				 String mail= rs.getString("MAIL");
				 Date data_assunzione= rs.getDate("DATA_ASSUNZIONE");
				 Date data_licenziamento= rs.getDate("DATA_LICENZIAMENTO");
				 int categoria= rs.getInt("CATEGORIA");
				 String username= rs.getString("USERNAME");
				 String password= rs.getString("PASSWORD");
				 
				 
				 //Creare un nuovo oggetto di tipo Utente
				 Dipendente dip= new Dipendente(id_utente,data_nascita,nome,cognome,codice_fiscale,mail,data_assunzione,data_licenziamento,categoria,username,password,id_reparto);
				 //inserirlo nella lista da restituire in uscita
				listaDipendenti.add(dip);
				
			}
		} catch (SQLException e) {
			logger.log(Level.SEVERE, "Errore nel recupero delle info ->" + e.getMessage());
			listaDipendenti = new ArrayList<Dipendente>();
		}

		return listaDipendenti;
	}

	
	/**
	 * Metodo che riporta la "lista" di tutti i pazienti dell'ospedale
	 * 
	 * @return : lista pazienti
	 */
	public List<Utente> getAllPatient() {
		return getAllUsers("select * from utenti");
	}
	public String insertDipendente(Date data_nascita, String nome,String cognome, String codice_fiscale, String mail, Date data_assunzione, Date data_licenziamento, int categoria, String username, String password) {
		return "insert into dipendenti ('DATA_NASCITA','NOME','COGNOME','CODICE_FISCALE','MAIL','DATA_ASSUNZIONE','DATA_LICENZIAMENTO','CATEGORIA','USERNAME','PASSWORD','reparti_ID_REPARTO')"
				+ "VALUES ("+data_nascita+","+nome+","+cognome+","+codice_fiscale+","+mail+","+data_assunzione+","+data_licenziamento+","+categoria+","+username+","+password+")";
	} 
	//getdipendente
	public Dipendente getDipendente(String user) {
		
		String query="SELECT * from dipendenti where USERNAME = ' " + user + " ' ";
		try {
			ResultSet rs = getDbm().performQuery(query); 	//restituisce il risultato della query eseguita sul db
			while (rs.next()) {//scorre le righe della tabella/resultSet/ rs.next()=metodo che scorre le riche nella tabella

				// recuperare i campi dal result set
				 int id_utente=  rs.getInt("ID_UTENTE");
				 int id_reparto=  rs.getInt("reparto_ID_REPARTO");
				 Date data_nascita= rs.getDate("DATA_NASCITA");
				 String nome= rs.getString("NOME");
				 String cognome= rs.getString("COGNOME");
				 String codice_fiscale=rs.getString("CODICE_FISCALE");
				 String mail= rs.getString("MAIL");
				 Date data_assunzione= rs.getDate("DATA_ASSUNZIONE");
				 Date data_licenziamento= rs.getDate("DATA_LICENZIAMENTO");
				 int categoria= rs.getInt("CATEGORIA");
				 String username= rs.getString("USERNAME");
				 String password= rs.getString("PASSWORD");
				 //Creare un nuovo oggetto di tipo Dipendente
				 Dipendente dip= new Dipendente(id_utente,data_nascita,nome,cognome,codice_fiscale,mail,data_assunzione,data_licenziamento,categoria,username,password,id_reparto);
				 //controlli sulla data di licenziamento in modificaDipendente
				 return dip;
				 
					 
				 
				
			}
		} catch (SQLException e) {
			logger.log(Level.SEVERE, "Errore nel recupero delle info ->" + e.getMessage());
			return null;
		}
		return null;
		
	}
	
	
}
