package it.gov.giua.model;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.xml.crypto.Data;

public class Utente {
	
	private Date nascita;
	private String nome,cognome,codiceFiscale;
	private int ID; 
	
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
	public Utente(Date nascita,String nome,String cognome,String codiceFiscale,int ID) {
		super();
		setNascita(nascita);
		setNome(nome);
		setCognome(cognome);
		setCodiceFiscale(codiceFiscale);
		setID(ID);
	}

	
	//setters
	public void setID(int ID) {this.ID = ID;}
	public void setNome(String nome) {this.nome=nome;}
	public void setCognome(String cognome) {this.cognome=cognome;}
	public void setCodiceFiscale(String codiceFiscale) {this.codiceFiscale=codiceFiscale;}
	public void setNascita(Date nascita) {this.nascita=nascita;}
	
	//getters
	public int getID() {return ID;}
	public String getNome() {return nome;}
	public String getCognome() {return cognome;}
	public Date getNascita() {return nascita;}
	public String getCodiceFiscale() {return codiceFiscale;}
	
	
	/* 
	@Override
	public String toString() {
		return "News [id=" + id + ", titolo=" + titolo + ", sottotitolo=" + sottotitolo + ", testo=" + testo
				+ ", abilitato=" + abilitato + ", tipo=" + tipo + "]";
	}
	
	*/
	
	
}