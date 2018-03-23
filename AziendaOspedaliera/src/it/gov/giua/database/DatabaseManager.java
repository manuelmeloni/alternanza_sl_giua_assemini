package it.gov.giua.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseManager {

	protected Logger logger = Logger.getLogger(DatabaseManager.class.getName());
	
	private static Connection connection;
	private String classDriver;
	private String hostnameOrIpAddress;
	private String databasePort;
	private String databaseUsername;
	private String databasePassword;
	private String connectionString;

	public DatabaseManager(String classDriver, String hostnameOrIpAddress, String databasePort, String databaseUsername, String databasePassword, String schema){
		this.classDriver = classDriver;
		this.hostnameOrIpAddress = hostnameOrIpAddress;
		this.databasePort = databasePort;
		this.databaseUsername = databaseUsername;
		this.databasePassword = databasePassword;
		this.connectionString = "jdbc:mysql://"+hostnameOrIpAddress+":"+databasePort+"/"+schema;
	}
	
	/**
	 * Return a database connection instance by a Singleton Design Pattern
	 * @return
	 */
	public Connection getConnection(){
		if(connection == null){
			try {
				Class.forName(this.classDriver);				
				connection = DriverManager.getConnection(this.connectionString, this.databaseUsername,this.databasePassword);
			} catch (ClassNotFoundException e) {
				System.out.println("Verifica di aver caricato il driver ojdbc per Oracle");
				logger.log(Level.SEVERE, "Verifica di aver caricato il driver ojdbc per Oracle");
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("Verifica la stringa di connessione al database ->"+this.connectionString);
				logger.log(Level.SEVERE, "Verifica la stringa di connessione al database ->"+this.connectionString);
			}			
		}
		return connection;
	}
	
	
	public void closeConnection(){
		try {
			connection.close();
		} catch (SQLException e) {
			//nothing TODO
		}
	}

	public ResultSet performQuery(String query) throws SQLException{
		logger.log(Level.CONFIG, "query to perform ->"+query);
		return getConnection().createStatement().executeQuery(query);
	}	

	public int executeUpdate(String dml) throws SQLException{
		logger.log(Level.CONFIG, "dml to perform ->"+dml);
		return getConnection().createStatement().executeUpdate(dml);
	}

	/**
	 * @return the classDriver
	 */
	public String getClassDriver() {
		return classDriver;
	}

	/**
	 * @param classDriver the classDriver to set
	 */
	public void setClassDriver(String classDriver) {
		this.classDriver = classDriver;
	}

	/**
	 * @return the hostnameOrIpAddress
	 */
	public String getHostnameOrIpAddress() {
		return hostnameOrIpAddress;
	}

	/**
	 * @param hostnameOrIpAddress the hostnameOrIpAddress to set
	 */
	public void setHostnameOrIpAddress(String hostnameOrIpAddress) {
		this.hostnameOrIpAddress = hostnameOrIpAddress;
	}

	/**
	 * @return the databasePort
	 */
	public String getDatabasePort() {
		return databasePort;
	}

	/**
	 * @param databasePort the databasePort to set
	 */
	public void setDatabasePort(String databasePort) {
		this.databasePort = databasePort;
	}

	/**
	 * @return the databaseUsername
	 */
	public String getDatabaseUsername() {
		return databaseUsername;
	}

	/**
	 * @param databaseUsername the databaseUsername to set
	 */
	public void setDatabaseUsername(String databaseUsername) {
		this.databaseUsername = databaseUsername;
	}

	/**
	 * @return the databasePassword
	 */
	public String getDatabasePassword() {
		return databasePassword;
	}

	/**
	 * @param databasePassword the databasePassword to set
	 */
	public void setDatabasePassword(String databasePassword) {
		this.databasePassword = databasePassword;
	}

}
