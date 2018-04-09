package it.gov.giua.model;

import  java.time.LocalDate;

public class Amministratore extends Dipendente {
	
	//Costruttori
	public Amministratore() {
		super();	
	}
	
	public Amministratore(DateOf data_nascita, String nome, String cognome, String codice_fiscale, String email, DateOf data_assunzione, DateOf data_licenziamento, int categoria, String username, String password, String specializzazione, String reparto) {
		super(data_nascita, nome, cognome, codice_fiscale, email, data_assunzione, data_licenziamento, categoria, username, password);
		
	}
	
	//toString
		public String toString() {
			return super.toString();
		}
	

}
