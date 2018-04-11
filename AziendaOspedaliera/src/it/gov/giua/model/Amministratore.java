package it.gov.giua.model;

import java.util.Date;

public class Amministratore extends Dipendente {
	
	//Costruttori
	public Amministratore() {
		super();	
	}
	public Amministratore(Dipendente a) {
		super(a);
	}
	public Amministratore(int id_dipendente, Date data_nascita, String nome, String cognome, String codice_fiscale, String email, Date data_assunzione, Date data_licenziamento, int categoria, String username, String password, String specializzazione, int id_reparto) {
		super(id_dipendente, data_nascita, nome, cognome, codice_fiscale, email, data_assunzione, data_licenziamento, categoria, username, password, id_reparto);
	}
	
	//toString
	public String toString() {
		return super.toString();
	}
	
	//equals
	public boolean equals(Amministratore a) {
		if(super.equals(a))
			return true;
		else
			return false;
	}

}
