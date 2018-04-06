package it.gov.giua.model;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.xml.crypto.Data;

public class Utente {
	
	private Date nascita;
	private String nome,cognome,codiceFiscale;
	private int ID; 
	private int id_reparto;
	public Utente() {
		super();
	}
	
	/**
	 * 
	 * @param nascita data di nascita dell'utente da creare
	 * @param nome Nome dell'utente da creare
	 * @param cognome Cognome dell'utente da creare
	 * @param codiceFiscale Codice Fiscale dell'utente da creare  
	 * @param ID ID della persona della persona da creare 
	 */
	public Utente(int id,int id_reparto,Date nascita,String nome,String cognome,String codiceFiscale) {
		super();
		setID(id);
		setId_reparto(id_reparto);
		setNascita(nascita);
		setNome(nome);
		setCognome(cognome);
		setCodiceFiscale(codiceFiscale);
		
	}

	
	//setters
	public void setID(int ID) {this.ID = ID;}
	public void setId_reparto(int id_reparto) {this.id_reparto = id_reparto;}
	public void setNome(String nome) {this.nome=nome;}
	public void setCognome(String cognome) {this.cognome=cognome;}
	public void setCodiceFiscale(String codiceFiscale) {this.codiceFiscale=codiceFiscale;}
	public void setNascita(Date nascita) {this.nascita=nascita;}
	
	//getters
	public int getID() {return ID;}
	public int getId_reparto() {return  id_reparto;}
	public String getNome() {return nome;}
	public String getCognome() {return cognome;}
	public Date getNascita() {return nascita;}
	public String getCodiceFiscale() {return codiceFiscale;}
	
	
	
	@Override
	public String toString() {
		return "Utente [id:" + ID + ", nome:" + nome + ", cognome:" + cognome + ", data di nascita:" + nascita
				+ ", codice fiscale:" + codiceFiscale  + "]";
	}
	
	
	
	
}