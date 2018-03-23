package it.gov.giua.database.dao;

import java.util.ResourceBundle;
import java.util.logging.Logger;

import it.gov.giua.database.DatabaseManager;

public class BaseDAO {

	protected Logger logger = Logger.getLogger(BaseDAO.class.getName());

	private DatabaseManager dbm;
	
	public BaseDAO() {
		ResourceBundle bundle = ResourceBundle.getBundle("aziendaospedaliera");
		
		String databasePassword = bundle.getString("db.password");
		String schema = bundle.getString("db.schema");
		String classDriver = bundle.getString("db.driver");
		String hostnameOrIpAddress = bundle.getString("db.address");
		String databasePort = bundle.getString("db.port");
		String databaseUsername = bundle.getString("db.username");
		
		setDbm(new DatabaseManager(classDriver, hostnameOrIpAddress, databasePort, databaseUsername, databasePassword, schema));
	}

	
	public DatabaseManager getDbm() {
		return dbm;
	}

	public void setDbm(DatabaseManager dbm) {
		this.dbm = dbm;
	}
	
	
}
